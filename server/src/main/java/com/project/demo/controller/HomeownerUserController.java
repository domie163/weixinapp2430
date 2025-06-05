package com.project.demo.controller;

import com.project.demo.entity.HomeownerUser;
import com.project.demo.service.HomeownerUserService;
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
 * 房主用户：(HomeownerUser)表控制层
 *
 */
@RestController
@RequestMapping("/homeowner_user")
public class HomeownerUserController extends BaseController<HomeownerUser, HomeownerUserService> {

    /**
     * 房主用户对象
     */
    @Autowired
    public HomeownerUserController(HomeownerUserService service) {
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
