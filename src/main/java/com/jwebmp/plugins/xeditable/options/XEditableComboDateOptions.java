/*
 * Copyright (C) 2017 GedMarc
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
import com.jwebmp.plugins.xeditable.options.items.ComboDateOptions;

/**
 * XEditable Combo Date Input Component
 *
 * @author GedMarc
 * @since 13 Jun 2017
 */
public class XEditableComboDateOptions
		extends XEditableOptions<XEditableComboDateOptions>
{


	/**
	 * Text shown as clear date button. If false clear button will not be rendered.
	 */
	private Boolean clear;
	/**
	 * Configuration of datepicker. Full list of options: http://api.jqueryui.com/datepicker
	 */
	@JsonProperty("combodate")
	private ComboDateOptions comboDate;

	/**
	 * If true - html will be escaped in content of element via $.text() method.
	 * <p>
	 * If false - html will not be escaped, $.html() used.
	 * <p>
	 * When you use own display function, this option obviosly has no effect.
	 */
	private Boolean escape;
	/**
	 * Format used for sending value to server. Also applied when converting date from data-value attribute.
	 */
	private String format;

	/**
	 * CSS class automatically applied to input
	 */
	@JsonProperty("inputclass")
	private String inputClass;

	/**
	 * HTML template of input. Normally you should not change it.
	 */
	@JsonProperty("tpl")
	private String template;
	/**
	 * Format used for displaying date. Also applied when converting date from element's text on init. If not specified equals to format
	 */
	@JsonProperty("viewformat")
	private String viewFormat;

	/**
	 * Constructs a new date
	 */
	public XEditableComboDateOptions()
	{
		setType(XEditableDataTypes.DateUi);
	}

	/**
	 * Text shown as clear date button. If false clear button will not be rendered.
	 *
	 * @return
	 */
	public Boolean getClear()
	{
		return clear;
	}

	/**
	 * Text shown as clear date button. If false clear button will not be rendered.
	 *
	 * @param clear
	 *
	 * @return
	 */
	public XEditableComboDateOptions setClear(Boolean clear)
	{
		this.clear = clear;
		return this;
	}

	/**
	 * Configuration of datepicker. Full list of options: http://api.jqueryui.com/datepicker
	 *
	 * @return
	 */
	public ComboDateOptions getDatepicker()
	{
		return comboDate;
	}

	/**
	 * Configuration of datepicker. Full list of options: http://api.jqueryui.com/datepicker
	 *
	 * @param datepicker
	 *
	 * @return
	 */
	public XEditableComboDateOptions setDatepicker(ComboDateOptions datepicker)
	{
		comboDate = datepicker;
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
	public XEditableComboDateOptions setEscape(Boolean escape)
	{
		this.escape = escape;
		return this;
	}

	/**
	 * Format used for sending value to server. Also applied when converting date from data-value attribute.
	 *
	 * @return
	 */
	public String getFormat()
	{
		return format;
	}

	/**
	 * Format used for sending value to server. Also applied when converting date from data-value attribute.
	 *
	 * @param format
	 *
	 * @return
	 */
	public XEditableComboDateOptions setFormat(String format)
	{
		this.format = format;
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
	public XEditableComboDateOptions setInputClass(String inputClass)
	{
		this.inputClass = inputClass;
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
	public XEditableComboDateOptions setTpl(String tpl)
	{
		template = tpl;
		return this;
	}

	/**
	 * Format used for displaying date. Also applied when converting date from element's text on init. If not specified equals to format
	 *
	 * @return
	 */
	public String getViewFormat()
	{
		return viewFormat;
	}

	/**
	 * Format used for displaying date. Also applied when converting date from element's text on init. If not specified equals to format
	 *
	 * @param viewFormat
	 *
	 * @return
	 */
	public XEditableComboDateOptions setViewFormat(String viewFormat)
	{
		this.viewFormat = viewFormat;
		return this;
	}

}
