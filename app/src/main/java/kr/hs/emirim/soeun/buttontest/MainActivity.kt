package kr.hs.emirim.soeun.buttontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //var btn1 : Button
        //btn1 = findViewById<Button>(R.id.btn1)
//      제네릭 타입은 생략도 가능하다


        setContentView(R.layout.layout3)
    }
}