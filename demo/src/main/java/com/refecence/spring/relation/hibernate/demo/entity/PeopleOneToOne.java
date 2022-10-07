package com.refecence.spring.relation.hibernate.demo.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "people_one_to_one")
public class PeopleOneToOne implements Serializable{
private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private UUID id;
	@Column(name="name", length = 50)
	private String name;
	@Column(name="enabled")
	private boolean enabled;
	
	@OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "fk_action_oto_id")
    private ActionOto actionOto;
	
}
