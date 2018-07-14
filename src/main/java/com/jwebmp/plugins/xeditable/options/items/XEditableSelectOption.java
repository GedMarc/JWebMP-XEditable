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

package com.jwebmp.plugins.xeditable.options.items;

import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * All the options available for a select option
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public class XEditableSelectOption
		extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;
	/**
	 * A value to identify the select option
	 */
	private Long value;
	/**
	 * The text to display, can be a component
	 */
	private String text;
	/**
	 * Since 1.4.1 key children supported to render OPTGROUP (for select input only).
	 * <p>
	 * [{text: "group1", children: [{value: 1, text: "text1"}, {value: 2, text: "text2"}]}, ...]
	 * <p>
	 */
	private List<XEditableSelectOption> children;

	/*
	 * Constructs a new XEditableSelectOption
	 */
	public XEditableSelectOption()
	{
		//Nothing needed
	}

	/**
	 * Since 1.4.1 key children supported to render OPTGROUP (for select input only).
	 * <p>
	 * [{text: "group1", children: [{value: 1, text: "text1"}, {value: 2, text: "text2"}]}, ...]
	 *
	 * @return
	 */
	public List<XEditableSelectOption> getChildren()
	{
		if (children == null)
		{
			children = new ArrayList<>();
		}
		return children;
	}

	/**
	 * Since 1.4.1 key children supported to render OPTGROUP (for select input only).
	 * <p>
	 * [{text: "group1", children: [{value: 1, text: "text1"}, {value: 2, text: "text2"}]}, ...]
	 *
	 * @param children
	 *
	 * @return
	 */
	public XEditableSelectOption setChildren(List<XEditableSelectOption> children)
	{
		this.children = children;
		return this;
	}

	/**
	 * A value to identify the select option
	 *
	 * @return
	 */
	public Long getValue()
	{
		return value;
	}

	/**
	 * A value to identify the select option
	 *
	 * @param value
	 *
	 * @return
	 */
	public XEditableSelectOption setValue(Long value)
	{
		this.value = value;
		return this;
	}

	/**
	 * The text to display, can be a component
	 *
	 * @return
	 */
	public String getText()
	{
		return text;
	}

	/**
	 * The text to display, can be a component
	 *
	 * @param text
	 *
	 * @return
	 */
	public XEditableSelectOption setText(String text)
	{
		this.text = text;
		return this;
	}

}
