package pe.optical.repository.spring.impl;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;
import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import pe.optical.domain.SNE_MAIL;
import pe.optical.repository.spring.MailSpringRepository;

@Repository("springDataRepository")
public class MailSpringRepositoryImpl implements MailSpringRepository {

	@Autowired
	private MongoTemplate mongoOps;

	@Override
	public SNE_MAIL buscar(ObjectId id) {
		// TODO Auto-generated method stub
		SNE_MAIL mail = mongoOps.findById(id, SNE_MAIL.class);
		return mail;
	}

	@Override
	public List<SNE_MAIL> obtenerTodos() {
		// TODO Auto-generated method stub
		List<SNE_MAIL> collection =  mongoOps.findAll(SNE_MAIL.class);
		return collection;
	}

	@Override
	public void crear(SNE_MAIL object) {
		// TODO Auto-generated method stub
		mongoOps.insert(object);
	}

	@Override
	public void actualizar(SNE_MAIL object) {
		// TODO Auto-generated method stub
		Query query = new Query(where("id").is(object.getId()));
		//Update update = new Update().set(key, value);
		//mongoOps.update(query, update, SNE_APLICACION.class);
		SNE_MAIL mail = mongoOps.findOne(query, SNE_MAIL.class);
		if(Objects.nonNull(mail)) {
			mail.setSNEI_CODIGO_APLICACION(object.getSNEI_CODIGO_APLICACION());
			mail.setSNEV_MAIL_ORIGEN_MASCARA(object.getSNEV_MAIL_ORIGEN_MASCARA());
			mail.setSNEV_ASUNTO(object.getSNEV_ASUNTO());
			mail.setSNEV_MENSAJE(object.getSNEV_MENSAJE());
			mail.setSNEV_ADJUNTO(object.getSNEV_ADJUNTO());
			mail.setSNEV_DESCRIPCION(object.getSNEV_DESCRIPCION());
			mail.setSNEN_ESTADO(object.getSNEN_ESTADO());
			mail.setSNED_FECHA_REGISTRO(object.getSNED_FECHA_REGISTRO());		
			mongoOps.save(mail);
		}
	}

	@Override
	public void eliminar(SNE_MAIL object) {
		// TODO Auto-generated method stub
		mongoOps.remove(object);
	}
	
	

}
