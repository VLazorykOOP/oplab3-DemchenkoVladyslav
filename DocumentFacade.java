public class DocumentFacade {
    private void WorkWithDocument(DocumentMemento d) {
        d.document.open();
        System.out.println("renaming to 'new name'");
        d.renamed("new name");
        d.document.save();

        System.out.println("backup");
        d.backUp();
        d.document.close();
    }

    public void WorkWithTextDocument() {
        DocumentMemento dm = new DocumentMemento();
        TextDocument td = DocumentFactory.createTextDocument("test");
        dm.document = td;
        WorkWithDocument(dm);
    }

    public void WorkWithSpreadsheetDocument() {
        DocumentMemento dm = new DocumentMemento();
        SpreadSheetDocument sd = DocumentFactory.createSpreadSheetDocument("spreadsheet");
        dm.document = sd;
        WorkWithDocument(dm);
    }
}
