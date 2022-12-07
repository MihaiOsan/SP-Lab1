public interface Visitor {
    void visitBook(Book b);
    void visitSection(Section s);
    void visitTableOfContent(TableOfContent t);
    void visitTable(Table t);
    void visitParagraph(Paragraph p);
    void visitImageProxy(ImageProxy i);
    void visitImage(Image i);

}
