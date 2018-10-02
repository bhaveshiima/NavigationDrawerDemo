package vsl.bhavesh.navigationdrawerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class StaffFragment:Fragment()
{


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.staff,container,false)
        return v
        //return super.onCreateView(inflater, container, savedInstanceState)
    }


}