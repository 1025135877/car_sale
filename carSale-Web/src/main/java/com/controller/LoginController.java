package com.controller;

import com.common.Assist;
import com.common.MyConst;
import com.entity.Adminlog;
import com.entity.Company;
import com.entity.Employee;
import com.service.AdminlogService;
import com.service.CompanyService;
import com.service.EmployeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.common.Assist.andEq;

@Controller
@RequestMapping("/login")
public class LoginController {
    private static Logger logger = LogManager.getLogger();
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private AdminlogService adminlogService;

    @RequestMapping("/isLoginSuccess")
    @ResponseBody
    public Map<String,String> login(Employee employee){

        HashMap<String, String> map = new HashMap<>();
        Assist.WhereRequire<Integer> companyId = andEq("companyId", employee.getCompanyId());
        Assist.WhereRequire<Integer> positionId = andEq("positionId", employee.getPositionId());
        Assist.WhereRequire<String> empName = andEq("empName", employee.getEmpName());
        Assist.WhereRequire<String> empPhone = andEq("empPhone", employee.getEmpPhone());
        Assist.WhereRequire<String> empPassword = andEq("empPassword", employee.getEmpPassword());
        Assist assist = new Assist();
        assist.setRequires(positionId,companyId,empName,empPhone,empPassword);

        long rowCount = employeeService.getEmployeeRowCount(assist);
        if(rowCount>0){
            Employee employee1 = employeeService.selectEmployeeByObj(employee);
            map.put("resultLogin",employee1.getEmpId().toString());
        }else {
            map.put("resultLogin","false");
        }

        return map;
    }

    @RequestMapping("/isExistCompanyName")
    @ResponseBody
    public Map<String,String> findCompany(Company company){
        Company companyByObj = companyService.selectCompanyByObj(company);
        HashMap<String, String> map = new HashMap<>();
        if(companyByObj!=null){
            map.put("resultName","true");
        }else {
            map.put("resultName","false");
        }
        return map;
    }
    @RequestMapping("/isExistEmpName")
    @ResponseBody
    public Map<String,String> findCompanyid(Employee employee){
        Employee employee1 = employeeService.selectEmployeeByObj(employee);
        HashMap<String, String> map = new HashMap<>();
        if(employee1!=null){
            map.put("resultName","true");
        }else {
            map.put("resultName","false");
        }
        return map;
    }
    @RequestMapping("/isExistEmpPhone")
    @ResponseBody
    public Map<String,String> findphone(Employee employee){
        Employee employee1 = employeeService.selectEmployeeByObj(employee);
        HashMap<String, String> map = new HashMap<>();
        if(employee1!=null){
            map.put("resultName","true");
        }else {
            map.put("resultName","false");
        }
        return map;
    }
    @RequestMapping("/getCompanyId")
    @ResponseBody
    public Map<String,String> getCompanyid(Company company){
        Company company1 = companyService.selectCompanyByObj(company);
        HashMap<String, String> map = new HashMap<>();
        if(company1!=null){
            map.put("companyId",company1.getCompanyId().toString());
        }else {
            map.put("companyId","false");
        }
        return map;
    }
    @RequestMapping("/goMain")
    @ResponseBody
    public ModelAndView goMain(String empId){
        logger.debug("开始--根据id查询员工对象的方法");
        ModelAndView modelAndView = new ModelAndView();

        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        logger.debug("根据id查询员工对象为：" + employeeById);

        Integer positionId = employeeById.getPositionId();
        if (positionId == MyConst.ADMINPOSITION){
            modelAndView.setViewName("AdminMain");//经理权限
        } else if (positionId == MyConst.EMPPOSITION) {
            modelAndView.setViewName("EmpMain");//操作员权限
        }

        //添加日志管理信息
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(empId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("访问首页");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        modelAndView.addObject("emp",employeeById);
        logger.debug("结束--根据id查询员工对象的方法");
        return modelAndView;
    }


}
