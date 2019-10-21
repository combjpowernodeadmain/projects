package com.wkcto.ba03;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * <p>Description: 实体类 </p>
 * <p>Company: http://www.bjpowernode.com
 */
public class ExcelHeadModel extends BaseRowModel {
    //定义属性,指定列的关系

    /**
     * value:指定表头内容
     * index:指定列的索引, 从 0开始
     */
    @ExcelProperty(value = "日期",index = 0)
    private String date;

    @ExcelProperty(value = "华为mate20",index = 1)
    private String m1;

    @ExcelProperty(value = "oppo",index = 2)
    private String m2;

    @ExcelProperty(value = "小米9",index = 3)
    private String m3;

    @ExcelProperty(value = "魅族",index = 4)
    private String m4;

    @ExcelProperty(value = "荣耀MagicBook",index = 5)
    private String b1;

    @ExcelProperty(value = "戴尔DELL",index = 6)
    private String b2;

    @ExcelProperty(value = "惠普(HP)暗影精灵",index = 7)
    private String b3;

    @ExcelProperty(value = "机械革命",index = 8)
    private String b4;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public String getM3() {
        return m3;
    }

    public void setM3(String m3) {
        this.m3 = m3;
    }

    public String getM4() {
        return m4;
    }

    public void setM4(String m4) {
        this.m4 = m4;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public String getB4() {
        return b4;
    }

    public void setB4(String b4) {
        this.b4 = b4;
    }
}
