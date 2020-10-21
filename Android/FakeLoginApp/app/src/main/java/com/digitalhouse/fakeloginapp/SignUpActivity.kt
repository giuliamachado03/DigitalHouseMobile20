package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.activity_main.edtxtEmail as edtxtEmail1
import kotlinx.android.synthetic.main.activity_sign_up.edtxtPassword as edtxtPassword1

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        checkAgree.setOnCheckedChangeListener { _, isChecked ->
            btnSignUp.isEnabled = isChecked
        }

        btnLogin.setOnClickListener {
            finish()
        }

        btnSignUp.setOnClickListener {

            val nome = edtxtName.text.toString()
            val password = edtxtPassword.text.toString()
            val email = edtxtEmail.text.toString()

            if (nome.isEmpty()) {
                edtxtName.error = "Campo Vazio"
            } else if (email.isEmpty()) {
                edtxtEmail.error = "Campo Vazio"
            } else if (password.isEmpty()) {
                edtxtPassword.error = "Campo Vazio"
            } else {
                try {
                    UserService.register(nome, email, password)
                    Toast.makeText(this, "Usuário cadastrado com sucesso!", Toast.LENGTH_LONG)
                        .show()
                    finish()
                } catch (e: Exception) {
                    Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()

                }


            }
        }
    }
}


