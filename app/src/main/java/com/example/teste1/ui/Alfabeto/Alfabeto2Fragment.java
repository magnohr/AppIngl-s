package com.example.teste1.ui.Alfabeto;

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
 * Use the {@link Alfabeto2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Alfabeto2Fragment extends Fragment implements View.OnClickListener{
    private ImageView a ,b,c,d,e,f,g,h,i;
    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Alfabeto2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Alfabeto2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Alfabeto2Fragment newInstance(String param1, String param2) {
        Alfabeto2Fragment fragment = new Alfabeto2Fragment();
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
        View view = inflater.inflate(R.layout.fragment_alfabeto2, container, false);

        a = view.findViewById(R.id.aa);
        b = view.findViewById(R.id.bb);
        c = view.findViewById(R.id.cc);
        d = view.findViewById(R.id.dd);
        e = view.findViewById(R.id.ee);
        f = view.findViewById(R.id.ff);
        g = view.findViewById(R.id.gg);
        h = view.findViewById(R.id.hh);
        i = view.findViewById(R.id.ii);

   a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
       f.setOnClickListener(this);
       g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(id == R.id.aa){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.a);
            tocarSom();
        } else if( id == R.id.bb){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.b);
            tocarSom();
        }else if( id == R.id.cc){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.c);
            tocarSom();
        }else if( id == R.id.dd){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.d);
            tocarSom();
        }else if( id == R.id.ee){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.e);
            tocarSom();
        }else if( id == R.id.ff){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.f);
            tocarSom();
        }else if( id == R.id.gg){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.g);
            tocarSom();
        }else if( id == R.id.hh){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.h);
            tocarSom();
        }else if( id == R.id.ii){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.i);
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