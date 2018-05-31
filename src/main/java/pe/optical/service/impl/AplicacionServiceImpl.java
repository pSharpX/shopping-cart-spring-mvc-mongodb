package pe.optical.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pe.optical.application.CustomAuditable;
import pe.optical.converter.AplicacionConverter;
import pe.optical.dto.AplicacionDto;
import pe.optical.repository.AplicacionRepository;
//import pe.optical.repository.spring.AplicacionSpringRepository;
import pe.optical.service.AplicacionService;

@Service
public class AplicacionServiceImpl implements AplicacionService, CustomAuditable {

	@Autowired
	@Qualifier("springDataRepository")
	// @Qualifier("defaultRepository")
	private AplicacionRepository aplicacionRepository;
	
	@Autowired
	private AplicacionConverter aplicacionConverter;
	
	@Override
	public AplicacionDto buscar(String id) {
		// TODO Auto-generated method stub
		return aplicacionConverter.map(aplicacionRepository.buscar(aplicacionConverter.convertIdFrom(id)));
	}

	@Override
	public List<AplicacionDto> obtenerTodos() {
		// TODO Auto-generated method stub
		return aplicacionConverter.mapToListOf(aplicacionRepository.obtenerTodos());
	}

	@Override
	public void crear(AplicacionDto object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(AplicacionDto object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(AplicacionDto object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Logger getLogger() {
		// TODO Auto-generated method stub
		return LogManager.getLogger(getClass());
	}
}
