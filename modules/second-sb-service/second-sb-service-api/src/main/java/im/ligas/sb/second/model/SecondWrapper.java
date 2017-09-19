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

package im.ligas.sb.second.model;

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
 * This class is a wrapper for {@link Second}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Second
 * @generated
 */
@ProviderType
public class SecondWrapper implements Second, ModelWrapper<Second> {
	public SecondWrapper(Second second) {
		_second = second;
	}

	@Override
	public Class<?> getModelClass() {
		return Second.class;
	}

	@Override
	public String getModelClassName() {
		return Second.class.getName();
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
	* Returns the field2 of this second.
	*
	* @return the field2 of this second
	*/
	@Override
	public boolean getField2() {
		return _second.getField2();
	}

	@Override
	public boolean isCachedModel() {
		return _second.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _second.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this second is field2.
	*
	* @return <code>true</code> if this second is field2; <code>false</code> otherwise
	*/
	@Override
	public boolean isField2() {
		return _second.isField2();
	}

	@Override
	public boolean isNew() {
		return _second.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _second.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<im.ligas.sb.second.model.Second> toCacheModel() {
		return _second.toCacheModel();
	}

	@Override
	public im.ligas.sb.second.model.Second toEscapedModel() {
		return new SecondWrapper(_second.toEscapedModel());
	}

	@Override
	public im.ligas.sb.second.model.Second toUnescapedModel() {
		return new SecondWrapper(_second.toUnescapedModel());
	}

	@Override
	public int compareTo(im.ligas.sb.second.model.Second second) {
		return _second.compareTo(second);
	}

	/**
	* Returns the field3 of this second.
	*
	* @return the field3 of this second
	*/
	@Override
	public int getField3() {
		return _second.getField3();
	}

	@Override
	public int hashCode() {
		return _second.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _second.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SecondWrapper((Second)_second.clone());
	}

	/**
	* Returns the field1 of this second.
	*
	* @return the field1 of this second
	*/
	@Override
	public java.lang.String getField1() {
		return _second.getField1();
	}

	/**
	* Returns the field5 of this second.
	*
	* @return the field5 of this second
	*/
	@Override
	public java.lang.String getField5() {
		return _second.getField5();
	}

	/**
	* Returns the user name of this second.
	*
	* @return the user name of this second
	*/
	@Override
	public java.lang.String getUserName() {
		return _second.getUserName();
	}

	/**
	* Returns the user uuid of this second.
	*
	* @return the user uuid of this second
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _second.getUserUuid();
	}

	/**
	* Returns the uuid of this second.
	*
	* @return the uuid of this second
	*/
	@Override
	public java.lang.String getUuid() {
		return _second.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _second.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _second.toXmlString();
	}

	/**
	* Returns the create date of this second.
	*
	* @return the create date of this second
	*/
	@Override
	public Date getCreateDate() {
		return _second.getCreateDate();
	}

	/**
	* Returns the field4 of this second.
	*
	* @return the field4 of this second
	*/
	@Override
	public Date getField4() {
		return _second.getField4();
	}

	/**
	* Returns the modified date of this second.
	*
	* @return the modified date of this second
	*/
	@Override
	public Date getModifiedDate() {
		return _second.getModifiedDate();
	}

	/**
	* Returns the company ID of this second.
	*
	* @return the company ID of this second
	*/
	@Override
	public long getCompanyId() {
		return _second.getCompanyId();
	}

	/**
	* Returns the foo ID of this second.
	*
	* @return the foo ID of this second
	*/
	@Override
	public long getFooId() {
		return _second.getFooId();
	}

	/**
	* Returns the group ID of this second.
	*
	* @return the group ID of this second
	*/
	@Override
	public long getGroupId() {
		return _second.getGroupId();
	}

	/**
	* Returns the primary key of this second.
	*
	* @return the primary key of this second
	*/
	@Override
	public long getPrimaryKey() {
		return _second.getPrimaryKey();
	}

	/**
	* Returns the user ID of this second.
	*
	* @return the user ID of this second
	*/
	@Override
	public long getUserId() {
		return _second.getUserId();
	}

	@Override
	public void persist() {
		_second.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_second.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this second.
	*
	* @param companyId the company ID of this second
	*/
	@Override
	public void setCompanyId(long companyId) {
		_second.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this second.
	*
	* @param createDate the create date of this second
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_second.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_second.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_second.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_second.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field1 of this second.
	*
	* @param field1 the field1 of this second
	*/
	@Override
	public void setField1(java.lang.String field1) {
		_second.setField1(field1);
	}

	/**
	* Sets whether this second is field2.
	*
	* @param field2 the field2 of this second
	*/
	@Override
	public void setField2(boolean field2) {
		_second.setField2(field2);
	}

	/**
	* Sets the field3 of this second.
	*
	* @param field3 the field3 of this second
	*/
	@Override
	public void setField3(int field3) {
		_second.setField3(field3);
	}

	/**
	* Sets the field4 of this second.
	*
	* @param field4 the field4 of this second
	*/
	@Override
	public void setField4(Date field4) {
		_second.setField4(field4);
	}

	/**
	* Sets the field5 of this second.
	*
	* @param field5 the field5 of this second
	*/
	@Override
	public void setField5(java.lang.String field5) {
		_second.setField5(field5);
	}

	/**
	* Sets the foo ID of this second.
	*
	* @param fooId the foo ID of this second
	*/
	@Override
	public void setFooId(long fooId) {
		_second.setFooId(fooId);
	}

	/**
	* Sets the group ID of this second.
	*
	* @param groupId the group ID of this second
	*/
	@Override
	public void setGroupId(long groupId) {
		_second.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this second.
	*
	* @param modifiedDate the modified date of this second
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_second.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_second.setNew(n);
	}

	/**
	* Sets the primary key of this second.
	*
	* @param primaryKey the primary key of this second
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_second.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_second.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this second.
	*
	* @param userId the user ID of this second
	*/
	@Override
	public void setUserId(long userId) {
		_second.setUserId(userId);
	}

	/**
	* Sets the user name of this second.
	*
	* @param userName the user name of this second
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_second.setUserName(userName);
	}

	/**
	* Sets the user uuid of this second.
	*
	* @param userUuid the user uuid of this second
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_second.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this second.
	*
	* @param uuid the uuid of this second
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_second.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SecondWrapper)) {
			return false;
		}

		SecondWrapper secondWrapper = (SecondWrapper)obj;

		if (Objects.equals(_second, secondWrapper._second)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _second.getStagedModelType();
	}

	@Override
	public Second getWrappedModel() {
		return _second;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _second.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _second.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_second.resetOriginalValues();
	}

	private final Second _second;
}