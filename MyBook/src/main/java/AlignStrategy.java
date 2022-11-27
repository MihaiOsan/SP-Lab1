public interface AlignStrategy {
    public default void render(Paragraph p){
        String text = p.getTitle();
        text = "##" + text;
        p.setTitle(text);
    }
}
