package com.saurabhchallenges.akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saurabhchallenges.akash.entity.User;

@Repository
public interface DAOLayerRepo extends JpaRepository<User, Long> {

}
