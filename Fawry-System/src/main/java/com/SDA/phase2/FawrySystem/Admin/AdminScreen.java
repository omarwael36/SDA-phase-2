package com.SDA.phase2.FawrySystem.Admin;

public class AdminScreen
{

    public void DisplayRefundReq (AdminController c)
    {
        for (int i =0 ; i < c.refund.Req.Refundreq.size() ; i++)
        {
            System.out.print("Refund Owner .." + c.refund.Req.Refundreq.get(i).Ownername);
            System.out.print("Refund source .." + c.refund.Req.Refundreq.get(i).Source);
            System.out.print("Refund id .." + c.refund.Req.Refundreq.get(i).id);
        }

    }
}
