package in.sp.main.playvideo.controller;

import in.sp.main.playvideo.service.VideoPlaybackService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ott/video")
public class VideoPlaybackController {

    private final VideoPlaybackService videoPlaybackService;

    public VideoPlaybackController(VideoPlaybackService videoPlaybackService) {
        this.videoPlaybackService = videoPlaybackService;
    }

    @PutMapping("/{videoId}/playback-speed")
    public ResponseEntity<String> updatePlaybackSpeed(@PathVariable int videoId, @RequestBody Map<String, Object> request) {
        return videoPlaybackService.updatePlaybackSpeed(videoId, request);
    }

    @PostMapping("/{videoId}/backwardforward")
    public ResponseEntity<String> backwardForward(@PathVariable int videoId, @RequestBody Map<String, Object> request) {
        return videoPlaybackService.backwardForward(videoId, request);
    }

    @PostMapping("/{videoId}/cast")
    public ResponseEntity<String> castVideo(@PathVariable int videoId, @RequestBody Map<String, Object> request) {
        return videoPlaybackService.castVideo(videoId, request);
    }

    @PutMapping("/{videoId}/quality")
    public ResponseEntity<String> updateVideoQuality(@PathVariable int videoId, @RequestBody Map<String, Object> request) {
        return videoPlaybackService.updateVideoQuality(videoId, request);
    }
}
