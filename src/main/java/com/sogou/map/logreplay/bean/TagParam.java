package com.sogou.map.logreplay.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.sogou.map.logreplay.bean.base.AbstractBean;

/**
 * ������������Ĺ���
 * һ��������(TagInfo)�ɹ������������Ϣ(ParamInfo)
 */
@Table(name = "tag_param")
public class TagParam extends AbstractBean {

	@Id
	@Column
	private Long id;
	
	/** ������id **/
	@Column(name = "tag_info_id")
	private Long tagInfoId;
	
	/** �����Ĳ�����Ϣ�б� **/
	@Transient
	private List<ParamInfo> paramInfoList = new ArrayList<ParamInfo>();
	
	/** ��ص�ע�� **/
	@Column
	private String comment;
	
	public TagParam() {}
	
	public TagParam(Long tagInfoId, String comment) {
		this.tagInfoId = tagInfoId;
		this.comment = comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTagInfoId() {
		return tagInfoId;
	}

	public void setTagInfoId(Long tagInfoId) {
		this.tagInfoId = tagInfoId;
	}
	
	public List<ParamInfo> getParamInfoList() {
		return paramInfoList;
	}

	public void setParamInfoList(List<ParamInfo> paramInfoList) {
		this.paramInfoList = paramInfoList;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public void addParamInfo(ParamInfo info) {
		paramInfoList.add(info);
	}
	
}