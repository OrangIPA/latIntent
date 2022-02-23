package id.sch.smktelkommlg.siswa.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        if (intent != null){
            val tvData1: TextView = findViewById(R.id.tv_data1) as TextView
            val tvData2: TextView = findViewById(R.id.tv_data2) as TextView

            tvData1.setText(intent.getStringExtra("data1"))
            tvData2.setText(intent.getStringExtra("data2"))
        }
    }
}