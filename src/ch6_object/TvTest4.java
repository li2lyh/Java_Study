package ch6_object;
	
class TvTest4 {
    public static void main(String args[]){
    	Tv4[] tvArr = new Tv4[3];
    	
    	// Tv 객체 생성해서 Tv 객체 배열의 각 요소에 저장
    	for(int i = 0; i < tvArr.length; i++) {
    		tvArr[i] = new Tv4();
    		tvArr[i].channel = i + 10; 
    	}
    	
    	for(int i = 0; i < tvArr.length; i++) {
    		tvArr[i].channelUp(); 
    		System.out.printf("tvArr[%d].channel=%d%n", i , tvArr[i].channel);
    	}
    }
}

class Tv4{ 
    // TV의 속성(멤버변수)
    String color; 
    boolean power; 
    int channel; 

    // TV의 기능(메서드)
    void power(){power = !power;} // tv를 켜거나 끄는 기능을 하는 메서드
    void channelUp(){++channel;} // tv의 채널을 높이는 기능을 하는 메서드
    void channelDown(){--channel;} // tv의 채널을 낮추는 기능을 하는 메서드
}
