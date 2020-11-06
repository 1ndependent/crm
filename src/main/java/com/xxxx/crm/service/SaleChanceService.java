package com.xxxx.crm.service;

import com.xxxx.crm.po.SaleChance;
import com.xxxx.crm.vo.SaleChanceVo;

import java.util.Map;

public interface SaleChanceService {

    Map<String,Object> selectList(SaleChanceVo vo);

    SaleChance selectSaleChanceInfoById(String saleChanceId);

    void insert(SaleChance saleChance);

    void update(SaleChance saleChance);

    void deleteIds(String[] ids);
}
