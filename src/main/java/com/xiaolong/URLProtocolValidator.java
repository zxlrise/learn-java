package com.xiaolong;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLProtocolValidator {
    public  static boolean isHttpOrHttpsURL(String urlStr) {
        // 定义正则表达式匹配HTTP或HTTPS协议
        String regex = "^(http|https)://.*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(urlStr);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] urls = {
                "https://www.example.com",
                "HTTP://www.example.com",
                "ftp://ftp.example.com",
                "invalid url",
                "HTTPS://www.example.co",
                "    "
        };

        for (String url : urls) {
            boolean isHttpOrHttps = isHttpOrHttpsURL(url);
            System.out.println(url + " is " + (isHttpOrHttps ? "HTTP/HTTPS" : "not HTTP/HTTPS") + " URL.");
        }
        
    }
}
