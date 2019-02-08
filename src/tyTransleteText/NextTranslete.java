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
				// год
				MyString += secondArray[i][3].charAt(2);
				MyString += secondArray[i][3].charAt(3);
				MyString += ".";// мес€ц
				MyString += secondArray[i][2].charAt(0);
				MyString += secondArray[i][2].charAt(1);
				MyString += " дата ";
				MyString += "  в ";
				MyString += secondArray[i][2].charAt(2);
				MyString += secondArray[i][2].charAt(3) + ":";// часы
				MyString += secondArray[i][1].charAt(0);
				MyString += secondArray[i][1].charAt(1) + ":";// минуты
				MyString += secondArray[i][1].charAt(2);
				MyString += secondArray[i][1].charAt(3) + ":";// секунды
				MyString += " номер линии ";
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

	private String whatAction(char a) {// какое действие
		String action = null;
		switch (a) {
		case '1':
			action = "вызвали   ";
			break;
		case '2':
			action = "сбросили  ";
		}

		return action;

	}

	String deyWeeak(char a) {

		String day;
		switch (a) {
		case '1':
			day = "понедельник \n";
			break;
		case '2':
			day = "вторник \n";
			break;
		case '3':
			day = "среда \n";
			break;
		case '4':
			day = "четверг \n";
			break;
		case '5':
			day = "п€тница \n";
			break;
		case '6':
			day = "суббота \n";
			break;
		case '7':
			day = "воскресенье \n";
			break;
		default:
			day = "ошибка нет такого дн€ недели \n";
			break;
		}
		return day;
	}

	private void ArreyCeateString(String[][] secondArray) {
		System.out.println(secondArray[1][0] + " " + secondArray[1][1] + " " + secondArray[1][2] + " "
				+ secondArray[1][3] + " " + secondArray[1][4]);

	}

}
