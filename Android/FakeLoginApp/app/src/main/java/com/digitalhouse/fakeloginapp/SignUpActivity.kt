package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnCreateAccountSignUp.setOnClickListener {
            finish()
        }

        checkAgree.setOnCheckedChangeListener { _, isChecked ->
            btnCreateAccountSignUp.isEnabled = isChecked
        }

    }
}