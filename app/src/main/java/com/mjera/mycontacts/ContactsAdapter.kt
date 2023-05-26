package com.mjera.mycontacts
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mjera.mycontacts.databinding.ContactsListItemBinding

class TweetAdapter(var contactList:List<ContactsData>):RecyclerView.Adapter<TweetViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        val binding=
            ContactsListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TweetViewHolder(binding)

    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        val currentTweet=contactList.get(position)
        val binding=holder.binding
        binding.tvDisplayName.text=currentTweet.displayName
        binding.tvPhoneNumber.text = currentTweet.phoneNumber
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class TweetViewHolder(var binding:ContactsListItemBinding):RecyclerView.ViewHolder(binding.root)