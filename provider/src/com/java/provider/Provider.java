package com.java.provider;

public abstract class Provider {

	public String name;
	public String CEO;

	public Provider(String name, String CEO) {
		super();
		this.name = name;
		this.CEO = CEO;
	}
	
	
@Override
public String toString() {
	return "Provider [name=" + name + ", CEO=" + CEO + "]";
		
}

@Override
public boolean equals(Object obj) {
	System.out.println("Running equals in Provider");

	if (obj != null) {

		if (obj instanceof Provider) {
			Provider pro = (Provider) obj;
			if (this.name.equals(pro.name) && this.CEO.equals(pro.CEO)) {
				System.out.println("Both are Equal");
				return true;
			}
		} else {
			System.out.println("Obj is a Provider");
		}

	} else {
		System.out.println("Obj is Null");
	}
	return super.equals(obj);
}

public abstract void service();

}


