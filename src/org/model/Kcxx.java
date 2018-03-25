package org.model;

/**
 * Kcxx entity. @author MyEclipse Persistence Tools
 */

public class Kcxx implements java.io.Serializable {

	// Fields

	private Integer courseid;
	private String coursename;
	private Integer facultyid;
	private Integer coursecredit;
	private String flag;

	// Constructors

	/** default constructor */
	public Kcxx() {
	}

	/** minimal constructor */
	public Kcxx(Integer courseid, Integer facultyid) {
		this.courseid = courseid;
		this.facultyid = facultyid;
	}

	/** full constructor */
	public Kcxx(Integer courseid, String coursename, Integer facultyid,
			Integer coursecredit, String flag) {
		this.courseid = courseid;
		this.coursename = coursename;
		this.facultyid = facultyid;
		this.coursecredit = coursecredit;
		this.flag = flag;
	}

	// Property accessors

	public Integer getCourseid() {
		return this.courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return this.coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Integer getFacultyid() {
		return this.facultyid;
	}

	public void setFacultyid(Integer facultyid) {
		this.facultyid = facultyid;
	}

	public Integer getCoursecredit() {
		return this.coursecredit;
	}

	public void setCoursecredit(Integer coursecredit) {
		this.coursecredit = coursecredit;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}