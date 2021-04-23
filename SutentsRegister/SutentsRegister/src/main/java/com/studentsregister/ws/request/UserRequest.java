package com.studentsregister.ws.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequest {

	@NotNull(message = "{message.error.user.null.firstName}")
	private String firstName;

	@NotNull(message = "{message.error.user.null.lastName}")
	private String lastName;

	@NotNull(message = "{message.error.user.null.email}")
	private String email;

	@NotNull(message = "{message.error.user.null.cpf}")
	private String cpf;

	@NotNull(message = "{message.error.user.null.password}")
	@Size(min = 8, max = 16, message = "{message.error.user.invalidSize.password}")
	private String password;

	private String gender;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
