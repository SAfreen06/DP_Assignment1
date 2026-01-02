public abstract class ContentDecorator implements DocumentContent {

    protected DocumentContent documentContent;

    public ContentDecorator(DocumentContent documentContent) {
        this.documentContent = documentContent;
    }

    @Override
    public String getContent() {
        return documentContent.getContent();
    }
}

