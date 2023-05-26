package com.mjera.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mjera.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        diplayContacts()
    }
    fun diplayContacts(){
        val contact1=ContactsData("","Kelitu","0723456789")
        val contact2=ContactsData("","Amina","0765432180")
        val contactList= listOf(contact1,contact2)
        val twtAdapter=TweetAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=twtAdapter

    }

}
