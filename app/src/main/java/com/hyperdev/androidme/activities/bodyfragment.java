package com.hyperdev.androidme.activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hyperdev.androidme.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class bodyfragment extends Fragment {


    public bodyfragment() {
        
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bodyfragment, container, false);
    }

}
