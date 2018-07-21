package com.jwebmp.plugins.xeditable;

import com.jwebmp.core.Page;
import com.jwebmp.core.PageConfigurator;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "XEditable",
		pluginDescription = "This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes. Please try out demo to see how it works.",
		pluginUniqueName = "jwebswing-xeditable",
		pluginVersion = "1.6.4",
		pluginCategories = "xeditable,inline editing, direct editing, ui,web ui, framework",
		pluginSubtitle = "This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes. Please try out demo to see how it works.",
		pluginSourceUrl = "https://vitalets.github.io/x-editable/docs.html",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-XEditable/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-XEditable",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://vitalets.github.io/x-editable/docs.html",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/XEditable.jar/download"
) class XEditablePageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new XEditablePageConfigurator
	 */
	public XEditablePageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

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
}
