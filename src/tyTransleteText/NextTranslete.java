package tyTransleteText;

public class NextTranslete {
	UnloadingFrame unloadingFrame = new UnloadingFrame();

	public NextTranslete(String[][] secondArray) {

		ArreyCeateString(secondArray);
		UnloadingFiles(secondArray);

	}

	private void UnloadingFiles(String[][] secondArray) {
		try {
			for (int i = 0; i < secondArray.length; i++) {
				String MyString = "";
				MyString += secondArray[i][3].charAt(0);
				MyString += secondArray[i][3].charAt(1);
				MyString += ".";
				// ���
				MyString += secondArray[i][3].charAt(2);
				MyString += secondArray[i][3].charAt(3);
				MyString += ".";// �����
				MyString += secondArray[i][2].charAt(0);
				MyString += secondArray[i][2].charAt(1);
				MyString += " ���� ";
				MyString += "  � ";
				MyString += secondArray[i][2].charAt(2);
				MyString += secondArray[i][2].charAt(3) + ":";// ����
				MyString += secondArray[i][1].charAt(0);
				MyString += secondArray[i][1].charAt(1) + ":";// ������
				MyString += secondArray[i][1].charAt(2);
				MyString += secondArray[i][1].charAt(3) + ":";// �������
				MyString += " ����� ����� ";
				MyString += secondArray[i][0].charAt(2);
				MyString += " ";

				try {

					MyString += whatAction(secondArray[i][0].charAt(3));
				} catch (Exception e) {
				}
				MyString += deyWeeak(secondArray[i][4].charAt(3));
				System.out.println(MyString);

				unloadingFrame.setTextArea(MyString);

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private String whatAction(char a) {// ����� ��������
		String action = null;
		switch (a) {
		case '1':
			action = "�������   ";
			break;
		case '2':
			action = "��������  ";
		}

		return action;

	}

	String deyWeeak(char a) {

		String day;
		switch (a) {
		case '1':
			day = "����������� \n";
			break;
		case '2':
			day = "������� \n";
			break;
		case '3':
			day = "����� \n";
			break;
		case '4':
			day = "������� \n";
			break;
		case '5':
			day = "������� \n";
			break;
		case '6':
			day = "������� \n";
			break;
		case '7':
			day = "����������� \n";
			break;
		default:
			day = "������ ��� ������ ��� ������ \n";
			break;
		}
		return day;
	}

	private void ArreyCeateString(String[][] secondArray) {
		System.out.println(secondArray[1][0] + " " + secondArray[1][1] + " " + secondArray[1][2] + " "
				+ secondArray[1][3] + " " + secondArray[1][4]);

	}

}
