package com.map.collect.intenate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {

	public static void main(String[] args) {

		List<User> list = new ArrayList<User>();
		list.add(new User(1, "Ramesh", "secrate", "ramesh@gmail.com"));
		list.add(new User(1, "Tony", "secrate", "tony@gmail.com"));
		list.add(new User(1, "Tom", "secrate", "tom@gmail.com"));
		list.add(new User(1, "Pandit", "secrate", "pandit@gmail.com"));
		list.add(new User(1, "Laxman", "secrate", "laxman@gmail.com"));

		List<UserDTO> userDTO = new ArrayList<UserDTO>();
		for (User users : list) {
			userDTO.add(new UserDTO(users.getId(), users.getUserName(), users.getEmail()));
		}

		for (UserDTO dto : userDTO) {
			System.out.println(dto);
		}
     
		//List<UserDTO> userDTOS= list.stream()
    	//	  .map((User,user) -> new UserDTO(user.getId(),user.getName(),user.getEmail()))
    	//	  .collection(Collectors.toList());
     // userDTOS.forEach(System.out::println);
	
	}
}

class UserDTO {

	private int id;
	private String userName;
	private String password;
	private String email;

	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UseDTO [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}

}

class User {
	private int id;
	private String userName;
	private String password;
	private String email;

	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}

}
