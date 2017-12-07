package aldwin.tablante.com.recipelist

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
class RecipeRecycler(dataDishes:ArrayList<Dish>):RecyclerView.Adapter<RecipeRecycler.Recipe>() {

    var dataDishes:ArrayList<Dish> = dataDishes
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Recipe {
        var view = LayoutInflater.from(parent!!.context).inflate(R.layout.recipelist,parent,false)
        return Recipe(view)
    }

    override fun onBindViewHolder(holder: Recipe?, position: Int) {
var dish = dataDishes[position]
        var title = dish.dtitle
        var description = dish.ddescription
  holder!!.titlev.text= "" + title
        holder.descript.text = "" + description
holder.setReclicker(object :RecipeClicker{
    override fun onRecipeClicker(view: View, pos: Int) {

    }

})

    }

    override fun getItemCount(): Int {
return dataDishes.size
    }


    class Recipe(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener{


        var titlev: TextView
        var descript: TextView
        var reClicker:RecipeClicker?=null
        init {
            titlev = itemView.findViewById(R.id.titleview)
            descript = itemView.findViewById(R.id.description)
        }
  fun setReclicker(foodRecipeClicker: RecipeClicker){
      this.reClicker=foodRecipeClicker

  }
        override fun onClick(p0: View?) {
            this.reClicker!!.onRecipeClicker(p0!!,adapterPosition)
        }

    }
}
