package com.wkcto.ba02;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.util.Date;

/**
 * 模型类需要继承BaseRowModel
 * 定义属性，属性保存excel中cell的数据，属性可以定义不同的类型。
 * 使用@ExcelPropery, 指定cell的数据和model中属性的对应关系
 */
public class StudentModel extends BaseRowModel {

    //index：列号（索引）
    @ExcelProperty(index = 0)
    private String name;

    @ExcelProperty(index = 1)
    private Integer age;

    @ExcelProperty(index = 2)
    private String sex;

    @ExcelProperty(index = 3)
    private String email;

    @ExcelProperty(index = 4,format = "yyyy-MM-dd")
    private Date birth;

    @ExcelProperty(index = 5)
    private String mobile;

    @ExcelProperty(index = 6)
    private String concat;

    @ExcelProperty(index = 7)
    private String concatMobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getConcat() {
        return concat;
    }

    public void setConcat(String concat) {
        this.concat = concat;
    }

    public String getConcatMobile() {
        return concatMobile;
    }

    public void setConcatMobile(String concatMobile) {
        this.concatMobile = concatMobile;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                ", mobile='" + mobile + '\'' +
                ", concat='" + concat + '\'' +
                ", concatMobile='" + concatMobile + '\'' +
                '}';
    }
}

