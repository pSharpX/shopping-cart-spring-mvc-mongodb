package pe.optical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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

import pe.optical.dto.MailDto;
import pe.optical.service.MailService;

@Controller
@RequestMapping("/mails")
public class MailController {
	
	@Autowired
	private MailService mailService;

	@GetMapping(
		value = "/",
		produces = {"text/html"}
	)
	public String index(Model model) {
		//Model model, Principal principal
		model.addAttribute("message", "You are in");
		model.addAttribute("mails", mailService.obtenerTodos());
		return "index";
	}
	
	@GetMapping(
		value = "/",
		produces = {"application/json"}
	)
	@ResponseBody
    public List<MailDto> getMails() {        
        return mailService.obtenerTodos();
    }
	
	@GetMapping("/{id}")
    public MailDto getMail(@PathVariable String id) {
        MailDto mailDto = mailService.buscar(id);
        return mailDto;
    }
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public MailDto createMail(@RequestBody MailDto mailDto) {        
        mailService.crear(mailDto);
        return mailDto;
    }
		
	@PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateMail(@RequestBody MailDto mailDto) {        
		mailService.actualizar(mailDto);
    }

}
