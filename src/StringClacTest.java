import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringClacTest {

	@Test
	void test() {

		String number = "";
		String expected = "0";

		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void test2() {

		String number = "7";
		String expected = "7";

		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void test3() {

		String number = "100";
		String expected = "100";

		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void test4() {

		String number = "2,3";
		String expected = "5";

		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void test5() {

		String number = "1,100";
		String expected = "101";

		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void test6() {
		String number = ("7.5 , 8.1");
		String expected = "15.6";

		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void test7() {
		String number = "-65";
		String expected = "-65";

		String actual = StringCalc.add(number);
		assertEquals(expected, actual);

	}

	@Test
	void test8() {
		String number = ("-65,4");
		String expected = "-61";

		String actual = StringCalc.add(number);
		assertEquals(expected, actual);
	}

	@Test
	void test9() {
		String expected = "-89";
		String actual = StringCalc.add("-65,-24");

		assertEquals(expected, actual);
	}

	@Test
	void test10() {
		String number = "";
		String expected = "0";

		String actual = StringCalc.add(number);

		assertEquals(expected, actual);
	}

	@Test
	void test11() {
		String number = ("21,6");
		String expected = "27";

		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void test12() {
		String number = ("2,7");
		String expected = "9";

		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

}
