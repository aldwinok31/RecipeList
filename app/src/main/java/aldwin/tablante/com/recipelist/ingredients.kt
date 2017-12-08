package aldwin.tablante.com.recipelist
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ingredient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ingredients)
        val ss:Int = intent.getIntExtra("aleyah",0)




        if(ss == 0){
            val textv = findViewById<TextView>(R.id.textView2)
            textv.setText(R.string.recipe1)
            val textv1 = findViewById<TextView>(R.id.textView3)
            textv1.setText(R.string.procedure1)
            val imageView = findViewById<ImageView>(R.id.imageView)
            imageView.setImageResource(R.drawable.fishpie)

        }
        if(ss==1) {
            val textv = findViewById<TextView>(R.id.textView2)
            textv.setText(R.string.recipe2)
            val textv1 = findViewById<TextView>(R.id.textView3)
            textv1.setText(R.string.procedure2)
            val imageView = findViewById<ImageView>(R.id.imageView)
            imageView.setImageResource(R.drawable.chicken)
        }

            if(ss == 2){


                val textv = findViewById<TextView>(R.id.textView2)
                textv.setText(R.string.recipe3)
                val textv1 = findViewById<TextView>(R.id.textView3)
                textv1.setText(R.string.procedure3)
                val imageView = findViewById<ImageView>(R.id.imageView)
                imageView.setImageResource(R.drawable.lomi)



            }



    }
}