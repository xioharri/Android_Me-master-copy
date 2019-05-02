package com.example.android.android_me.ui;

import android.app.Fragment;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    //Constructer is needed to Instantating the fragment
    public BodyPartFragment(){

    }

    /*This method inflates the fragment layout in addition to its resources

     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflate android.me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        //return rootview
        return rootView;
    }
}
