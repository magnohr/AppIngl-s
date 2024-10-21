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
 * Use the {@link Alfabeto4Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Alfabeto4Fragment extends Fragment implements View.OnClickListener {

    private ImageView s,u,v,w,x,y,z;
    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Alfabeto4Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Alfabeto4Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Alfabeto4Fragment newInstance(String param1, String param2) {
        Alfabeto4Fragment fragment = new Alfabeto4Fragment();
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
        View view= inflater.inflate(R.layout.fragment_alfabeto4, container, false);

        s = view.findViewById(R.id.ss);
        u = view.findViewById(R.id.uu);
        v = view.findViewById(R.id.vv);
        w = view.findViewById(R.id.ww);
        x = view.findViewById(R.id.xx);
        y = view.findViewById(R.id.yy);
        z = view.findViewById(R.id.zz);


        s.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);


        return  view;
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(id == R.id.ss){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.s);
            tocarSom();
        } else if( id == R.id.uu){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.u);
            tocarSom();
        }else if( id == R.id.vv){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.v);
            tocarSom();
        }else if( id == R.id.ww){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.w);
            tocarSom();
        }else if( id == R.id.xx){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.x);
            tocarSom();
        }else if( id == R.id.yy){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.y);
            tocarSom();
        }else if( id == R.id.zz) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.z);
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