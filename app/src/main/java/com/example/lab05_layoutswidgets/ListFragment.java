package com.example.lab05_layoutswidgets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        LinearLayout btnCatedral = view.findViewById(R.id.btnCatedral);
        LinearLayout btnClaustro = view.findViewById(R.id.btnClaustro);

        btnCatedral.setOnClickListener(v ->
                loadFragment(new CatedralFragment()));

        btnClaustro.setOnClickListener(v ->
                loadFragment(new ClaustroFragment()));

        return view;
    }

    private void loadFragment(Fragment fragment) {
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
