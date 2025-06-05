package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 房源信息：(HousingInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HousingInformation")
public class HousingInformation implements Serializable {

    // HousingInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "housing_information_id")
    private Integer housing_information_id;

    // 房屋编号
    @Basic
    private String house_no;
    // 房屋名称
    @Basic
    private String house_name;
    // 封面
    @Basic
    private String cover;
    // 房屋类型
    @Basic
    private String house_type;
    // 押金
    @Basic
    private Integer deposit;
    // 租金
    @Basic
    private Integer rent;
    // 厅室
    @Basic
    private String hall;
    // 详细地址
    @Basic
    private String detailed_address;
    // 房屋详情
    @Basic
    private String house_details;
    // 房主用户
    @Basic
    private Integer homeowner_user;
    // 房主姓名
    @Basic
    private String name_of_the_owner;


    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
