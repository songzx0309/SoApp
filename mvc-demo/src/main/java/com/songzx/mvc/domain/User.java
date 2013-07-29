package com.songzx.mvc.domain;

import java.io.Serializable;

/**
 * @author songzhaoxu
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = -7698255575737369076L;
	
	private String id;
	private String name;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password="
				+ password + "]";
	}

}
