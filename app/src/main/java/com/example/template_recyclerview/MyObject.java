package com.example.template_recyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class MyObject implements Parcelable {
    private String backgroundImageUrl;
    private String sharingLogoUrl;
    private String newspaperTitle;
    private String articleShortText;
    private String articleAuthor;
    private String articleDate;

    public MyObject(String backgroundImageUrl, String sharingLogoUrl, String newspaperTitle, String articleShortText, String articleAuthor, String articleDate) {
        this.backgroundImageUrl = backgroundImageUrl;
        this.sharingLogoUrl = sharingLogoUrl;
        this.newspaperTitle = newspaperTitle;
        this.articleShortText = articleShortText;
        this.articleAuthor = articleAuthor;
        this.articleDate = articleDate;
    }

        //GESTION DU PARCELABLE
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(backgroundImageUrl);
        dest.writeString(sharingLogoUrl);
        dest.writeString(newspaperTitle);
        dest.writeString(articleShortText);
        dest.writeString(articleAuthor);
        dest.writeString(articleDate);
    }

    protected MyObject(Parcel in) {
        backgroundImageUrl = in.readString();
        sharingLogoUrl = in.readString();
        newspaperTitle = in.readString();
        articleShortText = in.readString();
        articleAuthor = in.readString();
        articleDate = in.readString();
    }

    public static final Creator<MyObject> CREATOR = new Creator<MyObject>() {
        @Override
        public MyObject createFromParcel(Parcel in) {
            return new MyObject(in);
        }

        @Override
        public MyObject[] newArray(int size) {
            return new MyObject[size];
        }
    };
    //FIN GESTION DU PARCELABLE

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
    }

    public void setBackgroundImageUrl(String backgroundImageUrl) {
        this.backgroundImageUrl = backgroundImageUrl;
    }

    public String getSharingLogoUrl() {
        return sharingLogoUrl;
    }

    public void setSharingLogoUrl(String sharingLogoUrl) {
        this.sharingLogoUrl = sharingLogoUrl;
    }

    public String getNewspaperTitle() {
        return newspaperTitle;
    }

    public void setNewspaperTitle(String newspaperTitle) {
        this.newspaperTitle = newspaperTitle;
    }

    public String getArticleShortText() {
        return articleShortText;
    }

    public void setArticleShortText(String articleShortText) {
        this.articleShortText = articleShortText;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

}
