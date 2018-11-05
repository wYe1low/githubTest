package com.study.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="mobile")
public class Mobile {
	private int id;
	private String mobilenumber;
	private String mobilearea;
	private String mobiletype;
	private String areacode;
	private String postcode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getMobilearea() {
		return mobilearea;
	}
	public void setMobilearea(String mobilearea) {
		this.mobilearea = mobilearea;
	}
	public String getMobiletype() {
		return mobiletype;
	}
	public void setMobiletype(String mobiletype) {
		this.mobiletype = mobiletype;
	}
	public String getAreacode() {
		return areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobilenumber=" + mobilenumber + ", mobilearea=" + mobilearea + ", mobiletype="
				+ mobiletype + ", areacode=" + areacode + ", postcode=" + postcode + "]";
	}
	
	
}
