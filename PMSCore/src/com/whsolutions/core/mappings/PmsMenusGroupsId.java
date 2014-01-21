package com.whsolutions.core.mappings;

// Generated Jan 21, 2014 5:02:18 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PmsMenusGroupsId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2547662516227126155L;
	private int groupId;
	private int menuId;
	private int privilegeId;

	public PmsMenusGroupsId() {
	}

	public PmsMenusGroupsId(int groupId, int menuId, int privilegeId) {
		this.groupId = groupId;
		this.menuId = menuId;
		this.privilegeId = privilegeId;
	}

	@Column(name = "group_id", nullable = false)
	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Column(name = "menu_id", nullable = false)
	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	@Column(name = "privilege_id", nullable = false)
	public int getPrivilegeId() {
		return this.privilegeId;
	}

	public void setPrivilegeId(int privilegeId) {
		this.privilegeId = privilegeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PmsMenusGroupsId))
			return false;
		PmsMenusGroupsId castOther = (PmsMenusGroupsId) other;

		return (this.getGroupId() == castOther.getGroupId())
				&& (this.getMenuId() == castOther.getMenuId())
				&& (this.getPrivilegeId() == castOther.getPrivilegeId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGroupId();
		result = 37 * result + this.getMenuId();
		result = 37 * result + this.getPrivilegeId();
		return result;
	}

}
