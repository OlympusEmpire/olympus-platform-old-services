package com.olympus.platform.exception.handler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResourceConflictsException extends RuntimeException {

  private static final long serialVersionUID = 2883857331236752874L;
  private String code;
  private HttpStatus status;

  public ResourceConflictsException(String code, HttpStatus status, String message) {
    super(message);
    this.code = code;
    this.status = status;
  }

  public ResourceConflictsException(String message) {
    super(message);
  }
}
