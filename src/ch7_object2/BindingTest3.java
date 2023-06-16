package ch7_object2;

class BindingTest3 {
    public static void main(String[] args) {
        Parent5 p = new Child5();
        Child5 c = new Child5();
 
        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}
 
class Parent5 {
    int x = 100;
 
    void method() {
        System.out.println("Parent Method");
    }
}
 
class Child5 extends Parent5 {
    int x = 200;    // 멤버변수 중복정의
 
    void method() {
        System.out.println("x=" + x);   // this.x와 같음
        System.out.println("super.x=" + super.x);   // 조상 클래스의 멤버변수 호출
        System.out.println("this.x=" + this.x);     // 자손 클래스의 멤버변수 호출
    }
}
