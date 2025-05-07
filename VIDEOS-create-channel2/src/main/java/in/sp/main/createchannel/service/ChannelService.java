package in.sp.main.createchannel.service;

import in.sp.main.createchannel.dto.ChannelRequest;
import in.sp.main.createchannel.dto.ChannelResponse;
import in.sp.main.createchannel.model.Channel;
import in.sp.main.createchannel.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ChannelService {

    @Autowired
    private ChannelRepository channelRepository;

    public ChannelResponse createChannel(ChannelRequest request) {
        Channel channel = new Channel();
        channel.setUsername(request.getUsername());
        channel.setEmail(request.getEmail());
        channel.setChannelName(request.getChannelName());
        channel.setDescription(request.getDescription());
        channel.setUrl(request.getUrl());
        channel.setProfileImageUrl(request.getProfileImageUrl());
        channel.setBackdropImageUrl(request.getBackdropImageUrl());
        channel.setLocation(request.getLocation());
        channel.setUserId(request.getUserId());
        channel.setDateOfCreation(LocalDateTime.now());
        channel.setDateOfUpdation(LocalDateTime.now());

        Channel saved = channelRepository.save(channel);
        return mapToResponse(saved);
    }

  

    public ChannelResponse updateChannel(Long id, ChannelRequest request) {
        Channel channel = channelRepository.findById(id).orElseThrow(() -> new RuntimeException("Channel not found"));
        channel.setUsername(request.getUsername());
        channel.setEmail(request.getEmail());
        channel.setChannelName(request.getChannelName());
        channel.setDescription(request.getDescription());
        channel.setUrl(request.getUrl());
        channel.setProfileImageUrl(request.getProfileImageUrl());
        channel.setBackdropImageUrl(request.getBackdropImageUrl());
        channel.setLocation(request.getLocation());
        channel.setUserId(request.getUserId());
        channel.setDateOfUpdation(LocalDateTime.now());

        Channel updated = channelRepository.save(channel);
        return mapToResponse(updated);
    }

    public void deleteChannel(Long id) {
        channelRepository.deleteById(id);
    }

    private ChannelResponse mapToResponse(Channel channel) {
        ChannelResponse response = new ChannelResponse();
        response.setChannelId(channel.getChannelId());
        response.setChannelName(channel.getChannelName());
        response.setDescription(channel.getDescription());
        response.setUrl(channel.getUrl());
        response.setProfileImageUrl(channel.getProfileImageUrl());
        response.setBackdropImageUrl(channel.getBackdropImageUrl());
        response.setLocation(channel.getLocation());
        response.setUsername(channel.getUsername());
        response.setEmail(channel.getEmail());
        response.setUserId(channel.getUserId());
        response.setDateOfCreation(channel.getDateOfCreation());
        response.setDateOfUpdation(channel.getDateOfUpdation());
        return response;
    }
    public ChannelResponse saveChannel(ChannelRequest request) {
        // Convert DTO to Entity
        Channel channel = new Channel();
        channel.setChannelName(request.getChannelName());
        channel.setEmail(request.getEmail());
        // ... set other fields

        // Save entity
        Channel savedChannel = channelRepository.save(channel);

        // Convert Entity to Response DTO
        ChannelResponse response = new ChannelResponse();
        response.setId(savedChannel.getId());
        response.setChannelName(savedChannel.getChannelName());
        // ... set other fields

        return response;
    }
    public ChannelResponse getChannel(Long channelId) {
        Channel channel = channelRepository.findById(channelId)
                .orElseThrow(() -> new RuntimeException("Channel not found"));
        return mapToResponse(channel);
    }
}
