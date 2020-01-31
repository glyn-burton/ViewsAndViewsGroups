package com.example.viewsandviewsgroups
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onGenerateLabel(view: View) {
        var boldFont = Typeface.createFromAsset(assets,"Lovelo-Black.ttf")
        val firstName = etName.text.toString()
        val surname = etSurname.text.toString()
        val address = etStreetAddress.text.toString()
        val city = etCity.text.toString()
        val state = etState.text.toString()
        val zip = etZip.text.toString()


        val fullInfo = Person(firstName,surname,address,city,state,zip)
        Log.d("TAG",fullInfo.toString())

        val nameText = etNameOutput

        nameText.text = firstName +" "+surname

        var infoText = etAddressOutput

        infoText.text = address+"\n"+city+", "+state+" "+zip



    }
}
