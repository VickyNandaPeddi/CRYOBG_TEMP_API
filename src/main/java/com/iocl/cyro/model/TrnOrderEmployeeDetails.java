package com.iocl.cyro.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TRN_ORDER_EMP_DET")
public class TrnOrderEmployeeDetails {
	@Id

	@Column(name = "REQ_NO")
	private int reqNo;

	@Column(name = "BASE_PRICE")
	private double baseprice;

	@Column(name = "EXPECTED_DELIVERY_DATE")
	private Timestamp expectedeliverydate;

	@Column(name = "CALLDATE")
	private Timestamp calldate;

	@Column(name = "MODEL")
	private String confmodel;
	@Column(name = "QUANTITY")
	private String quantity;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SEQ_NO")
	private int seqno;
	@Column(name = "CREATED_BY")
	private String createdBy;
	@Column(name = "CREATED_ON")
	private Timestamp createdon;

	public int getReqNo() {
		return reqNo;
	}

	public void setReqNo(int reqNo) {
		this.reqNo = reqNo;
	}

	public double getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(double baseprice) {
		this.baseprice = baseprice;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Timestamp getExpectedeliverydate() {
		return expectedeliverydate;
	}

	public void setExpectedeliverydate(Timestamp expectedeliverydate) {
		this.expectedeliverydate = expectedeliverydate;
	}

	public Timestamp getCalldate() {
		return calldate;
	}

	public void setCalldate(Timestamp calldate) {
		this.calldate = calldate;
	}

	public String getConfmodel() {
		return confmodel;
	}

	public void setConfmodel(String confmodel) {
		this.confmodel = confmodel;
	}

	public int getSeqno() {
		return seqno;
	}

	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Timestamp createdon) {
		this.createdon = createdon;
	}

}
