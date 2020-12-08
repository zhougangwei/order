package com.vakievakie.tradepower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.vakievakie.tradepower.ui.main.PaperFragment
import com.vakievakie.tradepower.ui.main.SectionsPagerAdapter
import com.vakievakie.tradepower.ui.main.TopPlayerFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val fragments=mutableListOf<Fragment>()
         fragments.add(PaperFragment.newInstance())
         fragments.add(TopPlayerFragment.newInstance())
        vp.adapter= SectionsPagerAdapter(this ,supportFragmentManager,fragments)
        tb.setupWithViewPager(vp)
    }
}