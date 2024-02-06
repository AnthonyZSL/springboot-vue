package com.example.springbootvue.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Anthony
 * @since 2023-03-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Userauto对象", description="")
public class Userauto implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "账户")
    private String no;

    private String name;

    private String password;

    private Integer age;

    private Integer sex;

    private String phone;

    @ApiModelProperty(value = "角色 0-超级管理员 1-管理员 2-普通账户")
    private Integer roleId;

    @ApiModelProperty(value = "Y 有效 N 无效")
    @TableField("isValid")
    private String isvalid;


}
