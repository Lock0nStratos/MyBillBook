package com.zjt.mybill.Models.Bean;

/**
 * Created by Y410P on 2018/3/15.
 */

public class BillItemBean {
    private String Time;
    private String Type;
    private int OutIn;
    private String Money;

    public BillItemBean(String time,String type,int outIn,String money){
        Time=time;
        Type=type;
        OutIn=outIn;
        Money=money;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }


    public String getMoney() {
        return Money;
    }

    public void setMoney(String money) {
        Money = money;
    }

    public int getOutIn() {
        return OutIn;
    }

    public void setOutIn(int outIn) {
        OutIn = outIn;
    }
}
