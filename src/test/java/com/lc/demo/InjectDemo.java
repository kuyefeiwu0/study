package com.lc.demo;

public class InjectDemo {
	public static void main(String[] args) throws Exception {

	}
}

class LcDemo {
	private LcDemo1 demo1;

	public LcDemo1 getDemo() {
		return demo1;
	}

	public LcDemo() {
		LcDemo1 lc = new LcDemo1();
		lc.setId("id");
		lc.setName("name");
		this.demo1=lc;
	}

}

class LcDemo1 {
	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}