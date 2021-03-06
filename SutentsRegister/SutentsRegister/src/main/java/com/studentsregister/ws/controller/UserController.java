package com.studentsregister.ws.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentsregister.ws.dto.UserRequest;
import com.studentsregister.ws.response.UserResponse;

@RestController
@RequestMapping("users")
public class UserController {

	/**
	 * Método para obter usuários.
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping()
	public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit") int limit) {
		return "Get users was called. Page: " + page + " Limit: " + limit;
	}

	/**
	 * Método para obter usuário.
	 * 
	 * @param idUser
	 * @return
	 */
	@GetMapping(path = "/{idUser}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_ATOM_XML_VALUE })
	public ResponseEntity<UserResponse> getUser(@PathVariable String idUser) {

		UserResponse usuario = new UserResponse();
		usuario.setFirstName("Teste");
		usuario.setId("123213ADV");
		usuario.setLastName("Teste2");

		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}

	/**
	 * Método para criar usuário.
	 * 
	 * @return
	 */
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public String createUser(@Valid @RequestBody UserRequest userToInsert) {

		int gender = userToInsert.getGender().length();

		// return new ResponseEntity<>(userToInsert, HttpStatus.OK);

		return "teste";
	}

	/**
	 * Método para atualizar usuário.
	 * 
	 * @return
	 */
	@PutMapping
	public String updatedUser() {
		return "Update user";
	}

	/**
	 * Método para deletar usuário
	 * 
	 * @return
	 */
	@DeleteMapping
	public String deleteUser() {
		return "Delete Uuser";
	}
}
