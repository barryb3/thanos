package com.cision.thanos.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** Represents an table influencertargetareas.
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "influencertargetareas")
public class Influencertargetarea {
  @Id
  @Size(max = 255)
  @Column(name = "influencer_id")
  private String influencerId;

  @Size(max = 255)
  @Column(name = "targetarea")
  private String targetarea;

  @Size(max = 255)
  @Column(name = "targetareaid")
  private String targetareaid;

  @Column(name = "create_date")
  private LocalDate createDate;

  @Column(name = "last_update_date")
  private LocalDate lastUpdateDate;

}