package builder;

public class Client {
    public static void main(String[] args){
        HttpRequest request = new HttpRequest.Builder("https://api.shop.com/order")
                .method("POST")
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer token123")
                .body("{ \"item\": \"Laptop\", \"qty\": 1 }")
                .timeout(10000)
                .build();

        System.out.println(request);
    }
}
