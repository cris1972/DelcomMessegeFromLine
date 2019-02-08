package tyTransleteText;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;



public class UnloadingFrame extends JFrame{
	
	 JPanel p;
	int i,k,n;
	
	JTextArea textArea;
	
	
	public UnloadingFrame() { super("обработка файла статистики вызовов на линии сборки");
    setLayout(new FlowLayout());//расположение элементов на экране
  
  
   
    textArea=new JTextArea(35,50);
    textArea.setWrapStyleWord(true); 
    textArea.setLineWrap(true); 
    DefaultCaret caret = (DefaultCaret) textArea.getCaret(); 
    caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE); 
    setSize(700,700);//размеры окна
    JScrollPane jScrollPane=new JScrollPane(textArea);
    add(jScrollPane);
    setLocationRelativeTo(null);//окно по центру экрана
    setVisible(true);//сделать видимым окно
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//задание для кнопки закрытия окна
    setLocationRelativeTo(null);//окно по центру экрана
   
    
		
	}
	 public  void setTextArea(String s){
		 textArea.append(s);
	    }

}
