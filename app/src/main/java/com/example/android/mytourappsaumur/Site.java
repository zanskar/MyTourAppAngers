package com.example.android.mytourappsaumur;

/**
 * {@link Site} represents a touristic site to visit.
 * It contains text description for this site and
 * optional image file for that word.
 */
public class Site {

    /**
     * String resource ID for the Name of the site
     */
    private int mSiteNameId;

    /**
     * String resource ID for the Address of the site
     */
    private int mSiteAddressId;

    /**
     * String resource ID for the Description of the site
     */
    private int mSiteDescriptionId;

    /**
     * Image resource ID for the site
     */
    private int mImageResourceId;

    /**
     * Create a new Site object.
     *
     * @param siteNameId        is the string resource ID for the site name
     * @param siteAddressId     is the string resource Id for the site address
     * @param siteDescriptionId is the string ID for the site description
     * @param imageResourceId   is the resource ID for the image file associated with this site
     */
    public Site(int siteNameId, int siteAddressId, int siteDescriptionId, int imageResourceId) {
        mSiteNameId = siteNameId;
        mSiteAddressId = siteAddressId;
        mSiteDescriptionId = siteDescriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Return the image resource ID of the site
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return the the string resource ID for the site name
     */
    public int getSiteNameId() {
        return mSiteNameId;
    }

    /**
     * Return the string resource Id for the site address
     */
    public int getSiteAddressId() {
        return mSiteAddressId;
    }

    /**
     * Return the string resource ID for the site description.
     */
    public int getSiteDescriptionId() {
        return mSiteDescriptionId;
    }
}