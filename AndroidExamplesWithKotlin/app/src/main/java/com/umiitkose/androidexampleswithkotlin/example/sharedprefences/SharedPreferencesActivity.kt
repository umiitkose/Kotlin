package com.umiitkose.androidexampleswithkotlin.example.sharedprefences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umiitkose.androidexampleswithkotlin.R
import kotlinx.android.synthetic.main.activity_shared_preferences.*

class SharedPreferencesActivity : AppCompatActivity() {

    private lateinit var sharedPref: SharedPreferences

    companion object{
        val PREFERENCE_FILE_KEY = "my_pref_key"
        val EDT_KEY = "edk_key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)
        // Başka uygulamaların erişimini kapatmak için MODE_PRIVATE yaptık. Yalnızca bu uygulamadan okuyacağız. İlk parametre de xml dosya yolu
        sharedPref = getSharedPreferences(PREFERENCE_FILE_KEY, Context.MODE_PRIVATE)

    }

    private fun saveEdtValue(){
        //Sharedpreferences yazma işlemi
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor.apply(){
            putString(EDT_KEY,et_sp.text.toString())
            apply()
        }
    }

    private fun readValues(){
        val value = sharedPref.getString(EDT_KEY,"none")
        
    }
}
