public class AlignLeft implements AlignStrategy{
    @Override
    public void render(Paragraph p) {
        String text = p.getTitle();
        text = text+ "##";
        p.setTitle(text);
    }
}
