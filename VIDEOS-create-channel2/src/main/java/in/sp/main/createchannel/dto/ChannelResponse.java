package in.sp.main.createchannel.dto;

import java.time.LocalDateTime;

public class ChannelResponse {

    private Long channelId;
    private String channelName;
    private String description;
    private String url;
    private String profileImageUrl;
    private String backdropImageUrl;
    private String location;
    private String username;
    private String email;
    private Long userId;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfUpdation;

    // Setters
    public void setChannelId(Object channelId) {
        if (channelId instanceof Long) {
            this.channelId = (Long) channelId;
        }
    }

    public void setChannelName(Object channelName) {
        if (channelName instanceof String) {
            this.channelName = (String) channelName;
        }
    }

    public void setDescription(Object description) {
        if (description instanceof String) {
            this.description = (String) description;
        }
    }

    public void setUrl(Object url) {
        if (url instanceof String) {
            this.url = (String) url;
        }
    }

    public void setProfileImageUrl(Object profileImageUrl) {
        if (profileImageUrl instanceof String) {
            this.profileImageUrl = (String) profileImageUrl;
        }
    }

    public void setBackdropImageUrl(Object backdropImageUrl) {
        if (backdropImageUrl instanceof String) {
            this.backdropImageUrl = (String) backdropImageUrl;
        }
    }

    public void setLocation(Object location) {
        if (location instanceof String) {
            this.location = (String) location;
        }
    }

    public void setUsername(Object username) {
        if (username instanceof String) {
            this.username = (String) username;
        }
    }

    public void setEmail(Object email) {
        if (email instanceof String) {
            this.email = (String) email;
        }
    }

    public void setUserId(Object userId) {
        if (userId instanceof Long) {
            this.userId = (Long) userId;
        }
    }

    public void setDateOfCreation(Object dateOfCreation) {
        if (dateOfCreation instanceof LocalDateTime) {
            this.dateOfCreation = (LocalDateTime) dateOfCreation;
        }
    }

    public void setDateOfUpdation(Object dateOfUpdation) {
        if (dateOfUpdation instanceof LocalDateTime) {
            this.dateOfUpdation = (LocalDateTime) dateOfUpdation;
        }
    }

    // Optional method (not needed since id is handled by setChannelId)
    public void setId(Object id) {
        setChannelId(id);
    }

    // Getters
    public Long setChannelId() {
        return channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public String getBackdropImageUrl() {
        return backdropImageUrl;
    }

    public String getLocation() {
        return location;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Long getUserId() {
        return userId;
    }
    public Long getChannelId() {
        return channelId;
    }


    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public LocalDateTime getDateOfUpdation() {
        return dateOfUpdation;
    }
}
