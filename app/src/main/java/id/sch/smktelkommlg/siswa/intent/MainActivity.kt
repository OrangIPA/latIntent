package id.sch.smktelkommlg.siswa.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivityData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivityData.setOnClickListener(this)

        val btnMoveActivityObject: Button = findViewById(R.id.btn_move_activity_object)
        btnMoveActivityObject.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                moveIntent.putExtra("data1", "some string data")
                moveIntent.putExtra("data2", "some string data 2")
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_object -> {
                val player: Person = Person("Bahana", 17, "bahana_alana_29rpl@student.smktelkom-mlg.sch.id", "ngalam")
                val intentObject: Intent = Intent(this@MainActivity, MoveWithObject::class.java)
                intentObject.putExtra(MoveWithObject.EXTRA_PERSON, player)
                startActivity(intentObject)

            }
        }
    }
}