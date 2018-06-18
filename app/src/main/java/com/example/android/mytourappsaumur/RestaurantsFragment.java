package com.example.android.mytourappsaumur;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants sites.
 */
public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        // Create a list of sites
        final ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(R.string.name_restaurant_1, R.string.address_restaurant_1, R.string.description_restaurant_1));
        sites.add(new Site(R.string.name_restaurant_2, R.string.address_restaurant_2, R.string.description_restaurant_2));
        sites.add(new Site(R.string.name_restaurant_3, R.string.address_restaurant_3, R.string.description_restaurant_3));
        sites.add(new Site(R.string.name_restaurant_4, R.string.address_restaurant_4, R.string.description_restaurant_4));
        sites.add(new Site(R.string.name_restaurant_5, R.string.address_restaurant_5, R.string.description_restaurant_5));
        sites.add(new Site(R.string.name_restaurant_6, R.string.address_restaurant_6, R.string.description_restaurant_6));
        sites.add(new Site(R.string.name_restaurant_7, R.string.address_restaurant_7, R.string.description_restaurant_7));

        // Create an {@link SiteAdapter}, whose data source is a list of {@link Site}. The
        // adapter knows how to create list items for each item in the list.
        SiteAdapter adapter = new SiteAdapter(getActivity(), sites);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // site_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SiteAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Site} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
