package com.jp.a20220124antonmakovnycschools.modules.local.schools;

public class SchoolsItem{

	private String schoolName;
	private String campusName;
	private String website;
	private String zip;

	public SchoolsItem(String schoolName, String campusName, String website, String zip){
		this.schoolName = schoolName;
		this.campusName = campusName;
		this.website = website;
		this.zip = zip;
	}


	public String getSchoolName() {
		return schoolName;
	}

	public String getCampusName() {
		return campusName;
	}

	public String getWebsite() {
		return website;
	}

	public String getZip() {
		return zip;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
