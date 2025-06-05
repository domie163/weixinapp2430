package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 房屋类型：(HouseType)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HouseType")
public class HouseType implements Serializable {

    // HouseType编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "house_type_id")
    private Integer house_type_id;

    // 房屋类型
    @Basic
    private String house_type;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
