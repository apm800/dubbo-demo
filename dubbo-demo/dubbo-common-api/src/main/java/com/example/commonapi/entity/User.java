package com.example.commonapi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zk
 * @date 2021/1/22 16:06
 */
@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    private int age;
}
