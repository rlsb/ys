package org.model;

/**
 * Xyxx entity. @author MyEclipse Persistence Tools
 */

public class Xyxx implements java.io.Serializable {

	// Fields

	private Integer facultyid;
	private String facultyname;
	private Integer schoolid;
	private String flag;

	// Constructors

	/** default constructor */
	public Xyxx() {
	}

	/** minimal constructor */
	public Xyxx(Integer schoolid) {
		this.schoolid = schoolid;
	}

	/** full constructor */
	public Xyxx(String facultyname, Integer schoolid, String flag) {
		this.facultyname = facultyname;
		this.schoolid = schoolid;
		this.flag = flag;
	}

	// Property accessors

	public Integer getFacultyid() {
		return this.facultyid;
	}

	public void setFacultyid(Integer facultyid) {
		this.facultyid = facultyid;
	}

	public String getFacultyname() {
		return this.facultyname;
	}

	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}

	public Integer getSchoolid() {
		return this.schoolid;
	}

	public void setSchoolid(Integer schoolid) {
		this.schoolid = schoolid;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}