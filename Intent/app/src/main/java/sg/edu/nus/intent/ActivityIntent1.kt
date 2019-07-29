package sg.edu.nus.intent

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class ActivityIntent1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)

        val btnIntent5 = findViewById<Button>(R.id.btn_intent5)
        btnIntent5.setOnClickListener{
            val myIntent = Intent(this, ActivityIntent5::class.java)
            startActivity(myIntent)
        }

        val btnIntent6 = findViewById<Button>(R.id.btn_intent6)
        btnIntent6.setOnClickListener{
            val myIntent = Intent(this, ActivityIntent6::class.java)
            startActivity(myIntent)
        }

        val butBack = findViewById<Button>(R.id.btn_back)
        butBack.setOnClickListener{
            finish()
        }

        // Toast.makeText(this, "I am in ActivityIntent1 !!!", Toast.LENGTH_LONG).show()

    }
}
