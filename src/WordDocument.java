class WordDocument extends Document {

    protected void open() {
        System.out.println("Opening Word document");
    }

    protected void prepare() {
        System.out.println("Preparing Word document");
    }

    protected String getContent() {
        return "Word Content";
    }
}
