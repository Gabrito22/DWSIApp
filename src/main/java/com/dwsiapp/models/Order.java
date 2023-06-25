package com.dwsiapp.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private Date date;
    private double total;
    @ManyToOne
    private User user;
    @OneToOne
    private DetalleOrder detalle;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DetalleOrder getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleOrder detalle) {
        this.detalle = detalle;
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
