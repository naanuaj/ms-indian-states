package com.ajdev.ind.states.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="indian_states")
public class Indian_States {
	
	//Main Attributes for this class and Entity starts here
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="state_id")
	private Long stateId;
	
	@Column(name="state_name",
			nullable=false)
	private String stateName;
	
	@Column(name="state_vehicle_code",
			nullable=false)
	private String stateVehicleCode;
	
	//Main Attributes for this class and Entity ends here
	
	
	
	@OneToMany(mappedBy="states",
			cascade={CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	private List<State_Districts> state_districts1;
	
	@OneToMany(mappedBy="states",
			cascade={CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	private List<State_Divisions> state_divisions1;
	
	@OneToMany(mappedBy="states",
			cascade={CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	private List<State_Talukas_SubDivisions> state_talukas1;
	
	@OneToMany(mappedBy="states",
			cascade={CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	private List<State_Talukas_Urban_Status> state_urban_status1;
	
	@OneToMany(mappedBy="states",
			cascade={CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	private List<State_Villages> state_villages1;
}
