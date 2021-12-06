package com.example.techmarket;

public class FlickrAPI {
    static final String BASE_URL = "https://api.flickr.com/services/rest";
    static final String API_KEY = "465bc7a6758e44a8c075e91f4590f1f9";
    static final String TAG = "WebServicesFunTag";

    MainActivity mainActivity;
    public FlickrAPI(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }
}
