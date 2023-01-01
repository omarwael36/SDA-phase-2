package com.SDA.phase2.FawrySystem.Refund;

public class RefundController
{
    public RefundRequest Req ;

    public void Refundwallet (int id)
    {
        for (int i = 0 ; i<Req.Refundreq.size() ; i++)
        {
            if (Req.Refundreq.get(i).getId() == id)
            {
                if (Req.Refundreq.get(i).isApproved()==true)
                {
                    //refund wallet;
                }
            }
        }

    }

    public void RefundCredit (int id)
    {
        for (int i = 0 ; i<Req.Refundreq.size() ; i++)
        {
            if (Req.Refundreq.get(i).getId() == id)
            {
                if (Req.Refundreq.get(i).isApproved()==true)
                {
                    //refund Credit;
                }
            }
        }

    }
}
