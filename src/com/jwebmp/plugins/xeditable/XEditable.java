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

package com.jwebmp.plugins.xeditable;

import com.jwebmp.base.html.Link;
import com.jwebmp.base.html.attributes.LinkAttributes;
import com.jwebmp.plugins.ComponentInformation;

import static com.jwebmp.utilities.StaticStrings.STRING_HASH;

/**
 * This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only)
 * and includes both popup and inline modes. Please try out demo to
 * see how it works.
 *
 * @param <O>
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
@ComponentInformation(name = "XEditable Core Component",
		description = "The core XEditable Components",
		url = "https://vitalets.github.io/x-editable/docs.html")
public class XEditable<O extends XEditableOptions> extends Link<XEditable<O>>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The Feature for the items
	 */
	private XEditableFeature feature;

	/**
	 * Constructs displaying a certain text
	 *
	 * @param displayedText
	 */
	public XEditable(String displayedText)
	{
		this();
		setText(displayedText);
	}

	/*
	 * Constructs a new XEditable
	 */
	public XEditable()
	{
		addAttribute(LinkAttributes.HRef, STRING_HASH);
	}

	@Override
	public O getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Returns a feature never null
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public XEditableFeature<O> getFeature()
	{
		if (feature == null)
		{
			feature = new XEditableFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the feature of this component
	 *
	 * @param feature
	 *
	 * @return
	 */
	public XEditable setFeature(XEditableFeature feature)
	{
		this.feature = feature;
		return this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
