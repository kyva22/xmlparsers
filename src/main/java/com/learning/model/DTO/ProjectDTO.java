package com.learning.model.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectDTO {

    @JsonProperty("projectName")
    private String projectName;

    @JsonProperty("bassProjectKey")
    private String bassProjectKey;

    @JsonProperty("targetProjectKey")
    private String targetProjectKey;

    @JsonProperty("scripts")
    private List<String> scripts;



}
