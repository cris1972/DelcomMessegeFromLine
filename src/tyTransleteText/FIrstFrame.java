package tyTransleteText;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;
public class FIrstFrame extends JFrame {
	 JButton b1,b2;
	    JLabel l1;
	    JTextField t1,t2;
	     JPanel p;
	    int i,k;
	    String a,b,text1;
	    JTextArea textArea;
	    Mylesener mylesener=new Mylesener();
	
   public FIrstFrame(){
		super("��������� ����� ���������� ������� �� ����� ������");
        setLayout(new FlowLayout());//������������ ��������� �� ������
       // System.out.println();
        t1=new JTextField(10);//���� �����
        t1.setText("D:\\test1.txt");
        b1=new JButton("�������������");
        l1=new  JLabel("���� � �����");
      //  textArea=new JTextArea(100 ,50);
        add(l1);
        add(t1);
        add(b1);//�������� ������� � ����
        setSize(700,100);//������� ����
       // textArea.append("��������� ���������������");//�������� � ���� ������
        add(new JScrollPane(textArea));
        b1.addActionListener(mylesener);//���������� ���������
        setLocationRelativeTo(null);//���� �� ������ ������
        setVisible(true);//������� ������� ����
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������� ��� ������ �������� ����
        setLocationRelativeTo(null);//���� �� ������ ������
    }
	public class Mylesener implements ActionListener{

	    
	  
	        	

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (e.getSource()==b1){
	                     text1=t1.getText();//����� ����� �� ���� �����
	                     new ReadTextFromFile (t1.getText());//��������� ����� ������ ������� ����
  
	           
	          
	         }
	    }
	 }
	}



