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

import com.tcpl.sas.exception.NoSuchEvalVendorException;
import com.tcpl.sas.model.EvalVendor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the eval vendor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rakshansh
 * @see EvalVendorUtil
 * @generated
 */
@ProviderType
public interface EvalVendorPersistence extends BasePersistence<EvalVendor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EvalVendorUtil} to access the eval vendor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the eval vendor in the entity cache if it is enabled.
	 *
	 * @param evalVendor the eval vendor
	 */
	public void cacheResult(EvalVendor evalVendor);

	/**
	 * Caches the eval vendors in the entity cache if it is enabled.
	 *
	 * @param evalVendors the eval vendors
	 */
	public void cacheResult(java.util.List<EvalVendor> evalVendors);

	/**
	 * Creates a new eval vendor with the primary key. Does not add the eval vendor to the database.
	 *
	 * @param evalVendorId the primary key for the new eval vendor
	 * @return the new eval vendor
	 */
	public EvalVendor create(long evalVendorId);

	/**
	 * Removes the eval vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor that was removed
	 * @throws NoSuchEvalVendorException if a eval vendor with the primary key could not be found
	 */
	public EvalVendor remove(long evalVendorId)
		throws NoSuchEvalVendorException;

	public EvalVendor updateImpl(EvalVendor evalVendor);

	/**
	 * Returns the eval vendor with the primary key or throws a <code>NoSuchEvalVendorException</code> if it could not be found.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor
	 * @throws NoSuchEvalVendorException if a eval vendor with the primary key could not be found
	 */
	public EvalVendor findByPrimaryKey(long evalVendorId)
		throws NoSuchEvalVendorException;

	/**
	 * Returns the eval vendor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor, or <code>null</code> if a eval vendor with the primary key could not be found
	 */
	public EvalVendor fetchByPrimaryKey(long evalVendorId);

	/**
	 * Returns all the eval vendors.
	 *
	 * @return the eval vendors
	 */
	public java.util.List<EvalVendor> findAll();

	/**
	 * Returns a range of all the eval vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>EvalVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eval vendors
	 * @param end the upper bound of the range of eval vendors (not inclusive)
	 * @return the range of eval vendors
	 */
	public java.util.List<EvalVendor> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the eval vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>EvalVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eval vendors
	 * @param end the upper bound of the range of eval vendors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of eval vendors
	 */
	public java.util.List<EvalVendor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EvalVendor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the eval vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>EvalVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eval vendors
	 * @param end the upper bound of the range of eval vendors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of eval vendors
	 */
	public java.util.List<EvalVendor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EvalVendor>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the eval vendors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of eval vendors.
	 *
	 * @return the number of eval vendors
	 */
	public int countAll();

}