package in.sp.main.playvideo.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "play_video") // Table name in the database
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    @Column(name = "video_id", nullable = false, updatable = false)
    private Long videoId;

    @Column(name = "title", nullable = false, length = 255) // Video title, cannot be null
    private String title;

    @Column(name = "genre", length = 100) // Genre of the video
    private String genre;

    @Column(name = "quality", length = 50) // Video quality (e.g., 1080p, 4K)
    private String quality;

    @Column(name = "playback_speed", length = 20) // Playback speed (e.g., 1x, 1.5x)
    private String playbackSpeed;
}
