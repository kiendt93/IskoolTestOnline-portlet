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

package com.vietnamobile.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.vietnamobile.model.OnlinetestEntry;

import java.util.List;

/**
 * The persistence utility for the onlinetest entry service. This utility wraps {@link OnlinetestEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author duymb
 * @see OnlinetestEntryPersistence
 * @see OnlinetestEntryPersistenceImpl
 * @generated
 */
public class OnlinetestEntryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(OnlinetestEntry onlinetestEntry) {
		getPersistence().clearCache(onlinetestEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OnlinetestEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OnlinetestEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OnlinetestEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OnlinetestEntry update(OnlinetestEntry onlinetestEntry)
		throws SystemException {
		return getPersistence().update(onlinetestEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OnlinetestEntry update(OnlinetestEntry onlinetestEntry,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(onlinetestEntry, serviceContext);
	}

	/**
	* Caches the onlinetest entry in the entity cache if it is enabled.
	*
	* @param onlinetestEntry the onlinetest entry
	*/
	public static void cacheResult(
		com.vietnamobile.model.OnlinetestEntry onlinetestEntry) {
		getPersistence().cacheResult(onlinetestEntry);
	}

	/**
	* Caches the onlinetest entries in the entity cache if it is enabled.
	*
	* @param onlinetestEntries the onlinetest entries
	*/
	public static void cacheResult(
		java.util.List<com.vietnamobile.model.OnlinetestEntry> onlinetestEntries) {
		getPersistence().cacheResult(onlinetestEntries);
	}

	/**
	* Creates a new onlinetest entry with the primary key. Does not add the onlinetest entry to the database.
	*
	* @param onlinetestEntryId the primary key for the new onlinetest entry
	* @return the new onlinetest entry
	*/
	public static com.vietnamobile.model.OnlinetestEntry create(
		long onlinetestEntryId) {
		return getPersistence().create(onlinetestEntryId);
	}

	/**
	* Removes the onlinetest entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param onlinetestEntryId the primary key of the onlinetest entry
	* @return the onlinetest entry that was removed
	* @throws com.vietnamobile.NoSuchOnlinetestEntryException if a onlinetest entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.OnlinetestEntry remove(
		long onlinetestEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchOnlinetestEntryException {
		return getPersistence().remove(onlinetestEntryId);
	}

	public static com.vietnamobile.model.OnlinetestEntry updateImpl(
		com.vietnamobile.model.OnlinetestEntry onlinetestEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(onlinetestEntry);
	}

	/**
	* Returns the onlinetest entry with the primary key or throws a {@link com.vietnamobile.NoSuchOnlinetestEntryException} if it could not be found.
	*
	* @param onlinetestEntryId the primary key of the onlinetest entry
	* @return the onlinetest entry
	* @throws com.vietnamobile.NoSuchOnlinetestEntryException if a onlinetest entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.OnlinetestEntry findByPrimaryKey(
		long onlinetestEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchOnlinetestEntryException {
		return getPersistence().findByPrimaryKey(onlinetestEntryId);
	}

	/**
	* Returns the onlinetest entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param onlinetestEntryId the primary key of the onlinetest entry
	* @return the onlinetest entry, or <code>null</code> if a onlinetest entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.OnlinetestEntry fetchByPrimaryKey(
		long onlinetestEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(onlinetestEntryId);
	}

	/**
	* Returns all the onlinetest entries.
	*
	* @return the onlinetest entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vietnamobile.model.OnlinetestEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the onlinetest entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.OnlinetestEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of onlinetest entries
	* @param end the upper bound of the range of onlinetest entries (not inclusive)
	* @return the range of onlinetest entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vietnamobile.model.OnlinetestEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the onlinetest entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.OnlinetestEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of onlinetest entries
	* @param end the upper bound of the range of onlinetest entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of onlinetest entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vietnamobile.model.OnlinetestEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the onlinetest entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of onlinetest entries.
	*
	* @return the number of onlinetest entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OnlinetestEntryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OnlinetestEntryPersistence)PortletBeanLocatorUtil.locate(com.vietnamobile.service.ClpSerializer.getServletContextName(),
					OnlinetestEntryPersistence.class.getName());

			ReferenceRegistry.registerReference(OnlinetestEntryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OnlinetestEntryPersistence persistence) {
	}

	private static OnlinetestEntryPersistence _persistence;
}