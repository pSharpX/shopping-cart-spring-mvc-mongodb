package pe.optical.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import pe.optical.domain.SNE_APLICACION;
import pe.optical.repository.AplicacionRepository;

@Repository
@Qualifier("defaultRepository")
public class AplicacionDefaultRepositoryImpl implements AplicacionRepository {
	
	@Autowired
	private MongoDatabase mongoDatabase;
	
	@Override
	public SNE_APLICACION buscar(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SNE_APLICACION> obtenerTodos() {
		// TODO Auto-generated method stub
		List<SNE_APLICACION> lista = new ArrayList<SNE_APLICACION>();		
		try {
			MongoCollection<Document> dbCollection = mongoDatabase.getCollection(SNE_APLICACION.COLLECTION_NAME);
			FindIterable<Document> list = dbCollection.find();
			if (list != null) {
				for (Document document : list) {
					SNE_APLICACION obj = new SNE_APLICACION();
					obj.setId(document.getObjectId("_id"));
					obj.setSNEV_NOMBRE_APLICACION(document.getString(SNE_APLICACION.NOMBRE_APLICACION_FIELD));					
					obj.setSNEV_DESCRIPCION_ERROR(document.getString(SNE_APLICACION.DESCRIPCION_ERROR_FIELD));					
					obj.setSNEN_ESTADO(document.getInteger(SNE_APLICACION.ESTADO_FIELD));
					obj.setSNED_FECHA_REGISTRO(document.getDate(SNE_APLICACION.FECHA_REGISTRO_FIELD));
					lista.add(obj);
				}
			}
		} catch (Exception ex) {
			lista = null;
			//log.error(ex);
		}
		return lista;
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
