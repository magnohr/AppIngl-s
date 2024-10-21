package com.example.teste1.ui.Animais;

import static com.example.teste1.R.id.*;
import static com.example.teste1.R.id.cachorro;

import android.annotation.SuppressLint;
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
 * Use the {@link Animais1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Animais1Fragment extends Fragment implements View.OnClickListener{


    private ImageView cao;
    private ImageView coruja ;
    private ImageView camelo;
    private ImageView gato ;
    private ImageView girafa;
    private ImageView tucano;

    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Animais1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Animais1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Animais1Fragment newInstance(String param1, String param2) {
        Animais1Fragment fragment = new Animais1Fragment();
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
        View view = inflater.inflate(R.layout.fragment_animais1, container, false);

        cao = view.findViewById(cachorro);
        coruja = view.findViewById(R.id.coruja);
        camelo = view.findViewById(R.id.camelo);
        gato = view.findViewById(R.id.gato);
        girafa = view.findViewById(R.id.girafa);
        tucano = view.findViewById(R.id.tucano);

        /////// evento de click

        cao.setOnClickListener(this);
        coruja.setOnClickListener(this);
        camelo.setOnClickListener(this);
        gato.setOnClickListener(this);
        girafa.setOnClickListener(this);
        tucano.setOnClickListener(this);

        return view;
    }

    ////////////
    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.cachorro) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
            tocarSom();
        } else if (id == R.id.coruja) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.owl); // Exemplo para coruja
            tocarSom();
        } else if (id == R.id.camelo) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.camel); // Exemplo para camelo
            tocarSom();
        }  else if (id == R.id.gato){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cat);
            tocarSom();
        } else if (id == R.id.girafa){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.giraffe);
            tocarSom();
        } else if (id == R.id.tucano){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.toucan);
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