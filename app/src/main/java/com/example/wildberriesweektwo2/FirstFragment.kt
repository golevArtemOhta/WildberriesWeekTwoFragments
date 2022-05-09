package com.example.wildberriesweektwo2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wildberriesweektwo2.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = "First fragment"
        binding.button.setOnClickListener {
            openFragment(SecondFragment.newInstance(), R.id.fragment)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = FirstFragment()
    }

    private fun openFragment(fragment: Fragment, idHolder: Int) {
        val secondFragment = SecondFragment.newInstance()
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(idHolder, fragment)
        transaction?.disallowAddToBackStack()
        transaction?.commit()
    }
}