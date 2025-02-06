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

        MessageFetcher messageFetcher = new MessageFetcher(locale);

        String message = messageFetcher.getMessage().join();

        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
