package com.mjera.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.mjera.mycontacts.databinding.ActivityContactAddBinding
import com.mjera.mycontacts.databinding.ActivityMainBinding

class ContactAddActivity : AppCompatActivity() {
    lateinit var binding: ActivityContactAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnSave.setOnClickListener {
            clearErrors()
            validateSignUp()
        }
    }
    fun validateSignUp() {
        val name = binding.etName.text.toString()
        val phoneNumber = binding.etPhoneNumber.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false

        if (name.isBlank()) {
            binding.tilName.error = "Name is required"
            error = true
        }
        if (phoneNumber.isBlank()) {
            binding.tilPhoneNumber.error = "Phone Number  is required"
            error = true
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true
        }
        if (!error) {
            Toast.makeText(
                this,
                "Contact was added successfully ",
                Toast.LENGTH_LONG
            ).show()
        }
    }
    fun clearErrors() {
        binding.tilPhoneNumber.error = null
        binding.tilName.error = null
        binding.tilEmail.error = null
    }
}

