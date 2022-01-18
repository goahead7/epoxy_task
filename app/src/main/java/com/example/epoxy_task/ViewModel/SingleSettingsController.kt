package com.example.epoxy_task.ViewModel

import com.airbnb.epoxy.EpoxyController
import com.example.epoxy_task.Settings.Setting
import com.example.epoxy_task.Settings.SettingDataFactory
import com.example.epoxy_task.Settings.epoxy.SingleSettingsModel_

class SingleSettingsController : EpoxyController(){
    var settingItems : List<Setting> = SettingDataFactory.getSettingItems(15)
    private var index = 0L

    init {
        settingItems = SettingDataFactory.getSettingItems(15)
    }

    override fun buildModels() = settingItems.forEach{
        SingleSettingsModel_(it)
            .id(index++)
            .addTo(this)
    }
}