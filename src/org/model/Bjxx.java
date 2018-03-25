package org.model;

/**
 * Bjxx entity. @author MyEclipse Persistence Tools
 */

public class Bjxx implements java.io.Serializable {

	// Fields

	private Integer classid;
	private String classname;
	private Integer professionid;
	private String gradename;
	private String flag;

	// Constructors

	/** default constructor */
	public Bjxx() {
	}

	/** minimal constructor */
	public Bjxx(Integer professionid) {
		this.professionid = professionid;
	}

	/** full constructor */
	public Bjxx(String classname, Integer professionid, String gradename,
			String flag) {
		this.classname = classname;
		this.professionid = professionid;
		this.gradename = gradename;
		this.flag = flag;
	}

	// Property accessors

	public Integer getClassid() {
		return this.classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public Integer getProfessionid() {
		return this.professionid;
	}

	public void setProfessionid(Integer professionid) {
		this.professionid = professionid;
	}

	public String getGradename() {
		return this.gradename;
	}

	public void setGradename(String gradename) {
		this.gradename = gradename;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}