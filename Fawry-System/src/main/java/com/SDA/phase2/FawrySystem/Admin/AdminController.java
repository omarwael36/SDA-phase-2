package com.SDA.phase2.FawrySystem.Admin;

import com.SDA.phase2.FawrySystem.Refund.RefundController;
import com.SDA.phase2.FawrySystem.services.DiscountInfo;
import com.SDA.phase2.FawrySystem.services.ServiceController;


public class AdminController {
    ServiceController sc = new ServiceController();
    RefundController refund = new RefundController();
    public void AddnewSP ()
    {

    }
    public void AddDiscount (double rate, String name, String type, int ID,String dison)
    {
        DiscountInfo di = new DiscountInfo(rate,name,type,ID,dison);
        sc.Discounts.add(di);

    }
    public void ShowUserTransactions ()
    {
        //Show
    }
    public void ShowRefund (int id)
    {
        for (int i = 0 ; i < refund.Req.Refundreq.size() ; i++)
        {
            if (refund.Req.Refundreq.get(i).getId() == id) {
                if (refund.Req.Refundreq.get(i).isApproved()) {
                    System.out.print("Refund Approved !!");
                } else if (refund.Req.Refundreq.get(i).getId() == id == false) {
                    System.out.print("Refund Declined !!");
                }
            }
        }
    }
    public void AcceptRefund (int id)
    {
        for (int i = 0 ; i < refund.Req.Refundreq.size() ; i++)
        {
            if (refund.Req.Refundreq.get(i).getId() == id)
            {
                refund.Req.Refundreq.get(i).setApproved(true);
            }
        }
    }
}
