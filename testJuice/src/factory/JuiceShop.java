package factory;

import constant.JuiceSweetEnum;
import constant.JuiceTypeEnum;
import juiceUtils.AppleJuice;
import juiceUtils.Juice;
import juiceUtils.OrangeJuice;

public class JuiceShop implements JuiceFactory {
	public Juice getJuice() {
		return new Juice();
	}

	public Juice getJuice(JuiceTypeEnum type) throws Exception {
		Juice juice;
		if (JuiceTypeEnum.APPLE.equals(type)) {
			juice = new AppleJuice();
		} else if (JuiceTypeEnum.ORANGE.equals(type)) {
			juice = new OrangeJuice();
		} else {
			throw new Exception("No Type");
		}
		return juice;
	}

	public Juice getJuice(JuiceTypeEnum type, JuiceSweetEnum sweet) throws Exception {
		Juice juice;
		juice = getJuice(type);
		juice.setSweet(sweet);
		return juice;
	}

}