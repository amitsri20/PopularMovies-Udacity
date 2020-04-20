package com.amit.popularmovies.reviews;

import android.os.Parcel;
import android.os.Parcelable;


public class MovieReviewModel implements Parcelable{
    public String mAuthor;
    public String mContent;

    public MovieReviewModel(String author, String content){
        this.mAuthor = author;
        this.mContent = content;
    }

    MovieReviewModel(Parcel parcel){
        this.mAuthor = parcel.readString();
        this.mContent = parcel.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(mAuthor);
        dest.writeString(mContent);
    }

    public static final Creator<MovieReviewModel> CREATOR = new Creator<MovieReviewModel>() {

        @Override
        public MovieReviewModel createFromParcel(Parcel parcel) {
            return new MovieReviewModel(parcel);
        }

        @Override
        public MovieReviewModel[] newArray(int size) {
            return new MovieReviewModel[size];
        }
    };
}
