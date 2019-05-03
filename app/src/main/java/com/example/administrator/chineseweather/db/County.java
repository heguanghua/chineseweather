package com.example.administrator.chineseweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2019/5/2 0002.
 */

public class County extends DataSupport {
    private int id;
    private String conutyName;
    private String weatherId;
    private int cityId;

    public void setId(int id){
        this.id = id;
    }
    public void setConutyName(String conutyName){
        this.conutyName = conutyName;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }

    public int getId(){
        return this.id;
    }
    public String getConutyName(){
        return this.conutyName;
    }
    public String getWeatherId(){
        return this.weatherId;
    }
    public int getCityId(){
        return this.cityId;
    }
}
