package ch7_object2;

class InterfaceTest3 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();
	}
}

class A3 {
	public void methodA() {
		I2 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

interface I2 {
	public abstract void methodB();
}

class B3 implements I2 {
	public void methodB() {
		System.out.println("methodB in B class");
	}
	public String toString() { return "class B"; }
}

class InstanceManager {
    public static I2 getInstance() { //반환타입이 인스턴스
        return new B3(); // 다른 인스턴스로 바꾸려면 여기만 바꾸면 됨
    }
}
