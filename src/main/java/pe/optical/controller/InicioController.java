package pe.optical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

	@GetMapping("/")
	public String index(Model model) {
		// Model model, Principal principal
		model.addAttribute("message", "You are in");
		// model.addAttribute("aplicaciones", aplicacionService.obtenerTodos());
		return "index";
	}

}
