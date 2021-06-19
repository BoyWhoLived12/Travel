package com.example.fragments1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            val bundle = bundleOf("someInt" to 0)
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<TestFragment>(R.id.fragment_container_view,args = bundle)
            }
        }
    }
}