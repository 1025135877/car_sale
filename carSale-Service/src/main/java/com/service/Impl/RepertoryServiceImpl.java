package com.service.Impl;

import com.common.Assist;
import com.dao.RepertoryMapper;
import com.entity.Repertory;
import com.service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepertoryServiceImpl implements RepertoryService{
    @Autowired
    private RepertoryMapper repertoryDao;
    @Override
    public long getRepertoryRowCount(Assist assist){
        return repertoryDao.getRepertoryRowCount(assist);
    }
    @Override
    public List<Repertory> selectRepertory(Assist assist){
        return repertoryDao.selectRepertory(assist);
    }
    @Override
    public Repertory selectRepertoryByObj(Repertory obj){
        return repertoryDao.selectRepertoryByObj(obj);
    }
    @Override
    public Repertory selectRepertoryById(Integer id){
        return repertoryDao.selectRepertoryById(id);
    }
    @Override
    public int insertRepertory(Repertory value){
        return repertoryDao.insertRepertory(value);
    }
    @Override
    public int insertNonEmptyRepertory(Repertory value){
        return repertoryDao.insertNonEmptyRepertory(value);
    }
    @Override
    public int insertRepertoryByBatch(List<Repertory> value){
        return repertoryDao.insertRepertoryByBatch(value);
    }
    @Override
    public int deleteRepertoryById(Integer id){
        return repertoryDao.deleteRepertoryById(id);
    }
    @Override
    public int deleteRepertory(Assist assist){
        return repertoryDao.deleteRepertory(assist);
    }
    @Override
    public int updateRepertoryById(Repertory enti){
        return repertoryDao.updateRepertoryById(enti);
    }
    @Override
    public int updateRepertory(Repertory value, Assist assist){
        return repertoryDao.updateRepertory(value,assist);
    }
    @Override
    public int updateNonEmptyRepertoryById(Repertory enti){
        return repertoryDao.updateNonEmptyRepertoryById(enti);
    }
    @Override
    public int updateNonEmptyRepertory(Repertory value, Assist assist){
        return repertoryDao.updateNonEmptyRepertory(value,assist);
    }

    public RepertoryMapper getRepertoryDao() {
        return this.repertoryDao;
    }

    public void setRepertoryDao(RepertoryMapper repertoryDao) {
        this.repertoryDao = repertoryDao;
    }

}