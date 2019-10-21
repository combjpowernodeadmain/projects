package com.wkcto.ba01;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

public class MyExcelListener extends AnalysisEventListener {
    public MyExcelListener() {
        super();
    }

    /**
     * 读取的每行数据都会调用invoke
     *
     * @param o 读取到的行数据 List<String>  -- ArrayList<String>
     * @param context 上下文， 能获取读取时信息。
     */
    @Override
    public void invoke(Object o, AnalysisContext context) {
        int row = context.getCurrentRowNum();
        System.out.println("类型："+o.getClass().getName()+"读取的行号："+row + "|读取的行数据:"+o );

        doSome(o);
    }

    //定义业务处理方法
    public void doSome(Object o){
        List<Object> list = (ArrayList<Object>)o;
        for (Object obj : list) {
            System.out.println(obj.getClass().getName());
        }
    }

    /**
     * 读取完成excel后执行的方法
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        System.out.println("excel读取完成");
    }
}
