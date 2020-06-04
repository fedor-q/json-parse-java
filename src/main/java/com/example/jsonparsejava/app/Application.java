package com.example.jsonparsejava.app;

import com.example.jsonparsejava.Consts;
import com.example.jsonparsejava.helper.JsonHelper;
import org.json.JSONObject;

import java.io.IOException;

/**
 * @author FedorD
 * Created on   2020-06-04
 */
public class Application {

    public static void parseJson() throws IOException {

        JSONObject jsonObject = JsonHelper.getJson(Consts.URL);

        jsonObject.keySet()
                .stream()
                .map(k -> k + "=" + jsonObject.get(k))
                .forEach(System.out::println);
    }

    public static int getVersion() throws IOException {

        return JsonHelper.getJson(Consts.URL).getInt("version");
    }
}
