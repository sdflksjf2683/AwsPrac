package com.ssafy.awstest.controller;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.awstest.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

@RestController
public class FileController {

	FileService service;
	@GetMapping("/upload")
	public ResponseEntity<Object> upload(MultipartFile[] multipartFileList) throws Exception {
		List<String> imagePathList = service.upload(multipartFileList);
		return new ResponseEntity<Object>(imagePathList, HttpStatus.OK);
	}
}