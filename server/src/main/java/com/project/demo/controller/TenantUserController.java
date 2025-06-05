package com.project.demo.controller;

import com.project.demo.entity.TenantUser;
import com.project.demo.service.TenantUserService;
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
 * 租客用户：(TenantUser)表控制层
 *
 */
@RestController
@RequestMapping("/tenant_user")
public class TenantUserController extends BaseController<TenantUser, TenantUserService> {

    /**
     * 租客用户对象
     */
    @Autowired
    public TenantUserController(TenantUserService service) {
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
