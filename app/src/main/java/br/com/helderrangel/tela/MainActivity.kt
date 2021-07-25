package br.com.helderrangel.tela

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvView: TextView
    private lateinit var btNova: Button
    private lateinit var tvPropriedade: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.btNova = findViewById(R.id.btNova)
        this.tvView =  findViewById(R.id.tvView)
        this.tvPropriedade = findViewById(R.id.tvPropriedade)

    }
    inner class onClickButton : View.OnClickListener {
        override fun onClick(v: View?) {
            this@MainActivity.tvPropriedade.text = "Fabricante"

        }
    }

    inner class OnClickBt : View.OnClickListener {
        override fun onClick(v: View?){
            this@MainActivity.tvView.text = Build.BRAND
        }
    }
}