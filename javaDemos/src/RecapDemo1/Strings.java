package RecapDemo1;

public class Strings {

	public static void main(String[] args) {
		// strings();
		String message = "I'm not feel today";
		String messageWithTrim = "                I'm gooooooood                       ";
		System.out.println(message.replace(' ', '-'));
		System.out.println(message.substring(3, 6));
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		System.out.println(messageWithTrim.trim());
		System.out.println(messageWithTrim);
	}

	public static void strings() {
		String message = "The weather is a good today ";
		System.out.println(message);

		System.out.println("Amounts of element " + message.length());
		System.out.println("5th element :" + message.charAt(5));
		System.out.println(message.concat("Long life"));
		System.out.println(message.startsWith("T"));
		char[] charArray = new char[25];
		message.getChars(0, 5, charArray, 0);
		System.out.println(charArray);
		System.out.println(message.indexOf("is"));
		System.out.println(message.lastIndexOf("ay"));
	}

}
