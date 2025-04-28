package com.example.renergify;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentTransaction;


public class Knowledge_AreaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_knowledge__area, container, false);

        View item1 = view.findViewById(R.id.item1);
        View item2 = view.findViewById(R.id.item2);
        View item3 = view.findViewById(R.id.item3);
        View item4 = view.findViewById(R.id.item4);
        View item5 = view.findViewById(R.id.item5);

        View.OnClickListener goToKnowledge = v -> {
            FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, new KnowledgeFragment());
            transaction.addToBackStack(null);
            transaction.commit();
        };

        item1.setOnClickListener(goToKnowledge);
        item2.setOnClickListener(goToKnowledge);
        item3.setOnClickListener(goToKnowledge);
        item4.setOnClickListener(goToKnowledge);
        item5.setOnClickListener(goToKnowledge);

        return view;
    }
}
