abstract class BaseDocument implements Document {
    public String filename;
    public String content;
    public final String extention;

    protected BaseDocument(String documentType) {
        this.extention = documentType;
    }

    @Override
    public void open() {

    }

    @Override
    public void save() {

    }

    @Override
    public void close() {

    }

    @Override
    public void rename(String newName) {
        filename = newName;
    }

    @Override
    public void updcontent(String newContent) {
        content = newContent;
    }

}
