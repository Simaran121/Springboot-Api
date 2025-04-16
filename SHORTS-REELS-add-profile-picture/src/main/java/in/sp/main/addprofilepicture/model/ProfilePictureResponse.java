package in.sp.main.addprofilepicture.model;

import java.util.List;
import java.util.Map;

public class ProfilePictureResponse {
    private String message;
    private List<Map<String, Object>> similarUsersEngagement;

    // Getters & Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Map<String, Object>> getSimilarUsersEngagement() {
        return similarUsersEngagement;
    }

    public void setSimilarUsersEngagement(List<Map<String, Object>> similarUsersEngagement) {
        this.similarUsersEngagement = similarUsersEngagement;
    }
}
