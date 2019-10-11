package com.myfirstapplication.fragmentex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_action.*
import kotlinx.android.synthetic.main.fragment_action.view.*

class fragmentAction: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_action, container, false)


        var myStr: String = view.editText.toString()

        view.button2.setOnClickListener(View.OnClickListener {


            var fragOne = fragmentOne()
            var myFragOne = fragmentManager!!.beginTransaction()
            myFragOne.replace(R.id.ml, fragOne).commit()


        })


        view.button3.setOnClickListener(View.OnClickListener {

            var fragTwo = frgamentTwo()
            var myFragTwo = fragmentManager!!.beginTransaction()
            myFragTwo.replace(R.id.ml, fragTwo).commit()

        })


        return view


    }

}