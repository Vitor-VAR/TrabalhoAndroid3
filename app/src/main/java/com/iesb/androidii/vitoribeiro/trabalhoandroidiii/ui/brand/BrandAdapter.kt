package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.brand

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.databinding.BrandItemBinding
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.BrandModel

class BrandAdapter: RecyclerView.Adapter<BrandAdapter.BrandViewHolder>() {
    private var brandList = ArrayList<BrandModel>()


    fun setBrandList(brandList: List<BrandModel>) {
        this.brandList = brandList as ArrayList<BrandModel>
        notifyDataSetChanged()
    }

    class BrandViewHolder(val binding: BrandItemBinding): RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandViewHolder {
        return BrandViewHolder(BrandItemBinding.inflate(LayoutInflater.from(parent.context)))

    }

    override fun getItemCount(): Int {
        return brandList.size
    }

    override fun onBindViewHolder(holder: BrandViewHolder, position: Int) {

        holder.itemView

    }
}