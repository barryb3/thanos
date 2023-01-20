package com.cision.thanos.repositories;


import com.cision.thanos.entities.InfluencerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfluencerRepository extends JpaRepository<InfluencerDetail,Long> {
}
