module com.jwebmp.plugins.xeditable {

	exports com.jwebmp.plugins.xeditable;
	exports com.jwebmp.plugins.xeditable.options;
	exports com.jwebmp.plugins.xeditable.options.items;
	exports com.jwebmp.plugins.xeditable.components;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.xeditable.XEditablePageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.xeditable.implementations.XEditableExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.xeditable.implementations.XEditableExclusionsModule;

	requires com.jwebmp.core;
	requires transitive com.fasterxml.jackson.annotation;

	requires java.logging;
	requires com.jwebmp.plugins.jqueryui;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.fasterxml.jackson.databind;

	opens com.jwebmp.plugins.xeditable to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.options.items to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.components to com.fasterxml.jackson.databind, com.jwebmp.core;
}
