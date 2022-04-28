package com.iocl.cyro.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRN_ORDER_CUST_DET")
public class TrnOrderCustDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SL_NO")
	private int slNo;

	@Column(name = "REQ_NO")
	private int reqNo;
	
	@Column(name = "REMARKS")
	private String remarks;
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "SEQ_NO")
	private int seqno;
	@Column(name = "CREATED_ON")
	private Timestamp createdon;

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public int getReqNo() {
		return reqNo;
	}

	public void setReqNo(int reqNo) {
		this.reqNo = reqNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSeqno() {
		return seqno;
	}

	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}

	public Timestamp getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Timestamp createdon) {
		this.createdon = createdon;
	}
}
