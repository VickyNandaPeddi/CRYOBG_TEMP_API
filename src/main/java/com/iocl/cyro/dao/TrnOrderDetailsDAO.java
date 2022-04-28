package com.iocl.cyro.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.iocl.cyro.model.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import com.iocl.cyro.model.TrnOrderDetails;

@Repository
public interface TrnOrderDetailsDAO extends CrudRepository<TrnOrderDetails, Integer> {
//	@Query(value = " insert into TRN_NONREG_ORDER (REQ_NO) values()", nativeQuery = true)
//	int createOrderDetails();
	@Query(value = " select * from  TRN_NONREG_ORDER ", nativeQuery = true)
//	@Query("select reqNo from  TrnOrderDetails")
	ArrayList<TrnOrderDetails> findAllOrder();
	@Query("update TrnOrderDetails  td set td.remarks=?1,td.status=?2 where td.reqNo=?3")
	public void updateOrderRemarks(String remarks,String status,int reqno);
	@Query("update TrnOrderDetails  td set td.trn_utr_num=?1,td.trn_date=?2 ,td.trn_amount=?3 ,td.trn_po_det=?4,td.status=?5 ,td.remarks=?6 where td.reqNo=?7 ")
	public void updateAcceptedDetails(String trnutrno, Timestamp trndate, double trnamount, String trnpodet,String status,String remarks,int reqno);
}
