package testData;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import commons.GlobalConstants;

import java.io.File;
import java.util.List;

public class UserDataMapper {

    public static UserDataMapper getUserData(){
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(new File(GlobalConstants.getGlobalInstance().getProjectPath() + "resources/UserData.json"), UserDataMapper.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    @JsonProperty("date")
    private List<Date> date;

    public List<Date> getDate() {
        return date;
    }

    public static class Date {
        @JsonProperty("startDate")
        private String startDate;

        @JsonProperty("endDate")
        private String endDate;

        public String getStartDate() {
            return startDate;
        }
        public String getEndDate() {
            return endDate;
        }
    }
}
