package com.restapi.mainfolder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="details")
public class Details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="language")
	private String language;
	
	@Column(name="link")
	private String link;
	
	@Column(name="level")
	private String level;
	
	@Column(name="password")
	private String password;
	
	@Column(name="dateandtime")
	private String dateandtime;
	
	
	
	
	
	public Details()
	{
		
	}

	public Details(String name, String language, String link, String level, String password, String dateandtime) {
		super();
		this.name = name;
		this.language = language;
		this.link = link;
		this.level = level;
		this.password = password;
		this.dateandtime = dateandtime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(String dateandtime) {
		this.dateandtime = dateandtime;
	}
	
	
	
	
	
}
