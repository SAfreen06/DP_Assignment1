public class BasicContent implements DocumentContent {

    private String content;

    public BasicContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

