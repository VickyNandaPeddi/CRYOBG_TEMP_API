package com.iocl.cyro.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "MST_STATUS")
public class MstStatus {

	@Id
//	@Transient
//	@Column(name = "STATUS_ID")
//	private int statusid;
	@Column(name = "STATUS_CODE")
	private String statuscode;

	@Column(name = "STATUS_DESC")
	private String statusdesc;

	@Column(name = "MODULE")
	private String module;

	public String getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}

	public String getStatusdesc() {
		return statusdesc;
	}

	public void setStatusdesc(String statusdesc) {
		this.statusdesc = statusdesc;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Override
	public String toString() {
		return "MstStatus [statuscode=" + statuscode + ", statusdesc=" + statusdesc + ", module=" + module
				+ ", getStatuscode()=" + getStatuscode() + ", getStatusdesc()=" + getStatusdesc() + ", getModule()="
				+ getModule() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
