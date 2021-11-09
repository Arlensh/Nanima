package com.optic.nanima.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.optic.nanima.R;
import com.optic.nanima.activities.FiltersActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class FiltersFragment extends Fragment {

    View mView;
    CardView mCardViewlol;
    CardView mCardViewfortnite;
    CardView mCardViewminecraft;
    CardView mCardViewcod;

    public FiltersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_filters, container, false);
        mCardViewlol = mView.findViewById(R.id.cardViewlol);
        mCardViewfortnite = mView.findViewById(R.id.cardViewfortnite);
        mCardViewminecraft = mView.findViewById(R.id.cardViewminecraft);
        mCardViewcod = mView.findViewById(R.id.cardViewcod);

        mCardViewlol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFilterActivity("League of legends");
            }
        });

        mCardViewfortnite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFilterActivity("Fortnite");
            }
        });

        mCardViewminecraft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFilterActivity("Minecraft");
            }
        });

        mCardViewcod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFilterActivity("Call of duty");
            }
        });

        return mView;
    }

    private void goToFilterActivity(String category) {
        Intent intent = new Intent(getContext(), FiltersActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}
