package sg.edu.nus.intent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class ActivityIntent2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        var country : String = intent.getStringExtra ("country")
        var sportsType : String = intent.getStringExtra("sports")
        var teamSize :  Int = intent.getIntExtra("team size", 0)

        Toast.makeText(this, "Data passed from calling activity: country = " + country + " sports = " + sportsType + "  team size = " + teamSize,
                Toast.LENGTH_LONG).show()

        val butBack = findViewById<Button>(R.id.btn_back)
        butBack.setOnClickListener{
            finish()
        }
    }
}
