package src.Documents;

public class Document implements Cloneable {

    String name;
    Content content;

    public Document(String name, Content content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public Document clone() {
        try {
            Document clone = (Document) super.clone();
            clone.name = name;
            clone.content = content.clone();

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
