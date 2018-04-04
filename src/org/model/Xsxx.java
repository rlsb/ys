package org.model;

import java.sql.Timestamp;

/**
 * Xsxx entity. @author MyEclipse Persistence Tools
 */

public class Xsxx implements java.io.Serializable {

	// Fields

	private Integer studentid;
	private String studentname;
	private String password;
	private Integer classid;
	private String sex;
	private String facevalue;
	private Timestamp brithdate;
	private String image;
	private String flag;

	// Constructors

	/** default constructor */
	public Xsxx() {
	}

	/** minimal constructor */
	public Xsxx(Integer studentid, Integer classid) {
		this.studentid = studentid;
		this.classid = classid;
	}

	/** full constructor */
	public Xsxx(Integer studentid, String studentname, String password,
			Integer classid, String sex, String facevalue, Timestamp brithdate,
			String image, String flag) {
		this.studentid = studentid;
		this.studentname = studentname;
		this.password = password;
		this.classid = classid;
		this.sex = sex;
		this.facevalue = facevalue;
		this.brithdate = brithdate;
		this.image = image;
		this.flag = flag;
	}

	// Property accessors

	public Integer getStudentid() {
		return this.studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getClassid() {
		return this.classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFacevalue() {
		return this.facevalue;
	}

	public void setFacevalue(String facevalue) {
		this.facevalue = facevalue;
	}

	public Timestamp getBrithdate() {
		return this.brithdate;
	}

	public void setBrithdate(Timestamp brithdate) {
		this.brithdate = brithdate;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}