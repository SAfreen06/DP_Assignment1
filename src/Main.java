public class Main {
    public static void main(String[] args) {
        Document document = DocumentFactory.createDocument("PDF");

        DocumentContent content =
                new BasicContent("Design Patterns Assignment");

        content = new HeaderDecorator(content);
        content = new WatermarkDecorator(content);

        document.setContent(content);

        document.setPrintStrategy(new ColorPrint());

        document.printDocument();
    }
}
