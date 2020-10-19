package com.jlq.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/18 15:25
 * 把字符串转换成日期
 */

public class StringToDateConverter implements Converter<String, Date> {

    /**
     *
     * @param source 传入进来的字符串
     * @return
     */
    @Override
    public Date convert(String source) {
        //判断
        if(source==null){
            throw new RuntimeException("请传入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //把字符串准换成日期
        try {
            return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}


