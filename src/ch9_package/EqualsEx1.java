package ch9_package;

public class EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) // 주소값을 비교하기에 false
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");

		v2 = v1;

		if (v1.equals(v2)) // v2에 v1 주소값이 저장되었으므로 true
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
}
