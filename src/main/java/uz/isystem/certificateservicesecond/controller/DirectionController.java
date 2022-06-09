package uz.isystem.certificateservicesecond.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.certificateservicesecond.model.Direction;
import uz.isystem.certificateservicesecond.service.DirectionService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/directions")
@AllArgsConstructor
public class DirectionController {
    private DirectionService directionService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Direction direction){
        boolean result = directionService.create(direction);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<Direction> result = directionService.getAll();
        return ResponseEntity.ok(result);
    }
}
