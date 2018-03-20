package org.model;

/**
 * Zyxx entity. @author MyEclipse Persistence Tools
 */

public class Zyxx implements java.io.Serializable {

	// Fields

	private Integer professionid;
	private String professionname;
	private Integer facultyid;
	private String flag;

	// Constructors

	/** default constructor */
	public Zyxx() {
	}

	/** minimal constructor */
	public Zyxx(Integer facultyid) {
		this.facultyid = facultyid;
	}

	/** full constructor */
	public Zyxx(String professionname, Integer facultyid, String flag) {
		this.professionname = professionname;
		this.facultyid = facultyid;
		this.flag = flag;
	}

	// Property accessors

	public Integer getProfessionid() {
		return this.professionid;
	}

	public void setProfessionid(Integer professionid) {
		this.professionid = professionid;
	}

	public String getProfessionname() {
		return this.professionname;
	}

	public void setProfessionname(String professionname) {
		this.professionname = professionname;
	}

	public Integer getFacultyid() {
		return this.facultyid;
	}

	public void setFacultyid(Integer facultyid) {
		this.facultyid = facultyid;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}