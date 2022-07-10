package com.ajdev.ind.states.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "state_districts")
public class State_Districts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="state_dist_id")
	private Long stateDistrictId;
	
	@Column(name="state_dist_name",
			nullable=false)
	private String stateDistrictName;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="state_id")
	private Indian_States states;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="state_div_id")
	private State_Divisions divisions;
	
	//Mappings for this class to other classes
	
	@OneToMany(mappedBy="districts",
			cascade={CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	private List<State_Talukas_SubDivisions> state_talukas3;
	
	@OneToMany(mappedBy="districts",
			cascade={CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	private List<State_Talukas_Urban_Status> state_urban_status3;
	
	@OneToMany(mappedBy="districts",
			cascade={CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	private List<State_Villages> state_villages3;

}
