package com.service.Impl;

import com.common.Assist;
import com.dao.FinancingMapper;
import com.entity.Financing;
import com.service.FinancingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancingServiceImpl implements FinancingService{
    @Autowired
    private FinancingMapper financingDao;
    @Override
    public long getFinancingRowCount(Assist assist){
        return financingDao.getFinancingRowCount(assist);
    }
    @Override
    public List<Financing> selectFinancing(Assist assist){
        return financingDao.selectFinancing(assist);
    }
    @Override
    public Financing selectFinancingByObj(Financing obj){
        return financingDao.selectFinancingByObj(obj);
    }
    @Override
    public Financing selectFinancingById(Integer id){
        return financingDao.selectFinancingById(id);
    }
    @Override
    public int insertFinancing(Financing value){
        return financingDao.insertFinancing(value);
    }
    @Override
    public int insertNonEmptyFinancing(Financing value){
        return financingDao.insertNonEmptyFinancing(value);
    }
    @Override
    public int insertFinancingByBatch(List<Financing> value){
        return financingDao.insertFinancingByBatch(value);
    }
    @Override
    public int deleteFinancingById(Integer id){
        return financingDao.deleteFinancingById(id);
    }
    @Override
    public int deleteFinancing(Assist assist){
        return financingDao.deleteFinancing(assist);
    }
    @Override
    public int updateFinancingById(Financing enti){
        return financingDao.updateFinancingById(enti);
    }
    @Override
    public int updateFinancing(Financing value, Assist assist){
        return financingDao.updateFinancing(value,assist);
    }
    @Override
    public int updateNonEmptyFinancingById(Financing enti){
        return financingDao.updateNonEmptyFinancingById(enti);
    }
    @Override
    public int updateNonEmptyFinancing(Financing value, Assist assist){
        return financingDao.updateNonEmptyFinancing(value,assist);
    }

    public FinancingMapper getFinancingDao() {
        return this.financingDao;
    }

    public void setFinancingDao(FinancingMapper financingDao) {
        this.financingDao = financingDao;
    }

}