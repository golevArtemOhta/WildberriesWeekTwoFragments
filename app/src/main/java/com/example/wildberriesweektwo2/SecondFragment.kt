package com.example.wildberriesweektwo2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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

}