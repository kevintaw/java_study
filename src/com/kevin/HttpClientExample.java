package com.kevin;


import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 16-6-17.
 */
public class HttpClientExample {

    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {
        HttpClientExample http = new HttpClientExample();

        System.out.println("Testing 1 - Send Http GET request");
        http.sendGet();

        System.out.println("\nTesting 2 - Send Http POST request");
        http.sendPost();
    }

    // HTTP GET request
    private void sendGet() throws Exception {

        String url = "http://10.111.188.69:8080/getMetaData.do?id=256960145";

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(url);

        //add request header
        request.addHeader("User-Agent", USER_AGENT);
        CloseableHttpResponse response = client.execute(request);

        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());

    }

    // HTTP POST request
    private void sendPost() throws Exception {

        String url = "http://www.tudou.com/plcover/coverPage/getIndexItems.html";

        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("User-Agent", USER_AGENT);

        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("lid", "17212143"));
        urlParameters.add(new BasicNameValuePair("sort", "0"));
        urlParameters.add(new BasicNameValuePair("desc", "false"));
        urlParameters.add(new BasicNameValuePair("isCache", "true"));
        urlParameters.add(new BasicNameValuePair("page", "1"));
        urlParameters.add(new BasicNameValuePair("pageSize", "20"));

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        CloseableHttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader((new InputStreamReader(response.getEntity().getContent())));
        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());


    }
}
