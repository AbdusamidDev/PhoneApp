package developer.abdusamid.phoneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phones.*

class PhonesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phones)

        ip_card.setOnClickListener {
            startActivity(Intent(this, PhonesListActivity::class.java))
        }

        sam_card.setOnClickListener {
            startActivity(Intent(this, PhonesListActivity::class.java))
        }

        micard.setOnClickListener {
            startActivity(Intent(this, PhonesListActivity::class.java))
        }

        sonycard.setOnClickListener {
            startActivity(Intent(this, PhonesListActivity::class.java))
        }

        hw_card.setOnClickListener {
            startActivity(Intent(this, PhonesListActivity::class.java))
        }

        at_card.setOnClickListener {
            startActivity(Intent(this, PhonesListActivity::class.java))
        }
    }
}