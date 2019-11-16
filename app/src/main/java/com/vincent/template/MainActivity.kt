package com.vincent.template

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.vincent.template.R

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val navController: NavController by lazy { findNavController(R.id.nav_host_fragment) }

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_App)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupToolbar()
        setupDrawerLayout()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        setupActionBarWithNavController(navController, drawer_layout)
    }

    private fun setupDrawerLayout() {
        nav_view.setupWithNavController(navController)

        nav_view.setNavigationItemSelectedListener {
            drawer_layout.closeDrawers()

            false
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(drawer_layout)
    }
}
