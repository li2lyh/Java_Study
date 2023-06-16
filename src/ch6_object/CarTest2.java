package ch6_object;

class Car2 {
    String color;
    String gearType;
    int door;
 
    //생성자 1
    Car2() {
        this("white", "auto", 4);
    }
 
    //생성자 2
    Car2(String color) {
        this(color, "auto", 4);
    }
 
    //생성자 3
    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
 
public class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2(); // 생성자 1
        Car2 c2 = new Car2("blue"); // 생성자 2
 
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
 
    }
}