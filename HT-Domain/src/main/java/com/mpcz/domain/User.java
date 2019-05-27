package com.mpcz.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/*
 * @author Hemant Verma
 * @version 1.0
 * @date 2019-05-24
 */

@Entity(name = "User")
@Table(name = "user")
public class User implements Serializable{

	 
	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "user_id")
	    private Long userId;

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

	    @Column(name = "user_name")
	    private String userName;
	    
	    @Column(name = "userid")
	    private String userid;
	    
	    @Column(name = "user_credentials")
	    private String userCredentials;
	    
	    @Column(name = "login_attemp")
	    private Long loginAttemp;
	    
	    @Column(name = "login_status")
	    private String loginStatus;
	    
	    @Column(name = "account_non_expired")
	    private Boolean accountNonExpired;
	    
	    @Column(name = "account_non_locked")
	    private Boolean accountNonLocked;
	    
	    @Column(name = "credentials_non_expired")
	    private Boolean credentialsNonExpired;
	    
	    @Column(name = "last_logged_in_date")
	    private Date lastLoggedInDate;
	    
	    @Column(name = "user_email_id")
	    private String userEmailId;

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
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

		public Date getUpdated() {
			return updated;
		}

		public void setUpdated(Date updated) {
			this.updated = updated;
		}

		public Long getUpdatedBy() {
			return updatedBy;
		}

		public void setUpdatedBy(Long updatedBy) {
			this.updatedBy = updatedBy;
		}

		public Boolean getIsActive() {
			return isActive;
		}

		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public String getUserCredentials() {
			return userCredentials;
		}

		public void setUserCredentials(String userCredentials) {
			this.userCredentials = userCredentials;
		}

		public Long getLoginAttemp() {
			return loginAttemp;
		}

		public void setLoginAttemp(Long loginAttemp) {
			this.loginAttemp = loginAttemp;
		}

		public String getLoginStatus() {
			return loginStatus;
		}

		public void setLoginStatus(String loginStatus) {
			this.loginStatus = loginStatus;
		}

		public Boolean getAccountNonExpired() {
			return accountNonExpired;
		}

		public void setAccountNonExpired(Boolean accountNonExpired) {
			this.accountNonExpired = accountNonExpired;
		}

		public Boolean getAccountNonLocked() {
			return accountNonLocked;
		}

		public void setAccountNonLocked(Boolean accountNonLocked) {
			this.accountNonLocked = accountNonLocked;
		}

		public Boolean getCredentialsNonExpired() {
			return credentialsNonExpired;
		}

		public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
			this.credentialsNonExpired = credentialsNonExpired;
		}

		public Date getLastLoggedInDate() {
			return lastLoggedInDate;
		}

		public void setLastLoggedInDate(Date lastLoggedInDate) {
			this.lastLoggedInDate = lastLoggedInDate;
		}

		public String getUserEmailId() {
			return userEmailId;
		}

		public void setUserEmailId(String userEmailId) {
			this.userEmailId = userEmailId;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", created=" + created + ", createdBy=" + createdBy + ", updated="
					+ updated + ", updatedBy=" + updatedBy + ", isActive=" + isActive + ", userName=" + userName
					+ ", userid=" + userid + ", userCredentials=" + userCredentials + ", loginAttemp=" + loginAttemp
					+ ", loginStatus=" + loginStatus + ", accountNonExpired=" + accountNonExpired
					+ ", accountNonLocked=" + accountNonLocked + ", credentialsNonExpired=" + credentialsNonExpired
					+ ", lastLoggedInDate=" + lastLoggedInDate + ", userEmailId=" + userEmailId + "]";
		}
	    
	    

}