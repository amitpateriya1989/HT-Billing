package com.mpcz.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/*
 * @author Hemant Verma
 * @version 1.0
 * @date 2019-05-24
 */

@Entity(name = "Role")
@Table(name = "role")
public class Role implements Serializable{

	 	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "role_id")
	    private Long roleId;

	    @Column(name = "created")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date created;

	    @Column(name = "created_by")
	    private Long createdBy;

	    @Column(name = "updated")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date updated;
	    
	    @Column(name = "updated_by")
	    private Long updatedBy;

	    @Column(name = "is_active")
	    private Boolean isActive;

	    @Column(name = "role")
	    private String role;
	    
	    @Column(name = "desc")
	    private String desc;
	    
	   

		public Long getRoleId() {
			return roleId;
		}

		public void setRoleId(long roleId) {
			this.roleId = roleId;
		}

		public Date getCreated() {
			return created;
		}

		public void setCreated(Date created) {
			this.created = created;
		}

		public Long getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(Long createdBy) {
			this.createdBy = createdBy;
		}

		public Long getUpdatedBy() {
			return updatedBy;
		}

		public void setUpdatedBy(Long updatedBy) {
			this.updatedBy = updatedBy;
		}

		public Boolean isActive() {
			return isActive;
		}

		public void setActive(Boolean isActive) {
			this.isActive = isActive;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Date getUpdated() {
			return updated;
		}

		public void setUpdated(Date updated) {
			this.updated = updated;
		}

		@Override
		public String toString() {
			return "Role [roleId=" + roleId + ", created=" + created + ", createdBy=" + createdBy + ", updated="
					+ updated + ", updatedBy=" + updatedBy + ", isActive=" + isActive + ", role=" + role + ", desc="
					+ desc + "]";
		}

		
	    
	    

}
