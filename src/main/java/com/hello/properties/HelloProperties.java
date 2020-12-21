package com.hello.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author anchao
 * @date 2020/12/21 16:27
 **/
//@ConfigurationProperties(prefix = "str")
public class HelloProperties {

    public static final String DEFAULT_STR1 = "I know, you need me";

    public static final String DEFAULT_STR2 = "but I also need you";

    private String str1 = DEFAULT_STR1;

    private String str2 = DEFAULT_STR2;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
