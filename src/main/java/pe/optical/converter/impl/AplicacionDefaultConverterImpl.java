package pe.optical.converter.impl;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import pe.optical.converter.AplicacionConverter;
import pe.optical.domain.SNE_APLICACION;
import pe.optical.dto.AplicacionDto;

@Component
public class AplicacionDefaultConverterImpl implements AplicacionConverter {

	@Override
	public SNE_APLICACION map(AplicacionDto object) {
		// TODO Auto-generated method stub
		SNE_APLICACION aplicacion = new SNE_APLICACION();
		aplicacion.setId(new ObjectId(object.getId()));
		aplicacion.setSNEV_NOMBRE_APLICACION(object.getNombreAplicacion());
		aplicacion.setSNEV_DESCRIPCION_ERROR(object.getDescripcionError());
		aplicacion.setSNEN_ESTADO(object.getEstado());
		aplicacion.setSNED_FECHA_REGISTRO(object.getFechaRegistro());
		return aplicacion;
	}

	@Override
	public AplicacionDto map(SNE_APLICACION object) {
		// TODO Auto-generated method stub
		AplicacionDto aplicacionDto = new AplicacionDto();
		aplicacionDto.setId(object.getId().toString());
		aplicacionDto.setNombreAplicacion(object.getSNEV_NOMBRE_APLICACION());
		aplicacionDto.setDescripcionError(object.getSNEV_DESCRIPCION_ERROR());
		aplicacionDto.setEstado(object.getSNEN_ESTADO());
		aplicacionDto.setFechaRegistro(object.getSNED_FECHA_REGISTRO());
		return aplicacionDto;
	}

}
