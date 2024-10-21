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
 * Use the {@link Cores2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cores2Fragment extends Fragment implements  View.OnClickListener {

    private ImageView branco, preto, rosa, roxo, cinza;
    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Cores2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cores2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Cores2Fragment newInstance(String param1, String param2) {
        Cores2Fragment fragment = new Cores2Fragment();
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
        View view = inflater.inflate(R.layout.fragment_cores2, container, false);

        branco = view.findViewById(R.id.branco);
        preto = view.findViewById(R.id.preto);
        rosa = view.findViewById(R.id.rosa);
        roxo = view.findViewById(R.id.roxo);
        cinza = view.findViewById(R.id.cinza);

        branco.setOnClickListener(this);
        preto.setOnClickListener(this);
        rosa.setOnClickListener(this);
        roxo.setOnClickListener(this);
        cinza.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.branco) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.branco);
            tocarSom();
        }else if (id == R.id.preto) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.preto);
            tocarSom();
        }else if (id == R.id.rosa) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.rosa);
            tocarSom();
        } else if (id == R.id.roxo) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.roxo);
            tocarSom();
        } else if (id == R.id.cinza) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cinza);
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