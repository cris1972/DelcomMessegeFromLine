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
		super("обработка файла статистики вызовов на линии сборки");
        setLayout(new FlowLayout());//расположение элементов на экране
       // System.out.println();
        t1=new JTextField(10);//поле ввода
        t1.setText("D:\\test1.txt");
        b1=new JButton("преобразовать");
        l1=new  JLabel("путь к файлу");
      //  textArea=new JTextArea(100 ,50);
        add(l1);
        add(t1);
        add(b1);//добавить элемент в окно
        setSize(700,100);//размеры окна
       // textArea.append("результат преобаразования");//добавить в поле вывода
        add(new JScrollPane(textArea));
        b1.addActionListener(mylesener);//добавление слущателя
        setLocationRelativeTo(null);//окно по центру экрана
        setVisible(true);//сделать видимым окно
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//задание для кнопки закрытия окна
        setLocationRelativeTo(null);//окно по центру экрана
    }
	public class Mylesener implements ActionListener{

	    
	  
	        	

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (e.getSource()==b1){
	                     text1=t1.getText();//взять текст из поля ввода
	                     new ReadTextFromFile (t1.getText());//отправить место откуда считать файл
  
	           
	          
	         }
	    }
	 }
	}



