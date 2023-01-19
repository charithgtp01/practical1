package info.charith.practical1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init();

    }

    private fun init() {
        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            register()
        }

    }

    private fun register() {

        var name: String = etName.text.toString()
        var email: String = etEmail.text.toString()

        when {
            name.isBlank() -> Toast.makeText(
                this,
                getString(R.string.nameemptymessage),
                Toast.LENGTH_SHORT
            ).show()
            email.isBlank() -> Toast.makeText(
                this,
                getString(R.string.emailemptymessage),
                Toast.LENGTH_SHORT
            ).show()

            else -> {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("name", name)
                intent.putExtra("email", email)
                startActivity(intent)
            }
        }
    }
}