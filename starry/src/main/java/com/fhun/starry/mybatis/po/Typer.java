package com.fhun.starry.mybatis.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName typer
 */
@TableName(value ="typer")
@Data
public class Typer implements Serializable {
    /**
     * 
     */
    @TableId(value = "typer_id", type = IdType.AUTO)
    private Integer typerId;

    /**
     * 
     */
    @TableField(value = "word")
    private String word;

    /**
     * 
     */
    @TableField(value = "picture_id")
    private Integer pictureId;

    /**
     * 
     */
    @TableField(value = "delete_flag")
    private Integer deleteFlag;

    /**
     * 
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 
     */
    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}