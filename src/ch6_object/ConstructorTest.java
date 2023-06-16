package ch6_object;

class Dataa {
	int value;
}

class Dataa2 {
	int value;
	
	Dataa2(int x) {
		value = x;
	}
}

class ConstructorTest {
    public static void main(String[] args) {
    	Dataa d1 = new Dataa(); // Dataa는 컴파일러가 기본 생성자를 추가 해줌 
//      Dataa2 d2 = new Dataa2(); // 컴파일 에러, 이미 Dataa2(int x)가 정의되어 있으므로 기본 생성자 추가 안됨
    }
}