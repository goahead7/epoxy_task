package com.example.epoxy_task.Settings
import com.example.epoxy_task.R
import java.util.*

object SettingDataFactory{

    private val random = Random()
    private val titles = arrayListOf<String>("Problem_1", "Problem_2", "Problem_3", "Problem_4", "Problem_5", "Problem_6", "Problem_7","Problem8")
    private val texts = arrayListOf<String>("NEED FIX", "OK", "SOME TROUBLE")

    private fun randomPicture() : Int{
        val grid = random.nextInt(7)
        return when(grid) {
            0 -> R.drawable.setting1
            1 -> R.drawable.setting2
            2 -> R.drawable.setting3
            3 -> R.drawable.setting4
            4 -> R.drawable.setting5
            else -> R.drawable.setting1
        }
    }

    private fun randomTitle() : String {
        val title = random.nextInt(8)
        return titles[title]
    }

    private fun randomText() : String {
        val text = random.nextInt(3)
        return texts[text]
    }

    fun getSettingItems(count:Int) : List<Setting>{
        var settingItems = mutableListOf<Setting>()
        repeat(count){
            val image = randomPicture()
            val title = randomTitle()
            val text = randomText()
            settingItems.add(Setting(image,title,text))
        }
        return settingItems
    }
}