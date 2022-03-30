package com.example.retorecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retorecycler.databinding.ItemCardBinding
import org.json.JSONObject

class MainAdapter(private val productos: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(productos[position])
    }

    override fun getItemCount(): Int = productos.size

    class MainHolder(val binding: ItemCardBinding): RecyclerView.ViewHolder(binding.root){
        fun render(producto: JSONObject){
            binding.ivProductImage.setImageResource(R.drawable.carrito_compras)
            binding.tvProductDescription.setText(producto.getString("descripcion"))
            binding.ivReviewStars.setImageResource(R.drawable.star_review)
            binding.ivReviewStars2.setImageResource(R.drawable.star_review)
            binding.ivReviewStars3.setImageResource(R.drawable.star_review)
            binding.ivReviewStars4.setImageResource(R.drawable.star_review)
            binding.ivReviewStars5.setImageResource(R.drawable.star_review)
            binding.tvPrice.setText(producto.getString("precio"))
        }
    }
}