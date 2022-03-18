package com.futurespace.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.futurespace.dto.LocalUser;
import com.futurespace.dto.SignUpRequest;
import com.futurespace.exception.UserAlreadyExistAuthenticationException;
import com.futurespace.model.User;

/**
 * @author Futurespace
 * @Since 26/3/22
 */
public interface UserService {

	public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;

	User findUserByEmail(String email);

	Optional<User> findUserById(Long id);

	LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
