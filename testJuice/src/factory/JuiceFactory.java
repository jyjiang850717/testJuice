package factory;

import constant.JuiceSweetEnum;
import constant.JuiceTypeEnum;
import juiceUtils.Juice;

public interface JuiceFactory{	

	public abstract Juice getJuice(JuiceTypeEnum type, JuiceSweetEnum sweet) throws Exception;
}
