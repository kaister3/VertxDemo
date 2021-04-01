import org.junit.jupiter.api.Test;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpMethod;

public class TestHelloWorldEmbedded {
  @Test
  public void testHello() {
    Vertx.vertx().createHttpClient().request(HttpMethod.GET, 8080, "127.0.0.1", "",ar -> {
      if (ar.succeeded()) {
        System.out.println("request success");
      }
    });
  }
}
