package com.example.epoxy_task.Settings.epoxy

import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxy_task.R
import com.example.epoxy_task.Settings.Setting

@EpoxyModelClass(layout = R.layout.setting_layout)
abstract class SingleSettingsModel (@EpoxyAttribute var setting: Setting) :  EpoxyModelWithHolder<SingleSettingsModel.SettingHolder>(){

    override fun bind(holder: SettingHolder) {
        holder.imageView?.setImageResource(setting.image)
        holder.titleView?.text = setting.title
        holder.textView?.text= setting.text
    }

    inner class SettingHolder : KotlinHolder(){
        val imageView by bind<ImageView>(R.id.image)
        val titleView by bind<TextView>(R.id.title)
        val textView by bind<TextView>(R.id.text)
    }
}