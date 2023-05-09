package jp.co.aforce.test;

public class MinMax {
//練習問題2
	public int getMaxValue(int a, int b, int c) {
		int big;
		big = c;
		if (big < a)
			big = b;
		if (big < c)
			big = c;
		return big;
	}

	public int getMinValue(int a, int b, int c) {
		int s;
		s = c;
		if (c > a)
			s = a;
		if (c > b)
			s = b;

		return s;
	}

}
