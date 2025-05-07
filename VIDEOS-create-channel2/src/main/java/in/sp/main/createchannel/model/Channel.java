package in.sp.main.createchannel.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity

@Table(name = "channels")
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long channelId;
    private Long id;
    private String username;
    private String email;
    private String channelName;
    private String description;
    private String url;
    private String profileImageUrl;
    private String backdropImageUrl;
    private String location;

    private Long userId;

    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfUpdation;
	public void setUsername(Object username2) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
	public void setChannelName(Object channelName2) {
		// TODO Auto-generated method stub
		
	}
	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		
	}
	public void setUrl(Object url2) {
		// TODO Auto-generated method stub
		
	}
	public void setProfileImageUrl(Object profileImageUrl2) {
		// TODO Auto-generated method stub
		
	}
	public void setBackdropImageUrl(Object backdropImageUrl2) {
		// TODO Auto-generated method stub
		
	}
	public void setLocation(Object location2) {
		// TODO Auto-generated method stub
		
	}
	public void setUserId(Object userId2) {
		// TODO Auto-generated method stub
		
	}
	public void setDateOfCreation(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}
	public void setDateOfUpdation(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}
	@Column(name="channel_id",nullable = false)
	public Object getChannelId() {
		// TODO Auto-generated method stub
		return channelId;
	}
	@Column(name="channel_name",nullable = false)
	public Object getChannelName() {
		// TODO Auto-generated method stub
		return channelName;
	}
	public Object getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	public Object getUrl() {
		// TODO Auto-generated method stub
		return url;
	}
	public Object getProfileImageUrl() {
		// TODO Auto-generated method stub
		return profileImageUrl;
	}
	public Object getBackdropImageUrl() {
		// TODO Auto-generated method stub
		return backdropImageUrl;
	}
	public Object getLocation() {
		// TODO Auto-generated method stub
		return location;
	}
	public Object getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}
	public Object getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public Object getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	public Object getDateOfCreation() {
		// TODO Auto-generated method stub
		return dateOfCreation;
	}
	public Object getDateOfUpdation() {
		// TODO Auto-generated method stub
		return dateOfUpdation;
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and Setters
}
