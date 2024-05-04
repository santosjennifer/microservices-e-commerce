package com.github.ecommerce.controller.payload;

import jakarta.validation.constraints.NotBlank;

public class AuthRequest {

	@NotBlank(message = "O usuário deve ser informado.")
    private String username;
	
	@NotBlank(message = "A senha deve ser informada.")
    private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
