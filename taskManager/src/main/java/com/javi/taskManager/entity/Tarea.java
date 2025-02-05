package com.javi.taskManager.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarea {

	@Id
	@GeneratedValue
	private Long id; 
	private String nombre; 
	private String descripcion; 
	private String estado; 
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion; 

}
