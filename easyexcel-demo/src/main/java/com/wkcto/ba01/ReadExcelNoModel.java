package com.wkcto.ba01;

import com.alibaba.excel.ExcelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExcelNoModel {

    public void run() throws Exception{
        //获取要读取的excel文件
        InputStream in = null;

        try {
            in = new FileInputStream(new File("D:/work/student.xlsx"));

            //创建Listener
            MyExcelListener listener = new MyExcelListener();
            ExcelReader reader = new ExcelReader(in,null,listener);
            //执行read，开始读取excel
            reader.read();

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            //关闭InputStream
        }

    }

    public static void main(String[] args) throws Exception {
        new ReadExcelNoModel().run();
    }
}
