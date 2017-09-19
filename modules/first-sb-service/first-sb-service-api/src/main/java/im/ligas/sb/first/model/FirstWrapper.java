/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package im.ligas.sb.first.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link First}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see First
 * @generated
 */
@ProviderType
public class FirstWrapper implements First, ModelWrapper<First> {
	public FirstWrapper(First first) {
		_first = first;
	}

	@Override
	public Class<?> getModelClass() {
		return First.class;
	}

	@Override
	public String getModelClassName() {
		return First.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("fooId", getFooId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", getField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long fooId = (Long)attributes.get("fooId");

		if (fooId != null) {
			setFooId(fooId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	/**
	* Returns the field2 of this first.
	*
	* @return the field2 of this first
	*/
	@Override
	public boolean getField2() {
		return _first.getField2();
	}

	@Override
	public boolean isCachedModel() {
		return _first.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _first.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this first is field2.
	*
	* @return <code>true</code> if this first is field2; <code>false</code> otherwise
	*/
	@Override
	public boolean isField2() {
		return _first.isField2();
	}

	@Override
	public boolean isNew() {
		return _first.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _first.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<im.ligas.sb.first.model.First> toCacheModel() {
		return _first.toCacheModel();
	}

	@Override
	public im.ligas.sb.first.model.First toEscapedModel() {
		return new FirstWrapper(_first.toEscapedModel());
	}

	@Override
	public im.ligas.sb.first.model.First toUnescapedModel() {
		return new FirstWrapper(_first.toUnescapedModel());
	}

	@Override
	public int compareTo(im.ligas.sb.first.model.First first) {
		return _first.compareTo(first);
	}

	/**
	* Returns the field3 of this first.
	*
	* @return the field3 of this first
	*/
	@Override
	public int getField3() {
		return _first.getField3();
	}

	@Override
	public int hashCode() {
		return _first.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _first.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FirstWrapper((First)_first.clone());
	}

	/**
	* Returns the field1 of this first.
	*
	* @return the field1 of this first
	*/
	@Override
	public java.lang.String getField1() {
		return _first.getField1();
	}

	/**
	* Returns the field5 of this first.
	*
	* @return the field5 of this first
	*/
	@Override
	public java.lang.String getField5() {
		return _first.getField5();
	}

	/**
	* Returns the user name of this first.
	*
	* @return the user name of this first
	*/
	@Override
	public java.lang.String getUserName() {
		return _first.getUserName();
	}

	/**
	* Returns the user uuid of this first.
	*
	* @return the user uuid of this first
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _first.getUserUuid();
	}

	/**
	* Returns the uuid of this first.
	*
	* @return the uuid of this first
	*/
	@Override
	public java.lang.String getUuid() {
		return _first.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _first.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _first.toXmlString();
	}

	/**
	* Returns the create date of this first.
	*
	* @return the create date of this first
	*/
	@Override
	public Date getCreateDate() {
		return _first.getCreateDate();
	}

	/**
	* Returns the field4 of this first.
	*
	* @return the field4 of this first
	*/
	@Override
	public Date getField4() {
		return _first.getField4();
	}

	/**
	* Returns the modified date of this first.
	*
	* @return the modified date of this first
	*/
	@Override
	public Date getModifiedDate() {
		return _first.getModifiedDate();
	}

	/**
	* Returns the company ID of this first.
	*
	* @return the company ID of this first
	*/
	@Override
	public long getCompanyId() {
		return _first.getCompanyId();
	}

	/**
	* Returns the foo ID of this first.
	*
	* @return the foo ID of this first
	*/
	@Override
	public long getFooId() {
		return _first.getFooId();
	}

	/**
	* Returns the group ID of this first.
	*
	* @return the group ID of this first
	*/
	@Override
	public long getGroupId() {
		return _first.getGroupId();
	}

	/**
	* Returns the primary key of this first.
	*
	* @return the primary key of this first
	*/
	@Override
	public long getPrimaryKey() {
		return _first.getPrimaryKey();
	}

	/**
	* Returns the user ID of this first.
	*
	* @return the user ID of this first
	*/
	@Override
	public long getUserId() {
		return _first.getUserId();
	}

	@Override
	public void persist() {
		_first.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_first.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this first.
	*
	* @param companyId the company ID of this first
	*/
	@Override
	public void setCompanyId(long companyId) {
		_first.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this first.
	*
	* @param createDate the create date of this first
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_first.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_first.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_first.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_first.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field1 of this first.
	*
	* @param field1 the field1 of this first
	*/
	@Override
	public void setField1(java.lang.String field1) {
		_first.setField1(field1);
	}

	/**
	* Sets whether this first is field2.
	*
	* @param field2 the field2 of this first
	*/
	@Override
	public void setField2(boolean field2) {
		_first.setField2(field2);
	}

	/**
	* Sets the field3 of this first.
	*
	* @param field3 the field3 of this first
	*/
	@Override
	public void setField3(int field3) {
		_first.setField3(field3);
	}

	/**
	* Sets the field4 of this first.
	*
	* @param field4 the field4 of this first
	*/
	@Override
	public void setField4(Date field4) {
		_first.setField4(field4);
	}

	/**
	* Sets the field5 of this first.
	*
	* @param field5 the field5 of this first
	*/
	@Override
	public void setField5(java.lang.String field5) {
		_first.setField5(field5);
	}

	/**
	* Sets the foo ID of this first.
	*
	* @param fooId the foo ID of this first
	*/
	@Override
	public void setFooId(long fooId) {
		_first.setFooId(fooId);
	}

	/**
	* Sets the group ID of this first.
	*
	* @param groupId the group ID of this first
	*/
	@Override
	public void setGroupId(long groupId) {
		_first.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this first.
	*
	* @param modifiedDate the modified date of this first
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_first.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_first.setNew(n);
	}

	/**
	* Sets the primary key of this first.
	*
	* @param primaryKey the primary key of this first
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_first.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_first.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this first.
	*
	* @param userId the user ID of this first
	*/
	@Override
	public void setUserId(long userId) {
		_first.setUserId(userId);
	}

	/**
	* Sets the user name of this first.
	*
	* @param userName the user name of this first
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_first.setUserName(userName);
	}

	/**
	* Sets the user uuid of this first.
	*
	* @param userUuid the user uuid of this first
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_first.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this first.
	*
	* @param uuid the uuid of this first
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_first.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FirstWrapper)) {
			return false;
		}

		FirstWrapper firstWrapper = (FirstWrapper)obj;

		if (Objects.equals(_first, firstWrapper._first)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _first.getStagedModelType();
	}

	@Override
	public First getWrappedModel() {
		return _first;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _first.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _first.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_first.resetOriginalValues();
	}

	private final First _first;
}