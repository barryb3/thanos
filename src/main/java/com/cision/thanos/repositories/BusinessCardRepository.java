package com.cision.thanos.repositories;

import com.cision.thanos.entities.Influencerbusinesscard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessCardRepository extends CrudRepository<Influencerbusinesscard,Long> {
}
