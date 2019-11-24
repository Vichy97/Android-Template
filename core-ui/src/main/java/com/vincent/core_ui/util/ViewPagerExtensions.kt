package com.vincent.core_ui.util

import androidx.viewpager.widget.ViewPager

fun ViewPager.onPageChanged(onPageChanged: (Int) -> Unit) {

    this.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

        override fun onPageScrollStateChanged(state: Int) {}

        override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
        ) {}

        override fun onPageSelected(position: Int) {
            onPageChanged(position)
        }
    })
}

fun ViewPager.onPageScrolled(onPageScrolled: (Int, Float, Int) -> Unit) {

    this.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

        override fun onPageScrollStateChanged(state: Int) {}

        override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
        ) {
            onPageScrolled(position, positionOffset, positionOffsetPixels)
        }

        override fun onPageSelected(position: Int) {}
    })
}

fun ViewPager.onPageScrollStateChanged(onPageScrollStateChanged: (Int) -> Unit) {

    this.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

        override fun onPageScrollStateChanged(state: Int) {
            onPageScrollStateChanged(state)
        }

        override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
        ) {}

        override fun onPageSelected(position: Int) {}
    })
}