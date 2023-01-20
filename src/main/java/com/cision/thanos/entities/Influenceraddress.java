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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "influenceraddresses",schema = "public")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Transactional
public class Influenceraddress {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;


  @JoinColumn(name = "influencer_id",referencedColumnName = "influencer_id")
  @ManyToOne(fetch = FetchType.LAZY)
  @NotNull
  @JsonIgnore
  private InfluencerDetail influencerId;

  @Column(name = "address_line1")
  private String addressLine1;

  @Column(name = "address_line2")
  private String addressLine2;

  @Column(name = "latitude")
  private String latitude;

  @Column(name = "longitude")
  private String longitude;

  @Column(name = "\"postalCode\"")
  private String postalCode;

  @Column(name = "country")
  private String country;

  @Column(name = "\"ISOCountryCode\"")
  private String iSOCountryCode;

  @Column(name = "\"addressType\"")
  private String addressType;

  @Column(name = "\"defaultFlag\"")
  private Boolean defaultFlag;

  @Column(name = "city")
  private String city;

  @Column(name = "state")
  private String state;

  @Column(name = "county")
  private String county;

  @Column(name = "\"timeZone\"")
  private String timeZone;

  @Column(name = "\"timeZoneUTCOffset\"")
  private String timeZoneUTCOffset;

  @Column(name = "\"timeZoneAbbreviation\"")
  private String timeZoneAbbreviation;

  @Column(name = "\"DMAId\"")
  private String dMAId;

  @Column(name = "\"DMADescription\"")
  private String dMADescription;
}