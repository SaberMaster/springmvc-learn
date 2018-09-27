package com.i2bgod.test.web.model;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class DataBinderTestModel {

	private String username;
	private boolean bool;//Boolean值测试
	private SchoolInfoModel schooInfo;
	private List hobbyList;//集合测试，此处可以改为数组/Set进行测试
	private Map map;//Map测试
	private PhoneNumberModel phoneNumber;//String->自定义对象的转换测试
	private Date date;//日期类型测试
	private UserState state;//String——>Enum类型转换测试
}
