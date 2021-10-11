package com.genil.learnBoot.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

/**
 * Created on Wed, 6/30/21 at 6:44 PM by Genil.
 */
@Data
@ToString
public class In {
  private String isFinal;
  private String time;
}
