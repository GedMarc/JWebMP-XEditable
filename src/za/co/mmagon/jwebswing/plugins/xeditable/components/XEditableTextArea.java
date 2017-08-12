package za.co.mmagon.jwebswing.plugins.xeditable.components;

import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.xeditable.XEditable;
import za.co.mmagon.jwebswing.plugins.xeditable.options.XEditableTextAreaOptions;

/**
 * XEditable Text
 * <p>
 * This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes. Please try out demo to
 * see how it works.
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
@ComponentInformation(name = "XEditable Text Area Component",
		description = "The Text Area XEditable Component",
		url = "https://vitalets.github.io/x-editable/docs.html#textarea")
public class XEditableTextArea extends XEditable<XEditableTextAreaOptions>
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new XEditableText
	 */
	public XEditableTextArea()
	{
		getFeature().setOptions(new XEditableTextAreaOptions());
	}

}
