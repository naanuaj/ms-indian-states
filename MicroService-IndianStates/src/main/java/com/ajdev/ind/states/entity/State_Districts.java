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
public class State_Districts {
	private Long stateDistrictId;
	private String stateDistrictName;

}
