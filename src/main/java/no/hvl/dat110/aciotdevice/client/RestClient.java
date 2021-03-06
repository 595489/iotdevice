package no.hvl.dat110.aciotdevice.client;

import okhttp3.*;
import com.google.gson.Gson;

import java.io.IOException;

public class RestClient {

	public RestClient() {
		// TODO Auto-generated constructor stub
	}

	private static String logpath = "/accessdevice/log";

	public void doPostAccessEntry(String message) {

		// TODO: implement a HTTP POST on the service to post the message
		OkHttpClient client = new OkHttpClient().newBuilder()
				.build();
		MediaType mediaType = MediaType.parse("text/plain");
		RequestBody body = RequestBody.create(mediaType, "locked");
		Request request = new Request.Builder()
				.url("http://localhost:8080/accessdevice/log/")
				.method("POST", body)
				.addHeader("Content-Type", "text/plain")
				.build();
		try (Response response = client.newCall(request).execute()){
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	private static String codepath = "/accessdevice/code";
	
	public AccessCode doGetAccessCode() {

		AccessCode code = null;
		
		// TODO: implement a HTTP GET on the service to get current access code
		Gson gson = new Gson();

		OkHttpClient client = new OkHttpClient().newBuilder()
				.build();
		Request request = new Request.Builder()
				.url("http://localhost:8080/accessdevice/code")
				.method("GET", null)
				.build();
		try (Response response = client.newCall(request).execute()){

		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		return code;
	}
}
