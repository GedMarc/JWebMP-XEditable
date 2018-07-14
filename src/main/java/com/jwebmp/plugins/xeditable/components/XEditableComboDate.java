package com.jwebmp.plugins.xeditable.components;

import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.xeditable.XEditable;
import com.jwebmp.plugins.xeditable.options.XEditableComboDateOptions;

/**
 * XEditable Select Drop Down
 * <p>
 * This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes.
 * Please try out demo to
 * see how it works.
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
@ComponentInformation(name = "XEditable Combo Date Component",
		description = "The Combo Date XEditable Component",
		url = "https://vitalets.github.io/x-editable/docs.html#combodate")
public class XEditableComboDate
		extends XEditable<XEditableComboDateOptions>
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new XEditableText
	 */
	public XEditableComboDate()
	{
		getFeature().setOptions(new XEditableComboDateOptions());
	}

}
