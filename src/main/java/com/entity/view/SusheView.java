package com.entity.view;

import com.entity.SusheEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 宿舍
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("sushe")
public class SusheView extends SusheEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 楼宇的值
		*/
		private String louyuValue;



	public SusheView() {

	}

	public SusheView(SusheEntity susheEntity) {
		try {
			BeanUtils.copyProperties(this, susheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 楼宇的值
			*/
			public String getLouyuValue() {
				return louyuValue;
			}
			/**
			* 设置： 楼宇的值
			*/
			public void setLouyuValue(String louyuValue) {
				this.louyuValue = louyuValue;
			}










}
