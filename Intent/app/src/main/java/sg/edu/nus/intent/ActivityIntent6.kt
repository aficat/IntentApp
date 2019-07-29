package sg.edu.nus.intent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActivityIntent6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent6)

        val btnIntent7 = findViewById<Button>(R.id.btn_intent7)
        btnIntent7.setOnClickListener {
            var editText = findViewById<EditText>(R.id.editText)
            val value = editText.getText().toString()
            val finalValue = Integer.parseInt(value)

            var sum = 0;
            val sb = StringBuilder();
            var result = fibonnaci(1, 1, finalValue, sum, sb)

            result = result.substring(0, (result.length)-1)

            var display = findViewById<TextView>(R.id.textView)
            display.setText(result)

        }

        val butBack = findViewById<Button>(R.id.btn_back)
        butBack.setOnClickListener{
            finish()
        }
    }

    fun fibonnaci(a: Int, b: Int, value: Int, sum: Int, sb:StringBuilder): String {

        if (value == 1)
            sb.append(a, " ")
        else
            sb.append(a, ", ")
        if (value == 1) {
            return sb.toString()
        } else
            return fibonnaci(b, a + b, value - 1, sum, sb)
    }

}
