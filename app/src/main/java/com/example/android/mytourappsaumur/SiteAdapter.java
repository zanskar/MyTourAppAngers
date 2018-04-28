package com.example.android.mytourappsaumur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SiteAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Site} objects.
 */
public class SiteAdapter extends ArrayAdapter<Site> {

    /**
     * Create a new {@link SiteAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param sites   is the list of {@link Site}s to be displayed.
     */
    public SiteAdapter(Context context, ArrayList<Site> sites) {
        super(context, 0, sites);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Site} object located at this position in the list
        Site currentSite = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID site_name_text_view.
        TextView siteNameTextView = (TextView) listItemView.findViewById(R.id.site_name_text_view);
        // Get the Site Name from the currentSite object and set this text on
        // the Site Name TextView.
        siteNameTextView.setText(currentSite.getSiteNameId());

        // Find the TextView in the list_item.xml layout with the ID site_address_text_view.
        TextView siteAddressTextView = (TextView) listItemView.findViewById(R.id.site_address_text_view);
        // Get the Site Address from the currentSite object and set this text on
        // the Site Address TextView.
        siteAddressTextView.setText(currentSite.getSiteAddressId());

        // Find the TextView in the list_item.xml layout with the ID site_description_text_view.
        TextView siteDescriptionTextView = (TextView) listItemView.findViewById(R.id.site_description_text_view);
        // Get the Site Description from the currentSite object and set this text on
        // the Site Description TextView.
        siteDescriptionTextView.setText(currentSite.getSiteDescriptionId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Check if an image is provided for this word or not
        if (currentSite.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentSite.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}