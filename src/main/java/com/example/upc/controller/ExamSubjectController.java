package com.example.upc.controller;

import com.example.upc.common.CommonReturnType;
import com.example.upc.controller.param.ExamSubjectParam;
import com.example.upc.controller.param.PageQuery;
import com.example.upc.dataobject.ExamSubject;
import com.example.upc.service.ExamSubjectService;
import com.example.upc.service.ExamSubjectTopicService;
import com.example.upc.service.SysIndustryService;
import com.example.upc.service.SysWorkTypeService;
import com.example.upc.util.StringUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zcc
 * @date 2019/5/10 19:52
 */
@Controller
@RequestMapping("/exam/subject")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class ExamSubjectController {
    @Autowired
    private ExamSubjectService examSubjectService;
    @Autowired
    private SysIndustryService sysIndustryService;
    @Autowired
    private SysWorkTypeService sysWorkTypeService;
    @RequestMapping("/getPage")
    @ResponseBody
    public CommonReturnType getPage(PageQuery pageQuery){
        return CommonReturnType.create(examSubjectService.getPage(pageQuery));

    }
    @RequestMapping("/getSubjectTopicIds")
    @ResponseBody
    public CommonReturnType getSubjectTopicIds(int id){
        return CommonReturnType.create(examSubjectService.getSubjectTopicIds(id));

    }
    @RequestMapping("/getIndustryAndWorkType")
    @ResponseBody
    public CommonReturnType getIndustryAndWorkType(){
        Map<String,Object> map = new HashMap();
        map.put("allIndustry",sysIndustryService.getAll());
        map.put("allWorkType",sysWorkTypeService.getAll());
        return CommonReturnType.create(map);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public CommonReturnType insert(ExamSubjectParam examSubjectParam,String topicIds){
        List<Integer> topicIdList = StringUtil.splitToListInt(topicIds);
        ExamSubject examSubject = new ExamSubject();
        BeanUtils.copyProperties(examSubjectParam,examSubject);
        examSubjectService.insert(examSubject,topicIdList);
        return CommonReturnType.create(null);
    }
    @RequestMapping("/delete")
    @ResponseBody
    public CommonReturnType delete(int id) {
        examSubjectService.delete(id);
        return CommonReturnType.create(null);
    }
    @RequestMapping("/update")
    @ResponseBody
    public CommonReturnType update(ExamSubjectParam examSubjectParam,String topicIds){
        List<Integer> topicIdList = StringUtil.splitToListInt(topicIds);
        ExamSubject examSubject = new ExamSubject();
        BeanUtils.copyProperties(examSubjectParam,examSubject);
        examSubjectService.update(examSubject,topicIdList);
        return CommonReturnType.create(null);
    }
}
