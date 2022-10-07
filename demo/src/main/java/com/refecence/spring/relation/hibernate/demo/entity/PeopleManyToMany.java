package com.refecence.spring.relation.hibernate.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "people_many_to_many")
public class PeopleManyToMany implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private UUID id;
	@Column(name="name", length = 50)
	private String name;
	@Column(name="enabled")
	private boolean enabled;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="people_action",
				joinColumns = @JoinColumn(name = "people_id"),
			 	inverseJoinColumns = @JoinColumn(name="action_id"))
	private List<ActionMtm>actionsMtm = new ArrayList<>();
	
}
