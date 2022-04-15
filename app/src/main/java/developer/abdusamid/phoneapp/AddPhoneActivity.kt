package developer.abdusamid.phoneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddPhoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_phone)

        title = "Add Phone"
    }
}