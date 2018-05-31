package pe.optical.converter.base;

import java.io.Serializable;

public interface ConverterIdBase<ID_ENTITY, ID_DTO extends Serializable>{
	ID_ENTITY convertIdFrom(ID_DTO source);
	ID_DTO convertIdFrom(ID_ENTITY target);
}
