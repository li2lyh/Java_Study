package ch7_object2;

class BindingTest2 {
    public static void main(String[] args) {
    	// 자손 클래스에 아무런 멤버도 정의되어있지 않아 참조변수 타입의 관계없이 조상의 멤버들을 사용하게 
        Parent4 p = new Child4();
        Child4 c = new Child4();
 
        System.out.println("p.x = " + p.x);
        p.method();
 
        System.out.println("c.x = " + c.x);
        c.method();
    }
}
 
class Parent4 {
    int x = 100;
 
    void method() {
        System.out.println("Parent Method");
    }
}
 
class Child4 extends Parent4 { } 

