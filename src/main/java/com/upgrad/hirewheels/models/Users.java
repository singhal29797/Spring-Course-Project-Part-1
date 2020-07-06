package com.upgrad.hirewheels.models;

import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    @Column(nullable = false)
    private String first_name;
    private String last_name;
    @Column(nullable = false)
    private String password;
    @Column(unique = true , nullable = false)
    private String email;
    @Column(unique = true , nullable = false)
    private String mobile_no;
    private int wallet_money;


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public int getWallet_money() {
        return wallet_money;
    }

    public void setWallet_money(int wallet_money) {
        this.wallet_money = wallet_money;
    }

    public Users() {}

    public Users(String first_name, String last_name, String password, String email, String mobile_no, int wallet_money) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.email = email;
        this.mobile_no = mobile_no;
        this.wallet_money = wallet_money;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                ", wallet_money=" + wallet_money +
                '}';
    }
}
