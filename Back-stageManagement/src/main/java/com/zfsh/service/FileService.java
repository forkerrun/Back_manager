package com.zfsh.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.zfsh.model.FileInfo;

public interface FileService {

	FileInfo save(MultipartFile file) throws IOException;

	void delete(String id);

}
