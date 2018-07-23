package com.test.mdnews.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZHANGZEJIAN on 2018/5/24 0024.
 */

public class News {
    @SerializedName("ctime")
    public String time;

    public String title;

    public String description;

    public String picUrl;

    public String url;

}
