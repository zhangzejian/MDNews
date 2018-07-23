package com.test.mdnews.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZHANGZEJIAN on 2018/5/24 0024.
 */

public class NewsList {
    public int code;

    public String msg;

    @SerializedName("newslist")
    public List<News> newsList;
}
