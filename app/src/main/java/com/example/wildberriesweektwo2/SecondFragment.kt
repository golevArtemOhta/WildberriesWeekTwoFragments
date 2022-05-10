package com.example.wildberriesweektwo2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Live circle", "onCreate Fragment 2")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("Live circle", "onCreateView Fragment 2")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Live circle", "onViewCreated Fragment 2")
        activity?.title = "Second fragment"
        createAlertDialog()
    }

    companion object {
        @JvmStatic
        fun newInstance() = SecondFragment()
    }

    private fun createAlertDialog(){
        val builder = getContext()?.let { AlertDialog.Builder(it) }
        builder?.setTitle("Оценка выполнения")
        builder?.setMessage("Поставь зачет/незачет приложению")
        builder?.setPositiveButton("Зачет"){dialogInterface, i->
            Toast.makeText(getContext(), "УРА! ПОБЕДА!", Toast.LENGTH_LONG).show()
        }
        builder?.setNegativeButton("Незачет"){dialogInterface, i->
            Toast.makeText(getContext(), "Грусть, тоска!", Toast.LENGTH_LONG).show()
        }
        builder?.show()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Live circle", "onAttach Fragment 2")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("Live circle", "onViewStateRestored Fragment 2")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Live circle", "onStart Fragment 2")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Live circle", "onResume Fragment 2")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Live circle", "onPause Fragment 2")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Live circle", "onStop Fragment 2")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Live circle", "onSaveInstanceState Fragment 2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Live circle", "onDestroyView Fragment 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Live circle", "onDestroy Fragment 2")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Live circle", "onDetach Fragment 2")
    }

}