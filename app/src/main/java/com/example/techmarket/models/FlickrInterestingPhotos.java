
package com.example.techmarket.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class FlickrInterestingPhotos {

    @SerializedName("photos")
    @Expose
    private Photos photos;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FlickrInterestingPhotos() {
    }

    /**
     * 
     * @param photos
     */
    public FlickrInterestingPhotos(Photos photos) {
        super();
        this.photos = photos;
    }

    public Photos getPhotos() {
        return photos;
    }

    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

}
