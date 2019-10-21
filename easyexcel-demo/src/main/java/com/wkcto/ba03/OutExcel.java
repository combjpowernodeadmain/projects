package com.wkcto.ba03;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Description: 实体类 </p>
 * <p>Company: http://www.bjpowernode.com
 */
public class OutExcel {

    public static void main(String[] args) throws FileNotFoundException {
        //定义输出的excel文件
        OutputStream out = new FileOutputStream("D:/work/月销售报表.xlsx");
        //创建ExcelWriter
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);

        //创建Sheet 1:表示第一个sheet
        Sheet sheet = new Sheet(1);
        //指定sheet名称
        sheet.setSheetName("销售的周报表");

        //指定表头信息
        Table table = new Table(1);
        table.setHead(getHead());

        writer.write0(getData(),sheet,table);
        writer.finish();

        System.out.println("生成excel完毕");
    }

    //创建表头 List<List<String>
    public static List<List<String>> getHead(){
        List<List<String>> head = new ArrayList<List<String>>();
        head.add(Arrays.asList("日期"));
        head.add(Arrays.asList("华为mate20"));
        head.add(Arrays.asList("oppo"));
        head.add(Arrays.asList("小米9"));
        head.add(Arrays.asList("魅族"));
        head.add(Arrays.asList("荣耀MagicBook"));
        head.add(Arrays.asList("戴尔DELL"));
        head.add(Arrays.asList("惠普(HP)暗影精灵"));
        head.add(Arrays.asList("机械革命"));

//        List<String> list = new ArrayList<String>();
//        list.add("日期");
//        list.add("华为mate20");
//        list.add("oppo");
//        list.add("小米9");
//        list.add("魅族");
//        head.add(list);

        return head;
    }

    //获取输出到excel的数据List<List<String>>
    public static List<List<String>> getData(){
        List<List<String>> data =new ArrayList<List<String>>();
        //第一行数据
        List<String> row = new ArrayList<String>();
        row.add("2019/5/1");
        row.add("8000");
        row.add("5000");
        row.add("6000");
        row.add("3000");
        row.add("10000");
        row.add("9000");
        row.add("1000");
        row.add("6080");
        data.add(row);

        //第二行数据
        row = new ArrayList<String>();
        row.add("2019/5/2");
        row.add("12000");
        row.add("3000");
        row.add("9500");
        row.add("1000");
        row.add("23300");
        row.add("9500");
        row.add("3000");
        row.add("6000");
        data.add(row);
        return data;

    }
}
