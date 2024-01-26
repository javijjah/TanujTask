package com.hachatml.tanujwallpapers.Model

import android.media.Image
import com.hachatml.tanujwallpapers.R

class WallpapersViewModel {
    companion object{
    val wallpaperList: MutableList<Int> = mutableListOf()

    fun getWallpapers():MutableList<Int>{
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
    wallpaperList.add(R.drawable.bolsa)
        return wallpaperList
    }
    }
}