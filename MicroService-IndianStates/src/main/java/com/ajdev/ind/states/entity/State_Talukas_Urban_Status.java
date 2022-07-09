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
public class State_Talukas_Urban_Status {
	private Long stateTalukaUrbanStatusId;
	private String stateTalukaName;
	private String urbanStatusCode;
}
