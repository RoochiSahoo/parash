package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ruchita
 * @version 2.0
 * @creation_date 21st Sept 2019 5.23PM
 * @modification_date 27st Sept 2019 5.23PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description Java Bean class used to represent database entity. 
 * 				It is also used as value object. 
 *				It is used in all layers of application.
 */
@Entity
@Table(name="user_login")
public class User {
				@Id
			private String username;
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

			@Override
			public String toString() {
				return "User [username=" + username + ", password=" + password + "]";
			}
			
			
			
	

}
