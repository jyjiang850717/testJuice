package test;

import constant.JuiceSweetEnum;
import constant.JuiceTypeEnum;
import factory.JuiceShop;
import juiceUtils.Juice;

class Test {
	public static void main(String[] args) {
		JuiceShop juiceShop = new JuiceShop();
		try{
			Juice appleJuice = juiceShop.getJuice(JuiceTypeEnum.APPLE);
			appleJuice.getInfo();
			Juice orangeJuice = juiceShop.getJuice(JuiceTypeEnum.ORANGE,JuiceSweetEnum.FULL);
			orangeJuice.getInfo();
			Juice BananaJuice = juiceShop.getJuice(JuiceTypeEnum.BANANA,JuiceSweetEnum.FULL);
			BananaJuice.getInfo();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Juice juice = juiceShop.getJuice();
		juice.getInfo();
	}
}