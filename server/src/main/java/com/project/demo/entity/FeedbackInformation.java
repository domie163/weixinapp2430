package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 反馈信息：(FeedbackInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "FeedbackInformation")
public class FeedbackInformation implements Serializable {

    // FeedbackInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_information_id")
    private Integer feedback_information_id;

    // 房屋编号
    @Basic
    private String house_no;
    // 房屋名称
    @Basic
    private String house_name;
    // 房屋类型
    @Basic
    private String house_type;
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
    // 租客用户
    @Basic
    private Integer tenant_user;
    // 反馈日期
    @Basic
    private Timestamp feedback_date;
    // 反馈内容
    @Basic
    private String feedback_content;



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
