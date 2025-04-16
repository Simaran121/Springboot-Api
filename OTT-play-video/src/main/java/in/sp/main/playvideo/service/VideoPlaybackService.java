package in.sp.main.playvideo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@Service
public class VideoPlaybackService {

    private final RestTemplate restTemplate;

    public VideoPlaybackService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static final String AIML_API_URL = "http://localhost:5000/suggestVideos"; // Your AIML API

    public ResponseEntity<String> updatePlaybackSpeed(int videoId, Map<String, Object> request) {
        return restTemplate.postForEntity(AIML_API_URL, request, String.class);
    }

    public ResponseEntity<String> backwardForward(int videoId, Map<String, Object> request) {
        return restTemplate.postForEntity(AIML_API_URL, request, String.class);
    }

    public ResponseEntity<String> castVideo(int videoId, Map<String, Object> request) {
        return restTemplate.postForEntity(AIML_API_URL, request, String.class);
    }

    public ResponseEntity<String> updateVideoQuality(int videoId, Map<String, Object> request) {
        return restTemplate.postForEntity(AIML_API_URL, request, String.class);
    }
}
