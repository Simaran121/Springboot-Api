package in.sp.main.createchannel.controller;
import java.time.LocalDateTime;
import java.util.Optional;

import in.sp.main.createchannel.dto.ChannelRequest;
import in.sp.main.createchannel.dto.ChannelResponse;
import in.sp.main.createchannel.repository.ChannelRepository;
import in.sp.main.createchannel.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/channels")
public class ChannelController {

    @Autowired
    private ChannelService channelService;
    @Autowired
    private ChannelRepository channelRepo;
    @PostMapping("/add")
    public ResponseEntity<ChannelResponse> addChannel(@RequestBody ChannelRequest request) {

        // Example: normally you'd save to DB here
        // Save logic omitted for simplicity

        ChannelResponse response = new ChannelResponse();
        response.setChannelId(request.getChannelId());
        response.setChannelName(request.getChannelName());
        response.setDescription(request.getDescription());
        response.setUrl(request.getUrl());
        response.setProfileImageUrl(request.getProfileImageUrl());
        response.setBackdropImageUrl(request.getBackdropImageUrl());
        response.setLocation(request.getLocation());
        response.setUsername(request.getUsername());
        response.setEmail(request.getEmail());
        response.setUserId(request.getUserId());
        response.setDateOfCreation(LocalDateTime.now());
        response.setDateOfUpdation(LocalDateTime.now());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ChannelResponse> getChannelById(@PathVariable Long id) {
        ChannelResponse response = channelService.getChannel(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ChannelResponse> updateChannel(@PathVariable Long id, @RequestBody ChannelRequest request) {
        return ResponseEntity.ok(channelService.updateChannel(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteChannel(@PathVariable Long id) {
        channelService.deleteChannel(id);
        return ResponseEntity.ok("Channel deleted successfully.");
    }
}
