package dev.samuelaberra.rest_service.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserResource {
	private UserDaoService service;
	public UserResource(UserDaoService service) {
		this.service=service;
	}
	
	//GET /users
	@GetMapping("/users")
	public List <User> retrieveUsers(){
		return service.findAll();
	}
	
	//GET /users/id
	@GetMapping("/users/{userId}")
	public User retrieveSingleUser(@PathVariable int userId){
		User singleUser= service.findOne(userId);
		if(singleUser==null) {
			throw new UserNotFoundException("userId: "+userId);
		}
		return singleUser;
	}

	//DELETE /users/id
	@DeleteMapping("/users/{userId}")
	public void deleteSingleUser(@PathVariable int userId){
		 service.deleteById(userId);
	}
	//POST /users
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user){
		User created = service.save(user);
		// /users/5 => users/{id}, user.getID
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
						.path("/{id}")
						.buildAndExpand(created.getId())
						.toUri();
		return ResponseEntity.created(location).build();
	}

}
