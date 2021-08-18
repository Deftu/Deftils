package xyz.matthewtgm.mango;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class APIs {

    /**
     * Fetches a string from the internet.
     *
     * @param url The url to fetch from.
     * @return The string fetched.
     */
    public static String get(URL url) {
        try {
            HttpURLConnection connection = createConnection(url, "GET");

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK)
                return IO.toString(connection.getInputStream());
            else
                return IO.toString(connection.getErrorStream());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "FAILED";
    }

    /**
     * Fetches a string from the internet.
     *
     * @param uri The url to fetch from.
     * @return The string fetched.
     */
    public static String get(URI uri) {
        try {
            return get(uri.toURL());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "FAILED";
    }

    /**
     * Fetches a string from the internet.
     *
     * @param url The url to fetch from.
     * @return The string fetched.
     */
    public static String get(String url) {
        try {
            return get(new URL(url));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "FAILED";
    }

    /**
     * Posts data to an API. (commonly a REST API.)
     *
     * @param url The URL to post to.
     * @param data The data to post to the given URL.
     * @param headers The headers used when posting.
     * @return The response from the server used by the URL.
     */
    public static String post(URL url, Object data, HttpHeader... headers) {
        try {
            HttpURLConnection connection = createConnection(url, "POST", headers);

            connection.setDoInput(true);
            connection.setDoOutput(true);

            String dataStr = Objects.stringify(data);
            System.out.println(dataStr);
            byte[] out = dataStr.getBytes(StandardCharsets.UTF_8);
            connection.setFixedLengthStreamingMode(out.length);

            connection.connect();

            try (OutputStream output = connection.getOutputStream()) {
                output.write(out);
            }

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK)
                return IO.toString(connection.getInputStream());
            else
                return IO.toString(connection.getErrorStream());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "FAILED";
    }

    /**
     * Posts data to an API. (commonly a REST API.)
     *
     * @param uri The URI to post to.
     * @param data The data to post to the given URL.
     * @param headers The headers used when posting.
     * @return The response from the server used by the URL.
     */
    public static String post(URI uri, Object data, HttpHeader... headers) {
        try {
            return post(uri.toURL(), data, headers);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "FAILED";
    }

    /**
     * Posts data to an API. (commonly a REST API.)
     *
     * @param url The URL to post to.
     * @param data The data to post to the given URL.
     * @param headers The headers used when posting.
     * @return The response from the server used by the URL.
     */
    public static String post(String url, Object data, HttpHeader... headers) {
        try {
            return post(new URL(url), data, headers);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "FAILED";
    }

    private static HttpURLConnection createConnection(URL url, String method, HttpHeader... headers) throws Exception {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(method);
        connection.setUseCaches(false);
        connection.setConnectTimeout(10_000);

        for (HttpHeader header : headers) {
            connection.addRequestProperty(header.key, header.value);
        }

        return connection;
    }

    public static class HttpHeader {
        public final String key;
        public final String value;

        public HttpHeader(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

}