package com.wkcto.ba03;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: 实体类 </p>
 * <p>Company: http://www.bjpowernode.com
 */
public class OutExcelModel {

    public static void main(String[] args) {
        OutputStream out = null;
        try{
            out = new FileOutputStream("d:/work/月销售报表2.xlsx");
            Sheet sheet = new Sheet(1,0,ExcelHeadModel.class);
            sheet.setSheetName("5月销售报表");

            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            writer.write0(getData(),sheet);
            writer.finish();

            System.out.println("使用Model生成excel完毕");
        }catch (IOException e ){
            e.printStackTrace();
        }

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
