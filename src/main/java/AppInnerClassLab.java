import com.fasterxml.jackson.core.JsonProcessingException;
import okhttp3.*;

import java.io.IOException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppInnerClassLab {

    public static void main(String[] args) {
        ObjectMapper jsonConverter = new ObjectMapper();
        jsonConverter.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        JiraClient client = new JiraClient();
        String requestBody = client.getIssue();

        try {
            Issue myIssue = jsonConverter.readValue(requestBody,Issue.class);
            System.out.println(myIssue.getFields().getPriority().getName());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

}



class Issue{

    private Fields fields;

    public Issue() {
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    class Fields {
        private String summary;
        private String description;

        private Priority priority;

        public Priority getPriority() {
            return priority;
        }

        public void setPriority(Priority priority) {
            this.priority = priority;
        }

        public Fields() {
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        class Priority{
            private String name;

            public Priority() {
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

    }
}


class JiraClient{
    public String getIssue(){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");

        Request request = new Request.Builder()
                .url("value removed")
                .addHeader("Authorization", "Bearer value removed")
                .addHeader("Cookie", "AWSALBAPP-0=AAAAAAAAAABzUBDCTE8BAh3Mubcqr7njs+VAa2NMTRm0KCDeOQgZ31aNoA7hmkXBl2l7JT6A/XfSjKGyLaRk1BAxP1tiyFys/CTkTSozBp7eSHNWcF+3huRg1iL31VYdraFQsmtirgtoQeI=; AWSALBAPP-1=_remove_; AWSALBAPP-2=_remove_; AWSALBAPP-3=_remove_; JSESSIONID=69E3B0C86A0AFD53702057198F09103F; atlassian.xsrf.token=B5AE-D7H4-RN6X-P2E3_9ab0838fc73d8150fe5de018c75459131bf6e2e6_lin")
                .build();
        try {
            return client.newCall(request).execute().body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
