package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.viewPager)
        val tab = findViewById<TabLayout>(R.id.tabLayout)

        tab.setupWithViewPager(pager)

        val fragments = listOf(MeuFragment(), MeuFragment(), MeuFragment())

        val titulos = listOf(getString(R.string.home), getString(R.string.biblioteca), getString(R.string.favoritos))

        pager.adapter = ViewPagerAdapter(fragments, titulos, supportFragmentManager)

        tab.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tab.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_library_books_24)
        tab.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_star_24)

        // Adiciona badge na segunda tab

        tab.getTabAt(1)!!.orCreateBadge.apply {
            number = 100
            maxCharacterCount = 3
            isVisible = true
        }

        // A ideia é fazer com que ao clicar na segunda tab, que é a que tem notificação,
        // essa notificação seja ocultada, pois o usuário "já leu" as novidades dela
        tab.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
            override fun onTabSelected(selected: TabLayout.Tab?) {
                // Verifica se é a segunda tab
                if (selected!!.position == 1) {
                    // Deixa invisível
                    tab.getTabAt(1)!!.badge?.isVisible = false
                }
            }

            // Não precisa de nada
            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            // Não precisa de nada
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }
}


