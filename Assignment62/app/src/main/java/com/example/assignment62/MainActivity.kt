package com.example.assignment62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var total0: TextView = findViewById(R.id.Total)
        var GPA: TextView = findViewById(R.id.GPA)
        var sub1: EditText =findViewById(R.id.text1)
        var sub2: EditText =findViewById(R.id.text2)
        var sub3: EditText =findViewById(R.id.text3)
        var sub4: EditText =findViewById(R.id.text4)
        var sub5: EditText =findViewById(R.id.text5)
        var cr1: EditText =findViewById(R.id.C1)
        var cr2: EditText =findViewById(R.id.C2)
        var cr3: EditText =findViewById(R.id.C3)
        var cr4: EditText =findViewById(R.id.C4)
        var cr5: EditText =findViewById(R.id.C5)
        var point1: EditText =findViewById(R.id.P1)
        var point2: EditText =findViewById(R.id.P2)
        var point3: EditText =findViewById(R.id.P3)
        var point4: EditText =findViewById(R.id.P4)
        var point5: EditText =findViewById(R.id.P5)
        var btnok: Button =findViewById(R.id.button1)
        var btnclear: Button =findViewById(R.id.button2)
        btnok.setOnClickListener(){
            var sub1 = sub1.text.toString()
            var sub2 = sub2.text.toString()
            var sub3 = sub3.text.toString()
            var sub4 = sub4.text.toString()
            var sub5 = sub5.text.toString()
            var c1 = cr1.text.toString()
            var c2 = cr2.text.toString()
            var c3 = cr3.text.toString()
            var c4 = cr4.text.toString()
            var c5 = cr5.text.toString()
            var po1 = point1.text.toString()
            var po2 = point2.text.toString()
            var po3 = point3.text.toString()
            var po4 = point4.text.toString()
            var po5 = point5.text.toString()
            var total1 = 0.00
            var total2 = 0.00
            var total3 = 0.00
            var total4 = 0.00
            var total5 = 0.00
            var total = 0.000
            var totalcru =0.00
            if(sub1 == "" || sub2 == "" || sub3 == "" || sub4 == "" || sub5 == "" ||
                c1 == "" || c2 == "" || c3 == "" || c4 == "" || c5 == "" ||
                po1 == "" || po2 == "" || po3 == "" || po4 == "" || po5 == ""  ){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ข้อมูลให้ครบ", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total1=c1.toDouble()*po1.toDouble()
                total2=c2.toDouble()*po2.toDouble()
                total3=c3.toDouble()*po3.toDouble()
                total4=c4.toDouble()*po4.toDouble()
                total5=c5.toDouble()*po5.toDouble()
                totalcru =c1.toDouble()+c2.toDouble()+c3.toDouble()+c4.toDouble()+c5.toDouble()
                total = (total1+total2+total3+total4+total5)/totalcru
                total0.setText(totalcru.toString())
                GPA.setText(total.toString())
            }
        }
        btnclear.setOnClickListener(){
            total0.setText("")
            GPA.setText("")
            sub1.setText("")
            sub2.setText("")
            sub3.setText("")
            sub4.setText("")
            sub5.setText("")
            cr1.setText("")
            cr2.setText("")
            cr3.setText("")
            cr4.setText("")
            cr5.setText("")
            point1.setText("")
            point2.setText("")
            point3.setText("")
            point4.setText("")
            point5.setText("")
        }
    }
}