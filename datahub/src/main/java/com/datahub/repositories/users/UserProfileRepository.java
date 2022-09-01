package com.datahub.repositories.users;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datahub.entities.users.User;
import com.datahub.entities.users.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, String> {
	Optional<User> findByEmailAddress(String emailAddress);
}
