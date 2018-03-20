package org.model;

/**
 * Jsxx entity. @author MyEclipse Persistence Tools
 */

public class Jsxx implements java.io.Serializable {

	// Fields

	private Integer teacherId;
	private String teacherName;
	private String teacherPassword;
	private Integer professionId;
	private String sex;
	private String flag;

	// Constructors

	/** default constructor */
	public Jsxx() {
	}

	/** full constructor */
	public Jsxx(String teacherName, String teacherPassword,
			Integer professionId, String sex, String flag) {
		this.teacherName = teacherName;
		this.teacherPassword = teacherPassword;
		this.professionId = professionId;
		this.sex = sex;
		this.flag = flag;
	}

	// Property accessors

	public Integer getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherPassword() {
		return this.teacherPassword;
	}

	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}

	public Integer getProfessionId() {
		return this.professionId;
	}

	public void setProfessionId(Integer professionId) {
		this.professionId = professionId;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}