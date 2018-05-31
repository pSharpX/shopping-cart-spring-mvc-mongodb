package pe.optical.repository.spring.impl;

import java.util.List;
import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.data.mongodb.core.query.Update;

import static org.springframework.data.mongodb.core.query.Criteria.where;
//import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.stereotype.Repository;

import pe.optical.domain.SNE_APLICACION;
import pe.optical.repository.spring.AplicacionSpringRepository;

@Repository
@Qualifier("springDataRepository")
public class AplicacionSpringRepositoryImpl implements AplicacionSpringRepository {
	
	@Autowired
	private MongoTemplate mongoOps;

	@Override
	public SNE_APLICACION buscar(ObjectId id) {
		//Query query = new Query(where("id").is(id));
		//SNE_APLICACION aplicacion = mongoOps.findOne(query, SNE_APLICACION.class);
		SNE_APLICACION aplicacion = mongoOps.findById(id, SNE_APLICACION.class);
		return aplicacion;
	}

	@Override
	public List<SNE_APLICACION> obtenerTodos() {
		List<SNE_APLICACION> collection =  mongoOps.findAll(SNE_APLICACION.class);
		return collection;
	}

	@Override
	public void crear(SNE_APLICACION object) {
		mongoOps.insert(object);
	}

	@Override
	public void actualizar(SNE_APLICACION object) {
		Query query = new Query(where("id").is(object.getId()));
		//Update update = new Update().set(key, value);
		//mongoOps.update(query, update, SNE_APLICACION.class);
		SNE_APLICACION aplicacion = mongoOps.findOne(query, SNE_APLICACION.class);
		if(Objects.nonNull(aplicacion)) {
			aplicacion.setSNEV_NOMBRE_APLICACION(object.getSNEV_NOMBRE_APLICACION());
			aplicacion.setSNEV_DESCRIPCION_ERROR(object.getSNEV_DESCRIPCION_ERROR());
			aplicacion.setSNEN_ESTADO(object.getSNEN_ESTADO());
			aplicacion.setSNED_FECHA_REGISTRO(object.getSNED_FECHA_REGISTRO());		
			mongoOps.save(aplicacion);
		}
	}

	@Override
	public void eliminar(SNE_APLICACION object) {
		mongoOps.remove(object);
	}

}
