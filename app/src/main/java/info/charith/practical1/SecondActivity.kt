package info.charith.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var name = intent.extras?.getString("name")
        var email = intent.extras?.getString("email")

        tvResult=findViewById(R.id.tvResult)

        tvResult.text = "Hi $name,\n Your email: $email is registered Successfully"
    }
}