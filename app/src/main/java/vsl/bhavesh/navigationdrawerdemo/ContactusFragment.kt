package vsl.bhavesh.navigationdrawerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ContactusFragment:Fragment()
{


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.contactus,container,false)
        return v
        //return super.onCreateView(inflater, container, savedInstanceState)
    }


}