package jp.co.cybermissions.com.example.tourinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Json Data
        val assetManager = resources.assets //アセット呼び出し
        val inputStream = assetManager.open("Detail.json") //Jsonファイル
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val jsonText: String = bufferedReader.readText() //データ
        Log.d("json",jsonText)
        val listUserType = Types.newParameterizedType(List::class.java, Detail::class.java)
        val adapter: JsonAdapter<List<Detail>> = Moshi.Builder().build().adapter(listUserType)
        //val adapter = Moshi.Builder().build().adapter(Detail::class.java)
        val detail: List<Detail>? = adapter.fromJson(jsonText)
        //val detail = adapter.fromJson(jsonText)
        Log.d("jsonjson",detail.toString())

    }

}