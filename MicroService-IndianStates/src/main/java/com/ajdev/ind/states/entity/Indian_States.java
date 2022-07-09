package com.ajdev.ind.states.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Indian_States {
	private Long stateId;
	private String stateName;
	private String stateVehicleCode;
}
