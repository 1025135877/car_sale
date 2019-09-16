package com.service.Impl;

import com.common.Assist;
import com.dao.EmployeeMapper;
import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeDao;
    @Override
    public long getEmployeeRowCount(Assist assist){
        return employeeDao.getEmployeeRowCount(assist);
    }
    @Override
    public List<Employee> selectEmployee(Assist assist){
        return employeeDao.selectEmployee(assist);
    }
    @Override
    public Employee selectEmployeeByObj(Employee obj){
        return employeeDao.selectEmployeeByObj(obj);
    }
    @Override
    public Employee selectEmployeeById(Integer id){
        return employeeDao.selectEmployeeById(id);
    }
    @Override
    public int insertEmployee(Employee value){
        return employeeDao.insertEmployee(value);
    }
    @Override
    public int insertNonEmptyEmployee(Employee value){
        return employeeDao.insertNonEmptyEmployee(value);
    }
    @Override
    public int insertEmployeeByBatch(List<Employee> value){
        return employeeDao.insertEmployeeByBatch(value);
    }
    @Override
    public int deleteEmployeeById(Integer id){
        return employeeDao.deleteEmployeeById(id);
    }
    @Override
    public int deleteEmployee(Assist assist){
        return employeeDao.deleteEmployee(assist);
    }
    @Override
    public int updateEmployeeById(Employee enti){
        return employeeDao.updateEmployeeById(enti);
    }
    @Override
    public int updateEmployee(Employee value, Assist assist){
        return employeeDao.updateEmployee(value,assist);
    }
    @Override
    public int updateNonEmptyEmployeeById(Employee enti){
        return employeeDao.updateNonEmptyEmployeeById(enti);
    }
    @Override
    public int updateNonEmptyEmployee(Employee value, Assist assist){
        return employeeDao.updateNonEmptyEmployee(value,assist);
    }

    public EmployeeMapper getEmployeeDao() {
        return this.employeeDao;
    }

    public void setEmployeeDao(EmployeeMapper employeeDao) {
        this.employeeDao = employeeDao;
    }

}