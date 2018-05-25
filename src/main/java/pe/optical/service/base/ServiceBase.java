package pe.optical.service.base;

import java.util.List;

import org.bson.types.ObjectId;

import pe.optical.dto.base.DtoBase;

public interface ServiceBase<T extends DtoBase> {
	T buscar(ObjectId id);
	List<T> obtenerTodos();
	void crear(T object);
	void actualizar(T object);
	void eliminar(T object);
	default void eliminar(ObjectId id) {
		eliminar(buscar(id));
	}
}
