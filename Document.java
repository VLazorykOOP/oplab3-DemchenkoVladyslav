public interface Document {
    void open();

    void save();

    void close();
    void rename(String newName);
    void updcontent(String newContent);
}