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

package im.ligas.sb.second.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import im.ligas.sb.second.exception.NoSuchSecondException;
import im.ligas.sb.second.model.Second;

/**
 * The persistence interface for the second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see im.ligas.sb.second.service.persistence.impl.SecondPersistenceImpl
 * @see SecondUtil
 * @generated
 */
@ProviderType
public interface SecondPersistence extends BasePersistence<Second> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SecondUtil} to access the second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the seconds where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching seconds
	*/
	public java.util.List<Second> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the seconds where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @return the range of matching seconds
	*/
	public java.util.List<Second> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the seconds where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching seconds
	*/
	public java.util.List<Second> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator);

	/**
	* Returns an ordered range of all the seconds where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching seconds
	*/
	public java.util.List<Second> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first second in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching second
	* @throws NoSuchSecondException if a matching second could not be found
	*/
	public Second findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator)
		throws NoSuchSecondException;

	/**
	* Returns the first second in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching second, or <code>null</code> if a matching second could not be found
	*/
	public Second fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator);

	/**
	* Returns the last second in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching second
	* @throws NoSuchSecondException if a matching second could not be found
	*/
	public Second findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator)
		throws NoSuchSecondException;

	/**
	* Returns the last second in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching second, or <code>null</code> if a matching second could not be found
	*/
	public Second fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator);

	/**
	* Returns the seconds before and after the current second in the ordered set where uuid = &#63;.
	*
	* @param fooId the primary key of the current second
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next second
	* @throws NoSuchSecondException if a second with the primary key could not be found
	*/
	public Second[] findByUuid_PrevAndNext(long fooId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator)
		throws NoSuchSecondException;

	/**
	* Removes all the seconds where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of seconds where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching seconds
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the second where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchSecondException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching second
	* @throws NoSuchSecondException if a matching second could not be found
	*/
	public Second findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchSecondException;

	/**
	* Returns the second where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching second, or <code>null</code> if a matching second could not be found
	*/
	public Second fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the second where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching second, or <code>null</code> if a matching second could not be found
	*/
	public Second fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the second where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the second that was removed
	*/
	public Second removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchSecondException;

	/**
	* Returns the number of seconds where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching seconds
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the seconds where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching seconds
	*/
	public java.util.List<Second> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the seconds where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @return the range of matching seconds
	*/
	public java.util.List<Second> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the seconds where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching seconds
	*/
	public java.util.List<Second> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator);

	/**
	* Returns an ordered range of all the seconds where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching seconds
	*/
	public java.util.List<Second> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first second in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching second
	* @throws NoSuchSecondException if a matching second could not be found
	*/
	public Second findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator)
		throws NoSuchSecondException;

	/**
	* Returns the first second in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching second, or <code>null</code> if a matching second could not be found
	*/
	public Second fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator);

	/**
	* Returns the last second in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching second
	* @throws NoSuchSecondException if a matching second could not be found
	*/
	public Second findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator)
		throws NoSuchSecondException;

	/**
	* Returns the last second in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching second, or <code>null</code> if a matching second could not be found
	*/
	public Second fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator);

	/**
	* Returns the seconds before and after the current second in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param fooId the primary key of the current second
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next second
	* @throws NoSuchSecondException if a second with the primary key could not be found
	*/
	public Second[] findByUuid_C_PrevAndNext(long fooId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator)
		throws NoSuchSecondException;

	/**
	* Removes all the seconds where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of seconds where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching seconds
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the seconds where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching seconds
	*/
	public java.util.List<Second> findByField2(boolean field2);

	/**
	* Returns a range of all the seconds where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @return the range of matching seconds
	*/
	public java.util.List<Second> findByField2(boolean field2, int start,
		int end);

	/**
	* Returns an ordered range of all the seconds where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching seconds
	*/
	public java.util.List<Second> findByField2(boolean field2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator);

	/**
	* Returns an ordered range of all the seconds where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching seconds
	*/
	public java.util.List<Second> findByField2(boolean field2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first second in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching second
	* @throws NoSuchSecondException if a matching second could not be found
	*/
	public Second findByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator)
		throws NoSuchSecondException;

	/**
	* Returns the first second in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching second, or <code>null</code> if a matching second could not be found
	*/
	public Second fetchByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator);

	/**
	* Returns the last second in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching second
	* @throws NoSuchSecondException if a matching second could not be found
	*/
	public Second findByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator)
		throws NoSuchSecondException;

	/**
	* Returns the last second in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching second, or <code>null</code> if a matching second could not be found
	*/
	public Second fetchByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator);

	/**
	* Returns the seconds before and after the current second in the ordered set where field2 = &#63;.
	*
	* @param fooId the primary key of the current second
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next second
	* @throws NoSuchSecondException if a second with the primary key could not be found
	*/
	public Second[] findByField2_PrevAndNext(long fooId, boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator)
		throws NoSuchSecondException;

	/**
	* Removes all the seconds where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public void removeByField2(boolean field2);

	/**
	* Returns the number of seconds where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching seconds
	*/
	public int countByField2(boolean field2);

	/**
	* Caches the second in the entity cache if it is enabled.
	*
	* @param second the second
	*/
	public void cacheResult(Second second);

	/**
	* Caches the seconds in the entity cache if it is enabled.
	*
	* @param seconds the seconds
	*/
	public void cacheResult(java.util.List<Second> seconds);

	/**
	* Creates a new second with the primary key. Does not add the second to the database.
	*
	* @param fooId the primary key for the new second
	* @return the new second
	*/
	public Second create(long fooId);

	/**
	* Removes the second with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the second
	* @return the second that was removed
	* @throws NoSuchSecondException if a second with the primary key could not be found
	*/
	public Second remove(long fooId) throws NoSuchSecondException;

	public Second updateImpl(Second second);

	/**
	* Returns the second with the primary key or throws a {@link NoSuchSecondException} if it could not be found.
	*
	* @param fooId the primary key of the second
	* @return the second
	* @throws NoSuchSecondException if a second with the primary key could not be found
	*/
	public Second findByPrimaryKey(long fooId) throws NoSuchSecondException;

	/**
	* Returns the second with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fooId the primary key of the second
	* @return the second, or <code>null</code> if a second with the primary key could not be found
	*/
	public Second fetchByPrimaryKey(long fooId);

	@Override
	public java.util.Map<java.io.Serializable, Second> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the seconds.
	*
	* @return the seconds
	*/
	public java.util.List<Second> findAll();

	/**
	* Returns a range of all the seconds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @return the range of seconds
	*/
	public java.util.List<Second> findAll(int start, int end);

	/**
	* Returns an ordered range of all the seconds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of seconds
	*/
	public java.util.List<Second> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator);

	/**
	* Returns an ordered range of all the seconds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SecondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of seconds
	* @param end the upper bound of the range of seconds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of seconds
	*/
	public java.util.List<Second> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Second> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the seconds from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of seconds.
	*
	* @return the number of seconds
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}