import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HTTPClient {

    public static void main(String[] args) throws IOException {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {

            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                @Override
                public String handleResponse(final HttpResponse response) throws IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }
            };

            HttpGet httpget = new HttpGet("http://google.ru");
            HttpPost httppost = new HttpPost("http://httpbin.org/post");
            System.out.println();
            CloseableHttpResponse response = httpclient.execute(httpget);
            CloseableHttpResponse response1 = httpclient.execute(httppost);
            try {

                System.out.println();

                System.out.println("GET Response:");
                // GET Request Line
                System.out.println("Executing request " + httpget.getRequestLine());

                System.out.println("----------------------------------------");
                System.out.println(response.getStatusLine());
                // GET Response headers
                for (Header header : response.getAllHeaders()) {
                    System.out.println(header.toString());
                }
                // GET Response body
                System.out.println("----------------------------------------");
                System.out.println(httpclient.execute(httpget, responseHandler));
                System.out.println();

                System.out.println();
                // POST response headers
                System.out.println("POST Response:");

                // POST Request Line
                System.out.println("Executing request " + httppost.getRequestLine());
                System.out.println("----------------------------------------");
                System.out.println(response1.getStatusLine());

                for (Header header : response1.getAllHeaders()) {
                    System.out.println(header.toString());
                }
                // POST Response body
                System.out.println("----------------------------------------");
                System.out.println(httpclient.execute(httppost, responseHandler));
                System.out.println();

                System.out.println();
            } finally {
                response.close();
            }

        } finally {
            httpclient.close();
        }
    }
}
