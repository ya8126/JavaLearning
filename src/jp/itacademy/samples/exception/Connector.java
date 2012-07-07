package jp.itacademy.samples.exception;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connector {

	public static void main(String[] args) {
		Connector conn = new Connector("www.yahoo.co.jp", 80);
		conn.connect();
	}

	private String host;
	private int port;

	public Connector(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public void connect() {
		try {
			Socket sock = new Socket(host, port);
			System.out.println("Ú‘±¬Œ÷:@" + sock);
		} catch (UnknownHostException e) {
			System.err.println(host + "‚ªŒ©‚Â‚©‚è‚Ü‚¹‚ñ");
		} catch (IOException e) {
			System.err.println("Ú‘±‚Å‚«‚Ü‚¹‚ñ");
		}
	}
}
