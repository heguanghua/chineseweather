package com.example.administrator.chineseweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2019/5/2 0002.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public void setId(int id){
        this.id = id;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }

    public int getId(){
        return this.id;
    }
    public String getCityName(){
        return this.cityName;
    }
    public int getCityCode(){
        return this.cityCode;
    }
    public int getProvinceId(){
        return this.provinceId;
    }
}
