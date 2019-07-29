package sg.edu.nus.intent

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE : Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent1 = findViewById<Button>(R.id.btn_intent1)

        btnIntent1.setOnClickListener{
            val myIntent = Intent(this, ActivityIntent1::class.java)
            startActivity(myIntent)
        }

        val btnIntent2 = findViewById<Button>(R.id.btn_intent2)
        btnIntent2.setOnClickListener{
            val myIntent = Intent(this, ActivityIntent2::class.java)
            myIntent.putExtra("country", "Singapore")
            myIntent.putExtra("sports", "Football")
            myIntent.putExtra("team size", 11)
            startActivity(myIntent)
        }

        val btnIntent3 = findViewById<Button>(R.id.btn_intent3)
        btnIntent3.setOnClickListener{
            val myIntent = Intent(this, ActivityIntent3::class.java)

            var bundleObj : Bundle = Bundle()
            bundleObj.putString("Country", "Indonesia")
            bundleObj.putString("Sports", "Badminton")
            bundleObj.putBoolean("Team Size", true)

            myIntent.putExtras(bundleObj)

            startActivity(myIntent)
        }

        val btnIntent4 = findViewById<Button>(R.id.btn_intent4)
        btnIntent4.setOnClickListener{
            val myIntent = Intent(this, ActivityIntent4::class.java)

            startActivityForResult(myIntent, REQUEST_CODE)
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if ((requestCode == REQUEST_CODE) && (resultCode == Activity.RESULT_OK)) {
            if (data!!.hasExtra("Continent")){
                val country = data!!.extras.getString("Continent")
                Toast.makeText(this, "Returned Continent = " +
                        country, Toast.LENGTH_LONG).show()
            }
        }
    }
}
