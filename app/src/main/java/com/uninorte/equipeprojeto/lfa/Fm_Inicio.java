package com.uninorte.equipeprojeto.lfa;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by miguelmorales on 17/4/15.
 */
public class Fm_Inicio extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fm_inicio, container, false);

        return rootView;
    }
}
