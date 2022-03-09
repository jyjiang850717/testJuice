package juiceUtils;

import constant.JuiceSweetEnum;

public class Juice {
	String name;
	JuiceSweetEnum sweet;

	public Juice() {
		this.name = "Juice";
		this.sweet = JuiceSweetEnum.HALF;
	}

	public void getInfo() {
		System.out.println("Juice name:" + this.name+","+"Sweet:"+sweet);
	}

	public void setSweet(JuiceSweetEnum sweet) {
		this.sweet = sweet;
	}
}
