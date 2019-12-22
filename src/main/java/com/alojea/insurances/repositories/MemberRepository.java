package com.alojea.insurances.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.alojea.insurances.models.Member;


public interface MemberRepository extends CrudRepository<Member, String> {
    
	@Override
    Optional<Member> findById(String id);
    
    @Override
    void delete(Member deleted);
}