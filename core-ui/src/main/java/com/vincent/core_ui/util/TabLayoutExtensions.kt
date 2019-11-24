package com.vincent.core_ui.util

import com.google.android.material.tabs.TabLayout

fun TabLayout.onTabSelected(onTabSelected: (TabLayout.Tab) -> Unit) {

    this.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

        override fun onTabSelected(tab: TabLayout.Tab) {
            onTabSelected.invoke(tab)
        }

        override fun onTabUnselected(tab: TabLayout.Tab) {}

        override fun onTabReselected(tab: TabLayout.Tab) {}
    })
}

fun TabLayout.onTabUnselected(onTabUnselected: (TabLayout.Tab) -> Unit) {

    this.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

        override fun onTabSelected(tab: TabLayout.Tab) {}

        override fun onTabUnselected(tab: TabLayout.Tab) {
            onTabUnselected(tab)
        }

        override fun onTabReselected(tab: TabLayout.Tab) {}
    })
}

fun TabLayout.onTabReselected(onTabReselected: (TabLayout.Tab) -> Unit) {

    this.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

        override fun onTabSelected(tab: TabLayout.Tab) {}

        override fun onTabUnselected(tab: TabLayout.Tab) {}

        override fun onTabReselected(tab: TabLayout.Tab) {
            onTabReselected(tab)
        }
    })
}