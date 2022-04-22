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
@Table(name = "TRN_NONREG_ORDER")
public class TrnOrderDetails {
	@Id
	@GeneratedValue(generator = "trnOrderSeq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "trnOrderSeq", sequenceName = "TRN_ORDER_SEQ")
	@Column(name = "REQ_NO")
	private int reqNo;

	@Column(name = "CUST_NAME")
	private String custName;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "email")
	private String email;

	@Column(name = "product")
	private String product;

	@Column(name = "model")
	private String model;

	@Column(name = "quantity")
	private String quantity;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "billtoaddr")
	private String billtoaddr;

	@Column(name = "shiptoaddr")
	private String shiptoaddr;

	@Column(name = "gst_no")
	private String gstno;

	@Column(name = "gstcertificate")
	private String gstcertificate;

	@Column(name = "panno")
	private String panno;

	@Column(name = "pancertificate")
	private String pancertificate;

	@Column(name = "tanno")
	private String tanno;

	@Column(name = "accountnumber")
	private String accountnumber;

	@Column(name = "payee_name")
	private String payeename;

	@Column(name = "ifsccode")
	private String ifsccode;

	@Column(name = "branchcode")
	private String branchcode;

	@Column(name = "cancelledcheque")
	private String cancelledcheque;

	@Column(name = "tcsapplicable")
	private String tcsapplicable;

	@Column(name = "tcsdeclarationform")
	private String tcsdeclarationform;

	@Column(name = "deliverytype")
	private String deliverytype;

	@Column(name = "BASE_PRICE")
	private double baseprice;

	@Column(name = "EXPECTED_DELIVERY_DATE")
	private Timestamp expectedeliverydate;

	@Column(name = "CREATED_ON")
	private Timestamp createdOn;

	@Column(name = "CALLDATE")
	private Timestamp calldate;

	@Column(name = "CONF_MODEL")
	private String confmodel;

	@Column(name = "CONF_QUANTITY")
	private String confquantity;

	@Column(name = "STATUS")
	private String status;

	public int getReqNo() {
		return reqNo;
	}

	public void setReqNo(int reqNo) {
		this.reqNo = reqNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getBilltoaddr() {
		return billtoaddr;
	}

	public void setBilltoaddr(String billtoaddr) {
		this.billtoaddr = billtoaddr;
	}

	public String getShiptoaddr() {
		return shiptoaddr;
	}

	public void setShiptoaddr(String shiptoaddr) {
		this.shiptoaddr = shiptoaddr;
	}

	public String getGstno() {
		return gstno;
	}

	public void setGstno(String gstno) {
		this.gstno = gstno;
	}

	public String getGstcertificate() {
		return gstcertificate;
	}

	public void setGstcertificate(String gstcertificate) {
		this.gstcertificate = gstcertificate;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public String getPancertificate() {
		return pancertificate;
	}

	public void setPancertificate(String pancertificate) {
		this.pancertificate = pancertificate;
	}

	public String getTanno() {
		return tanno;
	}

	public void setTanno(String tanno) {
		this.tanno = tanno;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getPayeename() {
		return payeename;
	}

	public void setPayeename(String payeename) {
		this.payeename = payeename;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getCancelledcheque() {
		return cancelledcheque;
	}

	public void setCancelledcheque(String cancelledcheque) {
		this.cancelledcheque = cancelledcheque;
	}

	public String getTcsapplicable() {
		return tcsapplicable;
	}

	public void setTcsapplicable(String tcsapplicable) {
		this.tcsapplicable = tcsapplicable;
	}

	public String getTcsdeclarationform() {
		return tcsdeclarationform;
	}

	public void setTcsdeclarationform(String tcsdeclarationform) {
		this.tcsdeclarationform = tcsdeclarationform;
	}

	public String getDeliverytype() {
		return deliverytype;
	}

	public void setDeliverytype(String deliverytype) {
		this.deliverytype = deliverytype;
	}

	public double getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(double baseprice) {
		this.baseprice = baseprice;
	}

	public Timestamp getExpectedeliverydate() {
		return expectedeliverydate;
	}

	public void setExpectedeliverydate(Timestamp expectedeliverydate) {
		this.expectedeliverydate = expectedeliverydate;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
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

	public String getConfquantity() {
		return confquantity;
	}

	public void setConfquantity(String confquantity) {
		this.confquantity = confquantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TrnOrderDetails [reqNo=" + reqNo + ", custName=" + custName + ", city=" + city + ", state=" + state
				+ ", mobile=" + mobile + ", email=" + email + ", product=" + product + ", model=" + model
				+ ", quantity=" + quantity + ", remarks=" + remarks + ", billtoaddr=" + billtoaddr + ", shiptoaddr="
				+ shiptoaddr + ", gstno=" + gstno + ", gstcertificate=" + gstcertificate + ", panno=" + panno
				+ ", pancertificate=" + pancertificate + ", tanno=" + tanno + ", accountnumber=" + accountnumber
				+ ", payeename=" + payeename + ", ifsccode=" + ifsccode + ", branchcode=" + branchcode
				+ ", cancelledcheque=" + cancelledcheque + ", tcsapplicable=" + tcsapplicable + ", tcsdeclarationform="
				+ tcsdeclarationform + ", deliverytype=" + deliverytype + ", baseprice=" + baseprice
				+ ", expectedeliverydate=" + expectedeliverydate + ", createdOn=" + createdOn + ", calldate=" + calldate
				+ ", confmodel=" + confmodel + ", confquantity=" + confquantity + ", status=" + status + ", getReqNo()="
				+ getReqNo() + ", getCustName()=" + getCustName() + ", getCity()=" + getCity() + ", getState()="
				+ getState() + ", getMobile()=" + getMobile() + ", getEmail()=" + getEmail() + ", getProduct()="
				+ getProduct() + ", getModel()=" + getModel() + ", getQuantity()=" + getQuantity() + ", getRemarks()="
				+ getRemarks() + ", getBilltoaddr()=" + getBilltoaddr() + ", getShiptoaddr()=" + getShiptoaddr()
				+ ", getGstno()=" + getGstno() + ", getGstcertificate()=" + getGstcertificate() + ", getPanno()="
				+ getPanno() + ", getPancertificate()=" + getPancertificate() + ", getTanno()=" + getTanno()
				+ ", getAccountnumber()=" + getAccountnumber() + ", getPayeename()=" + getPayeename()
				+ ", getIfsccode()=" + getIfsccode() + ", getBranchcode()=" + getBranchcode()
				+ ", getCancelledcheque()=" + getCancelledcheque() + ", getTcsapplicable()=" + getTcsapplicable()
				+ ", getTcsdeclarationform()=" + getTcsdeclarationform() + ", getDeliverytype()=" + getDeliverytype()
				+ ", getBaseprice()=" + getBaseprice() + ", getExpectedeliverydate()=" + getExpectedeliverydate()
				+ ", getCreatedOn()=" + getCreatedOn() + ", getCalldate()=" + getCalldate() + ", getConfmodel()="
				+ getConfmodel() + ", getConfquantity()=" + getConfquantity() + ", getStatus()=" + getStatus()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

}

//refno,custname,city state,created on