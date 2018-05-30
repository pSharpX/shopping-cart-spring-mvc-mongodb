package pe.optical.repository.spring;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import pe.optical.domain.base.EntityBase;


@NoRepositoryBean
public interface SpringRepositoryBase<T extends EntityBase, ID> extends Repository<T, ID>{

}
