package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalhouse.fakeloginapp.users.UserModel
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.edtxtEmail
import kotlinx.android.synthetic.main.activity_main.edtxtPassword
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.activity_welcome.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateAccountMain.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        btnLoginMain.setOnClickListener {

            val email = edtxtEmail.text.toString()
            val senha = edtxtPassword.text.toString()

            if (email.isEmpty()) {
                edtxtEmail.error = "Campo vazio"
            } else if (senha.isEmpty()) {
                edtxtPassword.error = "Campo vazio"
            } else {
                UserService.logIn(email, senha)
                val intent = Intent(this, Welcome::class.java)
                startActivity(intent)
            }

        }

    }


}

