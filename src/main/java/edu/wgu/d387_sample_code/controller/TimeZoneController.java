package edu.wgu.d387_sample_code.controller;

import edu.wgu.d387_sample_code.timezones.TimeZoneConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TimeZoneController {

    @GetMapping("/presentation")
    public ResponseEntity<String> getPresentationTime(){
        String timeZones = "Join us for an online presentation held at: " + TimeZoneConverter.convertTimeZones();
        return new ResponseEntity<>(timeZones, HttpStatus.OK);
    }
}
