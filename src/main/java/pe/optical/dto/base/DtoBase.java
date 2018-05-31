package pe.optical.dto.base;

import java.io.Serializable;

public abstract class DtoBase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1647072142263251165L;
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
