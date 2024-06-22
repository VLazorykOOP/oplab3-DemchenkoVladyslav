public class DocumentMemento {
    public String filename;
    public String content;
    public BaseDocument document;

    public void renamed(String newName) {
        filename = document.filename;
        document.filename = newName;
    }

    public void updated(String newContent) {
        content = document.content;
        document.content = newContent;
    }

    public void backUp() {
        document.rename(filename);
        document.updcontent(content);
        System.out.println("file backed up");
    }
}
