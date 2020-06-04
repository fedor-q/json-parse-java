package com.example.jsonparsejava.helper;

import com.example.jsonparsejava.Consts;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * @author FedorD
 * Created on   2020-06-04
 */
public class JsonHelper {

    public static JSONObject getJson(String strUrl) throws IOException {
        String json = "";
        URL url = new URL(strUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(Consts.REQUEST_METHOD);
        conn.connect();

        int responseCode = conn.getResponseCode();

        if (responseCode != 200)
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        else {
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                json += sc.nextLine();
            }
            sc.close();
        }
        return new JSONObject(json);
    }
}
