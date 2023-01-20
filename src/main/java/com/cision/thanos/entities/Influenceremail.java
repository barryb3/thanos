package com.cision.thanos.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "influenceremails",schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Transactional
public class Influenceremail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  @NotNull
  @JsonIgnore
  private Long id;

  @ManyToOne
  @JoinColumn(name = "influencer_id", referencedColumnName = "influencer_id")
  @JsonIgnore
  private InfluencerDetail influencerId;

  @Column(name = "email")
  private String email;

  @Column(name = "\"defaultFlag\"")
  private Boolean defaultFlag;

}