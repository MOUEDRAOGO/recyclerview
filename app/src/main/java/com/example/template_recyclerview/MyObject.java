package com.example.template_recyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class MyObject implements Parcelable {
    private String backgroundImage;
    private String sharingLogo;
    private String newspaperTitle;
    private String articleShortText;
    private String articleAuthor;
    private String articleDate;

    public MyObject(String backgroundImage, String sharingLogoUrl, String newspaperTitle, String articleShortText, String articleAuthor, String articleDate) {
        this.backgroundImage = backgroundImage;
        this.sharingLogo = sharingLogoUrl;
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
        dest.writeString(backgroundImage);
        dest.writeString(sharingLogo);
        dest.writeString(newspaperTitle);
        dest.writeString(articleShortText);
        dest.writeString(articleAuthor);
        dest.writeString(articleDate);
    }

    protected MyObject(Parcel in) {
        backgroundImage = in.readString();
        sharingLogo = in.readString();
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

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public String getSharingLogo() {
        return sharingLogo;
    }

    public void setSharingLogo(String sharingLogo) {
        this.sharingLogo = sharingLogo;
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
