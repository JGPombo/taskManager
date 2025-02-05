package com.javi.taskManager.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javi.taskManager.dto.TareaDto;
import com.javi.taskManager.entity.Tarea;
import com.javi.taskManager.repository.TareaRepository;

@Service
public class TareaServiceImpl implements TareaService {

	@Autowired
	private TareaRepository tareaRepository;

	@Override
	public List<TareaDto> obtenerTodas() {
		List<Tarea> tareas = tareaRepository.findAll();
		return tareas.stream()
				.map(tarea -> new TareaDto(tarea.getNombre(), tarea.getDescripcion()))
				.collect(Collectors.toList());
	} 
}
