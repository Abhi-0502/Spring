package com.text.gogglesheet;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")

public class CellController {

    @PostMapping("/updateCell")
        public String updateCell(@RequestBody CellUpdateRequest request) {
            System.out.println("Cell updated: " + request);
            return "Cell updated successfully";
        }
    }

    class CellUpdateRequest {
        public int rowIndex;
        public String column;
        public String value;
    }


