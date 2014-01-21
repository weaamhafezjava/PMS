package com.whsolutions.core.mappings;

// Generated Jan 21, 2014 5:02:18 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "pms_users", catalog = "pms_storage", uniqueConstraints = @UniqueConstraint(columnNames = "user_name"))
public class PmsUsers implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3286881812521382971L;
	private int userId;
	private String address;
	private Date creationDate;
	private String email;
	private Long mobile;
	private String password;
	private String userName;
	private Set<PmsGroups> pmsGroupses = new HashSet<PmsGroups>(0);

	public PmsUsers() {
	}

	public PmsUsers(int userId, Date creationDate, String password,
			String userName) {
		this.userId = userId;
		this.creationDate = creationDate;
		this.password = password;
		this.userName = userName;
	}

	public PmsUsers(int userId, String address, Date creationDate,
			String email, Long mobile, String password, String userName,
			Set<PmsGroups> pmsGroupses) {
		this.userId = userId;
		this.address = address;
		this.creationDate = creationDate;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.userName = userName;
		this.pmsGroupses = pmsGroupses;
	}

	@Id
	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "address", length = 50)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, length = 19)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "email", length = 80)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "mobile", precision = 10, scale = 0)
	public Long getMobile() {
		return this.mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "user_name", unique = true, nullable = false, length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "pmsUserses")
	public Set<PmsGroups> getPmsGroupses() {
		return this.pmsGroupses;
	}

	public void setPmsGroupses(Set<PmsGroups> pmsGroupses) {
		this.pmsGroupses = pmsGroupses;
	}

}
