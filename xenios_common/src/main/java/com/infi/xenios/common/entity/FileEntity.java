package com.infi.xenios.common.entity;

import java.util.Date;

import lombok.Data;

@Data
public class FileEntity {
	public String fileName;
	public String createdBy;
	public String lastModifiedBy;
	public Date createdTimestamp;
	public Date lastModTimestamp;
	public Long fileSize;

}
