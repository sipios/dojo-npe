package com.sipios.keiko.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Civility {
    MONSIEUR("M"),
    MADAME("F");

    @Getter
    private String key;

    public static Civility findByKey(String key) {
        for(Civility civility : Civility.values()) {
            if(key.equals(civility.getKey())) {
                return civility;
            }
        }
        return null;
    }
}
