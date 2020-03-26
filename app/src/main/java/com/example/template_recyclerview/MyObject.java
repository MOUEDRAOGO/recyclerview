package com.example.template_recyclerview;

public class MyObject {
    private String backgroundImageUrl;
    private String sharingLogoUrl;
    private String newspaperTitle;
    private String articleShortText;
    private String articleAuthor;
    private String articleDate;

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


    public MyObject(String backgroundImageUrl, String sharingLogoUrl, String newspaperTitle, String articleShortText, String articleAuthor, String articleDate ) {
        this.backgroundImageUrl = backgroundImageUrl;
        this.sharingLogoUrl = sharingLogoUrl;
        this.newspaperTitle = newspaperTitle;
        this.articleShortText = articleShortText;
        this.articleAuthor = articleAuthor;
        this.articleDate = articleDate;
    }


}
