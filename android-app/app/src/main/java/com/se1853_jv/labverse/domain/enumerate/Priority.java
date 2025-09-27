package com.se1853_jv.labverse.domain.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Priority {
    HIGH(0),
    MEDIUM(1),
    LOW(2);

    private final int value;

    public static int toValue(Priority priority) {
        return priority.getValue();
    }
}
