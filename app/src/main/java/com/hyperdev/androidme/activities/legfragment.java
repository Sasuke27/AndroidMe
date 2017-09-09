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
public class legfragment extends Fragment {


    public legfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_legfragment, container, false);
    }

}
