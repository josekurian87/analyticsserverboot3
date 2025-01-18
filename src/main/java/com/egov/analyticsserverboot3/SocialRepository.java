package com.egov.analyticsserverboot3;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialRepository extends JpaRepository<Social, String> {
}