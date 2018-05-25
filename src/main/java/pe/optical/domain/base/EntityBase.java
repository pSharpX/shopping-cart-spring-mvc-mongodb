package pe.optical.domain.base;

import org.bson.types.ObjectId;

public abstract class EntityBase {
	
	protected ObjectId id;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

}
