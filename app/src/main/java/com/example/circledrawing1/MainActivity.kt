package com.example.circledrawing1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.circledrawing1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), InputFragment.FragmentCommunicationListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            add(R.id.fragment_container, InputFragment())
        }

    }

    override fun radiusEntered(radius: Float) {
        val fragment = supportFragmentManager.findFragmentByTag("f1") as? CircleFragment
        fragment?.drawCircle(fragment.binding.surfaceView.holder.lockCanvas(), radius)
    }
}