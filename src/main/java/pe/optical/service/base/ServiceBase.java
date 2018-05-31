package pe.optical.service.base;

import java.io.Serializable;
import java.util.List;

import pe.optical.dto.base.DtoBase;

public interface ServiceBase<T extends DtoBase, ID extends Serializable> {
	T buscar(ID id);
	List<T> obtenerTodos();
	void crear(T object);
	void actualizar(T object);
	void eliminar(T object);
	default void eliminar(ID id) {
		eliminar(buscar(id));
	}
}
