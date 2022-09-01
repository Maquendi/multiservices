package com.datahub.entities.users;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.datahub.utils.OwnedEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "userconsent")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserConsent extends OwnedEntity {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String code;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@NotNull
	private User userWhoGranted;
	
	private String permissionGranted; // is a permission
	
	@ManyToOne(fetch = FetchType.LAZY)
	@NotNull
	private User userGrantedTo; // must be an admin user
	
	private boolean isUsed;
	
	public boolean wasGrantedTo(String userId) {
		return this.userGrantedTo.getId().equals(userId);
	}
	
	public boolean isGrantedPermission(String permission) {
		return this.permissionGranted.equals(permission);
	}

	@Override
	public String getOwnerUserId() {
		return this.userWhoGranted.getId();
	}
}
