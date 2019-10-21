package com.wkcto.ba02;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExcelHasModel {

    public void run() throws Exception {
        InputStream in = null;
        try {

            in = new FileInputStream(new File("D:/work/student.xlsx"));
            MyExcelListener listener = new MyExcelListener();
            ExcelReader reader = new ExcelReader(in,null, listener);
            //读取excel
            Sheet sheet = new Sheet(1,1,StudentModel.class);
            reader.read(sheet);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if( in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {
        new ReadExcelHasModel().run();
    }

}
