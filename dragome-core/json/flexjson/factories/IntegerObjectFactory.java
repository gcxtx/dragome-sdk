package flexjson.factories;

import java.lang.reflect.Type;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

public class IntegerObjectFactory implements ObjectFactory
{
	public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass)
	{
		if (value instanceof Number)
		{
			return ((Number) value).intValue();
		}
		else
		{
			try
			{
				return Integer.parseInt(value.toString());
			}
			catch (Exception e)
			{
				throw context.cannotConvertValueToTargetType(value, Integer.class);
			}
		}
	}
}
