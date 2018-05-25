package pe.optical.repository.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import pe.optical.domain.SNE_APLICACION;
import pe.optical.repository.AplicacionRepository;

@Repository
public class AplicacionDefaultRepositoryImpl implements AplicacionRepository {

	@Override
	public SNE_APLICACION buscar(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SNE_APLICACION> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crear(SNE_APLICACION object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(SNE_APLICACION object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(SNE_APLICACION object) {
		// TODO Auto-generated method stub
		
	}

}
