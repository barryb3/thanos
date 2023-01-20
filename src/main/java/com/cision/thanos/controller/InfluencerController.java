package com.cision.thanos.controller;


import com.cision.thanos.entities.InfluencerDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface InfluencerController {

  @PostMapping("/create")
  ResponseEntity<?> createInfluencer(@RequestBody InfluencerDetail influencer);

  @GetMapping("/{id}")
  ResponseEntity<?> getInfluencerById(@PathVariable Long id);

  @PutMapping("/update/{id}")
  ResponseEntity<?> updateInfluencer(@PathVariable Long id, @RequestBody InfluencerDetail influencer);

  @DeleteMapping("/delete/{id}")
  ResponseEntity<?> deleteInfluencerById(@PathVariable Long id);
  @GetMapping
  ResponseEntity<?> getAllInfluencers();

}
