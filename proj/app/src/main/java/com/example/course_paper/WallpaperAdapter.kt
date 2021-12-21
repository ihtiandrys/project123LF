package com.example.course_paper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.course_paper.databinding.WallpaperItemBinding

// Класс, который и будет передавать в RecyclerView
class WallpaperAdapter: RecyclerView.Adapter<WallpaperAdapter.WallpaperHolder>() {
    val wallpaperList = ArrayList<Wallpaper>()
    class WallpaperHolder(item: View):RecyclerView.ViewHolder(item) {
        val binding = WallpaperItemBinding.bind(item)
        fun bind(wallpaper: Wallpaper) = with(binding) {
            im.setImageResource(wallpaper.imageId)
            tvTitle.text = wallpaper.title
        }
    }

    // Метод берет разметку создает с помощью inflate и передает разметку в view (создается)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallpaperHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.wallpaper_item, parent, false)
        return WallpaperHolder(view)
    }

    // Метод, который начинает заполнять (заполняется)
    override fun onBindViewHolder(holder: WallpaperHolder, position: Int) {
        holder.bind(wallpaperList[position])
    }

    // Метод, передает размер нашего массива
    override fun getItemCount(): Int {
        return wallpaperList.size
    }

    // Метод, заполнения экрана
    fun addWallpaper(wallpaper: Wallpaper){
        wallpaperList.add(wallpaper)
        notifyDataSetChanged()
    }
}