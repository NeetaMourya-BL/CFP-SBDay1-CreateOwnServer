package com.org.http;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

	public class Handlers {
		public static class RootHandler implements HttpHandler {
			@Override
			public void handle(HttpExchange exchange) throws IOException {
				String response = "<h1>Server start success if you see this message</h1>" + "<h1> Port:"
						+ SimpleHttpServer.port + "</h1>";
				exchange.sendResponseHeaders(200, response.length());
				OutputStream os = exchange.getResponseBody();
				os.write(response.getBytes());
				os.close();
			}
		}}
