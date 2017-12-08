package aldwin.tablante.com.recipelist

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import org.w3c.dom.Text


class RecipeRecycler(dataDishes: ArrayList<Dish>, context: Context) : RecyclerView.Adapter<RecipeRecycler.Recipe>() {
    var mContext = context
    var dataDishes: ArrayList<Dish> = dataDishes
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Recipe {
        var view = LayoutInflater.from(parent!!.context).inflate(R.layout.recipelist, parent, false)
        return Recipe(view)
    }

    override fun onBindViewHolder(holder: Recipe?, position: Int) {
        var dish = dataDishes[position]
        var title = dish.dtitle
        var description = dish.ddescription
        holder!!.titlev.text = "" + title
        holder.descript.text = "" + description
        holder.setReclicker(object : RecipeClicker {

            override fun onRecipeClicker(view: View, pos: Int) {
               // Toast.makeText(mContext,"Name"+dish,Toast.LENGTH_LONG).show()

                    val intent = Intent(mContext, ingredient::class.java)
                    intent.putExtra("aleyah",pos)
                    mContext.startActivity(intent)




            }

        })

    }

    override fun getItemCount(): Int {
        return dataDishes.size
    }


    class Recipe(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        override fun onClick(p0: View?) {
            this.reClicker!!.onRecipeClicker(p0!!, adapterPosition)
        }

        val titlev: TextView
        val descript: TextView
        var reClicker: RecipeClicker? = null

        init {
            titlev = itemView.findViewById<TextView>(R.id.titleview)
            descript = itemView.findViewById<TextView>(R.id.description)
            itemView.setOnClickListener(this)
        }

        fun setReclicker(foodRecipeClicker: RecipeClicker) {
            this.reClicker = foodRecipeClicker

        }





    }
}
