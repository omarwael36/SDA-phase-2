package com.SDA.phase2.FawrySystem.Refund;

import com.SDA.phase2.FawrySystem.services.ServiceProvider;

public class Transactions
{
    private int id = 0 ;
    private String Time ;
    private String Source ;
    private String Ownername;
    private boolean approved = false;
    ServiceProvider Sp = new ServiceProvider();
    double amount;

    public Transactions() {
    }

    public Transactions(int id, String time, String source, String ownername, boolean approved, ServiceProvider sp, double amount) {
        this.id = id;
        Time = time;
        Source = source;
        Ownername = ownername;
        this.approved = approved;
        Sp = sp;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getOwnername() {
        return Ownername;
    }

    public void setOwnername(String ownername) {
        Ownername = ownername;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public ServiceProvider getSp() {
        return Sp;
    }

    public void setSp(ServiceProvider sp) {
        Sp = sp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
