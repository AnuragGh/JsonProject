package com.mip.app.json;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonExampleString {

	public static void main(String[] args) {
		String jsonString;
		try {
			jsonString = new JSONObject()
			.put("JSON1", "Hello World!")
			.put("JSON2", "Hello my World!")
			.put("JSON3", new JSONObject().put("key1", "value1"))
			.toString();
			System.out.println(jsonString);
		} catch (JSONException e) {
			System.out.println("JSONException: "+e.getMessage());
		}



	}

}
