package ch6_object;

class Tv3{ 
    // TV의 속성(멤버변수)
    String color; 
    boolean power; 
    int channel; 

    // TV의 기능(메서드)
    void power(){power = !power;} // tv를 켜거나 끄는 기능을 하는 메서드
    void channelUp(){++channel;} // tv의 채널을 높이는 기능을 하는 메서드
    void channelDown(){--channel;} // tv의 채널을 낮추는 기능을 하는 메서드
}

public class TvTest3 {
    public static void main(String args[]){
    	Tv3 t1 = new Tv3(); 
        Tv3 t2 = new Tv3();
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
        
        t2 = t1; // t1이 저장하고 있는 값을 t2에 저장
        t1.channel = 7; 
        System.out.println("t1의 channel 값을 7로 변경하였습니다.");
        
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
    }
}
