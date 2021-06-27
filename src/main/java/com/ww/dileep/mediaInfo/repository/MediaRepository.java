package com.ww.dileep.mediaInfo.repository;

import org.springframework.stereotype.Repository;

import com.ww.dileep.mediaInfo.entity.Media;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.*;

@Repository
public interface MediaRepository extends JpaRepository<Media, Integer> {

	Media findByMediaId(int mediaId);

	List<Media> findMediaByProductId(int productId);
	

}
