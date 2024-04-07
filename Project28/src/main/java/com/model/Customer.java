package com.model;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable{
	private int cid;
	private String cname;
	private double cbill;
	private int cphone;
	
	public Customer()
	{
		
	}

	public Customer(int cid, String cname, double cbill, int cphone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cbill = cbill;
		this.cphone = cphone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getCbill() {
		return cbill;
	}

	public void setCbill(double cbill) {
		this.cbill = cbill;
	}

	public int getCphone() {
		return cphone;
	}

	public void setCphone(int cphone) {
		this.cphone = cphone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cbill, cid, cname, cphone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Double.doubleToLongBits(cbill) == Double.doubleToLongBits(other.cbill) && cid == other.cid
				&& Objects.equals(cname, other.cname) && cphone == other.cphone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cbill=" + cbill + ", cphone=" + cphone + "]";
	}
	
}
