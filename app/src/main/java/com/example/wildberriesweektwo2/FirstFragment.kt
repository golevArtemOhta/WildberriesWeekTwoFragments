package com.example.wildberriesweektwo2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wildberriesweektwo2.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Live circle", "onCreate Fragment 1")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
        Log.d("Live circle", "onCreateView Fragment 1")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Live circle", "onViewCreated Fragment 1")
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

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Live circle", "onAttach Fragment 1")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("Live circle", "onViewStateRestored Fragment 1")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Live circle", "onStart Fragment 1")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Live circle", "onResume Fragment 1")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Live circle", "onPause Fragment 1")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Live circle", "onStop Fragment 1")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Live circle", "onSaveInstanceState Fragment 1")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Live circle", "onDestroyView Fragment 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Live circle", "onDestroy Fragment 1")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Live circle", "onDetach Fragment 1")
    }

}