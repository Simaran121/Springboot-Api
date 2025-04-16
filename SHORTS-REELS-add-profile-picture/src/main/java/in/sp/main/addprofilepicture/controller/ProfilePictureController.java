package in.sp.main.addprofilepicture.controller;

import in.sp.main.addprofilepicture.model.ProfilePictureRequest;
import in.sp.main.addprofilepicture.model.ProfilePictureResponse;
import in.sp.main.addprofilepicture.service.ProfilePictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shorts/channel")
public class ProfilePictureController {

    @Autowired
    private ProfilePictureService profilePictureService;

    @PostMapping("/profile-picture")
    public ProfilePictureResponse addProfilePicture(@RequestBody ProfilePictureRequest request) {
        return profilePictureService.fetchAIMLRecommendation(request);
    }
}
