package ch7_object2;

class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
 
class Parent {
    int x = 10;
}
 
class Child extends Parent{
    void method() {
        System.out.println("x=" +x);
        System.out.println("this.x=" + this.x); // 모두 같은 변수를 의미하므로 출력 값이 모두 같음
        System.out.println("super.x=" + super.x);
    }
}
