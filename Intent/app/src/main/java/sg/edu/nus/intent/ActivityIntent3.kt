package sg.edu.nus.intent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class ActivityIntent3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent3)

        var country : String = intent.getStringExtra("Country")
        var sportsType : String = intent.getStringExtra("Sports")
        var teamSport :  Boolean = intent.getBooleanExtra("Team Sport", true)

        Toast.makeText(this, "Data passed from calling activity: country = " + country + " sports = " + sportsType + "  It's a team sport : " + teamSport,
                Toast.LENGTH_LONG).show()

        val butBack = findViewById<Button>(R.id.btn_back)
        butBack.setOnClickListener{
            finish()
        }
    }
}
