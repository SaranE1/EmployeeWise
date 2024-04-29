package com.mongo.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Guide {
    private String API_TO_ADD_DATA;
    private String API_TO_UPDATE_DATA;
    private String API_TO_DELETE_DATA;
    private String API_TO_SHOW_DATA;
}
