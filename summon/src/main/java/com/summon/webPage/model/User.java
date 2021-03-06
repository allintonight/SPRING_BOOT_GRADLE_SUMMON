package com.summon.webPage.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 100)
	private String email;
	
	@Column(nullable = false, length = 100)
	private String password;
	
	@Column(length = 500)
	private String profile_image;
	
	@Column(nullable = false)
	private int adult_confirm;
	
	@Enumerated(EnumType.STRING)
	private RoleType roleType;
	
	@CreationTimestamp
	private Timestamp create_time;
	
	private enum RoleType{
		USER, ADMIN, WRITER
	}

}
