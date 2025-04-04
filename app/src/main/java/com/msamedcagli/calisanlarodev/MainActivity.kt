package com.msamedcagli.calisanlarodev

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

            var calisan1 =calisanlar("calisan1",3000,"yazılım",32)
            var calisan2 =calisanlar("calisan2",3500,"yazılım",27)
            var calisan3 =calisanlar("calisan3",4000,"yazılım",37)
            var calisan4 =calisanlar("calisan4",7000,"müdür",40)
            var calisan5 =calisanlar("calisan5",1200,"stajyer",20)
            var calisan6 =calisanlar("calisan6",2300,"asistan",24)
            var calisan7 =calisanlar("calisan7",7800,"gm yardımcısı",45)
            var calisan8 =calisanlar("calisan8",12000,"genel müdür",55)
            var calisan9 =calisanlar("calisan9",3550,"yazılım",33)
            var calisan10 =calisanlar("calisan10",4750,"yazılım",39)

            val CalisanDizisi = arrayListOf(calisan1,calisan2,calisan3,calisan4,calisan5,calisan6,calisan7,calisan8,calisan9,calisan10)

            val yasDepartmentFilter = CalisanDizisi.filter { it.yas>30 }.filter { it.department=="yazılım"}.map { it.maasGoster() }
            println(yasDepartmentFilter)

            val yasIsimFilter = CalisanDizisi.filter { it.yas<25 }.map { it.isim }
            println(yasIsimFilter)
    }
}