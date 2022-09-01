package com.datahub.repositories.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datahub.entities.users.Contact;

@Repository
public interface UserContactRepository extends JpaRepository<Contact, String> {
  List<Contact> findAllByUserId(String userId);
}
