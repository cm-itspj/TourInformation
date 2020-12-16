package jp.co.cybermissions.com.example.tourinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView.AdapterContextMenuInfo
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val button: Button = findViewById(R.id.button)
//        button.setOnClickListener{ textShow() }
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        super.onCreateOptionsMenu(menu)
//
//        val inflater = menuInflater
//        inflater.inflate(R.menu.options_menu, menu)
//        Log.i("AboutFragment", "Menu Called")
//        return true
//    }
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.getItemId()) {
//            R.id.aboutFragment -> {
//                return true
//            }
//            else -> return  super.onOptionsItemSelected(item)
//        }
//
//    }

//private fun textShow () {
//    Toast.makeText(this,"Button Clicked",
//    Toast.LENGTH_SHORT).show()
//}
}