package com.SDA.phase2.FawrySystem.Payment;

public class CreditCard extends payment {
    private String CardNumber;
    private String ExpiryDate;
    private String SecurityNumber;
    private double amount;

    public CreditCard() {
    }

    public CreditCard(String cardNumber, String expiryDate, String securityNumber, double amount) {
        CardNumber = cardNumber;
        ExpiryDate = expiryDate;
        SecurityNumber = securityNumber;
        this.amount = amount;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
    }

    public String getSecurityNumber() {
        return SecurityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        SecurityNumber = securityNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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
