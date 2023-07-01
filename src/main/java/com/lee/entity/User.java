package com.lee.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class User {

    @TableId
    private int id;
    @TableField
    private String name;

    @TableField
    private int age;
    @TableField
    private String email;

}
