package com.example.fragmentsex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val manager = supportFragmentManager

        btnFragmentA.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.add(R.id.flyFragment, FragmentA)
        }
    }
}

private fun Any.add(flyFragment: Any, fragmentA: Any) {
    TODO("Not yet implemented")
}







