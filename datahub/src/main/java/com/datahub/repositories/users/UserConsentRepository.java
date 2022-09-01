package com.datahub.repositories.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datahub.entities.users.UserConsent;

@Repository
public interface UserConsentRepository extends JpaRepository<UserConsent, String> {}
