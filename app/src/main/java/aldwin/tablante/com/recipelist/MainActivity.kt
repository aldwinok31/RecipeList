package aldwin.tablante.com.recipelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
var adapter :RecipeRecycler?=null
    var dataDishes : ArrayList<Dish> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title_list =   arrayOf("Fish Pie","Chicken Salad","Lomi")
        val description_list = arrayOf("Inspiration for a mash-topped seafood bake" , "Serve up a bright,light plate of goodness","Lomi or Pancit Lomi is a Filipino dish made with a variety of thick fresh egg noodles of about a quarter of an inch in diameter, soaked in lye water to give it more texture."
        )


for(i in 0..title_list.size-1) {

    dataDishes.add(Dish(title_list[i], description_list[i]))

}
        adapter = RecipeRecycler(dataDishes,applicationContext)
var layout_manager =LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layout_manager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter


    }



}
