package com.example.giftest2;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class fragmentSneakers extends Fragment {
    ListView list;
    View view;

    public fragmentSneakers() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.sneakers_fragment,container,false);
        final String mainMenu[] = getResources().getStringArray(R.array.sneakers);
        final Intent checkout = new Intent(getActivity(),DisplayProduct.class);

        list = (ListView) view.findViewById(R.id.extrasList);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                    String value = mainMenu[position];
                    checkout.putExtra("value",value);
                    startActivity(checkout);
                    getActivity().finish();
            }
        });

        return view;
    }
}
