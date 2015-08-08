package com.example.wangweimin.coolweather.model;

/**
 * Created by wangweimin on 15/8/6.
 */
public class Province {
    private int id;
    private String provinceCode;
    private String provinceName;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode){
        this.provinceCode = provinceCode;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
}
