package com.datahub.entities.users;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.datahub.entities.shared.Permission;
import com.datahub.utils.EntityBase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER_HUB")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends EntityBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;

	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Contact> contacts;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<UserProfile> profiles; // will contain stale profiles with the overriden property true.
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	private Set<User> referrals;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "referredBy_id" )
	private User referredBy;
	
	private boolean isActive;
	
	@ManyToMany
	@JoinTable(
			  name = "user_permission", 
			  joinColumns = @JoinColumn(name = "user_id"), 
			  inverseJoinColumns = @JoinColumn(name = "permission_id"))
	private Set<Permission> permissions;
	
	public boolean isAuthorized(String action) {
		System.out.println(permissions);
		return this.isActive && this.permissions.stream().anyMatch((@NotNull var e) -> e.getPermission().equals(action));
	}
}
