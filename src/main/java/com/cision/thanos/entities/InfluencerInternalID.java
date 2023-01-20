package com.cision.thanos.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "influencer_internal_id",schema = "public")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Transactional
public class InfluencerInternalID {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "influencer_id", referencedColumnName = "influencer_id",nullable = false)
  @JsonIgnore
  private InfluencerDetail influencerId;
  private String internalIdType;
  private String internalId;

}
