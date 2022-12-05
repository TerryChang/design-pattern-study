package com.youngjin.designpattern.chapter19.A1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);		// 현재 시간 표시
    private TextArea textScreen = new TextArea(10, 60);	// 경비 센터 출력
    private Button buttonUse = new Button("금고 사용");	// 금고 사용 버튼
    private Button buttonAlarm = new Button("비상벨");	// 비상벨 버튼
    private Button buttonPhone = new Button("일반 통화");	// 일반 통화 버튼
    private Button buttonExit = new Button("종료");		// 종료 버튼

    private State state = DayState.getInstance();		// 현재 상태 


    // 생성자 
    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        // textClock 배치 
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        // textScreen 배치 
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        // 패널에 버튼 추가
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // 그 패널을 배치 
        add(panel, BorderLayout.SOUTH);

        // 버튼이 눌렸을 때의 리스너를 람다식으로 설정
        /*
        buttonUse.addActionListener(e -> state.doUse(this));
        buttonAlarm.addActionListener(e -> state.doAlarm(this));
        buttonPhone.addActionListener(e -> state.doPhone(this));
        buttonExit.addActionListener(e -> System.exit(0));
        */
        
        // 출판사에서 배포되는 예제 샘플코드는 위의 코드를 사용하지만 이렇게 할 경우 컴파일이 이루어지지 않았다.
        // 부록 A 연습문제 해답 에서도 동일하게 사용되어 있기 때문에 jdk 15 로 컴파일 테스트를 해보지 않아서 잘못된 코드라 말할수는 없지만
        // jdk 15 미만에서도 컴파일 가능하게끔 하기 위해 부록 A에 있는 소스가 아닌 19장 본문에 있는 코딩형태로 수정했다
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
        
        // 표시 
        pack();
        setVisible(true);
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		if(e.getSource() == buttonUse) {
			state.doUse(this);
		} else if(e.getSource() == buttonAlarm) {
			state.doAlarm(this);
		} else if(e.getSource() == buttonPhone) {
			state.doPhone(this);
		} else if(e.getSource() == buttonExit) {
			System.exit(0);
		} else {
			System.out.println("?");
		}
	}

	// 시간 설정 
    @Override
    public void setClock(int hour) {
        String clockstring = String.format("현재 시간은 %02d:00", hour);
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);
    }

    // 상태 변화 
    @Override
    public void changeState(State state) {
        System.out.println(this.state + "에서 " + state + "으로 상태가 변화했습니다.");
        this.state = state;
    }

    // 경비 센터 경비원 호출
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    // 경비 센터 기록 
    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }
}
