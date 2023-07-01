package com.lee.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    @TableField("name")
    private String name;

    @TableField("age")
    private int age;
    @TableField("email")
    private String email;

}
