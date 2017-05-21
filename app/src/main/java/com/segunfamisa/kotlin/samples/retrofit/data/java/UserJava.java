package com.segunfamisa.kotlin.samples.retrofit.data.java;

import com.google.gson.annotations.SerializedName;

/**
 * User class in Java
 */
public class UserJava {

    @SerializedName("login")
    private String login;

    @SerializedName("id")
    private long id;

    @SerializedName("url")
    private String url;

    @SerializedName("html_url")
    private String htmlUrl;

    @SerializedName("followers_url")
    private String followersUrl;

    @SerializedName("followingUrl")
    private String followingUrl;

    @SerializedName("starredUrl")
    private String starredUrl;

    @SerializedName("gists_url")
    private String gistsUrl;

    @SerializedName("type")
    private String type;

    @SerializedName("score")
    private int score;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserJava user = (UserJava) o;

        if (id != user.id) return false;
        if (score != user.score) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (url != null ? !url.equals(user.url) : user.url != null) return false;
        if (htmlUrl != null ? !htmlUrl.equals(user.htmlUrl) : user.htmlUrl != null) return false;
        if (followersUrl != null ? !followersUrl.equals(user.followersUrl) : user.followersUrl != null)
            return false;
        if (followingUrl != null ? !followingUrl.equals(user.followingUrl) : user.followingUrl != null)
            return false;
        if (starredUrl != null ? !starredUrl.equals(user.starredUrl) : user.starredUrl != null)
            return false;
        if (gistsUrl != null ? !gistsUrl.equals(user.gistsUrl) : user.gistsUrl != null)
            return false;
        return type != null ? type.equals(user.type) : user.type == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (htmlUrl != null ? htmlUrl.hashCode() : 0);
        result = 31 * result + (followersUrl != null ? followersUrl.hashCode() : 0);
        result = 31 * result + (followingUrl != null ? followingUrl.hashCode() : 0);
        result = 31 * result + (starredUrl != null ? starredUrl.hashCode() : 0);
        result = 31 * result + (gistsUrl != null ? gistsUrl.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + score;
        return result;
    }
}
