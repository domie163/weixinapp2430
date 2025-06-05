package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 租赁申请：(LeaseApplication)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "LeaseApplication")
public class LeaseApplication implements Serializable {

    // LeaseApplication编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lease_application_id")
    private Integer lease_application_id;

    // 房屋编号
    @Basic
    private String house_no;
    // 房屋名称
    @Basic
    private String house_name;
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
    // 房主用户
    @Basic
    private Integer homeowner_user;
    // 房主姓名
    @Basic
    private String name_of_the_owner;
    // 下单日期
    @Basic
    private Timestamp order_date;
    // 租客用户
    @Basic
    private Integer tenant_user;
    // 申请描述
    @Basic
    private String application_description;



    // 审核状态
    @Basic
    private String examine_state;

    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;







    // 审核回复
    @Basic
    private String examine_reply;



    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
