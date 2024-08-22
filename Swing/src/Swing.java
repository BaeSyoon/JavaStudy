import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing implements ActionListener {
	 	 
	public Swing() {
		 // Java GUI 공부: Swing 라이브러리
		 
		 // JFrame은 Swing에서 기본적으로 창(window)을 나타내는 클래스입니다.
		 JFrame frame = new JFrame("계산기");
		 frame.setSize(400, 500);  // 창 크기 설정
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 창을 닫아도 JVM에 남아 가동하기 때문에 메모리 과사용
		 frame.setLayout(null);  // 레이아웃 매니저 설정 (null은 직접 배치)
		 frame.setVisible(true);  // 창을 화면에 표시

		 // JTextField는 사용자로부터 텍스트 입력을 받거나, 결과를 표시하는 데 사용하는 컴포넌트입니다.
		 JTextField textField = new JTextField();
		 textField.setBounds(50,25,300,50);  // 위치와 크기 설정
		 textField.setFont(new Font("Arial", Font.BOLD, 30));  // 글꼴 설정
		 textField.setEditable(false);  // 사용자 입력 불가 (결과 표시용)
		 frame.add(textField);  // JFrame에 추가

		 // JButton은 클릭 가능한 버튼을 나타냅니다.
		 JButton button = new JButton("1");
		 button.setBounds(50, 100, 100, 50);  // 위치와 크기 설정
		 button.setFont(new Font("Arial", Font.BOLD, 20));  // 글꼴 설정
		 button.addActionListener(this);  // 버튼 클릭 시 호출될 리스너 설정
		 frame.add(button);  // JFrame에 추가

		 // JPanel은 여러 컴포넌트를 그룹화해서 하나의 컨테이너로 묶어주는 역할을 합니다. 계산기에서 숫자 버튼들을 깔끔하게 배치하기 위해 사용됩니다.
		 JPanel panel = new JPanel();
		 panel.setBounds(50, 100, 300, 300);  // 위치와 크기 설정
		 panel.setLayout(new GridLayout(4, 4, 10, 10));  // 4x4 그리드 레이아웃, 컴포넌트 간 10픽셀 간격
		 frame.add(panel);  // JFrame에 추가                                                
		 
		 // Layout Manager는 컴포넌트들을 JFrame이나 JPanel 안에 배치하는 방식을 결정합니다. 몇 가지 주요 레이아웃 매니저를 소개합니다.
		 // FlowLayout: 컴포넌트들을 좌에서 우로 순차적으로 배치합니다.
		 // BorderLayout: 상하좌우 및 중앙으로 컴포넌트를 배치할 수 있습니다.
		 // GridLayout: 행렬 형태로 컴포넌트를 배치합니다. 각 셀이 동일한 크기를 가집니다.
		 // null Layout: 사용자가 컴포넌트의 위치와 크기를 직접 설정합니다.
		 
	 }
	
	 public static void main(String[] args) {
		 new Swing();
	 }	 
	 
	
	 // ActionListener는 버튼 클릭 같은 사용자 동작(이벤트)에 반응하여 특정 작업을 수행하도록 합니다.
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 System.out.println("Button Clicked.");
	 }
		 
		 
	 
}
