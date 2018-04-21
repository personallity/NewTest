package com.example.xiyou.newtest;

/**
 * Created by XiYou on 2018/4/18.
 */

public class Inter {

    private String name;

    private String url;

    private int imageId;

    public Inter(String name, String url, int imageId) {
        this.name = name;
        this.url = url;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getUrl() {
        return url;
    }
}
