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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "pms_menus", catalog = "pms_storage", uniqueConstraints = @UniqueConstraint(columnNames = "menu_name"))
public class PmsMenus implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6847900786466581254L;
	private int menuId;
	private Date creationDate;
	private String description;
	private String menuName;
	private Set<PmsMenusGroups> pmsMenusGroupses = new HashSet<PmsMenusGroups>(
			0);

	public PmsMenus() {
	}

	public PmsMenus(int menuId, Date creationDate, String menuName) {
		this.menuId = menuId;
		this.creationDate = creationDate;
		this.menuName = menuName;
	}

	public PmsMenus(int menuId, Date creationDate, String description,
			String menuName, Set<PmsMenusGroups> pmsMenusGroupses) {
		this.menuId = menuId;
		this.creationDate = creationDate;
		this.description = description;
		this.menuName = menuName;
		this.pmsMenusGroupses = pmsMenusGroupses;
	}

	@Id
	@Column(name = "menu_id", unique = true, nullable = false)
	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
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
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "menu_name", unique = true, nullable = false, length = 80)
	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pmsMenus")
	public Set<PmsMenusGroups> getPmsMenusGroupses() {
		return this.pmsMenusGroupses;
	}

	public void setPmsMenusGroupses(Set<PmsMenusGroups> pmsMenusGroupses) {
		this.pmsMenusGroupses = pmsMenusGroupses;
	}

}
