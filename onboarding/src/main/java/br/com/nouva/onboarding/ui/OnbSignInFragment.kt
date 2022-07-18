package br.com.nouva.onboarding.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import br.com.nouva.core.setColouredSpan
import br.com.nouva.onboarding.databinding.FragmentOnbSiginBinding

class OnbSignInFragment : Fragment() {

    private lateinit var binding: FragmentOnbSiginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        binding = FragmentOnbSiginBinding.inflate(layoutInflater).apply {
            lifecycleOwner = viewLifecycleOwner
        }

        initView()

        return binding.root
    }

    private fun initView() {
        binding.tvForgotPassword.setColouredSpan(
            "Esqueceu sua senha? mude aqui.",
            20, 30, lazy {
                ContextCompat.getColor(
                    requireContext(),
                    br.com.nouva.migrate.R.color.colorSecondary
                )
            }.value
        )
    }
}