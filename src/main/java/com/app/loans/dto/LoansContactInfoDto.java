package com.app.loans.dto;

import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("loans")
@Getter
@Setter
public class LoansContactInfoDto {

  private String message;
  private Map<String, String> contactDetails;
  private List<String> onCallSupport;
}
