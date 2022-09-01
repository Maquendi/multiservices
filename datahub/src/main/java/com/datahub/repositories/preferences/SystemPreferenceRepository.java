package com.datahub.repositories.preferences;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datahub.entities.preferences.SystemPreference;

@Repository
public interface SystemPreferenceRepository extends JpaRepository<SystemPreference, String> {
  Optional<SystemPreference> findByPreferenceName(String name);
}
