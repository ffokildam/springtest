package com.example.demo.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String Title,
        LocalDateTime startTime,
        LocalDateTime endTime,
        Integer distance,
        Location location
) {
}
