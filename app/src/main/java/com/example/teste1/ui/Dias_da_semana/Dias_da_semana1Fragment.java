package com.example.teste1.ui.Dias_da_semana;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.teste1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Dias_da_semana1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Dias_da_semana1Fragment extends Fragment implements View.OnClickListener {

    private Button segunda,terca ,quarta,quinta,sexta,sabado,domingo;
    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Dias_da_semana1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Dias_da_semana1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Dias_da_semana1Fragment newInstance(String param1, String param2) {
        Dias_da_semana1Fragment fragment = new Dias_da_semana1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_dias_da_semana1, container, false);

        segunda = view.findViewById(R.id.segunda);
        terca = view.findViewById(R.id.terca);
        quarta = view.findViewById(R.id.quarta);
        quinta = view.findViewById(R.id.quinta);
        sexta = view.findViewById(R.id.sexta);
        sabado = view.findViewById(R.id.sabado);
        domingo = view.findViewById(R.id.domingo);

       segunda.setOnClickListener(this);
        terca.setOnClickListener(this);
        quarta.setOnClickListener(this);
        quinta.setOnClickListener(this);
        sexta.setOnClickListener(this);
        sabado.setOnClickListener(this);
        domingo.setOnClickListener(this);



        return view;
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if (id == R.id.segunda){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.monday);
            tocarSom();
        } else if (id == R.id.terca) {
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.tuesday);
            tocarSom();

        }else if (id == R.id.quarta) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wednesday);
            tocarSom();

        }else if (id == R.id.quinta) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tuesday);
            tocarSom();

        }else if (id == R.id.sexta) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.friday);
            tocarSom();

        }else if (id == R.id.sabado) {

            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.saturday);
            tocarSom();

        }else if (id == R.id.domingo) {

            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sunday);
            tocarSom();

        }

    }

    public  void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }

    }
}