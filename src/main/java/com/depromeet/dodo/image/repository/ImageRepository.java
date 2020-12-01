package com.depromeet.dodo.image.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.depromeet.dodo.image.domain.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
