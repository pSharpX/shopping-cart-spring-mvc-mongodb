package pe.optical.repository.spring;

import org.bson.types.ObjectId;

import pe.optical.domain.SNE_MAIL;
import pe.optical.repository.MailRepository;

public interface MailSpringRepository 
	extends MailRepository, SpringRepositoryBase<SNE_MAIL, ObjectId> {

}
