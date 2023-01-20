package com.cision.thanos.controller.impl;

import com.cision.thanos.controller.InfluencerController;
import com.cision.thanos.entities.InfluencerDetail;
import com.cision.thanos.services.InfluencerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/influencer")
@Log4j2
public class InfluencerControllerImpl
    implements InfluencerController {
  private final InfluencerService influencerService;
  @Override
  public ResponseEntity<?> createInfluencer(@Validated InfluencerDetail influencer) {
    log.info("inside create Influencer");
    return ResponseEntity.ok(influencerService.createInfluencer(influencer));
  }

  @Override
  public ResponseEntity<?> getInfluencerById(Long id) {
    return ResponseEntity.ok(influencerService.getInfluencerById(id));
  }

  @Override
  public ResponseEntity<?> updateInfluencer(Long id, InfluencerDetail influencer) {
    Long idDb = influencerService.updateInfluencer(id,influencer);
    if (idDb == null){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return ResponseEntity.ok(idDb);
  }

  @Override
  public ResponseEntity<?> deleteInfluencerById(Long id) {
    influencerService.deleteInfluencer(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<?> getAllInfluencers() {
    return null;
  }
}
