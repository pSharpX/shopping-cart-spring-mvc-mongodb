package pe.optical.repository.spring;

import org.bson.types.ObjectId;

import pe.optical.domain.SNE_APLICACION;
import pe.optical.repository.AplicacionRepository;

public interface AplicacionSpringRepository 
	extends AplicacionRepository, SpringRepositoryBase<SNE_APLICACION, ObjectId> {

}
