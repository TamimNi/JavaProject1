package server;

public class Response {
    private String code;
    private String content;

    public Response(String code, String content) {
        this.code = code;
        this.content = content;
    }

    protected String get() {
        return "HTTP/1.0 " + this.code + "\r\n" +
                "Content-Type: application/json" + "\r\n" +
                "Content-Length: " + this.content.length() + "\r\n" +
                "\r\n" +
                this.content;
    }

}