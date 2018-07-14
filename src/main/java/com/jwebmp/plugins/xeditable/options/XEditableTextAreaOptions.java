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

package com.jwebmp.plugins.xeditable.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.plugins.xeditable.XEditableDataTypes;
import com.jwebmp.plugins.xeditable.XEditableOptions;

/**
 * XEditable Text Area Input Component
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public class XEditableTextAreaOptions
		extends XEditableOptions
{

	private static final long serialVersionUID = 1L;
	/**
	 * If true - html will be escaped in content of element via $.text() method.
	 * <p>
	 * If false - html will not be escaped, $.html() used.
	 * <p>
	 * When you use own display function, this option obviosly has no effect.
	 */
	private Boolean escape;
	/**
	 * CSS class automatically applied to input
	 */
	@JsonProperty("inputclass")
	private String inputClass;
	/**
	 * Placeholder attribute of input. Shown when input is empty.
	 */
	@JsonProperty("placeholder")
	private String placeHolder;
	/**
	 * Number of rows in textarea
	 */
	private Integer rows;

	/**
	 * HTML template of input. Normally you should not change it.
	 */
	@JsonProperty("tpl")
	private String template;

	/**
	 * Construct a new instance of the editable text area
	 */
	public XEditableTextAreaOptions()
	{
		setType(XEditableDataTypes.Textarea);
	}

	/**
	 * If true - html will be escaped in content of element via $.text() method.
	 * <p>
	 * If false - html will not be escaped, $.html() used.
	 * <p>
	 * When you use own display function, this option obviosly has no effect.
	 *
	 * @return
	 */
	public Boolean getEscape()
	{
		return escape;
	}

	/**
	 * If true - html will be escaped in content of element via $.text() method.
	 * <p>
	 * If false - html will not be escaped, $.html() used.
	 * <p>
	 * When you use own display function, this option obviosly has no effect.
	 *
	 * @param escape
	 *
	 * @return
	 */
	public XEditableTextAreaOptions setEscape(Boolean escape)
	{
		this.escape = escape;
		return this;
	}

	/**
	 * CSS class automatically applied to input
	 *
	 * @return
	 */
	public String getInputClass()
	{
		return inputClass;
	}

	/**
	 * CSS class automatically applied to input
	 *
	 * @param inputClass
	 *
	 * @return
	 */
	public XEditableTextAreaOptions setInputClass(String inputClass)
	{
		this.inputClass = inputClass;
		return this;
	}

	/**
	 * Placeholder attribute of input. Shown when input is empty.
	 *
	 * @return
	 */
	public String getPlaceHolder()
	{
		return placeHolder;
	}

	/**
	 * Placeholder attribute of input. Shown when input is empty.
	 *
	 * @param placeHolder
	 *
	 * @return
	 */
	public XEditableTextAreaOptions setPlaceHolder(String placeHolder)
	{
		this.placeHolder = placeHolder;
		return this;
	}

	/**
	 * Number of rows in textarea
	 *
	 * @return
	 */
	public Integer getRows()
	{
		return rows;
	}

	/**
	 * Number of rows in textarea
	 *
	 * @param rows
	 *
	 * @return
	 */
	public XEditableTextAreaOptions setRows(Integer rows)
	{
		this.rows = rows;
		return this;
	}

	/**
	 * HTML template of input. Normally you should not change it.
	 *
	 * @return
	 */
	public String getTemplate()
	{
		return template;
	}

	/**
	 * HTML template of input. Normally you should not change it.
	 *
	 * @param tpl
	 *
	 * @return
	 */
	public XEditableTextAreaOptions setTpl(String tpl)
	{
		this.template = tpl;
		return this;
	}
}
