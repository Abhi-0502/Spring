package com.text.gogglesheet.cdp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class CdpChatbotApplication {


    @RequestMapping("/api/chat")
    public static void main(String[] args) {
        SpringApplication.run(CdpChatbotApplication.class, args);
    }

    @GetMapping("/ask")
    public String getAnswer(@RequestParam String question) {
        return processQuestion(question);
    }

    private String processQuestion(String question) {
        question = question.toLowerCase();
        if (question.contains("set up a new source") && question.contains("segment")) {
            return "To set up a new source in Segment, visit: https://segment.com/docs/getting-started/";
        } else if (question.contains("create a user profile") && question.contains("mparticle")) {
            return "To create a user profile in mParticle, refer to: https://docs.mparticle.com/guides/profiles/";
        } else if (question.contains("build an audience segment") && question.contains("lytics")) {
            return "For audience segmentation in Lytics, check: https://docs.lytics.com/audiences/";
        } else if (question.contains("integrate my data") && question.contains("zeotap")) {
            return "To integrate your data with Zeotap, see: https://docs.zeotap.com/home/en-us/integration-guide";
        } else if (question.contains("compare") && (question.contains("segment") || question.contains("lytics"))) {
            return "Segment uses traits and events, while Lytics focuses on behavioral scoring. More info: https://docs.segment.com & https://docs.lytics.com";
        } else {
            return "I'm sorry, I can only answer questions related to Segment, mParticle, Lytics, and Zeotap.";
        }
    }
}
