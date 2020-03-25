package com.example.upc.service.impl;

import com.example.upc.controller.param.GridPoints1;
import com.example.upc.controller.param.SmilePoints;
import com.example.upc.controller.param.enterpriseId;
import com.example.upc.controller.searchParam.EnterpriseSearchParam;
import com.example.upc.dao.GridPointsMapper;
import com.example.upc.dao.SupervisionEnterpriseMapper;
import com.example.upc.dao.SysAreaMapper;
import com.example.upc.dataobject.GridPoints;
import com.example.upc.dataobject.SysArea;
import com.example.upc.service.GridPointsService;
import com.example.upc.service.SysAreaService;
import com.example.upc.service.model.MapIndustryNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zcc
 * @date 2019/8/13 11:12
 */
@Service
public class GridPointsServiceImpl implements GridPointsService {
    @Autowired
    private GridPointsMapper gridPointsMapper;
    @Autowired
    private SysAreaMapper sysAreaMapper;
    @Autowired
    private SupervisionEnterpriseMapper supervisionEnterpriseMapper;
    @Autowired
    private SysAreaService sysAreaService;

    @Override
    public List<GridPoints> getAll() {
        return gridPointsMapper.getAll();
    }
    @Override
    public List<GridPoints1> getAll1() {
        return gridPointsMapper.getAll1();
    }

    @Override
    public List<GridPoints> getByAreaId(int id) {
        return gridPointsMapper.getByAreaId(id);
    }
    @Override
    public int checkPoint(int id){
        return gridPointsMapper.checkPoint(id);
    }
    @Override
    public int updatePoint(GridPoints record){
        return gridPointsMapper.updatePoint(record);
    }
    @Override
    public int insertPoint(GridPoints record){
        return gridPointsMapper.insertSelective(record);
    }
    @Override
    public List<SmilePoints> getSmileMapPoints(EnterpriseSearchParam enterpriseSearchParam){
        return gridPointsMapper.getSmileAll(enterpriseSearchParam);
    }

    @Override
    public  List<enterpriseId> getEnterpriseByName(String name) {
        return gridPointsMapper.getEnterpriseByName(name);
    }
    @Override
    public Map<String, Object> getAreaEnterprise(){
        List<SysArea> sysAreaList = sysAreaMapper.getAllAreaPa();
        List<Integer> areaIntegers=sysAreaService.getAll().stream().map((sysArea -> sysArea.getId())).collect(Collectors.toList());
        Map<Integer,Object> areaCount= new HashMap<>();
        for(SysArea sysArea:sysAreaList){
            List<Integer> areaIdList = new ArrayList<>();
            areaIdList.add(sysArea.getId());
            EnterpriseSearchParam foodCommonEnterpriseSearchParam = new EnterpriseSearchParam();
            List<String> fooCommonList = new ArrayList<>();
            fooCommonList.add("foodCommon");
            foodCommonEnterpriseSearchParam.setAreaList(areaIdList);
            foodCommonEnterpriseSearchParam.setIndustryList(fooCommonList);
            EnterpriseSearchParam foodCirculateEnterpriseSearchParam = new EnterpriseSearchParam();
            List<String> foodCirculateList = new ArrayList<>();
            foodCirculateList.add("foodCirculate");
            foodCirculateEnterpriseSearchParam.setAreaList(areaIdList);
            foodCirculateEnterpriseSearchParam.setIndustryList(foodCirculateList);
            EnterpriseSearchParam foodProduceEnterpriseSearchParam = new EnterpriseSearchParam();
            List<String> foodProduceList = new ArrayList<>();
            foodProduceList.add("foodProduce");
            foodProduceEnterpriseSearchParam.setAreaList(areaIdList);
            foodProduceEnterpriseSearchParam.setIndustryList(foodProduceList);
            EnterpriseSearchParam cosmeticsUseEnterpriseSearchParam = new EnterpriseSearchParam();
            List<String> cosmeticsUseList = new ArrayList<>();
            cosmeticsUseList.add("cosmeticsUse");
            cosmeticsUseEnterpriseSearchParam.setAreaList(areaIdList);
            cosmeticsUseEnterpriseSearchParam.setIndustryList(cosmeticsUseList);
            EnterpriseSearchParam drugsBusinessEnterpriseSearchParam = new EnterpriseSearchParam();
            List<String> drugsBusinessList = new ArrayList<>();
            drugsBusinessList.add("drugsBusiness");
            drugsBusinessEnterpriseSearchParam.setAreaList(areaIdList);
            drugsBusinessEnterpriseSearchParam.setIndustryList(drugsBusinessList);
            EnterpriseSearchParam medicalUseEnterpriseSearchParam = new EnterpriseSearchParam();
            List<String> medicalUseList = new ArrayList<>();
            medicalUseList.add("medicalUse");
            medicalUseEnterpriseSearchParam.setAreaList(areaIdList);
            medicalUseEnterpriseSearchParam.setIndustryList(medicalUseList);
            MapIndustryNumber mapIndustryNumber = new MapIndustryNumber();
            mapIndustryNumber.setFoodCommon(supervisionEnterpriseMapper.countList(foodCommonEnterpriseSearchParam));
            mapIndustryNumber.setFoodCirculate(supervisionEnterpriseMapper.countList(foodCirculateEnterpriseSearchParam));
            mapIndustryNumber.setFoodProduce(supervisionEnterpriseMapper.countList(foodProduceEnterpriseSearchParam));
            mapIndustryNumber.setCosmeticsUse(supervisionEnterpriseMapper.countList(cosmeticsUseEnterpriseSearchParam));
            mapIndustryNumber.setDrugsBusiness(supervisionEnterpriseMapper.countList(drugsBusinessEnterpriseSearchParam));
            mapIndustryNumber.setMedicalUse(supervisionEnterpriseMapper.countList(medicalUseEnterpriseSearchParam));
            areaCount.put(sysArea.getId(),mapIndustryNumber);
        }
        EnterpriseSearchParam enterpriseSearchParam = new EnterpriseSearchParam();
        enterpriseSearchParam.setAreaList(areaIntegers);
        List<String> industryList = new ArrayList<>();
        industryList.add("foodCommon");
        industryList.add("foodCirculate");
        industryList.add("foodProduce");
        industryList.add("cosmeticsUse");
        industryList.add("drugsBusiness");
        industryList.add("medicalUse");
        enterpriseSearchParam.setIndustryList(industryList);
        Map<String,Object> map = new HashMap<>();
        map.put("areaCount",areaCount);
        map.put("allCount",supervisionEnterpriseMapper.countList(enterpriseSearchParam));
        map.put("areaList",sysAreaList);
        return map;
    }
    @Override
    @Transactional
    public int deleteByEnterpriseId(int id){
        return gridPointsMapper.deleteByEnterpriseId(id);
    }

    @Override
    public GridPoints getPointByEnterpriseId(Integer id) {
        return gridPointsMapper.getPointByEnterpriseId(id);
    }

    @Override
    public int getVideoIdByEnterprise(int id) {
        return gridPointsMapper.getVideoIdByEnterprise(id);
    }
}