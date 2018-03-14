package com.example.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by 杨文鑫 on 2018/3/14.
 */
@Getter
@Setter
@ToString
public class SearchLogParam {

    private Integer type; //LogType

    private String beforeSeg;

    private String afterSeg;

    private String operator;

    private String fromTime; //yyyy-MM-dd HH:mm:ss

    private String toTime;
}
