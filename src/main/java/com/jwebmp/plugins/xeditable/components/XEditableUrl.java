/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.xeditable.components;

import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.xeditable.XEditable;
import com.jwebmp.plugins.xeditable.XEditableDataTypes;
import com.jwebmp.plugins.xeditable.options.XEditableHtml5TypesOptions;

/**
 * XEditable Text
 * <p>
 * This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes.
 * Please try out demo to
 * see how it works.
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
@ComponentInformation(name = "XEditable Html Url Component",
		description = "The Html 6 Types XEditable Component",
		url = "https://vitalets.github.io/x-editable/docs.html#html5types")
public class XEditableUrl
		extends XEditable<XEditableHtml5TypesOptions>
{


	/*
	 * Constructs a new XEditableText
	 */
	public XEditableUrl()
	{
		getFeature().setOptions(new XEditableHtml5TypesOptions(XEditableDataTypes.Url));
	}

}
