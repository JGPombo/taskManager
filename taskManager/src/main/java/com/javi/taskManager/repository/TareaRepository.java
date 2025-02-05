package com.javi.taskManager.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.javi.taskManager.entity.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long>{

}
