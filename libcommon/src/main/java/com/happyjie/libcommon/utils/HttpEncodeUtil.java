package com.happyjie.libcommon.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class HttpEncodeUtil {
    public static String encode(String value) {
        try {
            return URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
