package com.example.administrator.chineseweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2019/5/2 0002.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public void setId(int id){
        this.id = id;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
    public int getId(){
        return this.id;
    }
    public String getProvinceName(){
        return this.provinceName;
    }
    public int getProvinceCode(){
        return this.provinceCode;
    }
}
