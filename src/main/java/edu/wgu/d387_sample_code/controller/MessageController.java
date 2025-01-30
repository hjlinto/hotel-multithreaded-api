package edu.wgu.d387_sample_code.controller;

import edu.wgu.d387_sample_code.localization.MessageFetcher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MessageController {

    @GetMapping("/welcome")
    public ResponseEntity<String> getMessage(@RequestParam("lang") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        MessageFetcher message = new MessageFetcher(locale);

        return new ResponseEntity<String> (message.getMessage(), HttpStatus.OK);
    }
}
