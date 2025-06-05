package com.project.demo.controller;

import com.project.demo.entity.RentInformation;
import com.project.demo.service.RentInformationService;
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
 * 房租信息：(RentInformation)表控制层
 *
 */
@RestController
@RequestMapping("/rent_information")
public class RentInformationController extends BaseController<RentInformation, RentInformationService> {

    /**
     * 房租信息对象
     */
    @Autowired
    public RentInformationController(RentInformationService service) {
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
