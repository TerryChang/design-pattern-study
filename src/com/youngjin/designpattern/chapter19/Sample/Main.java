package com.youngjin.designpattern.chapter19.Sample;

//있는 그대로 실행하게 되면 버튼의 라벨이 한글로 되어 있는것이 깨져보인다.
//https://archmond.net/archives/7562 를 보고 수정하면 된다.

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 시간 설정 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
