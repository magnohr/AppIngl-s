package com.example.teste1.ui.Cores;

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
 * Use the {@link Cores1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cores1Fragment extends Fragment implements View.OnClickListener{

    private ImageView vermelho,amarelo,azul,verde,marron ,laranja;
    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Cores1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cores1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Cores1Fragment newInstance(String param1, String param2) {
        Cores1Fragment fragment = new Cores1Fragment();
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
        View view = inflater.inflate(R.layout.fragment_cores1, container, false);

        vermelho = view.findViewById(R.id.vermelho);
        amarelo = view.findViewById(R.id.amarelo);
        verde = view.findViewById(R.id.verde);
        marron = view.findViewById(R.id.marron);
        azul = view.findViewById(R.id.azul);
        laranja = view.findViewById(R.id.laranja1);


        vermelho.setOnClickListener(this);
        amarelo.setOnClickListener(this);
        verde.setOnClickListener(this);
        marron.setOnClickListener(this);
        azul.setOnClickListener(this);
        laranja.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {


        int id = v.getId();
        if(id == R.id.vermelho){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.vermelho);
            tocarSom();
        } else if( id == R.id.amarelo){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.amarelo);
            tocarSom();
        }else if( id == R.id.verde){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.verde);
            tocarSom();
        }else if( id == R.id.azul){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.azul);
            tocarSom();
        }else if( id == R.id.marron){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.marron);
            tocarSom();
        }else if( id == R.id.laranja1){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.laranja);
            tocarSom();
        }



    }

    public void tocarSom(){
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