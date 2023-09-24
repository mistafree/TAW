package com.example.demos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.Value;

@JsonSerialize
@Data
public class Activity {
    @JsonProperty("name")
    private String name;
    @JsonProperty("ECTS")
    private Integer ECTS;
    @JsonProperty("sala")
    private Integer sala;
    @JsonProperty("exam")
    private Boolean exam;
    @JsonProperty("id")
    private Integer id;


}
