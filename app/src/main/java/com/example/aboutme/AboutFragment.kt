package com.example.aboutme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    // Объявляем Binding (он заменит findViewById)
    private lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Связываем макет с DataBinding
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_about,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Обработка кнопки через Binding (без findViewById!)
        binding.nextButton.setOnClickListener {
            // Пока просто покажем сообщение
            binding.titleTextView.text = "Кнопка нажата!"
        }
    }
}