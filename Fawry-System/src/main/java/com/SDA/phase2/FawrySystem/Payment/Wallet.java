package com.SDA.phase2.FawrySystem.Payment;

public class Wallet extends payment {
    private int WalletID;
    private double Amount;

    public Wallet() {

    }

    public Wallet(int walletID, double amount) {
        WalletID = walletID;
        Amount = amount;
    }

    public int getWalletID() {
        return WalletID;
    }

    public void setWalletID(int walletID) {
        WalletID = walletID;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }
    public String Pay(double payed,double cost){
        PaymentController pc = new PaymentController();
        if(pc.CheckBalance(this.getAmount(),cost)){
            if(pc.CheckPayement(payed,cost)){
                this.setAmount(this.getAmount() - cost);
                return "Payment done successfully !!";
            }
        }
        return "Payment Error";
    }
}
