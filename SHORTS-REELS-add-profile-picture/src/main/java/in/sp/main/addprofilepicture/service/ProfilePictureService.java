package in.sp.main.addprofilepicture.service;

import in.sp.main.addprofilepicture.model.ProfilePictureRequest;
import in.sp.main.addprofilepicture.model.ProfilePictureResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ProfilePictureService {
    private final WebClient webClient;

    public ProfilePictureService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://127.0.0.1:5000").build(); // Replace with actual AI/ML API URL
    }

    public ProfilePictureResponse fetchAIMLRecommendation(ProfilePictureRequest request) {
        return webClient.post()
            .uri("/recommendProfileCompletion") // Replace with actual AIML API endpoint
            .bodyValue(request)
            .retrieve()
            .bodyToMono(ProfilePictureResponse.class)
            .block(); // Blocking call since you're using synchronous service
    }
}
