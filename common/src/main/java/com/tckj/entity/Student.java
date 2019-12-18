package com.tckj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WCH
 * @date 2019/12/17 14:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;
    private int age;
}
