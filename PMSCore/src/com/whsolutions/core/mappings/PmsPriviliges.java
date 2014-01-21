package com.whsolutions.core.mappings;

// Generated Jan 21, 2014 5:02:18 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pms_priviliges", catalog = "pms_storage")
public class PmsPriviliges implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5466499464160430614L;
	private int privilegeId;
	private Date creationDate;
	private Integer description;
	private Set<PmsMenusGroups> pmsMenusGroupses = new HashSet<PmsMenusGroups>(
			0);

	public PmsPriviliges() {
	}

	public PmsPriviliges(int privilegeId, Date creationDate) {
		this.privilegeId = privilegeId;
		this.creationDate = creationDate;
	}

	public PmsPriviliges(int privilegeId, Date creationDate,
			Integer description, Set<PmsMenusGroups> pmsMenusGroupses) {
		this.privilegeId = privilegeId;
		this.creationDate = creationDate;
		this.description = description;
		this.pmsMenusGroupses = pmsMenusGroupses;
	}

	@Id
	@Column(name = "privilege_id", unique = true, nullable = false)
	public int getPrivilegeId() {
		return this.privilegeId;
	}

	public void setPrivilegeId(int privilegeId) {
		this.privilegeId = privilegeId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, length = 19)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "description")
	public Integer getDescription() {
		return this.description;
	}

	public void setDescription(Integer description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pmsPriviliges")
	public Set<PmsMenusGroups> getPmsMenusGroupses() {
		return this.pmsMenusGroupses;
	}

	public void setPmsMenusGroupses(Set<PmsMenusGroups> pmsMenusGroupses) {
		this.pmsMenusGroupses = pmsMenusGroupses;
	}

}
