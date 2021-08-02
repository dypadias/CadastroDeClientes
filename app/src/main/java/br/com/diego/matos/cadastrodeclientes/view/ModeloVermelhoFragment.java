package br.com.diego.matos.cadastrodeclientes.view;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import app.br.com.matos.cadastrodeclientes.R;


public class ModeloVermelhoFragment extends Fragment {

    View view;

    public ModeloVermelhoFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_vermelho, container, false);

        TextView txtTitulo = view.findViewById(R.id.txtTituloListar);

        txtTitulo.setText(R.string.modelo_fragment);

        txtTitulo.setTextColor(ColorStateList.valueOf(Color.CYAN));

        return view;
    }


}
