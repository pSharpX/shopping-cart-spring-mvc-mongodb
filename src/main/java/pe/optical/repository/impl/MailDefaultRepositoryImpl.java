package pe.optical.repository.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.mongodb.client.MongoDatabase;

import pe.optical.domain.SNE_MAIL;
import pe.optical.repository.MailRepository;

@Repository
@Qualifier("defaultRepository")
public class MailDefaultRepositoryImpl implements MailRepository{

//	@Autowired
//	private MongoDatabase mongoDatabase;
	
	@Override
	public SNE_MAIL buscar(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SNE_MAIL> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crear(SNE_MAIL object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(SNE_MAIL object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(SNE_MAIL object) {
		// TODO Auto-generated method stub
		
	}

}
