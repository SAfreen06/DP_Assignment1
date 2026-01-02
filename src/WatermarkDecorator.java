public class WatermarkDecorator extends ContentDecorator {

    public WatermarkDecorator(DocumentContent documentContent) {
        super(documentContent);
    }

    @Override
    public String getContent() {
        return documentContent.getContent() + " [Watermark]";
    }
}
