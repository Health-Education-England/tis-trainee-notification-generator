package uk.nhs.hee.tis.notification.dto;

import lombok.Data;

/**
 * A DTO for Redis Record.
 */
@Data
public class RedisRecordDto {

  private String tisId;
  private String timestamp;
  private String email;
  private String originalJson;
  private String currentJson;
}
