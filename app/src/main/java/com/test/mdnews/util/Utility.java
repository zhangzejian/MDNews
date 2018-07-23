package com.test.mdnews.util;

import com.google.gson.Gson;
import com.test.mdnews.gson.NewsList;

/**
 * Created by ZHANGZEJIAN on 2018/5/24 0024.
 */

public class Utility {
    public static NewsList parseJsonWithGson(final String requestText){
        Gson gson = new Gson();
        return gson.fromJson(requestText,NewsList.class);
    }
}
