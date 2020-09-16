package com.example.upc.service.impl;

import com.example.upc.controller.searchParam.BillReportSearchParam;
import com.example.upc.dao.BillReportMapper;
import com.example.upc.dao.OriginRecordBillMapper;
import com.example.upc.dataobject.BillReport;
import com.example.upc.dataobject.Billdao;
import com.example.upc.dataobject.OriginRecordBill;
import com.example.upc.dataobject.SysUser;
import com.example.upc.service.BillReportService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class BillReportServiceImpl implements BillReportService {
    @Autowired
    BillReportMapper billreportMapper;
    @Autowired
    OriginRecordBillMapper originRecordBillMapper;

    @Override
    public List<Billdao> getBillReport(BillReportSearchParam billReportSearchParam, SysUser sysUser){
        if(billReportSearchParam.getDate()!=null)
        {
        billReportSearchParam.setEndTime(new Date(billReportSearchParam.getDate().getTime()+(long) 24 * 60 * 60 * 1000));
        }
        billReportSearchParam.setEnterpriseId(sysUser.getInfoId());
        return billreportMapper.selectBillReport(billReportSearchParam);
    }

    @Override
    public List<Billdao> getBillReportByBillId(BillReportSearchParam billReportSearchParam, SysUser sysUser){
        String billList=billReportSearchParam.getBillList();
        if(billList!=null && !"".equals(billList.trim()))
        {
            List<String> idList = Arrays.asList(billList.split(","));
            List<Integer> billIdList = new ArrayList<Integer>();
            idList.forEach(item->billIdList.add(Integer.parseInt(item)));
            return billreportMapper.selectBillReportByBillList(billIdList);
        }
        return null;
    }

    @Override
    public void insert(BillReportSearchParam billReportSearchParam, SysUser sysUser){

        BillReport billReport = new BillReport();
        BeanUtils.copyProperties(billReportSearchParam,billReport);
        billReport.setEnterpriseId(sysUser.getInfoId());
        billReport.setOperator(sysUser.getLoginName());
        billReport.setOperatorIp("127.0.0.1");
        billReport.setOperatorTime(new Date());
        billreportMapper.insert(billReport);
        billReportSearchParam.getIdList().forEach(item ->{
            OriginRecordBill originRecordBill = new OriginRecordBill();
            originRecordBill.setBillId(billReport.getId());
            originRecordBill.setRecordId(item);
            originRecordBill.setOperator(sysUser.getLoginName());
            originRecordBill.setOperatorIp("127.0.0.1");
            originRecordBill.setOperatorTime(new Date());
            originRecordBillMapper.insert(originRecordBill);
        });

    }

    @Override
    public void update(BillReportSearchParam billReportSearchParam, SysUser sysUser){

        BillReport billReport = new BillReport();
        BeanUtils.copyProperties(billReportSearchParam,billReport);
        billReport.setEnterpriseId(sysUser.getInfoId());
        billReport.setOperator(sysUser.getLoginName());
        billReport.setOperatorIp("127.0.0.1");
        billReport.setOperatorTime(new Date());
        billreportMapper.updateByPrimaryKey(billReport);
        originRecordBillMapper.deleteByBillId(billReportSearchParam.getId());
        billReportSearchParam.getIdList().forEach(item ->{
            OriginRecordBill originRecordBill = new OriginRecordBill();
            originRecordBill.setBillId(billReport.getId());
            originRecordBill.setRecordId(item);
            originRecordBill.setOperator(sysUser.getLoginName());
            originRecordBill.setOperatorIp("127.0.0.1");
            originRecordBill.setOperatorTime(new Date());
            originRecordBillMapper.insert(originRecordBill);
        });
    }

    public void delete(BillReportSearchParam billReportSearchParam, SysUser sysUser){
        billreportMapper.deleteByPrimaryKey(billReportSearchParam.getId());
        originRecordBillMapper.deleteByBillId(billReportSearchParam.getId());
    }
}
