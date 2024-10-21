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
 * Use the {@link Alfabeto3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Alfabeto3Fragment extends Fragment implements  View.OnClickListener{

    private ImageView j,k,l,m,n,o,p,q,r;
    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Alfabeto3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Alfabeto3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Alfabeto3Fragment newInstance(String param1, String param2) {
        Alfabeto3Fragment fragment = new Alfabeto3Fragment();
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
        View view = inflater.inflate(R.layout.fragment_alfabeto3, container, false);

        j = view.findViewById(R.id.jj);
        k = view.findViewById(R.id.kk);
        l = view.findViewById(R.id.ll);
        m = view.findViewById(R.id.mm);
        n = view.findViewById(R.id.nn);
        o= view.findViewById(R.id.oo);
        p= view.findViewById(R.id.pp);
        q = view.findViewById(R.id.qq);
        r = view.findViewById(R.id.rr);

        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if(id == R.id.jj){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.j);
            tocarSom();
        } else if (id == R.id.kk) {
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.k);
            tocarSom();

        }else if (id == R.id.ll) {
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.l);
            tocarSom();

        }else if (id == R.id.mm) {
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.m);
            tocarSom();

        }else if (id == R.id.nn) {
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.n);
            tocarSom();

        }else if (id == R.id.oo) {
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.o);
            tocarSom();

        }else if (id == R.id.pp) {
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.p);
            tocarSom();

        }else if (id == R.id.qq) {
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.q);
            tocarSom();

        }else if (id == R.id.rr) {
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.r);
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