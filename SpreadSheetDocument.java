public class SpreadSheetDocument extends BaseDocument {
    public SpreadSheetDocument(String filename) {
        super("xls");
        this.filename = filename;
    }

    @Override
    public void open() {
        System.out.println("Spreadsheet document " + filename + '.' + extention + " opened.");
    }

    @Override
    public void save() {
        System.out.println("Spreadsheet document " + filename + '.' + extention + " saved.");
    }

    @Override
    public void close() {
        System.out.println("Spreadsheet document " + filename + '.' + extention + " closed.");
    }
}