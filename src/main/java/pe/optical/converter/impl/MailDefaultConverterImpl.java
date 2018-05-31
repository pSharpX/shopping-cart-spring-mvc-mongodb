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
		SNE_MAIL mail = new SNE_MAIL();
		mail.setId(convertIdFrom(object.getId()));
		// mail.setSNEI_CODIGO_APLICACION(object.getCodigoAplicacion());
		mail.setSNEV_MAIL_ORIGEN_MASCARA(object.getOrigenMascara());
		mail.setSNEV_ASUNTO(object.getAsunto());
		mail.setSNEV_MENSAJE(object.getMensaje());
		mail.setSNEV_ADJUNTO(object.getAdjunto());
		mail.setSNEV_DESCRIPCION(object.getDescripcion());
		mail.setSNEN_ESTADO(object.getEstado());
		// mail.setSNED_FECHA_REGISTRO(object.getf);
		return mail;
	}

	@Override
	public MailDto map(SNE_MAIL object) {
		// TODO Auto-generated method stub
		MailDto mailDto = new MailDto();
		mailDto.setId(convertIdFrom(object.getId()));
		// mailDto.setCodigoAplicacion(object.getSNEI_CODIGO_APLICACION());
		mailDto.setOrigenMascara(object.getSNEV_MAIL_ORIGEN_MASCARA());
		mailDto.setAsunto(object.getSNEV_ASUNTO());
		mailDto.setMensaje(object.getSNEV_ASUNTO());
		mailDto.setAdjunto(object.getSNEV_ADJUNTO());
		mailDto.setDescripcion(object.getSNEV_DESCRIPCION());
		mailDto.setEstado(object.getSNEN_ESTADO());		
		return mailDto;
	}

}
