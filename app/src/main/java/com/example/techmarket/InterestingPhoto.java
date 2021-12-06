package com.example.techmarket;

public class InterestingPhoto {
    String id;
    String title;
    String dateTaken;
    String photoURL;

    public InterestingPhoto(String id, String title, String dateTaken, String photoURL) {
        this.id = id;
        this.title = title;
        this.dateTaken = dateTaken;
        this.photoURL = photoURL;
    }
    @Override
    public String toString() {
        return "InterestingPhoto{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", dateTaken='" + dateTaken + '\'' +
                ", photoURL='" + photoURL + '\'' +
                '}';
    }
}
