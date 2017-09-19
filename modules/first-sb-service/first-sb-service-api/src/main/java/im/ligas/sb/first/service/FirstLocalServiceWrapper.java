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

package im.ligas.sb.first.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FirstLocalService
 * @generated
 */
@ProviderType
public class FirstLocalServiceWrapper implements FirstLocalService,
	ServiceWrapper<FirstLocalService> {
	public FirstLocalServiceWrapper(FirstLocalService firstLocalService) {
		_firstLocalService = firstLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _firstLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _firstLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _firstLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _firstLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _firstLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _firstLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the first to the database. Also notifies the appropriate model listeners.
	*
	* @param first the first
	* @return the first that was added
	*/
	@Override
	public im.ligas.sb.first.model.First addFirst(
		im.ligas.sb.first.model.First first) {
		return _firstLocalService.addFirst(first);
	}

	/**
	* Creates a new first with the primary key. Does not add the first to the database.
	*
	* @param fooId the primary key for the new first
	* @return the new first
	*/
	@Override
	public im.ligas.sb.first.model.First createFirst(long fooId) {
		return _firstLocalService.createFirst(fooId);
	}

	/**
	* Deletes the first from the database. Also notifies the appropriate model listeners.
	*
	* @param first the first
	* @return the first that was removed
	*/
	@Override
	public im.ligas.sb.first.model.First deleteFirst(
		im.ligas.sb.first.model.First first) {
		return _firstLocalService.deleteFirst(first);
	}

	/**
	* Deletes the first with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the first
	* @return the first that was removed
	* @throws PortalException if a first with the primary key could not be found
	*/
	@Override
	public im.ligas.sb.first.model.First deleteFirst(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _firstLocalService.deleteFirst(fooId);
	}

	@Override
	public im.ligas.sb.first.model.First fetchFirst(long fooId) {
		return _firstLocalService.fetchFirst(fooId);
	}

	/**
	* Returns the first matching the UUID and group.
	*
	* @param uuid the first's UUID
	* @param groupId the primary key of the group
	* @return the matching first, or <code>null</code> if a matching first could not be found
	*/
	@Override
	public im.ligas.sb.first.model.First fetchFirstByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _firstLocalService.fetchFirstByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the first with the primary key.
	*
	* @param fooId the primary key of the first
	* @return the first
	* @throws PortalException if a first with the primary key could not be found
	*/
	@Override
	public im.ligas.sb.first.model.First getFirst(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _firstLocalService.getFirst(fooId);
	}

	/**
	* Returns the first matching the UUID and group.
	*
	* @param uuid the first's UUID
	* @param groupId the primary key of the group
	* @return the matching first
	* @throws PortalException if a matching first could not be found
	*/
	@Override
	public im.ligas.sb.first.model.First getFirstByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _firstLocalService.getFirstByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param first the first
	* @return the first that was updated
	*/
	@Override
	public im.ligas.sb.first.model.First updateFirst(
		im.ligas.sb.first.model.First first) {
		return _firstLocalService.updateFirst(first);
	}

	/**
	* Returns the number of firsts.
	*
	* @return the number of firsts
	*/
	@Override
	public int getFirstsCount() {
		return _firstLocalService.getFirstsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _firstLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String sayHallo() {
		return _firstLocalService.sayHallo();
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
		return _firstLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link im.ligas.sb.first.model.impl.FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _firstLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link im.ligas.sb.first.model.impl.FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _firstLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the firsts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link im.ligas.sb.first.model.impl.FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @return the range of firsts
	*/
	@Override
	public java.util.List<im.ligas.sb.first.model.First> getFirsts(int start,
		int end) {
		return _firstLocalService.getFirsts(start, end);
	}

	/**
	* Returns all the firsts matching the UUID and company.
	*
	* @param uuid the UUID of the firsts
	* @param companyId the primary key of the company
	* @return the matching firsts, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<im.ligas.sb.first.model.First> getFirstsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _firstLocalService.getFirstsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of firsts matching the UUID and company.
	*
	* @param uuid the UUID of the firsts
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching firsts, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<im.ligas.sb.first.model.First> getFirstsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<im.ligas.sb.first.model.First> orderByComparator) {
		return _firstLocalService.getFirstsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
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
		return _firstLocalService.dynamicQueryCount(dynamicQuery);
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
		return _firstLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public FirstLocalService getWrappedService() {
		return _firstLocalService;
	}

	@Override
	public void setWrappedService(FirstLocalService firstLocalService) {
		_firstLocalService = firstLocalService;
	}

	private FirstLocalService _firstLocalService;
}