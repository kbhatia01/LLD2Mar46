package src;

import Documents.Content;
import Documents.Document;

public class Main {
    public static void main() {
        Document doc = new Document("test", new Content("a", "a"));

        Document copyDoc = doc.clone();

        System.out.println(doc);
        System.out.println(copyDoc);
    }
}
