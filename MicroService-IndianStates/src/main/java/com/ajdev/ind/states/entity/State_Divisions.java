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
public class State_Divisions {
	private Long stateDivisionId;
	private String stateDivisionName;

}
