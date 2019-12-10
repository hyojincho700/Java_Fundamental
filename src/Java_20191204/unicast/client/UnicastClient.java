package Java_20191204.unicast.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class UnicastClient implements ActionListener{
	private JFrame jframe;
	private JTextArea jta;
	private JButton jbtn;
	private JTextField jtf;
	private String id;
	private String ip;
	private int port;
	
	//생성자 엄청 길다. new 작업은 다 생성자에서
	public UnicastClient(String id, String ip, int port){
			this.id = id;
			this.ip = ip;
			this.port = port;
		
			jframe = new JFrame("Unicast Chatting"); //title
			/***********************북쪽시작************************/
			JPanel j1 = new JPanel();
			JLabel jl1 = new JLabel("User ID : ["+id+"]");
			JLabel jl2 = new JLabel("Server IP : "+ip);
			j1.setLayout(new BorderLayout());
			j1.add(jl1,BorderLayout.CENTER);
			j1.add(jl2,BorderLayout.EAST);
			/***********************북쪽끝************************/
			
			/***********************중앙시작************************/
			jta = new JTextArea("",20,50);
			JScrollPane jsp = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			jta.setBackground(new Color(204,194,219));
			jta.setEditable(false);
			/***********************중앙끝************************/
			
			/***********************남쪽시작************************/
			JPanel j2 = new JPanel();
			jtf = new JTextField(30);
			jbtn = new JButton("SEND");
			j2.setLayout(new BorderLayout());
			j2.add(jtf, BorderLayout.CENTER);
			j2.add(jbtn, BorderLayout.EAST);
			/***********************남쪽끝************************/
			
			
			//상단, 센터, 하단 총 세 개 add
			jframe.add(j1,BorderLayout.NORTH);
			jframe.add(jsp,BorderLayout.CENTER);
			jframe.add(j2,BorderLayout.SOUTH);
			
			jframe.pack(); 
			jframe.setResizable(true); //채팅창 크기 조절
			jframe.setVisible(true);
			
			//이벤트 등록
			jbtn.addActionListener(this);
			jtf.addActionListener(this);
			
			jframe.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e){
					System.exit(0);
				}
				//열자마자 채팅칸에 커서 위치하는 것
				public void windowOpened(WindowEvent e){
					jtf.requestFocus();
				}
			});
	}
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		//객체 생성 위해 인자 두 개 필요
		new UnicastClient("hyojincho700","192.168.0.192",3000);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource(); //이벤트 한 대상을 Object로 반환한 것.
		String message = jtf.getText();
		//버튼을 눌렀으면 등록해주세요. jbtn이 로컬변수라서 에러나니까 멤버변수로 만들어줍니다. 밖으로 빼줍니다.
		if(obj == jbtn){
			jta.append(id + ":"+message+"\n"); //j text field 에서 가져온 text를 j text area에 보냅니다. jtf 도 로컬변수라서 에러나니까 멤버변수로 빼줍니다.
			jtf.setText("");
		}else if(obj == jtf){ //j text field에 입력하고 엔터 치면 채팅창에 입력되는 코드
			jta.append(id + ":"+message+"\n");
			jtf.setText("");
		}
	}
}
