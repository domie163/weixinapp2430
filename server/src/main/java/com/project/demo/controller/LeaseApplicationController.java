package com.project.demo.controller;

import com.project.demo.entity.LeaseApplication;
import com.project.demo.service.LeaseApplicationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 租赁申请：(LeaseApplication)表控制层
 *
 */
@RestController
@RequestMapping("/lease_application")
public class LeaseApplicationController extends BaseController<LeaseApplication, LeaseApplicationService> {

    /**
     * 租赁申请对象
     */
    @Autowired
    public LeaseApplicationController(LeaseApplicationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
