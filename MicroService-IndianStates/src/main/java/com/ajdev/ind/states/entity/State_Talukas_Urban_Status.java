package com.ajdev.ind.states.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="state_talukas_urban_status")
public class State_Talukas_Urban_Status {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="state_urb_id")
	private Long stateTalukaUrbanStatusId;
	
	@Column(name="state_urb_name",
			nullable=false)
	private String stateTalukaName;
	
	@Column(name="state_urb_code")
	private String urbanStatusCode;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="state_id")
	private Indian_States states;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="state_div_id")
	private State_Divisions divisions;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="state_dist_id")
	private State_Districts districts;
	
	@OneToOne(mappedBy="urban_status")
	private State_Talukas_SubDivisions talukas;
	
	@OneToOne(mappedBy="urban_status1")
	private State_Villages villages;
}
