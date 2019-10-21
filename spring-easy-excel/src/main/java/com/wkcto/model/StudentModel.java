package com.wkcto.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * <p>Description: 实体类 </p>
 * <p>Company: http://www.bjpowernode.com
 */
public class StudentModel extends BaseRowModel {

    @ExcelProperty(index = 0)
    private Integer id;

    @ExcelProperty(index = 1)
    private String name;

    @ExcelProperty(index = 2)
    private Integer age;

    @ExcelProperty(index = 3)
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
