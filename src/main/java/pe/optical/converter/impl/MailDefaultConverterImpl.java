package pe.optical.converter.impl;

import org.springframework.stereotype.Component;

import pe.optical.converter.MailConverter;
import pe.optical.domain.SNE_MAIL;
import pe.optical.dto.MailDto;

@Component
public class MailDefaultConverterImpl implements MailConverter {

	@Override
	public SNE_MAIL map(MailDto object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MailDto map(SNE_MAIL object) {
		// TODO Auto-generated method stub
		return null;
	}

}
