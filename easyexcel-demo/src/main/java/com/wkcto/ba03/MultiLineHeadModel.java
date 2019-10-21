package com.wkcto.ba03;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * <p>Description: 实体类 </p>
 * <p>Company: http://www.bjpowernode.com
 */
public class MultiLineHeadModel extends BaseRowModel {

    /**
     * value:指定表头内容
     * index:指定列的索引, 从 0开始
     */
    @ExcelProperty(value = {"日期","日期"},index = 0)
    private String date;

    @ExcelProperty(value = {"移动卡手机","华为mate20"},index = 1)
    private String m1;

    @ExcelProperty(value = {"移动卡手机","oppo"},index = 2)
    private String m2;

    @ExcelProperty(value = {"联通卡手机","小米9"},index = 3)
    private String m3;

    @ExcelProperty(value = {"联通卡手机","魅族"},index = 4)
    private String m4;

    @ExcelProperty(value = {"轻薄笔记本","荣耀MagicBook"},index = 5)
    private String b1;

    @ExcelProperty(value = {"轻薄笔记本","戴尔DELL"},index = 6)
    private String b2;

    @ExcelProperty(value = {"游戏笔记本","惠普(HP)暗影精灵"},index = 7)
    private String b3;

    @ExcelProperty(value = {"游戏笔记本","机械革命"},index = 8)
    private String b4;
}
