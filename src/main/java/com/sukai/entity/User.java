package com.sukai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "\"User\"")
@Data
@Builder
public class User implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "\"name\"")
    private String name;

    @TableField(value = "age")
    private Integer age;

    @TableField(value = "email")
    private String email;

}