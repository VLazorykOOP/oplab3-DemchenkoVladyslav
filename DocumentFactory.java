public class DocumentFactory {
    public  static TextDocument createTextDocument(String filename) {
        return new TextDocument(filename);
    }

    public static SpreadSheetDocument createSpreadSheetDocument(String filename) {
        return new SpreadSheetDocument(filename);
    }
}
