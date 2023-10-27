package com.olympus.platform.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RepresenterGetResponseDTO {

  private Long representerId;
  private String representerName;
  private String representerRole;
  private String representerDesc;
  private byte[] representerImage;
}
