package Decorater;

public class PlainText implements Text {
	   private String content;
	   public PlainText(String content) {
	           this.content = content;
	       }
	   public String getContent() {
	       return content;
	   }
}
