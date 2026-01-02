public abstract class Document {

    protected PrintStrategy printStrategy;
    protected DocumentContent content;

    public void setPrintStrategy(PrintStrategy printStrategy) {
        this.printStrategy = printStrategy;
    }

    public void setContent(DocumentContent content) {
        this.content = content;
    }

    // Template Method
    public final void printDocument() {
        open();
        prepare();
        printStrategy.print(content.getContent());
        close();
    }

    protected abstract void open();
    protected abstract void prepare();

    protected void close() {
        System.out.println("Closing document\n");
    }
}
