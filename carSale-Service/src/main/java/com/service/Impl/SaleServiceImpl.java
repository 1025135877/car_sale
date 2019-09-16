package com.service.Impl;

import com.common.Assist;
import com.dao.SaleMapper;
import com.entity.Sale;
import com.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService{
    @Autowired
    private SaleMapper saleDao;
    @Override
    public long getSaleRowCount(Assist assist){
        return saleDao.getSaleRowCount(assist);
    }
    @Override
    public List<Sale> selectSale(Assist assist){
        return saleDao.selectSale(assist);
    }
    @Override
    public Sale selectSaleByObj(Sale obj){
        return saleDao.selectSaleByObj(obj);
    }
    @Override
    public Sale selectSaleById(Integer id){
        return saleDao.selectSaleById(id);
    }
    @Override
    public int insertSale(Sale value){
        return saleDao.insertSale(value);
    }
    @Override
    public int insertNonEmptySale(Sale value){
        return saleDao.insertNonEmptySale(value);
    }
    @Override
    public int insertSaleByBatch(List<Sale> value){
        return saleDao.insertSaleByBatch(value);
    }
    @Override
    public int deleteSaleById(Integer id){
        return saleDao.deleteSaleById(id);
    }
    @Override
    public int deleteSale(Assist assist){
        return saleDao.deleteSale(assist);
    }
    @Override
    public int updateSaleById(Sale enti){
        return saleDao.updateSaleById(enti);
    }
    @Override
    public int updateSale(Sale value, Assist assist){
        return saleDao.updateSale(value,assist);
    }
    @Override
    public int updateNonEmptySaleById(Sale enti){
        return saleDao.updateNonEmptySaleById(enti);
    }
    @Override
    public int updateNonEmptySale(Sale value, Assist assist){
        return saleDao.updateNonEmptySale(value,assist);
    }

    public SaleMapper getSaleDao() {
        return this.saleDao;
    }

    public void setSaleDao(SaleMapper saleDao) {
        this.saleDao = saleDao;
    }

}