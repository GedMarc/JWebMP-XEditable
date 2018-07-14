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
 * XEditable Text Input Component
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public class XEditableHtml5TypesOptions
		extends XEditableOptions
{

	private static final long serialVersionUID = 1L;

	/**
	 * Whether to show clear button
	 */
	private Boolean clear;
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
	 * HTML template of input. Normally you should not change it.
	 */
	@JsonProperty("tpl")
	private String template;

	/**
	 * Constructs a new options
	 */
	public XEditableHtml5TypesOptions()
	{
	}

	/*
	 * Constructs a new XEditableTextOptions
	 */
	public XEditableHtml5TypesOptions(XEditableDataTypes type)
	{
		setType(type);
	}

	/**
	 * Whether to show clear button
	 *
	 * @return
	 */
	public Boolean getClear()
	{
		return clear;
	}

	/**
	 * Whether to show clear button
	 *
	 * @param clear
	 *
	 * @return
	 */
	public XEditableOptions setClear(Boolean clear)
	{
		this.clear = clear;
		return this;
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
	public XEditableHtml5TypesOptions setEscape(Boolean escape)
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
	public XEditableHtml5TypesOptions setInputClass(String inputClass)
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
	public XEditableHtml5TypesOptions setPlaceHolder(String placeHolder)
	{
		this.placeHolder = placeHolder;
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
	public XEditableHtml5TypesOptions setTpl(String tpl)
	{
		this.template = tpl;
		return this;
	}

}
