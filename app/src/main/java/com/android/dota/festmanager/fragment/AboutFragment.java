package com.android.dota.festmanager.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import com.android.dota.festmanager.R;

import org.w3c.dom.Text;

public class AboutFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_text_display,container,false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView title = getActivity().findViewById(R.id.tv_title);
        TextView display = getActivity().findViewById(R.id.tv_display);
        title.setText(R.string.aboutus);
        display.setText(R.string.aboutfest);
    }
}
