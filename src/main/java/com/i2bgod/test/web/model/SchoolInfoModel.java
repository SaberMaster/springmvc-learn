package com.i2bgod.test.web.model;

import lombok.Data;

@Data
public class SchoolInfoModel {

	//学校类型：高中、中专、大学
	private String schoolType;
	//学校名称
	private String schoolName;
	//专业
	private String specialty;

}
