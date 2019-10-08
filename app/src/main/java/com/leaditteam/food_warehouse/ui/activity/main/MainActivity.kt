package com.leaditteam.food_warehouse.ui.activity.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.leaditteam.food_warehouse.R
import com.leaditteam.food_warehouse.databinding.ActivityMainBinding
import com.leaditteam.food_warehouse.ui.fragment.menu.MainManuFragment
import com.leaditteam.food_warehouse.utils.viewModel
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein

class MainActivity : AppCompatActivity(), KodeinAware {

    override val kodein by kodein()

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding =
                    DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
                        .apply {
                            mainViewModel = viewModel
                }
        /*binding.lifecycleOwner = this*/

        supportFragmentManager.beginTransaction().replace(R.id.main_container, MainManuFragment())
            .commit()
    }
}
