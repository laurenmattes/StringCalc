
public class StringCalc {

	public static String add(String number) {

		if (number == "") {
			return "0";

		}
		if (number == "0") {
			return "";
		}
		if (number.contains("-") && number.contains(",")) {
			String[] values = number.split(",");
			String value5 = values[0];
			String value6 = values[1];
			int x = Integer.parseInt(value5);
			int y = Integer.parseInt(value6);

			int preResult = x + y;
			String result = Integer.toString(preResult);

			return result;
		}
		if (number.contains("-")) {
			String result = number;
			return result;
		}

		if (number.contains(",") && number.contains(".")) {
			String[] values = number.split(",");
			String value3 = values[0];
			String value4 = values[1];

			double x = Double.parseDouble(value3);
			double y = Double.parseDouble(value4);

			double preResult = x + y;
			String result2 = Double.toString(preResult);

			return result2;

		}
		if (number.contains(",")) {
			String[] values = number.split(",");
			String value1 = values[0];
			String value2 = values[1];

			int x = Integer.parseInt(value1);
			int y = Integer.parseInt(value2);

			int preResult = x + y;
			String result = Integer.toString(preResult);

			return result;
		}

		return number;
	}

}
