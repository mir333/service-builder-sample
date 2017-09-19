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

package im.ligas.sb.first.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import im.ligas.sb.first.exception.NoSuchFirstException;
import im.ligas.sb.first.model.First;

/**
 * The persistence interface for the first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see im.ligas.sb.first.service.persistence.impl.FirstPersistenceImpl
 * @see FirstUtil
 * @generated
 */
@ProviderType
public interface FirstPersistence extends BasePersistence<First> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FirstUtil} to access the first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the firsts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching firsts
	*/
	public java.util.List<First> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the firsts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @return the range of matching firsts
	*/
	public java.util.List<First> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the firsts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching firsts
	*/
	public java.util.List<First> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator);

	/**
	* Returns an ordered range of all the firsts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching firsts
	*/
	public java.util.List<First> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first first in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching first
	* @throws NoSuchFirstException if a matching first could not be found
	*/
	public First findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator)
		throws NoSuchFirstException;

	/**
	* Returns the first first in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching first, or <code>null</code> if a matching first could not be found
	*/
	public First fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator);

	/**
	* Returns the last first in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching first
	* @throws NoSuchFirstException if a matching first could not be found
	*/
	public First findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator)
		throws NoSuchFirstException;

	/**
	* Returns the last first in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching first, or <code>null</code> if a matching first could not be found
	*/
	public First fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator);

	/**
	* Returns the firsts before and after the current first in the ordered set where uuid = &#63;.
	*
	* @param fooId the primary key of the current first
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next first
	* @throws NoSuchFirstException if a first with the primary key could not be found
	*/
	public First[] findByUuid_PrevAndNext(long fooId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator)
		throws NoSuchFirstException;

	/**
	* Removes all the firsts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of firsts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching firsts
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the first where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFirstException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching first
	* @throws NoSuchFirstException if a matching first could not be found
	*/
	public First findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchFirstException;

	/**
	* Returns the first where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching first, or <code>null</code> if a matching first could not be found
	*/
	public First fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the first where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching first, or <code>null</code> if a matching first could not be found
	*/
	public First fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the first where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the first that was removed
	*/
	public First removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchFirstException;

	/**
	* Returns the number of firsts where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching firsts
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the firsts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching firsts
	*/
	public java.util.List<First> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the firsts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @return the range of matching firsts
	*/
	public java.util.List<First> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the firsts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching firsts
	*/
	public java.util.List<First> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator);

	/**
	* Returns an ordered range of all the firsts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching firsts
	*/
	public java.util.List<First> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first first in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching first
	* @throws NoSuchFirstException if a matching first could not be found
	*/
	public First findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator)
		throws NoSuchFirstException;

	/**
	* Returns the first first in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching first, or <code>null</code> if a matching first could not be found
	*/
	public First fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator);

	/**
	* Returns the last first in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching first
	* @throws NoSuchFirstException if a matching first could not be found
	*/
	public First findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator)
		throws NoSuchFirstException;

	/**
	* Returns the last first in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching first, or <code>null</code> if a matching first could not be found
	*/
	public First fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator);

	/**
	* Returns the firsts before and after the current first in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param fooId the primary key of the current first
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next first
	* @throws NoSuchFirstException if a first with the primary key could not be found
	*/
	public First[] findByUuid_C_PrevAndNext(long fooId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator)
		throws NoSuchFirstException;

	/**
	* Removes all the firsts where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of firsts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching firsts
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the firsts where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching firsts
	*/
	public java.util.List<First> findByField2(boolean field2);

	/**
	* Returns a range of all the firsts where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @return the range of matching firsts
	*/
	public java.util.List<First> findByField2(boolean field2, int start, int end);

	/**
	* Returns an ordered range of all the firsts where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching firsts
	*/
	public java.util.List<First> findByField2(boolean field2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator);

	/**
	* Returns an ordered range of all the firsts where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching firsts
	*/
	public java.util.List<First> findByField2(boolean field2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first first in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching first
	* @throws NoSuchFirstException if a matching first could not be found
	*/
	public First findByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator)
		throws NoSuchFirstException;

	/**
	* Returns the first first in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching first, or <code>null</code> if a matching first could not be found
	*/
	public First fetchByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator);

	/**
	* Returns the last first in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching first
	* @throws NoSuchFirstException if a matching first could not be found
	*/
	public First findByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator)
		throws NoSuchFirstException;

	/**
	* Returns the last first in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching first, or <code>null</code> if a matching first could not be found
	*/
	public First fetchByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator);

	/**
	* Returns the firsts before and after the current first in the ordered set where field2 = &#63;.
	*
	* @param fooId the primary key of the current first
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next first
	* @throws NoSuchFirstException if a first with the primary key could not be found
	*/
	public First[] findByField2_PrevAndNext(long fooId, boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator)
		throws NoSuchFirstException;

	/**
	* Removes all the firsts where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public void removeByField2(boolean field2);

	/**
	* Returns the number of firsts where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching firsts
	*/
	public int countByField2(boolean field2);

	/**
	* Caches the first in the entity cache if it is enabled.
	*
	* @param first the first
	*/
	public void cacheResult(First first);

	/**
	* Caches the firsts in the entity cache if it is enabled.
	*
	* @param firsts the firsts
	*/
	public void cacheResult(java.util.List<First> firsts);

	/**
	* Creates a new first with the primary key. Does not add the first to the database.
	*
	* @param fooId the primary key for the new first
	* @return the new first
	*/
	public First create(long fooId);

	/**
	* Removes the first with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the first
	* @return the first that was removed
	* @throws NoSuchFirstException if a first with the primary key could not be found
	*/
	public First remove(long fooId) throws NoSuchFirstException;

	public First updateImpl(First first);

	/**
	* Returns the first with the primary key or throws a {@link NoSuchFirstException} if it could not be found.
	*
	* @param fooId the primary key of the first
	* @return the first
	* @throws NoSuchFirstException if a first with the primary key could not be found
	*/
	public First findByPrimaryKey(long fooId) throws NoSuchFirstException;

	/**
	* Returns the first with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fooId the primary key of the first
	* @return the first, or <code>null</code> if a first with the primary key could not be found
	*/
	public First fetchByPrimaryKey(long fooId);

	@Override
	public java.util.Map<java.io.Serializable, First> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the firsts.
	*
	* @return the firsts
	*/
	public java.util.List<First> findAll();

	/**
	* Returns a range of all the firsts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @return the range of firsts
	*/
	public java.util.List<First> findAll(int start, int end);

	/**
	* Returns an ordered range of all the firsts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of firsts
	*/
	public java.util.List<First> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator);

	/**
	* Returns an ordered range of all the firsts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FirstModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of firsts
	* @param end the upper bound of the range of firsts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of firsts
	*/
	public java.util.List<First> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<First> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the firsts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of firsts.
	*
	* @return the number of firsts
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}