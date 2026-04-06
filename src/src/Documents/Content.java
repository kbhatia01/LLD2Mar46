package src.Documents;

public class Content implements Cloneable{
    String text;
    String html;

    public Content(String text, String html) {
        this.text = text;
        this.html = html;
    }

    @Override
    public Content clone() {
        try {
            Content clone = (Content) super.clone();
            clone.text = text;
            clone.html = html;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
