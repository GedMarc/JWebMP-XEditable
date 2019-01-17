package com.jwebmp.plugins.xeditable.components;

import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.xeditable.XEditable;
import com.jwebmp.plugins.xeditable.options.XEditableTextAreaOptions;

/**
 * XEditable Text
 * <p>
 * This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes.
 * Please try out demo to
 * see how it works.
 *
 * @author GedMarc
 * @since 13 Jun 2017
 */
@ComponentInformation(name = "XEditable Text Area Component",
		description = "The Text Area XEditable Component",
		url = "https://vitalets.github.io/x-editable/docs.html#textarea")
public class XEditableTextArea
		extends XEditable<XEditableTextAreaOptions>
{


	/*
	 * Constructs a new XEditableText
	 */
	public XEditableTextArea()
	{
		getFeature().setOptions(new XEditableTextAreaOptions());
	}

}
