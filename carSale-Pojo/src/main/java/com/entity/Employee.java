package com.entity;
public class Employee {
    private Integer empId;//员工编号
    private Integer companyId;//公司编号
    private Company company; //公司对象
    private String empPhone;//登录手机
    private Double empSalery;//员工工资
    private Integer positionId;//职务编号
    private String empName;//员工姓名
    private String empPassword;//登录密码

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee() {
        super();
    }
    public Employee(Integer empId,Integer companyId,String empPhone,Double empSalery,Integer positionId,String empName,String empPassword) {
        super();
        this.empId = empId;
        this.companyId = companyId;
        this.empPhone = empPhone;
        this.empSalery = empSalery;
        this.positionId = positionId;
        this.empName = empName;
        this.empPassword = empPassword;
    }
    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getEmpPhone() {
        return this.empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public Double getEmpSalery() {
        return this.empSalery;
    }

    public void setEmpSalery(Double empSalery) {
        this.empSalery = empSalery;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPassword() {
        return this.empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

}
