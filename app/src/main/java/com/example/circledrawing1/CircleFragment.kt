package com.example.circledrawing1

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.circledrawing1.databinding.FragmentCircleBinding

class CircleFragment : Fragment() {

    lateinit var binding: FragmentCircleBinding

//    private var radius: Float = 0f

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCircleBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    fun drawCircle(canvas: Canvas?, radius: Float) {
        canvas?.apply {
            val paint = Paint()

            paint.color = Color.RED
            paint.style = Paint.Style.FILL

            val centerX = width / 2f
            val centerY = height / 2f

            drawCircle(centerX, centerY, radius, paint)
        }
    }

}


