package id.sch.smktelkommlg.siswa.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObject : AppCompatActivity() {
    companion object{
        val EXTRA_PERSON: String = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        if(intent != null){
            val tvObject: TextView = findViewById<TextView>(R.id.tv_object_received)
            val player: Person? = intent.getParcelableExtra(EXTRA_PERSON)
            val text: String = "Name\t: " + player?.name + "\nEmail\t " + player?.email +
                    "\nCity\t: " + player?.city + "\nAge\t: " + player?.age
            tvObject.text = text
        }

    }
}