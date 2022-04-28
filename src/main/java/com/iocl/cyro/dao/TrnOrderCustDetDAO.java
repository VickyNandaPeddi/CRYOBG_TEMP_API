package com.iocl.cyro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iocl.cyro.model.TrnOrderCustDetails;
import com.iocl.cyro.model.TrnOrderEmployeeDetails;

@Repository
public interface TrnOrderCustDetDAO extends JpaRepository<TrnOrderCustDetails, Integer> {
	@Query(value = " select nvl(max(SEQ_NO),0) from TRN_ORDER_CUST_DET where REQ_NO=:reqNo ", nativeQuery = true)
	int fetchSeqNo(int reqNo);
}
