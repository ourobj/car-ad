package com.example.zhengsuren.olddriver;

/**
 * Created by zhengsuren on 16/4/26.
 */
public class UserInfo {
    private String id,username,realname,email,phone,driverId,alipay,carnum,earnings,cartranum;
    private int error = 1;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;


    }

    public String getEarnings() {
        return earnings;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public void setEarnings(String earnings) {
        this.earnings = earnings;
    }

    public void setRealname(String realname) {
        this.realname = realname;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCartranum() {
        return cartranum;
    }

    public void setCartranum(String cartranum) {
        this.cartranum = cartranum;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }
}
