package jp.co.aforce.test;
import java.util.Random;

public class PracticeTest8 {
	//練習問題1
	void printHello() {
		System.out.println("Hello");
	}

	//練習問題2

	void printRandomMessage() {

		String[] s = { "こんばんは", "こんにちは", "おはよう" };
		int n = (int) (3 * Math.random());
		System.out.println(s[n]);
	}

	//練習問題3
	void printMessage(String massage) {

		System.out.println(massage);

	}

	//練習問題4
	void printMessage2(String message, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	//練習問題5
	static void prinRectangleArea(double height, double width) {
		System.out.println(height * width);

	}

	//練習問題6

	String getWeatherForecast() {
		String[] days = { "今日", "明日", "明後日" };
		String[] weathers = { "晴れ", "曇り", "雨", "雪" };

		Random random = new Random();
		int randomDayIndex = random.nextInt(days.length);
		int randomWeatherIndex = random.nextInt(weathers.length);

		return days[randomDayIndex] + "の天気は" + weathers[randomWeatherIndex] + "でしょう。";

	}

	//練習問題7

	boolean isEvenNumber(int value) {
		if (value % 2 == 0) {
			return true;

		} else {
			return false;

		}

	}

	//練習問題8

	static String getMessage(String name, boolean isKid) {

		if (isKid) {
			return "こんにちは。" + name + "ちゃん。";
		} else {
			return "こんにちは。" + name + "さん。";
		}
	}

	//練習問題9

	static String getLongestString(String[] array) {
		String longestString = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i].length() >= longestString.length()) {
				longestString = array[i];
				}
			}
		
		return longestString;
		}
		
		//練習問題10
	 
		boolean isAdult(Person person) {
			   return (person.getAge() >= 20);
		}
		
	}


