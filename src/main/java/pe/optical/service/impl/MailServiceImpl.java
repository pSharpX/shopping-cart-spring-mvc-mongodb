package pe.optical.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pe.optical.application.CustomAuditable;
import pe.optical.converter.MailConverter;
import pe.optical.dto.MailDto;
import pe.optical.repository.MailRepository;
import pe.optical.service.MailService;

@Service
public class MailServiceImpl implements MailService, CustomAuditable {

	@Autowired
//	@Qualifier("springDataRepository")
	@Qualifier("defaultRepository")
	private MailRepository mailRepository;
	
	@Autowired
	private MailConverter mailConverter;
	
	@Override
	public MailDto buscar(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MailDto> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crear(MailDto object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(MailDto object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(MailDto object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Logger getLogger() {
		// TODO Auto-generated method stub
		return LogManager.getLogger(getClass());
	}

}
