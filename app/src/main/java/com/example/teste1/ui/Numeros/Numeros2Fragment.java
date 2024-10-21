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
 * Use the {@link Numeros2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Numeros2Fragment extends Fragment implements View.OnClickListener{

    private ImageView vinte,trinta,quarenta,cinquenta,sesenta,setenta,oitenta,noventa,cem;

    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Numeros2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Numeros2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Numeros2Fragment newInstance(String param1, String param2) {
        Numeros2Fragment fragment = new Numeros2Fragment();
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
        View view = inflater.inflate(R.layout.fragment_numeros2, container, false);

        vinte =view.findViewById(R.id.vinte);
        trinta = view.findViewById(R.id.trinta);
        quarenta = view.findViewById(R.id.quarenta);
        cinquenta = view.findViewById(R.id.cinquenta);
        sesenta =view.findViewById(R.id.sesenta);
        setenta = view.findViewById(R.id.setenta);
        oitenta = view.findViewById(R.id.oitenta);
        noventa = view.findViewById(R.id.noventa);
        cem = view.findViewById(R.id.cem);


        vinte.setOnClickListener(this);
        trinta.setOnClickListener(this);
        quarenta.setOnClickListener(this);
        cinquenta.setOnClickListener(this);
        sesenta.setOnClickListener(this);
        setenta.setOnClickListener(this);
        oitenta.setOnClickListener(this);
        noventa.setOnClickListener(this);
        cem.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if(id ==R.id.vinte){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.twenty);
            tocarSom();
        }else if(id == R.id.trinta){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.thirty);
            tocarSom();
        }else if(id == R.id.quarenta){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.forty);
            tocarSom();
        }else if(id == R.id.cinquenta){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.fifty);
            tocarSom();
        }else if(id == R.id.sesenta){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.sixty);
            tocarSom();
        }else if(id == R.id.setenta){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.seventy);
            tocarSom();
        }else if(id == R.id.oitenta){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.eighty);
            tocarSom();
        }else if(id == R.id.noventa){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.ninety);
            tocarSom();
        }else if(id == R.id.cem){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.onehundred);
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