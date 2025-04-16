package in.sp.main.addprofilepicture.model;

import jakarta.persistence.Table;
@Table(name="add_profile")
public class ProfilePictureRequest {
    private int profilePicAdded;
    private int engagementScore;

    // Constructors
    public ProfilePictureRequest() {}

    public ProfilePictureRequest(int profilePicAdded, int engagementScore) {
        this.profilePicAdded = profilePicAdded;
        this.engagementScore = engagementScore;
    }

    // Getters & Setters
    public int getProfilePicAdded() {
        return profilePicAdded;
    }

    public void setProfilePicAdded(int profilePicAdded) {
        this.profilePicAdded = profilePicAdded;
    }

    public int getEngagementScore() {
        return engagementScore;
    }

    public void setEngagementScore(int engagementScore) {
        this.engagementScore = engagementScore;
    }
}
