package com.example.techmarket.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import com.example.techmarket.R;
import com.example.techmarket.models.InterestingPhoto;

public class PaintingActivity {

    static final String TAG = "WebServicesFunTag";

    InterestingPhotosActivity interestingPhotosActivity;
    public PaintingActivity(InterestingPhotosActivity interestingPhotosActivity){
        this.interestingPhotosActivity = interestingPhotosActivity;
    }

    public void fetchInterestingPhotos(){

        String url = constructInterestingPhotoListURL();
        FetchInterestingPhotoListAsyncTask asyncTask = new FetchInterestingPhotoListAsyncTask();
        asyncTask.execute(url);
    }
    public String constructInterestingPhotoListURL(){
        String url ="https://api.flickr.com/services/rest";
        url += "?method=flickr.interestingness.getList";
        url += "&api_key=" + "465bc7a6758e44a8c075e91f4590f1f9";
        url += "&format=json";
        url += "&nojsoncallback=1";
        url += "&extras=date_taken,url_h";
        return url;
    }
    class FetchInterestingPhotoListAsyncTask extends AsyncTask<String, Void, List<InterestingPhoto>> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            ProgressBar progressBar = interestingPhotosActivity.findViewById(R.id.progressBar);
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected List<InterestingPhoto> doInBackground(String... strings) {

            String url = strings[0];
            List<InterestingPhoto> interestingPhotoList = new ArrayList<>();

            try {
                URL urlObject = new URL(url);
                HttpsURLConnection urlConnection = (HttpsURLConnection) urlObject.openConnection();


                String jsonResult ="";
                InputStream in= urlConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(in);
                int data = reader.read();
                while(data != -1){
                    jsonResult += (char) data;
                    data = reader.read();
                }
                Log.d(TAG, "doInBackground: " + jsonResult);


                JSONObject jsonObject = new JSONObject(jsonResult);

                JSONObject photosObject = jsonObject.getJSONObject("photos");
                JSONArray photoArray = photosObject.getJSONArray("photo");
                for (int i = 0; i<photoArray.length(); i++){
                    JSONObject singlePhotoObject = photoArray.getJSONObject(i);

                    InterestingPhoto interestingPhoto = parseInterestingPhoto(singlePhotoObject);
                    if(interestingPhoto != null){
                        interestingPhotoList.add(interestingPhoto);
                    }

                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return interestingPhotoList;
        }
        private InterestingPhoto parseInterestingPhoto(JSONObject singlePhotoObject){
            InterestingPhoto interestingPhoto = null;
            try{
                String id = singlePhotoObject.getString("id");
                String title =  singlePhotoObject.getString("title");
                String dateTaken = singlePhotoObject.getString("datetaken");
                String photoURL = singlePhotoObject.getString("url_h");
                interestingPhoto = new InterestingPhoto(id, title,dateTaken,photoURL);
            }
            catch (JSONException e){

            }
            return interestingPhoto;

        }

        @Override
        protected void onPostExecute(List<InterestingPhoto> interestingPhotos) {
            super.onPostExecute(interestingPhotos);

            Log.d(TAG, "onPostExecute: " + interestingPhotos.size());
            interestingPhotosActivity.receivedInterestingPhotos(interestingPhotos);

            ProgressBar progressBar = interestingPhotosActivity.findViewById(R.id.progressBar);
            progressBar.setVisibility(View.GONE);
        }
    }
    //GS:added
    public void fetchPhotoBitmap(String photoUrl){
        PhotoRequestAsyncTask asyncTask = new PhotoRequestAsyncTask();
        asyncTask.execute(photoUrl);
    }
    //GS:added
    class PhotoRequestAsyncTask extends AsyncTask<String, Void, Bitmap>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            ProgressBar progressBar = (ProgressBar) interestingPhotosActivity.findViewById(R.id.progressBar);
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            Bitmap bitmap = null;

            try {
                URL url = new URL(strings[0]);
                HttpsURLConnection urlConnection = (HttpsURLConnection)
                        url.openConnection();
                InputStream in = urlConnection.getInputStream();
                bitmap = BitmapFactory.decodeStream(in);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            ProgressBar progressBar = (ProgressBar) interestingPhotosActivity.findViewById(R.id.progressBar);
            progressBar.setVisibility(View.GONE);
            interestingPhotosActivity.receivedPhotoBitmap(bitmap);
        }
    }


}
