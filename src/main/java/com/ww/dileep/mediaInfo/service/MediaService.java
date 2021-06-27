package com.ww.dileep.mediaInfo.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.dileep.mediaInfo.entity.Media;
import com.ww.dileep.mediaInfo.repository.MediaRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MediaService {

	private static final Logger log = null;

	@Autowired
	private MediaRepository mediaRepo;

	public Media saveMedia(Media media) {
		return mediaRepo.save(media);
	}

	public Media findMediaById(int mediaId) {
		// TODO Auto-generated method stub
		return mediaRepo.findByMediaId(mediaId);
	}	
	
	public List<Media> findAllMedia() {
		// TODO Auto-generated method stub
		return mediaRepo.findAll();
	}
	
	public boolean deleteByMediaId(int mediaId) {
		// TODO Auto-generated method stub
		mediaRepo.deleteById(mediaId);
		return true;
	}

	public Media updateMedia(Media media) {
		// TODO Auto-generated method stub
		return mediaRepo.save(media);
	}

	public List<Media> findMediaByProductId(int productId) {
		// TODO Auto-generated method stub
		return mediaRepo.findMediaByProductId(productId);
	}
}
