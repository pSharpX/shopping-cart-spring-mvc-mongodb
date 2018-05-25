package pe.optical.converter.base;

import java.util.List;
import java.util.stream.Collectors;

import pe.optical.domain.base.EntityBase;
import pe.optical.dto.base.DtoBase;

public interface ConverterBase<X extends EntityBase, Y extends DtoBase> {
	X map(Y object);
	Y map(X object);

	default List<Y> mapToListOf(List<X> collection) {
		return collection.stream().map(this::map).collect(Collectors.toList());
	}
}
