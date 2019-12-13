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

package com.tcpl.sas.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.tcpl.sas.exception.NoSuchSourceVendorException;
import com.tcpl.sas.model.SourceVendor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the source vendor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rakshansh
 * @see SourceVendorUtil
 * @generated
 */
@ProviderType
public interface SourceVendorPersistence extends BasePersistence<SourceVendor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SourceVendorUtil} to access the source vendor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the source vendor in the entity cache if it is enabled.
	 *
	 * @param sourceVendor the source vendor
	 */
	public void cacheResult(SourceVendor sourceVendor);

	/**
	 * Caches the source vendors in the entity cache if it is enabled.
	 *
	 * @param sourceVendors the source vendors
	 */
	public void cacheResult(java.util.List<SourceVendor> sourceVendors);

	/**
	 * Creates a new source vendor with the primary key. Does not add the source vendor to the database.
	 *
	 * @param sourceVendorId the primary key for the new source vendor
	 * @return the new source vendor
	 */
	public SourceVendor create(long sourceVendorId);

	/**
	 * Removes the source vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor that was removed
	 * @throws NoSuchSourceVendorException if a source vendor with the primary key could not be found
	 */
	public SourceVendor remove(long sourceVendorId)
		throws NoSuchSourceVendorException;

	public SourceVendor updateImpl(SourceVendor sourceVendor);

	/**
	 * Returns the source vendor with the primary key or throws a <code>NoSuchSourceVendorException</code> if it could not be found.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor
	 * @throws NoSuchSourceVendorException if a source vendor with the primary key could not be found
	 */
	public SourceVendor findByPrimaryKey(long sourceVendorId)
		throws NoSuchSourceVendorException;

	/**
	 * Returns the source vendor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sourceVendorId the primary key of the source vendor
	 * @return the source vendor, or <code>null</code> if a source vendor with the primary key could not be found
	 */
	public SourceVendor fetchByPrimaryKey(long sourceVendorId);

	/**
	 * Returns all the source vendors.
	 *
	 * @return the source vendors
	 */
	public java.util.List<SourceVendor> findAll();

	/**
	 * Returns a range of all the source vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SourceVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of source vendors
	 * @param end the upper bound of the range of source vendors (not inclusive)
	 * @return the range of source vendors
	 */
	public java.util.List<SourceVendor> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the source vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SourceVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of source vendors
	 * @param end the upper bound of the range of source vendors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of source vendors
	 */
	public java.util.List<SourceVendor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SourceVendor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the source vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SourceVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of source vendors
	 * @param end the upper bound of the range of source vendors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of source vendors
	 */
	public java.util.List<SourceVendor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SourceVendor>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the source vendors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of source vendors.
	 *
	 * @return the number of source vendors
	 */
	public int countAll();

}