package com.chberndt.liferay.service.wrapper;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.service.LayoutLocalServiceWrapper;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Christian Berndt
 */
@Component(immediate = true, property = {}, service = ServiceWrapper.class)
public class LayoutLocalServiceOverride extends LayoutLocalServiceWrapper {

	public LayoutLocalServiceOverride() {
		super(null);
	}

	@Override
	public Layout addLayout(
			long userId, long groupId, boolean privateLayout,
			long parentLayoutId, long classNameId, long classPK,
			Map<Locale, String> nameMap, Map<Locale, String> titleMap,
			Map<Locale, String> descriptionMap, Map<Locale, String> keywordsMap,
			Map<Locale, String> robotsMap, String type, String typeSettings,
			boolean hidden, boolean system, long masterLayoutPlid,
			Map<Locale, String> friendlyURLMap, ServiceContext serviceContext)
		throws PortalException {

		System.out.println("LayoutLocalServiceOverride.addLayout()");

		return super.addLayout(
			userId, groupId, privateLayout, parentLayoutId, classNameId,
			classPK, nameMap, titleMap, descriptionMap, keywordsMap, robotsMap,
			type, typeSettings, hidden, system, masterLayoutPlid,
			friendlyURLMap, serviceContext);
	}

	@Override
	public Layout getLayout(long plid) throws PortalException {

		//    	System.out.println("Getting layout by plid " + plid);

		// TODO Auto-generated method stub

		return super.getLayout(plid);
	}

}