public class BookStatistics implements Visitor{

    private int images;
    private int paragraps;
    private int tables;
    private int tablesOfContent;

    public BookStatistics() {
        this.images = 0;
        this.paragraps = 0;
        this.tables = 0;
        this.tablesOfContent = 0;
    }

    @Override
    public void visitBook(Book b) {
    }

    @Override
    public void visitSection(Section s) {
    }

    @Override
    public void visitTableOfContent(TableOfContent t) {
    }

    @Override
    public void visitTable(Table t) {
        tables+=1;
    }

    @Override
    public void visitParagraph(Paragraph p) {
        paragraps+=1;
    }

    @Override
    public void visitImageProxy(ImageProxy i) {
        images+=1;
    }

    @Override
    public void visitImage(Image i) {
        images+=1;
    }

    public void printStatistics() {
        System.out.println("Book statistics:");
        System.out.println("*** Number of images: " + images);
        System.out.println("*** Number of tables: " + tables);
        System.out.println("*** Number of paragraphs: " + paragraps);
    }
}
