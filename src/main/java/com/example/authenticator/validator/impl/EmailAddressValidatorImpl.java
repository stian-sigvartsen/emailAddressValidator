package com.example.authenticator.validator.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.example.authenticator.validator.EmailAddressValidator;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
	},
	service = EmailAddressValidator.class
)
public class EmailAddressValidatorImpl implements EmailAddressValidator {

	@Override
	public boolean isValidEmailAddress(String emailAddress) {
		
		if (_validEmailDomains.contains(
			emailAddress.substring(emailAddress.indexOf('@')))) {
		
			return true;
		}
		return false;
	}

	private Set<String> _validEmailDomains = 
		new HashSet<String>(Arrays.asList(new String[] {"@liferay.com", "@example.com"}));
}