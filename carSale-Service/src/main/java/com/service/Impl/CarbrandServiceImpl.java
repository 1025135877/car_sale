package com.service.Impl;

import com.common.Assist;
import com.dao.CarbrandMapper;
import com.entity.Carbrand;
import com.service.CarbrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarbrandServiceImpl implements CarbrandService{
    @Autowired
    private CarbrandMapper carbrandDao;
    @Override
    public long getCarbrandRowCount(Assist assist){
        return carbrandDao.getCarbrandRowCount(assist);
    }
    @Override
    public List<Carbrand> selectCarbrand(Assist assist){
        return carbrandDao.selectCarbrand(assist);
    }
    @Override
    public Carbrand selectCarbrandByObj(Carbrand obj){
        return carbrandDao.selectCarbrandByObj(obj);
    }
    @Override
    public Carbrand selectCarbrandById(Integer id){
        return carbrandDao.selectCarbrandById(id);
    }
    @Override
    public int insertCarbrand(Carbrand value){
        return carbrandDao.insertCarbrand(value);
    }
    @Override
    public int insertNonEmptyCarbrand(Carbrand value){
        return carbrandDao.insertNonEmptyCarbrand(value);
    }
    @Override
    public int insertCarbrandByBatch(List<Carbrand> value){
        return carbrandDao.insertCarbrandByBatch(value);
    }
    @Override
    public int deleteCarbrandById(Integer id){
        return carbrandDao.deleteCarbrandById(id);
    }
    @Override
    public int deleteCarbrand(Assist assist){
        return carbrandDao.deleteCarbrand(assist);
    }
    @Override
    public int updateCarbrandById(Carbrand enti){
        return carbrandDao.updateCarbrandById(enti);
    }
    @Override
    public int updateCarbrand(Carbrand value, Assist assist){
        return carbrandDao.updateCarbrand(value,assist);
    }
    @Override
    public int updateNonEmptyCarbrandById(Carbrand enti){
        return carbrandDao.updateNonEmptyCarbrandById(enti);
    }
    @Override
    public int updateNonEmptyCarbrand(Carbrand value, Assist assist){
        return carbrandDao.updateNonEmptyCarbrand(value,assist);
    }

    public CarbrandMapper getCarbrandDao() {
        return this.carbrandDao;
    }

    public void setCarbrandDao(CarbrandMapper carbrandDao) {
        this.carbrandDao = carbrandDao;
    }

}