package org.zlibrary.core.options;

import org.zlibrary.core.options.config.ZLConfig;
import org.zlibrary.core.options.config.ZLConfigInstance;

public abstract class ZLOption {
	public static final String LOOK_AND_FEEL_CATEGORY = "ui";
	public static final String CONFIG_CATEGORY = "options";
	public static final String STATE_CATEGORY = "state";

	protected final ZLConfig myConfig = ZLConfigInstance.getInstance();
	protected final String myCategory;
	protected final String myGroup;
	protected final String myOptionName;
	protected boolean myIsSynchronized;

	/**
	 * �����������
	 * 
	 * @param config
	 * @param category
	 * @param group
	 * @param optionName
	 */
	protected ZLOption(String category, String group, String name) {
		myCategory = category.intern();
		myGroup = group.intern();
		myOptionName = name.intern();
		myIsSynchronized = false;

		/*
		 * String value = myConfig.getValue(group, name, null);
		 * 
		 * 
		 * 
		 * 
		 * if ((value != null)) { && (��������� �� �����)
		 * myConfig.setValue(group, name, value, category); }
		 */
	}

	/**
	 * @return ��� �����. �������� ����� ����� �� view
	 */
	public String getName() {
		return myOptionName;
	}

	/**
	 * @return "������" �����. �������� ����� ����� �� view
	 */
	public String getGroup() {
		return myGroup;
	}

	/**
	 * @return "���������" �����. �������� ����� ����� �� view
	 */
	public String getCategory() {
		return myCategory;
	}
}
