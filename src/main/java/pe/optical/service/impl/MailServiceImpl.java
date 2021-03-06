package pe.optical.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	@Qualifier("springDataRepository")
	// @Qualifier("defaultRepository")
	private MailRepository mailRepository;

	@Autowired
	private MailConverter mailConverter;

	@Override
	public MailDto buscar(String id) {
		return mailConverter.map(mailRepository.buscar(mailConverter.convertIdFrom(id)));
	}

	@Override
	public List<MailDto> obtenerTodos() {
		return mailConverter.mapToListOf(mailRepository.obtenerTodos());
	}

	@Override
	public void crear(MailDto object) {
		mailRepository.crear(mailConverter.map(object));
	}

	@Override
	public void actualizar(MailDto object) {
		mailRepository.actualizar(mailConverter.map(object));
	}

	@Override
	public void eliminar(MailDto object) {
		mailRepository.eliminar(mailConverter.map(object));
	}

	@Override
	public Logger getLogger() {
		return LogManager.getLogger(getClass());
	}

}
