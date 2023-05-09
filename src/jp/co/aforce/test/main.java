package jp.co.aforce.test;

public class main {
	public static void main(String[] args) {

		PracticeTest8 practiceTest8 = new PracticeTest8();

		//問題１
		practiceTest8.printHello();

		//問題2
		practiceTest8.printRandomMessage();

		//問題3
		practiceTest8.printMessage("Hello");

		//問題4
		practiceTest8.printMessage2("Hello", 5);

		//問題5
		practiceTest8.prinRectangleArea(5, 4);

		//問題6
		System.out.println(practiceTest8.getWeatherForecast());

		//問題7
		System.out.println(practiceTest8.isEvenNumber(9));

		//問題8
		String name = "太郎";
        boolean isKid = true;
		System.out.println(practiceTest8.getMessage(name, isKid));

		//問題9
		 String[] array = {"Apple", "Banana", "Peach", "Strawberry", "Blueberry"};
		System.out.println(practiceTest8.getLongestString(array));
		
		//問題10
		Person person = new Person("劉",21);
		System.out.println(practiceTest8.isAdult(person));	
    }

	}
