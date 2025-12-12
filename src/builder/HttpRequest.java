package builder;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private final String url;
    private final String method;
    private final String body;
    private final int timeout;
    private final Map<String, String> headers;

    private HttpRequest(Builder builder){
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
        this.timeout = builder.timeout;
        this.headers = builder.headers;
    }

    public static class Builder {
        private final String url;         // required
        private String method = "GET";    // default
        private String body = "";
        private int timeout = 5000;       // 5s default
        private final Map<String, String> headers = new HashMap<>();

        public Builder(String url){
            this.url = url;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", body='" + body + '\'' +
                ", timeout=" + timeout +
                ", headers=" + headers +
                '}';
    }
}
