package br.com.nouva.onboarding.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import br.com.nouva.core.setColouredSpan
import br.com.nouva.onboarding.R
import br.com.nouva.onboarding.databinding.FragmentOnbLoginStepOneBinding

class OnbLoginStepOneFragment : Fragment() {

     private val secondary by lazy {
        ContextCompat.getColor(requireContext(),
            R.color.colorLightSecondary090
        )
    }

    private lateinit var binding: FragmentOnbLoginStepOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        binding = FragmentOnbLoginStepOneBinding.inflate(layoutInflater).apply {
            lifecycleOwner = viewLifecycleOwner
        }

        initView()

        return binding.root
    }

    private fun initView() {
        binding.layoutArrowNext.setOnClickListener {
            findNavController().navigate(
                R.id.action_onbLoginStepOneFragment_to_onbLoginStepTwoFragment)
        }

        binding.tvLabelStepOne.apply {
            setColouredSpan(
                "Unimos pessoas com habilidades que outras precisam.",
                19, 31, secondary
            )
        }
    }

}