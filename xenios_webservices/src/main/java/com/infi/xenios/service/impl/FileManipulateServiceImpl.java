package com.infi.xenios.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import com.infi.xenios.common.entity.FileEntity;
import com.infi.xenios.config.AppProperties;
import com.infi.xenios.service.FileManipulateService;

@Service
public class FileManipulateServiceImpl implements FileManipulateService {

	@Override
	public List<FileEntity> fileDetails() {
		// TODO Auto-generated method stub
		FileUtils fileUtil = new FileUtils();
		String[] fileExt = { "csv" };
		Collection<File> files = fileUtil.listFiles(new File(AppProperties.fileUploadPath), fileExt, false);
		List<FileEntity> fileList = new ArrayList<>();
		FileEntity fileEntity = null;
		for (File file : files) {
			fileEntity = new FileEntity();
			fileEntity.fileName = file.getName();
			fileEntity.fileSize = file.length();
			fileList.add(fileEntity);
		}
		return fileList;
	}

}
