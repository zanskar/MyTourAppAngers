package com.example.android.mytourappsaumur;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of monuments sites.
 */
public class MonumentsFragment extends Fragment {
    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        // Create a list of sites
        final ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(R.string.name_monument_1, R.string.address_monument_1, R.string.description_monument_1,
                R.drawable.angerscastle));
        sites.add(new Site(R.string.name_monument_2, R.string.address_monument_2, R.string.description_monument_2,
                R.drawable.cathedraleangers));
        sites.add(new Site(R.string.name_monument_3, R.string.address_monument_3, R.string.description_monument_3,
                R.drawable.musee_jean_lurcat));
        sites.add(new Site(R.string.name_monument_4, R.string.address_monument_4, R.string.description_monument_4,
                R.drawable.maison_adam));
        sites.add(new Site(R.string.name_monument_5, R.string.address_monument_5, R.string.description_monument_5,
                R.drawable.musee_du_genie));
        sites.add(new Site(R.string.name_monument_6, R.string.address_monument_6, R.string.description_monument_6,
                R.drawable.beaux_arts));
        sites.add(new Site(R.string.name_monument_7, R.string.address_monument_7, R.string.description_monument_7,
                R.drawable.museumhisnat));
        sites.add(new Site(R.string.name_monument_8, R.string.address_monument_8, R.string.description_monument_8,
                R.drawable.pince));

        // Create an {@link SiteAdapter}, whose data source is a list of {@link Site}s. The
        // adapter knows how to create list items for each item in the list.
        SiteAdapter adapter = new SiteAdapter(getActivity(), sites);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // site_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SiteAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Site} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}

