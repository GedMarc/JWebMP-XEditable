import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.xeditable.XEditablePageConfigurator;
import com.jwebmp.plugins.xeditable.implementations.XEditableExclusionsModule;

module com.jwebmp.plugins.xeditable {

	exports com.jwebmp.plugins.xeditable;
	exports com.jwebmp.plugins.xeditable.options;
	exports com.jwebmp.plugins.xeditable.options.items;
	exports com.jwebmp.plugins.xeditable.components;

	provides IPageConfigurator with XEditablePageConfigurator;
	provides IGuiceScanModuleExclusions with XEditableExclusionsModule;
	provides IGuiceScanJarExclusions with XEditableExclusionsModule;

	requires com.jwebmp.core;
	requires com.fasterxml.jackson.annotation;

	requires java.logging;
	requires com.jwebmp.plugins.jqueryui;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	opens com.jwebmp.plugins.xeditable to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.options.items to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.components to com.fasterxml.jackson.databind, com.jwebmp.core;
}
