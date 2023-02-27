package com.devexperto

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.icu.lang.UCharacter
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


fun Context.toast(massage: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, massage, length).show()
}

fun RecyclerView.ViewHolder.toast(massage: String) {
    itemView.context.toast(massage)
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int): View = LayoutInflater
    .from(context)
    .inflate(R.layout.view_media_item, this, false)

fun ImageView.loadUrl (url: String){
    Glide.with(this).load(url).into(this)}

inline fun <reified T: Activity> Context.startActivity(){
    val intent = Intent(this, UCharacter.GraphemeClusterBreak.T::class.java)
    startActivity(intent)
}