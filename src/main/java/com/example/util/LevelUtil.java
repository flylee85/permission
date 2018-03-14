package com.example.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by 杨文鑫 on 2018/2/2.
 */
public class LevelUtil {

    public final static String SEPARATOR = ".";
    public final static String ROOT = "0";

    public static String calculateLevel(String parentLevel, int parentId) {
        if(StringUtils.isBlank(parentLevel)) {
            return ROOT;
        }else {
            return StringUtils.join(parentLevel, SEPARATOR, parentId);
        }
    }
}
