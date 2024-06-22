public class TextDocument extends BaseDocument {
    public TextDocument(String filename) {
        super("txt");
        this.filename = filename;
    }

    @Override
    public void open() {
        System.out.println("Text document " + filename + '.' + extention + " opened.");
    }

    @Override
    public void save() {
        System.out.println("Text document "+filename + '.' + extention +" saved.");
    }

    @Override
    public void close() {
        System.out.println("Text document "+filename + '.' + extention +" closed.");
    }
}