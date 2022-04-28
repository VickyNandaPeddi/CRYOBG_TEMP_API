package com.iocl.cyro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iocl.cyro.model.MstStatus;

import java.sql.Timestamp;
import java.util.Date;

@Repository
public interface MstStatusDao  extends JpaRepository<MstStatus, Integer>{
    @Query("update TrnOrderDetails  td set td.status=?1")
public void updateOrderStatus(String status);
    @Query("update TrnOrderDetails  td set td.remarks=?1")
    public void updateOrderRemarks(String remarks);
    @Query("update TrnOrderDetails  td set td.trn_utr_num=?1,td.trn_date=?2 ,td.trn_amount=?3 ,td.trn_po_det=?4 ")
    public void updateAcceptedDetails(String trnutrno, Timestamp trndate, double trnamount, String trnpodet);


}
