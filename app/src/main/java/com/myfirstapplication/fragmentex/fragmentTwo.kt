package com.myfirstapplication.fragmentex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.frgament_two.view.*

class frgamentTwo: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.frgament_two, container, false)

        view.FTwoBut1.setOnClickListener(View.OnClickListener {

            var fragAct = fragmentAction()
            var myFragAct = fragmentManager!!.beginTransaction()
            myFragAct.replace(R.id.ml, fragAct).commit()

        })

        return view

    }

}