package com.dwsiapp.models;

import java.util.Date;

public class Order {
    private Integer id;
    private String number;
    private Date date;
    private double total;

    public Order() {
    }

    public Order(Integer id, String number, Date date, double total) {
        this.id = id;
        this.number = number;
        this.date = date;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}
