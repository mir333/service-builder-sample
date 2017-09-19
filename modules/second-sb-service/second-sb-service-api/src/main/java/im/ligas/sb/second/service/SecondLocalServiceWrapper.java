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

package im.ligas.sb.second.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SecondLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SecondLocalService
 * @generated
 */
@ProviderType
public class SecondLocalServiceWrapper implements SecondLocalService,
	ServiceWrapper<SecondLocalService> {
	public SecondLocalServiceWrapper(SecondLocalService secondLocalService) {
		_secondLocalService = secondLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _secondLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _secondLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _secondLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _secondLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _secondLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _secondLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the second to the database. Also notifies the appropriate model listeners.
	*
	* @param second the second
	* @return the second that was added
	*/
	@Override
	public im.ligas.sb.second.model.Second addSecond(
		im.ligas.sb.second.model.Second second) {
		return _secondLocalService.addSecond(second);
	}

	/**
	* Creates a new second with the primary key. Does not add the second to the database.
	*
	* @param fooId the primary key for the new second
	* @return the new second
	*/
	@Override
	public im.ligas.sb.second.model.Second createSecond(long fooId) {
		return _secondLocalService.createSecond(fooId);
	}

	/**
	* Deletes the second from the database. Also notifies the appropriate model listeners.
	*
	* @param second the second
	* @return the second that was removed
	*/
	@Override
	public im.ligas.sb.second.model.Second deleteSecond(
		im.ligas.sb.second.model.Second second) {
		return _secondLocalService.deleteSecond(second);
	}

	/**
	* Deletes the second with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the second
	* @return the second that was removed
	* @throws PortalException if a second with the primary key could not be found
	*/
	@Override
	public im.ligas.sb.second.model.Second deleteSecond(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _secondLocalService.deleteSecond(fooId);
	}

	@Override
	public im.ligas.sb.second.model.Second fetchSecond(long fooId) {
		return _secondLocalService.fetchSecond(fooId);
	}

	/**
	* Returns the second matching the UUID and group.
	*
	* @param uuid the second's UUID
	* @param groupId the primary key of the group
	* @return the matching second, or <code>null</code> if a matching second could not be found
	*/
	@Override
	public im.ligas.sb.second.model.Second fetchSecondByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _secondLocalService.fetchSecondByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the second with the primary key.
	*
	* @param fooId the primary key of the second
	* @return the second
	* @throws PortalException if a second with the primary key could not be found
	*/
	@Override
	public im.ligas.sb.second.model.Second getSecond(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _secondLocalService.getSecond(fooId);
	}

	/**
	* Returns the second matching the UUID and group.
	*
	* @param uuid the second's UUID
	* @param groupId the primary key of the group
	* @return the matching second
	* @throws PortalException if a matching second could not be found
	*/
	@Override
	public im.ligas.sb.second.model.Second getSecondByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _secondLocalService.getSecondByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the second in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param second the second
	* @return the second that was updated
	*/
	@Override
	public im.ligas.sb.second.model.Second updateSecond(
		im.ligas.sb.second.model.Second second) {
		return _secondLocalService.updateSecond(second);
	}

	/**
	* Returns the number of seconds.
	*
	* @return the number of seconds
	*/
	@Override
	public int getSecondsCount() {
		return _secondLocalService.getSecondsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _secondLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _secondLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link im.ligas.sb.second.model.impl.SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _secondLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link im.ligas.sb.second.model.impl.SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _secondLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the seconds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link im.ligas.sb.second.model.impl.SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @return the range of seconds
	*/
	@Override
	public java.util.List<im.ligas.sb.second.model.Second> getSeconds(
		int start, int end) {
		return _secondLocalService.getSeconds(start, end);
	}

	/**
	* Returns all the seconds matching the UUID and company.
	*
	* @param uuid the UUID of the seconds
	* @param companyId the primary key of the company
	* @return the matching seconds, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<im.ligas.sb.second.model.Second> getSecondsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _secondLocalService.getSecondsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of seconds matching the UUID and company.
	*
	* @param uuid the UUID of the seconds
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching seconds, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<im.ligas.sb.second.model.Second> getSecondsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<im.ligas.sb.second.model.Second> orderByComparator) {
		return _secondLocalService.getSecondsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _secondLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _secondLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public void test() {
		_secondLocalService.test();
	}

	@Override
	public SecondLocalService getWrappedService() {
		return _secondLocalService;
	}

	@Override
	public void setWrappedService(SecondLocalService secondLocalService) {
		_secondLocalService = secondLocalService;
	}

	private SecondLocalService _secondLocalService;
}