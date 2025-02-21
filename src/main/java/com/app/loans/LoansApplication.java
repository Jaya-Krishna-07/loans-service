package com.app.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.app.loans.dto.LoansContactInfoDto;

@SpringBootApplication
@EnableConfigurationProperties(value = { LoansContactInfoDto.class })
public class LoansApplication {

  public static void main(String[] args) {
    SpringApplication.run(LoansApplication.class, args);
  }
}
