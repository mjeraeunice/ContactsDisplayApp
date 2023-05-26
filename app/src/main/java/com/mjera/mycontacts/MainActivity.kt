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
        val contact1=ContactsData("","Kelitu","0720987542","kelitu2@gmail.com")
        val contact2=ContactsData("","Amina","0735426780","aminaraji23@gmail.com")
        val contact3=ContactsData("","Kareem","0742426767","kareem4@gmail.com")
        val contact4=ContactsData("","Naj","0722426780","naraji30@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4)
        val twtAdapter=ContactsAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=twtAdapter

    }

}
