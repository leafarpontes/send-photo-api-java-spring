package pontes.rafa.photoapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pontes.rafa.photoapi.models.Photo;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PhotoController {

    @PostMapping("/foto")
    public ResponseEntity<Photo> sendPhoto(@RequestBody Photo photo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(photo);
    }
}
