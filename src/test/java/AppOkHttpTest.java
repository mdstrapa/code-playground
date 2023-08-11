import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class AppOkHttpTest {

    OkHttpClient client = new OkHttpClient.Builder().build();

    @Test
    public void shouldReturnCorrectStatusCode() throws IOException {
        Request request = new Request.Builder()
                .url("https://jira-sw-connector.sicredi.in/api/system/status")
                .build();

        Response response = client.newCall(request).execute();
        assertEquals(200,response.code());
    }

}
