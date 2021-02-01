package com.example.dubbo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zk
 * @date 2021/2/1 14:48
 */
@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    private int age;
}
