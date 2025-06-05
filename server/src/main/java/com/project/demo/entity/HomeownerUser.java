package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 房主用户：(HomeownerUser)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HomeownerUser")
public class HomeownerUser implements Serializable {

    // HomeownerUser编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "homeowner_user_id")
    private Integer homeowner_user_id;

    // 房主姓名
    @Basic
    private String name_of_the_owner;
    // 性别
    @Basic
    private String gender;



    // 审核状态
    @Basic
    private String examine_state;









    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
