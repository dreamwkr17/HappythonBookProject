package com.example.happythonbookproject;

//url 을 받아서 json Array를 리턴 
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

public class JSONfunctions {

	public static JSONArray getJSONfromURL(String url) {
		InputStream is = null;
		String result = "";
		JSONArray jArray = null;

		// Download JSON data from URL
		try {
			URL url1 = new URL(url);
			URLConnection urlConnection = url1.openConnection();
			HttpURLConnection httpUrlConnection = (HttpURLConnection) urlConnection;

			is = httpUrlConnection.getInputStream();

		} catch (Exception e) {
			Log.e("log_tag", "Error in http connection " + e.toString());
		}

		
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "UTF-8"), 8);

			StringBuilder sb = new StringBuilder();

			String line = null;

			while ((line = reader.readLine()) != null) {
				Log.i("line22", line);
				sb.append(line + "\n");
			}

			is.close();

			result = sb.toString();
		} catch (Exception e) {
			Log.e("log_tag", "Error converting result " + e.toString());
		}

		try {

			jArray = new JSONArray(result);

		} catch (JSONException e) {
			Log.e("log_tag", "Error parsing data " + e.toString());
		}
		Log.i("log_tag", "jArray 리턴함 " + result.toString());
		return jArray;
	}
	//quesry 형식 - params 와 함께 보낼때 (post)
	public static JSONArray getJSONfromURL(String params, String url) {
		InputStream is = null;
		String result = "";
		JSONArray jArray = null;
		boolean isSuccess = false;
	//	String param = "mGPS_X=37.549107&mGPS_Y=126.919026";
String param = params;
		// Download JSON data from URL
		try {
			URL url1 = new URL(url);
			URLConnection urlConnection = url1.openConnection();
			HttpURLConnection httpUrlConnection = (HttpURLConnection) urlConnection;
			httpUrlConnection.setRequestMethod("POST");
			httpUrlConnection.setDoOutput(true);

			OutputStream os = httpUrlConnection.getOutputStream();
			os.write(param.getBytes());
			os.flush();
			os.close();

			is = httpUrlConnection.getInputStream();

		} catch (Exception e) {
			Log.e("log_tag", "Error in http connection " + e.toString());
		}

		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "UTF-8"), 8);

			StringBuilder sb = new StringBuilder();

			String line = null;

			while ((line = reader.readLine()) != null) {
				Log.i("line22", line);
				sb.append(line + "\n");
			}

			is.close();

			result = sb.toString();
		} catch (Exception e) {
			Log.e("log_tag", "Error converting result " + e.toString());
		}

		try {

			jArray = new JSONArray(result);

		} catch (JSONException e) {
			Log.e("log_tag", "Error parsing data " + e.toString());
		}
		Log.i("log_tag", "jArray 리턴함 " + result.toString());
		return jArray;
}
}

