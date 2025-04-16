package in.sp.main.addprofilepicture.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRecommendationDTO {
    private int userId;
    private String interests;
    private int engagementScore;
}
