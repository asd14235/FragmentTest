package com.neppplus.fragmenttest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.fragmenttest.fragments.fragment_first_page
import com.neppplus.fragmenttest.fragments.fragment_second_page
import com.neppplus.fragmenttest.fragments.fragment_third_page

class fragmentTrainingAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3

    }

    override fun getItem(position: Int): Fragment {
        return when (position) {

            0 -> fragment_first_page()
            1 -> fragment_second_page()
            else -> fragment_third_page()
        }
        TODO("Not yet implemented")
    }

}