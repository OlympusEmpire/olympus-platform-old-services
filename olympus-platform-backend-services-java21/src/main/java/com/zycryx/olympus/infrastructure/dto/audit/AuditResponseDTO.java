package com.zycryx.olympus.infrastructure.dto.audit;

import lombok.*;

import java.util.Date;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AuditResponseDTO {

    private String userId;
    private String auditReason;
    private Date auditDate;

}
