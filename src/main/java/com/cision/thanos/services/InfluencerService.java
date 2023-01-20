package com.cision.thanos.services;

import com.cision.thanos.entities.InfluencerDetail;
import java.util.List;

public interface InfluencerService {
  Long createInfluencer(InfluencerDetail influencer);
  void  deleteInfluencer(Long id);
  InfluencerDetail getInfluencerById(Long id);
  Long updateInfluencer(Long id,InfluencerDetail influencer);
  List<InfluencerDetail> findAll();
}
