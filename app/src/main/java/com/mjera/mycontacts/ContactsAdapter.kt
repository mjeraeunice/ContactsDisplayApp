package com.mjera.mycontacts
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mjera.mycontacts.databinding.ContactsListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactsAdapter(var contactList:List<ContactsData>):RecyclerView.Adapter< ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ContactViewHolder {
        val binding=
            ContactsListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact=contactList.get(position)
        val binding=holder.binding
        binding.tvName.text=currentContact.displayName
        binding.tvPhoneNumber.text =currentContact.phoneNumber
        binding.tvEmail.text=currentContact.email
        Picasso
            .get()
            .load(currentContact.avatar)
////            .resize(80,80)
//            .centerCrop()
            .placeholder(R.drawable.africana)
            .error(R.drawable.africana)
            .transform(CropCircleTransformation())
            .into(binding.ivContact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(var binding:ContactsListItemBinding):RecyclerView.ViewHolder(binding.root)