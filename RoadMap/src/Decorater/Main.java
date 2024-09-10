package Decorater;

public class Main {
	public static void main(String[] strs) {
		
		Text plainText = new PlainText("Hello, world!");
		
		Text boldText = new BoldTextDecorator(plainText);
		System.out.println(boldText.getContent());
		Text italicText = new ItalicTextDecorator(boldText);
		System.out.println(italicText.getContent()); 
	}
}
