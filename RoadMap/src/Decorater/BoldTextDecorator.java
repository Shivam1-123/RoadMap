package Decorater;

public class BoldTextDecorator extends TextDecorator {
    public BoldTextDecorator(Text decoratedText) {
        super(decoratedText);
    }
    public String getContent() {
        	return "<b>" + super.getContent() + "</b>";
    }
}
