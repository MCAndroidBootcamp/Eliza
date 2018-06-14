package com.mcandroid.eliza

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

data class LangListAdapter(var langaugeList:List<Conversation>, var activity: Activity) : BaseAdapter(){

    override fun getItem(position: Int): Any {
        return langaugeList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return langaugeList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = View.inflate(activity,R.layout.layout_adapter,null)

        val tv_num = view.findViewById<TextView>(R.id.tv_number) as TextView
        val tv_lang = view.findViewById<TextView>(R.id.tv_lang) as TextView


        tv_num.text = (position+1).toString()+"."
        tv_lang.text = langaugeList.get(position).text


        return view
    }

}