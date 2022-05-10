package com.example.wildberriesweektwo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.wildberriesweektwo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*
    1) Жизненный цикл активити и фрагмента нужен для того, чтобы система могла понять \
    приоритетность работы экранов или приложений. А также для того, чтобы на основании этой приоритетности
    система могла закрывать те или иные экраны/приложения для высвобождения ресурсов
    Например, с помощью жизненного цикла можно решать следующие задачи:
    - в методе onPause - можно останавливатғ работу GPS навигатора или останавливать проигрывание
    музыки/видео
    - в методе onStop - можно сохранять данные в базу данных

    2) 3 примера использования жизненного цикла в реальны приложениях:
     - приостановка видео в приложении YouTube при сворачивании экрана (происходит скорее всего
     в методе onPause);
     - в любом мессенджере при написании сообщения и его не отправке, написанный текст при закрытии
     приложения, как правило, никуда не удаляется. Сохранения текста, скорее всего, происходит в
     методе onStop;

    3) Музыкальный проигрыватель останавливает музыку при входящем звонке.
    Обработка остановки происходит в onPause
    */

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("Live circle", "onCreate Activity 1")

        if (savedInstanceState == null) {
            openFragment(FirstFragment.newInstance(), R.id.fragment)
        }

    }

    private fun openFragment(fragment: Fragment, idHolder: Int) {
        supportFragmentManager
            .beginTransaction()
            .replace(idHolder, fragment)
            .commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Live circle", "onStart Activity 1")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Live circle", "onResume Activity 1")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Live circle", "onPause Activity 1")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Live circle", "onStop Activity 1")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Live circle", "onRestart Activity 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Live circle", "onDestroy Activity 1")
    }

}