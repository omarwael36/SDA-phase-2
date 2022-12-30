package com.SDA.phase2.FawrySystem.Refund;

public class RefundController
{
    RefundRequest Req ;

    public void Refundwallet (int id)
    {
        for (int i = 0 ; i<Req.Refundreq.size() ; i++)
        {
            if (Req.Refundreq.get(i).id == id)
            {
                if (Req.Refundreq.get(i).approved==true)
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
            if (Req.Refundreq.get(i).id == id)
            {
                if (Req.Refundreq.get(i).approved==true)
                {
                    //refund Credit;
                }
            }
        }

    }
}
