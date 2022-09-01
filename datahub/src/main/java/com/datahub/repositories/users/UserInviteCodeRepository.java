package com.datahub.repositories.users;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datahub.entities.users.UserInviteCode;

@Repository
public interface UserInviteCodeRepository extends JpaRepository<UserInviteCode, String>{
  Optional<UserInviteCode> findByInviteCode(Long inviteCode);
  List<UserInviteCode> findBySentToPhoneNumberOrSentToEmailAddress(String phoneNumber, String emailAddress);
}
