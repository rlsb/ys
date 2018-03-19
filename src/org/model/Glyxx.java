package org.model;

/**
 * Glyxx entity. @author MyEclipse Persistence Tools
 */

public class Glyxx implements java.io.Serializable {

	// Fields

	private Integer adminId;
	private Integer facultyId;
	private String username;
	private String facultyName;
	private String flag;
	private String password;

	// Constructors

	/** default constructor */
	public Glyxx() {
	}

	/** full constructor */
	public Glyxx(Integer facultyId, String username, String facultyName,
			String flag, String password) {
		this.facultyId = facultyId;
		this.username = username;
		this.facultyName = facultyName;
		this.flag = flag;
		this.password = password;
	}

	// Property accessors

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Integer getFacultyId() {
		return this.facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFacultyName() {
		return this.facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}