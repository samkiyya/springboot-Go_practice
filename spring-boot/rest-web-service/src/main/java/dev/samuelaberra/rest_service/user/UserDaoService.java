package dev.samuelaberra.rest_service.user;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

//	JPA/Hibernate > Database
// UserDaoService > Static List
	private static List <User> users = new ArrayList<>();
	private static int usersCount=0;
	static {
		users.add(new User(++usersCount,"Samuel",LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount,"Abrham",LocalDate.now().minusYears(50)));
		users.add(new User(++usersCount,"Emanuel",LocalDate.now().minusYears(27)));
		users.add(new User(++usersCount,"Daniel",LocalDate.now().minusYears(39)));
	}
	public List<User> findAll(){
		return users;
	}

 public User findOne(int id){
	 
	 Predicate<? super User> predicate = user->user.getId().equals(id);
	return users.stream().filter(predicate ).findFirst().orElse(null);
 }
 
 public void deleteById(int id){
	 Predicate<? super User> predicate = user->user.getId().equals(id);
	 users.removeIf(predicate);
 }
 
public User save(User user){
	user.setId(++usersCount);
		users.add(user);
		return user;
	
}

	
}
