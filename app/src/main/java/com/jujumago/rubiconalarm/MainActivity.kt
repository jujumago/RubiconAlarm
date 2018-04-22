package com.jujumago.rubiconalarm

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jujumago.rubiconalarm.fragments.AlarmsFragment
import com.jujumago.rubiconalarm.fragments.HomeFragment
import com.jujumago.rubiconalarm.fragments.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pagerAdapter: CustomPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(null)

        pagerAdapter = CustomPagerAdapter(supportFragmentManager)
        pagerAdapter!!.addFragments(AlarmsFragment(), "Alarms")
        pagerAdapter!!.addFragments(HomeFragment(),"Home")
        pagerAdapter!!.addFragments(ProfileFragment(), "Profile")

        container.adapter = pagerAdapter
        tabs.setupWithViewPager(container)
    }
}

