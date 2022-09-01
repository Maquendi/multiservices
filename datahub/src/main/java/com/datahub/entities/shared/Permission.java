package com.datahub.entities.shared;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import com.datahub.entities.users.User;
import com.datahub.utils.EntityBase;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Permission extends EntityBase {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String permission;

	// "user:activestatus:update"
	
	@ManyToMany(mappedBy = "permissions", fetch = FetchType.LAZY)
	private Set<User> users = new HashSet<>();
}
