package com.example.teste1.ui.Numeros;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.teste1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Numeros1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Numeros1Fragment extends Fragment implements View.OnClickListener {

    private ImageView um , dois,tres,quatro,cinco,seis,sete,oito,nove,dez;

    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Numeros1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Numeros1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Numeros1Fragment newInstance(String param1, String param2) {
        Numeros1Fragment fragment = new Numeros1Fragment();
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
        View view = inflater.inflate(R.layout.fragment_numeros1, container, false);

        um = view.findViewById(R.id.um);
        dois = view.findViewById(R.id.dois);
        tres = view.findViewById(R.id.tres);
        quatro = view.findViewById(R.id.quatro);
        cinco = view.findViewById(R.id.cinco);
        seis = view.findViewById(R.id.seis);
        sete = view.findViewById(R.id.sete);
        oito = view.findViewById(R.id.oito);
        nove = view.findViewById(R.id.nove);
        dez = view.findViewById(R.id.dez);


        um.setOnClickListener(this);
        dois.setOnClickListener(this);
        tres.setOnClickListener(this);
        quatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        sete.setOnClickListener(this);
        oito.setOnClickListener(this);
        nove.setOnClickListener(this);
        dez.setOnClickListener(this);


        return  view;
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if(id == R.id.um){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.one);
            tocarSom();
        }else if(id == R.id.dois){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.two);
            tocarSom();
        }else if(id == R.id.tres){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.three);
            tocarSom();
        }else if(id == R.id.quatro){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.four);
            tocarSom();
        }else if(id == R.id.cinco){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.five);
            tocarSom();
        }else if(id == R.id.seis){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.six);
            tocarSom();
        }else if(id == R.id.sete){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.seven);
            tocarSom();
        }else if(id == R.id.oito){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.eight);
            tocarSom();
        }else if(id == R.id.nove){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.nine);
            tocarSom();
        }else if(id == R.id.dez){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.ten);
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