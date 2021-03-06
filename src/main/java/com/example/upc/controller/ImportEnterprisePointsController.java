package com.example.upc.controller;

import com.example.upc.common.CommonReturnType;
import com.example.upc.controller.param.PageQuery;
import com.example.upc.service.ImportEnterprisePointsService;
import com.example.upc.service.InspectLllegalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ImportEnterprisePoints")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class ImportEnterprisePointsController {
    @Autowired
    private ImportEnterprisePointsService importEnterprisePointsService;

    @RequestMapping("/getAll")
    @ResponseBody
    public CommonReturnType getAll(){
        return CommonReturnType.create(importEnterprisePointsService.getAll());
    }
}
