package com.SDA.phase2.FawrySystem.Admin;

import com.SDA.phase2.FawrySystem.Refund.RefundController;

public class AdminController
{
    RefundController refund = new RefundController();
    public void AddnewSP ()
    {

    }
    public void AddDiscount ()
    {
    }
    public void ShowUserTransactions ()
    {
        
    }
    public void ShowRefund (int id)
    {
        for (int i = 0 ; i < refund.Req.Refundreq.size() ; i++)
        {
            if (refund.Req.Refundreq.get(i).id == id) {
                if (refund.Req.Refundreq.get(i).approved) {
                    System.out.print("Refund Approved !!");
                } else if (refund.Req.Refundreq.get(i).id == id == false) {
                    System.out.print("Refund Declined !!");
                }
            }
        }
    }
    public void AcceptRefund (int id)
    {
        for (int i = 0 ; i < refund.Req.Refundreq.size() ; i++)
        {
            if (refund.Req.Refundreq.get(i).id == id)
            {
                refund.Req.Refundreq.get(i).approved = true;
            }
        }
    }
}
