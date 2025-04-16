package in.sp.main.playvideo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoPlaybackResponseDto {
    private String message;
    private String playbackSpeed;
    private String quality;
}
