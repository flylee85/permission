package com.example.beans;

import lombok.*;

import java.util.Set;

/**
 * Created by 杨文鑫 on 2018/3/6.
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mail {

    private String subject;

    private String message;

    private Set<String> receivers;
}
