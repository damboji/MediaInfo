package com.ww.dileep.mediaInfo.controller;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ww.dileep.mediaInfo.entity.Media;
import com.ww.dileep.mediaInfo.service.MediaService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/media")
@Slf4j
public class MediaController {
	
	private static final Logger log = null;
	
	@Autowired
	private MediaService mediaService;
	
	@PostMapping("/save")
	public Media saveMedia(@RequestBody Media media) {
		//log.info("Inside saveProduct method in ProductController ");
		return mediaService.saveMedia(media);
	}

	@GetMapping("/{id}")
	public Media findMediaById(@PathVariable("id") int mediaId) {
		//log.info("Inside findProductById  method in ProductController ");
		return mediaService.findMediaById(mediaId);

	}
	
	@GetMapping("/byproduct/{id}")
	public List<Media> findMediaByProductId(@PathVariable("id") int productId) {
		return mediaService.findMediaByProductId(productId);

	}
	
	@GetMapping("/findall")
	public List<Media> findAllMedia() {
		return mediaService.findAllMedia();

	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteMediaId(@PathVariable("id") int mediaId) {
		mediaService.deleteByMediaId(mediaId);
		return "Successfully deleted: " +mediaId;

	}
	
	@PutMapping("/update")
	public Media updateMedia(@RequestBody Media media) {
		return mediaService.updateMedia(media);
	}
}
