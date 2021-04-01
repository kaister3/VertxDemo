package io.vertx.example;

import io.vertx.core.Vertx;

/**
 * @author kaister3
 */
public class HelloWorldEmbedded {
  public static void main(String[] args) {
    Vertx.vertx().createHttpServer().requestHandler(req -> {
      req.response().putHeader("content-type", "text/html;charset=utf8").end("Hello Vertx");
      System.out.println("received request");
    }).listen(8080);
  }
}
