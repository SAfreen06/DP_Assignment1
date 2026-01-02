class PDFDocument extends Document {

    protected void open() {
        System.out.println("Opening PDF document");
    }

    protected void prepare() {
        System.out.println("Preparing PDF document");
    }

    protected String getContent() {
        return "PDF Content";
    }
}