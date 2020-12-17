package com.jwebmp.plugins.xeditable;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "XEditable",
		pluginDescription = "This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes. Please try out demo to see how it works.",
		pluginUniqueName = "jwebswing-xeditable",
		pluginVersion = "1.6.4",
		pluginCategories = "xeditable,inline editing, direct editing, ui,web ui, framework",
		pluginSubtitle = "This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes. Please try out demo to see how it works.",
		pluginSourceUrl = "https://vitalets.github.io/x-editable/docs.html",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-XEditable/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-XEditable",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://vitalets.github.io/x-editable/docs.html",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.forms/jwebmp-xeditable",
		pluginGroupId = "com.jwebmp.plugins.forms",
		pluginArtifactId = "jwebmp-xeditable",
		pluginModuleName = "com.jwebmp.plugins.xeditable",
		pluginStatus = PluginStatus.Released
		

)
public class XEditablePageConfigurator
		implements IPageConfigurator<XEditablePageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	
	/*
	 * Constructs a new XEditablePageConfigurator
	 */
	public XEditablePageConfigurator()
	{
		//Nothing needed
	}
	
	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return XEditablePageConfigurator.enabled;
	}
	
	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		XEditablePageConfigurator.enabled = mustEnable;
	}
	
	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			
			page.getBody()
			    .addJavaScriptReference(XEditableReferencePool.XEditable.getJavaScriptReference());
			page.getBody()
			    .addCssReference(XEditableReferencePool.XEditable.getCssReference());
			
			page.getBody()
			    .addJavaScriptReference(XEditableReferencePool.XEditableTypeAhead.getJavaScriptReference());
			page.getBody()
			    .addCssReference(XEditableReferencePool.XEditableTypeAhead.getCssReference());
			
			page.getBody()
			    .addJavaScriptReference(XEditableReferencePool.XEditableTypeAheadJS.getJavaScriptReference());
		}
		return page;
	}
	
	@Override
	public boolean enabled()
	{
		return XEditablePageConfigurator.enabled;
	}
}
