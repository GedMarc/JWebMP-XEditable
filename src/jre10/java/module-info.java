module com.jwebmp.plugins.xeditable {

	exports com.jwebmp.plugins.xeditable;
	exports com.jwebmp.plugins.xeditable.options;
	exports com.jwebmp.plugins.xeditable.options.items;
	exports com.jwebmp.plugins.xeditable.components;

	requires com.jwebmp.core;
	requires com.fasterxml.jackson.annotation;

	requires java.logging;
	requires com.jwebmp.plugins.jqueryui;

	opens com.jwebmp.plugins.xeditable to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.options to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.options.items to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.components to com.fasterxml.jackson.databind,com.jwebmp.core;
}
