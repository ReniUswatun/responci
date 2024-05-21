package com.reni.universeitas.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil3.load
import com.reni.universeitas.R

class UniversityAdapter(private val universityList:ArrayList<ListDataUniversitas>)
    :RecyclerView.Adapter<UniversityAdapter.UniversityViewHolder>(){
    class UniversityViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.image_university_card_view)
        val textViewNameUniversity : TextView = itemView.findViewById(R.id.text_name_university)
        val textViewAddressUniversity : TextView = itemView.findViewById(R.id.text_address_university)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniversityViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.recycle_view_row,parent,false)
        return UniversityViewHolder(view)
    }

    override fun getItemCount(): Int {
         return universityList.size
    }

    override fun onBindViewHolder(holder: UniversityViewHolder, position: Int) {
        val university = universityList[position]
        holder.imageView.setImageResource(university.imageUniversity)
        holder.textViewNameUniversity.text = university.nameUniversity
        holder.textViewAddressUniversity.text = university.addressUniversity
    }
}