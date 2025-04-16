package in.sp.main.playvideo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoPlaybackRequestDto {
    private Long videoId;
    private String playbackSpeed;
    private String quality;
}
