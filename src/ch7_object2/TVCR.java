package ch7_object2;

class Tv2 {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class VCR {
    boolean power;
    int counter = 0;

    void power() {
        power = !power;
    }

    void play() { /* 내용 생략 */}

    void stop() { /* 내용 생략 */}

    void rew() { /* 내용 생략 */}

    void ff() { /* 내용 생략 */}

}

class TVCR extends Tv2 { //단일 상속만 허용하므로 비중이 높은 클래스 Tv2를 상속
    VCR vcr = new VCR(); // VCR클래스는 포함을 통해 다중상속을 피하고 코드의 재사용성을 높임
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }

}
