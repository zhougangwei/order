package com.vakievakie.tradepower.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vakievakie.tradepower.R
import com.vakievakie.tradepower.TopAdpter
import com.vakievakie.tradepower.bean.UserLevelBean

class TopPlayerFragment :Fragment(){



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_top, container, false)
        initView(root)
        return root
    }

    private fun initView(root: View) {
        val adapter=TopAdpter(R.layout.item_top_player)
        val rv= root.findViewById<RecyclerView>(R.id.rv)
        rv.adapter= adapter
        rv.layoutManager=LinearLayoutManager(context)
        val list=mutableListOf<UserLevelBean>()
        list.add(UserLevelBean(1,"Jakie",null,"87123.23USD"))
        list.add(UserLevelBean(2,"Jay",null,"71231.3USD"))
        list.add(UserLevelBean(3,"Lin",null,"53221.3USD"))
        list.add(UserLevelBean(4,"Lucy",null,"29897.23USD"))
        list.add(UserLevelBean(5,"May",null,"237455.23USD"))
        adapter.addData(list)
    }




    companion object {
        fun newInstance(): TopPlayerFragment {
            return TopPlayerFragment()
        }
    }
}