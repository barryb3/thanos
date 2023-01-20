package com.cision.thanos.repositories;


import com.cision.thanos.entities.InfluencerDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<InfluencerDetail,Long> {
}
