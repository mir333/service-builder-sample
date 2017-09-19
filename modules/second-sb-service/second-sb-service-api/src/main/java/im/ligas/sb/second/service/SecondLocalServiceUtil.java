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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Second. This utility wraps
 * {@link im.ligas.sb.second.service.impl.SecondLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SecondLocalService
 * @see im.ligas.sb.second.service.base.SecondLocalServiceBaseImpl
 * @see im.ligas.sb.second.service.impl.SecondLocalServiceImpl
 * @generated
 */
@ProviderType
public class SecondLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link im.ligas.sb.second.service.impl.SecondLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the second to the database. Also notifies the appropriate model listeners.
	*
	* @param second the second
	* @return the second that was added
	*/
	public static im.ligas.sb.second.model.Second addSecond(
		im.ligas.sb.second.model.Second second) {
		return getService().addSecond(second);
	}

	/**
	* Creates a new second with the primary key. Does not add the second to the database.
	*
	* @param fooId the primary key for the new second
	* @return the new second
	*/
	public static im.ligas.sb.second.model.Second createSecond(long fooId) {
		return getService().createSecond(fooId);
	}

	/**
	* Deletes the second from the database. Also notifies the appropriate model listeners.
	*
	* @param second the second
	* @return the second that was removed
	*/
	public static im.ligas.sb.second.model.Second deleteSecond(
		im.ligas.sb.second.model.Second second) {
		return getService().deleteSecond(second);
	}

	/**
	* Deletes the second with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the second
	* @return the second that was removed
	* @throws PortalException if a second with the primary key could not be found
	*/
	public static im.ligas.sb.second.model.Second deleteSecond(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSecond(fooId);
	}

	public static im.ligas.sb.second.model.Second fetchSecond(long fooId) {
		return getService().fetchSecond(fooId);
	}

	/**
	* Returns the second matching the UUID and group.
	*
	* @param uuid the second's UUID
	* @param groupId the primary key of the group
	* @return the matching second, or <code>null</code> if a matching second could not be found
	*/
	public static im.ligas.sb.second.model.Second fetchSecondByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchSecondByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the second with the primary key.
	*
	* @param fooId the primary key of the second
	* @return the second
	* @throws PortalException if a second with the primary key could not be found
	*/
	public static im.ligas.sb.second.model.Second getSecond(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSecond(fooId);
	}

	/**
	* Returns the second matching the UUID and group.
	*
	* @param uuid the second's UUID
	* @param groupId the primary key of the group
	* @return the matching second
	* @throws PortalException if a matching second could not be found
	*/
	public static im.ligas.sb.second.model.Second getSecondByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSecondByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the second in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param second the second
	* @return the second that was updated
	*/
	public static im.ligas.sb.second.model.Second updateSecond(
		im.ligas.sb.second.model.Second second) {
		return getService().updateSecond(second);
	}

	/**
	* Returns the number of seconds.
	*
	* @return the number of seconds
	*/
	public static int getSecondsCount() {
		return getService().getSecondsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<im.ligas.sb.second.model.Second> getSeconds(
		int start, int end) {
		return getService().getSeconds(start, end);
	}

	/**
	* Returns all the seconds matching the UUID and company.
	*
	* @param uuid the UUID of the seconds
	* @param companyId the primary key of the company
	* @return the matching seconds, or an empty list if no matches were found
	*/
	public static java.util.List<im.ligas.sb.second.model.Second> getSecondsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getSecondsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<im.ligas.sb.second.model.Second> getSecondsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<im.ligas.sb.second.model.Second> orderByComparator) {
		return getService()
				   .getSecondsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void test() {
		getService().test();
	}

	public static SecondLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SecondLocalService, SecondLocalService> _serviceTracker =
		ServiceTrackerFactory.open(SecondLocalService.class);
}