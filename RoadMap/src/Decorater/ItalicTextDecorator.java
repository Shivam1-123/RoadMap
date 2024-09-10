package Decorater;

public class ItalicTextDecorator extends TextDecorator {
    public ItalicTextDecorator(Text decoratedText) {
        super(decoratedText);
    }
    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }
}
