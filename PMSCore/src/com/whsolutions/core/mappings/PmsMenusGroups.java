package com.whsolutions.core.mappings;

// Generated Jan 21, 2014 5:02:18 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pms_menus_groups", catalog = "pms_storage")
public class PmsMenusGroups implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2524769163721085552L;
	private PmsMenusGroupsId id;
	private PmsMenus pmsMenus;
	private PmsPriviliges pmsPriviliges;
	private PmsGroups pmsGroups;

	public PmsMenusGroups() {
	}

	public PmsMenusGroups(PmsMenusGroupsId id, PmsMenus pmsMenus,
			PmsPriviliges pmsPriviliges, PmsGroups pmsGroups) {
		this.id = id;
		this.pmsMenus = pmsMenus;
		this.pmsPriviliges = pmsPriviliges;
		this.pmsGroups = pmsGroups;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "groupId", column = @Column(name = "group_id", nullable = false)),
			@AttributeOverride(name = "menuId", column = @Column(name = "menu_id", nullable = false)),
			@AttributeOverride(name = "privilegeId", column = @Column(name = "privilege_id", nullable = false)) })
	public PmsMenusGroupsId getId() {
		return this.id;
	}

	public void setId(PmsMenusGroupsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_id", nullable = false, insertable = false, updatable = false)
	public PmsMenus getPmsMenus() {
		return this.pmsMenus;
	}

	public void setPmsMenus(PmsMenus pmsMenus) {
		this.pmsMenus = pmsMenus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "privilege_id", nullable = false, insertable = false, updatable = false)
	public PmsPriviliges getPmsPriviliges() {
		return this.pmsPriviliges;
	}

	public void setPmsPriviliges(PmsPriviliges pmsPriviliges) {
		this.pmsPriviliges = pmsPriviliges;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id", nullable = false, insertable = false, updatable = false)
	public PmsGroups getPmsGroups() {
		return this.pmsGroups;
	}

	public void setPmsGroups(PmsGroups pmsGroups) {
		this.pmsGroups = pmsGroups;
	}

}
