package sg.edu.nus.intent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActivityIntent5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent5)

        val btnIntent7 = findViewById<Button>(R.id.btn_intent7)
        btnIntent7.setOnClickListener {
            var editText = findViewById<EditText>(R.id.editText)
            val value = editText.getText().toString()
            val finalValue = Integer.parseInt(value)

            val answer = fibonacci(finalValue)
            val display = findViewById<TextView>(R.id.textView)
            // print answer
            display.setText(answer)
        }

        val butBack = findViewById<Button>(R.id.btn_back)
        butBack.setOnClickListener{
            finish()
        }
    }

    fun fibonacci(value: Int): String {

        var first = 0
        var second = 1
        var temp: Int

        var answer: String
        val sb = StringBuilder()

        if (value < 1) {
            return value.toString()
        } else {
            for (i in 1..value) {
                if (i == value)
                    sb.append(second , " ")
                else {
                    sb.append(second, ", ")
                    temp = first + second
                    first = second
                    second = temp
                }
            }
        }

        answer = sb.toString()

        var length = answer.length
        answer = answer.substring(0, length - 1)

        return answer
    }
}
