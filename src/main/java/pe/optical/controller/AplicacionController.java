package pe.optical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import pe.optical.dto.AplicacionDto;
import pe.optical.service.AplicacionService;

@Controller
@RequestMapping("/aplicaciones")
public class AplicacionController {
	
	@Autowired
	private AplicacionService aplicacionService;

	@GetMapping("/")
	public String index(Model model) {
		//Model model, Principal principal
		model.addAttribute("message", "You are in");
		model.addAttribute("aplicaciones", aplicacionService.obtenerTodos());
		return "index";
	}
	
	@GetMapping("/{id}")
    public AplicacionDto getAplicacion(@PathVariable String id) {
        AplicacionDto aplicacionDto = aplicacionService.buscar(id);
        return aplicacionDto;
    }
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public AplicacionDto createMail(@RequestBody AplicacionDto aplicacionDto) {        
		aplicacionService.crear(aplicacionDto);
        return aplicacionDto;
    }
		
	@PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateMail(@RequestBody AplicacionDto aplicacionDto) {        
		aplicacionService.actualizar(aplicacionDto);
    }


}
