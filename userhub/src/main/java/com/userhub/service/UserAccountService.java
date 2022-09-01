package com.userhub.service;

import java.util.List;
import java.util.Optional;

import com.datahub.entities.users.Contact;
import com.datahub.entities.users.User;
import com.datahub.entities.users.UserConsent;
import com.datahub.entities.users.UserInviteCode;
import com.datahub.entities.users.UserProfile;
import com.shared.exceptions.BusinessException;
import com.userhub.model.requests.CreateContactRequest;

public interface UserAccountService {
	/**
	 * 
	 * @param userId
	 * @return
	 * @throws BusinessException
	 */
  Optional<UserConsent> getUserConsent(String userId) throws BusinessException;
  /**
   * 
   * @param userId
   * @return
   * @throws BusinessException
   */
  Optional<User> findOne(String userId) throws BusinessException;
  
  
  
  Optional<User> findByEmailAddress(String emailAddress);
  
  /**
   * 
   * @param contactId
   * @return
   * @throws BusinessException
   */
  Optional<Contact> findContact(String contactId) throws BusinessException;
  /**
   * 
   * @param userId
   * @return
   * @throws BusinessException
   */
  List<Contact> findUserContacts(String userId) throws BusinessException;
  /**
   * 
   * @param invitationCode
   * @param newUser
   * @return
   * @throws BusinessException
   */
  User createUser(Long invitationCode, User newUser) throws BusinessException;
  /**
   * 
   * @param profile
   * @return
   * @throws BusinessException
   */
  User updateUserProfile(UserProfile profile)throws BusinessException;
  /**
   * 
   * @param userId
   * @param newPassword
   * @return
   * @throws BusinessException
   */
  User updateUserPassword(String userId, String newPassword) throws BusinessException;
  /**
   * 
   * @param contact
   * @return
   * @throws BusinessException
   */
  Contact updateContact(Contact contact) throws BusinessException;
  /**
   * 
   * @param contact
   * @return
   * @throws BusinessException
   */
  UserInviteCode createInviteCode(Contact contact)throws BusinessException;
}
