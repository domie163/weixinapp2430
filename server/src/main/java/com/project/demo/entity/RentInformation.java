package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 房租信息：(RentInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RentInformation")
public class RentInformation implements Serializable {

    // RentInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rent_information_id")
    private Integer rent_information_id;

    // 房屋编号
    @Basic
    private String house_no;
    // 房屋名称
    @Basic
    private String house_name;
    // 房屋类型
    @Basic
    private String house_type;
    // 厅室
    @Basic
    private String hall;
    // 详细地址
    @Basic
    private String detailed_address;
    // 房主用户
    @Basic
    private Integer homeowner_user;
    // 房主姓名
    @Basic
    private String name_of_the_owner;
    // 租客用户
    @Basic
    private Integer tenant_user;
    // 租金
    @Basic
    private Integer rent;
    // 收租日期
    @Basic
    private Timestamp rent_collection_date;
    // 备注
    @Basic
    private String remarks;




    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;










    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
