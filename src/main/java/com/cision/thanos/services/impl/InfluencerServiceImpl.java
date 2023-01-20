package com.cision.thanos.services.impl;

import com.cision.thanos.entities.InfluencerDetail;
import com.cision.thanos.repositories.AddressRepository;
import com.cision.thanos.repositories.InfluencerRepository;
import com.cision.thanos.services.InfluencerService;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import javax.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class InfluencerServiceImpl implements InfluencerService {
  private final InfluencerRepository influencerRepository;
  private final AddressRepository addressRepository;

  @Override
  public Long createInfluencer(@NotNull InfluencerDetail influencer) {
    InfluencerDetail influencerDb = influencerRepository.saveAndFlush(getUpdatedInfluencer(influencer));
    return influencerDb.getInfluencerId();
  }

  @Override
  public void deleteInfluencer(Long id) {
     influencerRepository.deleteById(id);
  }

  @Override
  public InfluencerDetail getInfluencerById(Long id) {
    return influencerRepository.findById(id).orElse(null);
  }

  @Override
  public Long updateInfluencer(Long id,InfluencerDetail influencer) {
    Optional<InfluencerDetail> influencer1 = influencerRepository.findById(id);
    if (influencer1.isPresent()){
      influencer.setInfluencerId(influencer1.get().getInfluencerId());
      return influencerRepository.saveAndFlush(getUpdatedInfluencer(influencer)).getInfluencerId();
    }
    return null;
  }

  @Override
  public List<InfluencerDetail> findAll() {
    return null;
  }

  private static InfluencerDetail getUpdatedInfluencer(InfluencerDetail influencer){
    influencer.setCreatedDate(Instant.now());
    influencer.getAddresses().forEach(influenceraddress -> {
      influenceraddress.setInfluencerId(influencer);
    });
    influencer.getInfluencerPhones()
        .forEach(influencerphone -> {
          influencerphone.setInfluencerId(influencer);
        });
    influencer.getInfluencerTopics().forEach(influencerTopic -> {
      influencerTopic.setInfluencerId(influencer);
    });

    influencer.getInfluencerSocials().forEach(influencersocial -> {
      influencersocial.setInfluencerId(influencer);
    });

    influencer.getBusinessCards().forEach(influencerbusinesscard -> {
      influencerbusinesscard.setInfluencerId(influencer);
    });

    influencer.getEmails().forEach(influenceremail -> {
      influenceremail.setInfluencerId(influencer);
    });

    influencer.getHomepages().forEach(influencerhomepage -> {
      influencerhomepage.setInfluencerId(influencer);
    });
    influencer.getFaxes().forEach(influencerfax -> {
      influencerfax.setInfluencerId(influencer);
    });

    influencer.getLanguages().forEach(influencerlanguage -> {
      influencerlanguage.setInfluencerId(influencer);
    });

    influencer.getInternalIDS().forEach(influencerInternalID -> {
      influencerInternalID.setInfluencerId(influencer);
    });

    return influencer;
  }
}
