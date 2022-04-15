package developer.abdusamid.phoneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PhonesInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phones_info)
        actionBar?.hide()
    }
}