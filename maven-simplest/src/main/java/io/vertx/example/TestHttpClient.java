package io.vertx.example;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.RequestOptions;

public class TestHttpClient {
  public static void main(String[] args) {
    Vertx.vertx().createHttpClient().request(new RequestOptions()
    .setMethod(HttpMethod.GET)
    .setHost("localhost")
    .setPort(8080)
    .setURI("/")).onSuccess(req -> req.send().onComplete(resp -> {
      System.out.println("Hello Vertx");
    }));
  }
}
