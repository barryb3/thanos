package com.cision.thanos.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "influencerdetails",schema = "public")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Transactional
public class InfluencerDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "influencer_id")
  private Long influencerId;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "middle_name")
  private String middleName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "salutation")
  private String salutation;

  @Column(name = "suffix")
  private String suffix;

  @Column(name = "gender")
  private String gender;

  @Column(name = "location")
  private String location;

  @Column(name = "status")
  private String status;

  @Column(name = "opted_type")
  private String optedType;

  @Column(name = "biography")
  private String biography;

  @Column(name = "profile")
  private String profile;

  @Column(name = "verified_date")
  private Instant verifiedDate;

  @Column(name = "verified_by")
  private String verifiedBy;

  @Column(name = "created_date")
  private Instant createdDate;

  @Column(name = "rds_influencer_id")
  private String rdsInfluencerId;

  @Column(name = "mojo_influencer_id")
  private String mojoInfluencerId;
  @OneToMany(mappedBy = "influencerId",
      cascade = CascadeType.ALL,orphanRemoval = true,
      targetEntity = Influenceraddress.class)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Set<Influenceraddress> addresses;
  @OneToMany(mappedBy = "influencerId",
      cascade = CascadeType.ALL,orphanRemoval = true,
      targetEntity = Influencerbusinesscard.class)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Set<Influencerbusinesscard> businessCards;
  @OneToMany(mappedBy = "influencerId",
      cascade = CascadeType.ALL,
      orphanRemoval = true,targetEntity = Influenceremail.class)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Set<Influenceremail> emails;
  @OneToMany(mappedBy = "influencerId",
      cascade = CascadeType.ALL,orphanRemoval = true,
      targetEntity = Influencerfax.class)
  @LazyCollection(LazyCollectionOption.FALSE)
  private List<Influencerfax> faxes ;

  @OneToMany(fetch = FetchType.EAGER,mappedBy = "influencerId",
      cascade = CascadeType.ALL,orphanRemoval =
      true,targetEntity = Influencerhomepage.class)
  @Fetch(FetchMode.SUBSELECT)
  private List<Influencerhomepage> homepages;
  @OneToMany(mappedBy = "influencerId",
      cascade = CascadeType.ALL,orphanRemoval = true)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Set<Influencerjobrole> jobRoles;
  @OneToMany(mappedBy = "influencerId",
      cascade = CascadeType.ALL,orphanRemoval = true)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Set<Influencerlanguage> languages;
  @OneToMany(mappedBy = "influencerId"
      ,cascade = CascadeType.ALL, orphanRemoval = true)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Set<Influenceroutletid> outletIds;
  @OneToMany(mappedBy = "influencerId",
      cascade = CascadeType.ALL,orphanRemoval = true)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Set<Influencerphone> influencerPhones;
  @OneToMany(mappedBy = "influencerId",
      cascade = CascadeType.ALL,orphanRemoval = true)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Set<Influencersocial> influencerSocials;
  @OneToMany(mappedBy = "influencerId",
      cascade = CascadeType.ALL,orphanRemoval = true)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Set<InfluencerTopic> influencerTopics;
  @OneToMany(mappedBy = "influencerId",
      cascade = CascadeType.ALL,orphanRemoval = true)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Set<InfluencerInternalID> internalIDS;

}