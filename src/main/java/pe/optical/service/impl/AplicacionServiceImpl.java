package pe.optical.service.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.optical.converter.AplicacionConverter;
import pe.optical.dto.AplicacionDto;
import pe.optical.repository.AplicacionRepository;
import pe.optical.service.AplicacionService;

@Service
public class AplicacionServiceImpl implements AplicacionService {

	@Autowired
	private AplicacionRepository aplicacionRepository;
	@Autowired
	private AplicacionConverter aplicacionConverter;
	
	@Override
	public AplicacionDto buscar(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AplicacionDto> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
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
}
