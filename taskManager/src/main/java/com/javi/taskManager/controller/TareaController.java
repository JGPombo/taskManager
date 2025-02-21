package com.javi.taskManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.javi.taskManager.service.TareaServiceImpl;

@Controller
public class TareaController {
	
	@Autowired
	public TareaServiceImpl tareaServiceImpl; 
	
	@GetMapping("/")
	public String inicio() {
		return "inicio"; 
	}
	
//	@GetMapping("/listarTareas")
//	public String obtenerTodasTareas(Model model) {
//		model.addAttribute("tareas", tareaServiceImpl.obtenerTodas()); 
//		return "tareas"; 
//	}
//	
//	@GetMapping("/completadas")
//	public String obtenerTareasCompletadas() {
//
//		return "completadas"; 
//	}
//	
   
    @GetMapping("/tareas")
    public String mostrarTareas(Model model) {
        model.addAttribute("tareas", tareaServiceImpl.obtenerTodas());
        return "tareas"; // Carga tareas.html desde templates/
    }
    @GetMapping("/completadas")
    public String mostrarCompletadas(Model model) {
//        model.addAttribute("tareas", tareaServiceImpl.obtenerTodas());
        return "completadas"; // Carga tareas.html desde templates/
    }
    @GetMapping("/miDia")
    public String mostrarMiDia(Model model) {
//        model.addAttribute("tareas", tareaServiceImpl.obtenerTodas());
        return "miDia"; // Carga tareas.html desde templates/
    }
    
}
