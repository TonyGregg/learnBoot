package com.genil.learnBoot.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

/**
 * Created on Wed, 6/30/21 at 6:43 PM by Genil.
 */
@Data
@ToString
public class Out {
  @JsonProperty(value = "final" )
  private String isFinal;
  private String time;

}
