package com.example.teste1.ui.Comidas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.teste1.R;
import com.example.teste1.ui.Alfabeto.Alfabeto2Fragment;
import com.example.teste1.ui.Alfabeto.Alfabeto3Fragment;
import com.example.teste1.ui.Animais.Animais1Fragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ComidasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ComidasFragment extends Fragment {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ComidasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ComidasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ComidasFragment newInstance(String param1, String param2) {
        ComidasFragment fragment = new ComidasFragment();
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
        View view =inflater.inflate(R.layout.fragment_comidas, container, false);


        smartTabLayout = view.findViewById(R.id.viewpagertab);
        viewPager = view.findViewById(R.id.viewpager);


        // Usando getChildFragmentManager() dentro de um Fragment
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getChildFragmentManager(), // Corrigido para usar getChildFragmentManager
                FragmentPagerItems.with(getContext())
                        .add("Lugares", Comidas1Fragment.class)
                        .add("Lugares", Comidas2Fragment.class)
                        .add("Lugares", Comidas3Fragment.class)
                        .create()


        );

        // Configurando o adapter e o SmartTabLayout
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
        return view;
    }
}