package tyTransleteText;

public class TransleteTextFromFile {
String[]	list= null,list11= null;

String[][] list3 = new String[3000][5]; 


	public TransleteTextFromFile(String s) {
	//	System.out.println("	");
		s=s.replaceAll("\n|\r\n", "	");//избавились от знаков переноса строки
		
		list=s.split("0000	0000	0000	0000	0000	");//избавится от нулей
		list=list[1].split("	");//составить массив строк по пробелам
		
	   // PrintArray(list);
		SecondArray(list);
		new NextTranslete(SecondArray(list));
		
	}
	

	


	private String[][] SecondArray(String[] list2)
	{
	
	int j=0,k=0;
		for(int i=0;i<list2.length;i++) {
			
			
			
			if(j==5)
			{
				k++;
				j=0;
				
			}
			list3[k][j]=list2[i];
			
		
			j++;
		}
		return list3;
			
	}


	private void PrintArray(String[] list2) {
		for(String str:list2)
			
		{
			System.out.print(str);
		}
		
	}

}
