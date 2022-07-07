package com.revision.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import kotlin.contracts.Returns

class NameRecyclerviewAdapter (var namesList: List<String>):RecyclerView.Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
     var itemView=LayoutInflater.from(parent.context).inflate(R.layout.name_list_items,parent,false)
   return NamesViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
       holder.tvName.text=namesList.get(position)
    }

    override fun getItemCount(): Int {
        return namesList.size
    }
}
class NamesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)

}