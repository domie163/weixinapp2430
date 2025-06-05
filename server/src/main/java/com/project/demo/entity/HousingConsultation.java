package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 房源咨询：(HousingConsultation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HousingConsultation")
public class HousingConsultation implements Serializable {

    // HousingConsultation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "housing_consultation_id")
    private Integer housing_consultation_id;

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
    // 咨询日期
    @Basic
    private Timestamp consultation_date;
    // 租客用户
    @Basic
    private Integer tenant_user;
    // 咨询内容
    @Basic
    private String consultation_content;



    // 审核状态
    @Basic
    private String examine_state;








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
