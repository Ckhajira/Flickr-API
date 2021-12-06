package com.example.techmarket;

public class FlickrAPI {
    static final String BASE_URL = "https://api.flickr.com/services/rest";
    static final String API_KEY = "465bc7a6758e44a8c075e91f4590f1f9";
    static final String TAG = "WebServicesFunTag";

    MainActivity mainActivity;
    public FlickrAPI(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    public void fetchInterestingPhotos(){
        //need a URL for the request
        String url = constructInterestingPhotoListURL();
        // Log.e(TAG, "fetchInterestingPhotos: " + url);

        //start the background task to fetch the photos
        //we have to use a background task
        //Android will not let you do any network activity
        //on the main UI thread
        //define a subclass a AsyncTask
        //asynchronous means doesn't wait/block
        FetchInterestingPhotoListAsyncTask asyncTask = new FetchInterestingPhotoListAsyncTask();
        asyncTask.execute(url);
    }
}
