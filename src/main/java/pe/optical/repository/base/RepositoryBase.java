package pe.optical.repository.base;

import java.io.Serializable;
import java.util.List;
import pe.optical.domain.base.EntityBase;

public interface RepositoryBase<T extends EntityBase, ID extends Serializable> {
	T buscar(ID id);
	List<T> obtenerTodos();
	void crear(T object);
	void actualizar(T object);
	void eliminar(T object);
	default void eliminar(ID id) {
		eliminar(buscar(id));
	}	
}
