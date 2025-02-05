package com.javi.taskManager.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.javi.taskManager.dto.TareaDto;

@Service
public interface TareaService {

	List<TareaDto> obtenerTodas();
	
}
