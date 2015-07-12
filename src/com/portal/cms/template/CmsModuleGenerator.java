package com.portal.cms.template;


public class CmsModuleGenerator {
	private static String packName = "com.portal.cms.template";
	private static String fileName = "protal.properties";

	public static void main(String[] args) {
		new ModuleGenerator(packName, fileName).generate();
	}
}
