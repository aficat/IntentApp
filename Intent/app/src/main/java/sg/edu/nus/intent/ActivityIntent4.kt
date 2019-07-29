package sg.edu.nus.intent

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class ActivityIntent4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent4)

        val btnBack = findViewById<Button>(R.id.btn_Back)
        btnBack.setOnClickListener{
            val myIntent = Intent()
            myIntent.putExtra("Continent",
                    "Asia")
            setResult(Activity.RESULT_OK, myIntent)
            finish()
        }
    }
}
