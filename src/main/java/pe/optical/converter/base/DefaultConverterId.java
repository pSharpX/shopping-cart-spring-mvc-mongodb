package pe.optical.converter.base;

import org.bson.types.ObjectId;

public interface DefaultConverterId  extends ConverterIdBase<ObjectId, String>{
	@Override
	default String convertIdFrom(ObjectId target) {
		// TODO Auto-generated method stub
		return target.toString();
	}
	
	@Override
	default ObjectId convertIdFrom(String source) {
		// TODO Auto-generated method stub
		return new ObjectId(source);
	}
}
