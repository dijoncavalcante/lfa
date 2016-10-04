package com.uninorte.equipeprojeto.lfa;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by Leandro on 24/09/2016.
 * Esse fragment e utilizado apenas para a exibicao do assunto a ser escolhido. a imagem sera
 * sobreposta conforme o assunto escolhido
 */
public class Assunto extends Fragment {
    private ImageView imagem_conteudo;
    private PhotoViewAttacher zoom;//para habilitar zoom na imagem

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.assunto_conteudo, container, false);

        Bundle a = getArguments();
        int res = a.getInt("id");//obtem o id da imagem do assunto selecionado

        imagem_conteudo = (ImageView) rootView.findViewById(R.id.imagem);
        imagem_conteudo.setImageResource(res);

        zoom = new PhotoViewAttacher(imagem_conteudo);

        return rootView;
    }
}


