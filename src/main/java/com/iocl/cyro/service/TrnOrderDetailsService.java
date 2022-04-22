package com.iocl.cyro.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iocl.cyro.dao.TrnOrderDetailsDAO;
import com.iocl.cyro.dao.TrnOrderEmployeeDetailsDao;
import com.iocl.cyro.model.TrnOrderDetails;
import com.iocl.cyro.model.TrnOrderEmployeeDetails;

@Service
@Transactional
public class TrnOrderDetailsService {
	@Autowired
	private TrnOrderDetailsDAO trnOrderDetailsDao;
	@Autowired
	private TrnOrderEmployeeDetailsDao trnOrderDetailEmployeeDao;

	public TrnOrderDetails createOrder(TrnOrderDetails trnOrder) {

		trnOrder.setCreatedOn(new Timestamp(System.currentTimeMillis()));
		// Order Requested Submitted by Customer - Pending with Employee
		trnOrder.setStatus("1");
		return trnOrderDetailsDao.save(trnOrder);
	}

	public ArrayList<TrnOrderDetails> fetchAllOrders() {
		System.out.println("q :" + trnOrderDetailsDao.findAllOrder().size());
		return trnOrderDetailsDao.findAllOrder();
	}

	public TrnOrderDetails fetchOneOrders(int id) {
		return trnOrderDetailsDao.findById(id).get();
	}

	public TrnOrderDetails updateTrnOrderdetails(int id, TrnOrderDetails trnOrderDetails) {
		TrnOrderDetails _orderDetails = trnOrderDetailsDao.findById(id).get();

//		_orderDetails.setCreatedOn(new Timestamp(System.currentTimeMillis()));
//		_orderDetails.setAccountnumber(trnOrderDetails.getAccountnumber());
//		_orderDetails.setBilltoaddr(trnOrderDetails.getBilltoaddr());
//		_orderDetails.setBranchcode(trnOrderDetails.getBranchcode());
//		_orderDetails.setCancelledcheque(trnOrderDetails.getCancelledcheque());
//		_orderDetails.setCity(trnOrderDetails.getCity());
//		_orderDetails.setCustName(trnOrderDetails.getCustName());
//		_orderDetails.setEmail(trnOrderDetails.getEmail());
//		_orderDetails.setGstcertificate(trnOrderDetails.getGstcertificate());
//		_orderDetails.setGstno(trnOrderDetails.getGstno());
//		_orderDetails.setDeliverytype(trnOrderDetails.getDeliverytype());
//		_orderDetails.setPanno(trnOrderDetails.getPanno());
//		_orderDetails.setTcsdeclarationform(trnOrderDetails.getTcsdeclarationform());
//		_orderDetails.setTcsapplicable(trnOrderDetails.getTcsapplicable());
//		_orderDetails.setTanno(trnOrderDetails.getTanno());
//		_orderDetails.setState(trnOrderDetails.getState());
//		_orderDetails.setShiptoaddr(trnOrderDetails.getShiptoaddr());
//		_orderDetails.setRemarks(trnOrderDetails.getRemarks());
//		_orderDetails.setQuantity(trnOrderDetails.getQuantity());
//		_orderDetails.setMobile(trnOrderDetails.getMobile());
//		_orderDetails.setProduct(trnOrderDetails.getProduct());
//		_orderDetails.setModel(trnOrderDetails.getModel());
//		_orderDetails.setPancertificate(trnOrderDetails.getPancertificate());
//		_orderDetails.setPayeename(trnOrderDetails.getPayeename());
//		_orderDetails.setIfsccode(trnOrderDetails.getIfsccode());
		_orderDetails.setBaseprice(trnOrderDetails.getBaseprice());
		_orderDetails.setExpectedeliverydate(trnOrderDetails.getExpectedeliverydate());
		_orderDetails.setCalldate(trnOrderDetails.getCalldate());
		_orderDetails.setConfmodel(trnOrderDetails.getConfmodel());
		_orderDetails.setConfquantity(trnOrderDetails.getConfquantity());
		_orderDetails.setStatus("2");

		TrnOrderEmployeeDetails trnOrderEmployeeDetails = new TrnOrderEmployeeDetails();
		trnOrderEmployeeDetails.setBaseprice(trnOrderDetails.getBaseprice());
		trnOrderEmployeeDetails.setCalldate(trnOrderDetails.getCalldate());
		trnOrderEmployeeDetails.setConfmodel(trnOrderDetails.getConfmodel());
		trnOrderEmployeeDetails.setCreatedBy(_orderDetails.getReqNo() + "");
		trnOrderEmployeeDetails.setCreatedon(new Timestamp(System.currentTimeMillis()));
		trnOrderEmployeeDetails.setExpectedeliverydate(trnOrderDetails.getExpectedeliverydate());
		trnOrderEmployeeDetails.setQuantity(trnOrderDetails.getConfquantity());
		trnOrderEmployeeDetails.setReqNo(_orderDetails.getReqNo());
		int sequp = 1;
		trnOrderEmployeeDetails.setSeqno(++sequp);
		trnOrderDetailEmployeeDao.save(trnOrderEmployeeDetails);

		return trnOrderDetailsDao.save(_orderDetails);

	}

}
