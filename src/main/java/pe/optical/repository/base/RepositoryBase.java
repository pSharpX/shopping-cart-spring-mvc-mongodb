package pe.optical.repository.base;

import java.util.List;

import org.bson.types.ObjectId;

import pe.optical.domain.base.EntityBase;

public interface RepositoryBase<T extends EntityBase> {
	T buscar(ObjectId id);
	List<T> obtenerTodos();
	void crear(T object);
	void actualizar(T object);
	void eliminar(T object);
	default void eliminar(ObjectId id) {
		eliminar(buscar(id));
	}	
}
