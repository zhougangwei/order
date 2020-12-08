package com.vakievakie.tradepower.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

import com.vakievakie.tradepower.R


class PaperFragment :Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_paper, container, false)
        initView(root)
        return root
    }

    private fun initView(root: View) {
        val fragments=mutableListOf<Fragment>()
        val vp= root.findViewById<ViewPager>(R.id.vp)
        val tb= root.findViewById<TabLayout>(R.id.tb)
        fragments.add(OrderFragment.newInstance())
        fragments.add(OrderFragment.newInstance())
        fragments.add(OrderFragment.newInstance())
        vp.adapter= SectionsPagerAdapter(context!! ,childFragmentManager,fragments)
        tb.setupWithViewPager(vp)
    }




    companion object {
        fun newInstance(): PaperFragment {
            return PaperFragment()
        }
    }
}