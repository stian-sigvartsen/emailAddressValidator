package com.example.authenticator.validator.impl;

import com.example.authenticator.validator.EmailAddressValidator;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
	},
	service = EmailAddressValidator.class
)
public class EmailAddressValidatorImpl implements EmailAddressValidator {
}