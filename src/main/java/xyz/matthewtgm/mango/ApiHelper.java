package xyz.matthewtgm.mango;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class ApiHelper {

    /**
     * Fetches a string from the internet.
     *
     * @param url The url to fetch from.
     * @return The string fetched.
     */
    public static String fetch(URL url) {
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setUseCaches(false);
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK)
                return IOHelper.toString(conn.getInputStream());
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Fetches a string from the internet.
     *
     * @param url The url to fetch from.
     * @return The string fetched.
     */
    public static String fetch(URI uri) {
        try {
            return fetch(uri.toURL());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Fetches a string from the internet.
     *
     * @param url The url to fetch from.
     * @return The string fetched.
     */
    public static String fetch(String url) {
        try {
            return fetch(new URL(url));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}