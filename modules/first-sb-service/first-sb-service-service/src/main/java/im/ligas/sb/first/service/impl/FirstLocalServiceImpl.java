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

package im.ligas.sb.first.service.impl;

import aQute.bnd.annotation.ProviderType;

import im.ligas.sb.first.service.base.FirstLocalServiceBaseImpl;

/**
 * The implementation of the first local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link im.ligas.sb.first.service.FirstLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FirstLocalServiceBaseImpl
 * @see im.ligas.sb.first.service.FirstLocalServiceUtil
 */
@ProviderType
public class FirstLocalServiceImpl extends FirstLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link im.ligas.sb.first.service.FirstLocalServiceUtil} to access the first local service.
	 */
    public String sayHallo(){
        return "Hallo";
    }
}