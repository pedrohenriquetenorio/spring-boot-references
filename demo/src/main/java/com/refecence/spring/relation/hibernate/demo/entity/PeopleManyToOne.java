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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "people_many_to_one")
public class PeopleManyToOne implements Serializable {
private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private UUID id;
	@Column(name="name", length = 50)
	private String name;
	@Column(name="enabled")
	private boolean enabled;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "fk_action_mto_id")
    private ActionMto actionMto;
	
}
