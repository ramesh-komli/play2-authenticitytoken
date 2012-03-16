package model;

import authtoken.validator.AuthenticityToken;

public class FormData {
	
	@AuthenticityToken
	public String authtoken;
	
	public String name;
	
}
