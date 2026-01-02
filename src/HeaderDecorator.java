public class HeaderDecorator extends ContentDecorator {

    public HeaderDecorator(DocumentContent documentContent) {
        super(documentContent);
    }

    @Override
    public String getContent() {
        return "Header\n" + documentContent.getContent();
    }
}

