package edu.temple.viewpagerinclasssctivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager2)
        viewPager.adapter = object: FragmentStateAdapter(this){
            override fun getItemCount(): Int {
                return 10
            }

            override fun createFragment(position: Int): Fragment {
                return TextFragment.newInstance(position.toString())
            }
        }

    }

}