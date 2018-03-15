package com.zjt.mybill.Models.Bean;

/**
 * Created by Y410P on 2018/3/15.
 */

public class MonthBillBean {
    private String Year;
    private String Month;

    private String Money;

    public MonthBillBean(String year,String month,String money){
        Year=year;Month=month;Money=money;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getMoney() {
        return Money;
    }

    public void setMoney(String money) {
        Money = money;
    }
}
