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
    influencer.setCreatedDate(Instant.now());
    InfluencerDetail influencerDb = influencerRepository.saveAndFlush(influencer);
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
      influencerRepository.saveAndFlush(influencer);
    }
    return null;
  }

  @Override
  public List<InfluencerDetail> findAll() {
    return null;
  }
}
