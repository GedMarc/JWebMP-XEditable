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

/**
 * Configuration of combodate. Full list of options: http://vitalets.github.com/combodate/#docs
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public class ComboDateOptions extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;

	/**
	 * In this format date is stored in original input. List of tokens.*
	 */
	private String format;
	/**
	 * In this format dropdowns are displayed. Spaces are converted to &nbsp; for layout tuning.*
	 */
	private String template;
	/**
	 * Initial value. Used as default value if not defined in input.*
	 */
	private String value;
	/**
	 * Minimum value in years dropdown.*
	 */
	private Integer minYear;
	/**
	 * Maximum value in years dropdown.*
	 */
	private Integer maxYear;
	/**
	 * Years order.*
	 */
	private Boolean yearDescending;
	/**
	 * Step of values in minutes dropdown.*
	 */
	private Integer minuteStep;
	/**
	 * Step of values in seconds dropdown.*
	 */
	private Integer secondStep;
	/**
	 * What is shown in first item of all dropdown. Can be empty|name|none.*
	 */
	private String firstItem;
	/**
	 * Css class applied if date is incorrect, e.g. Feb, 31. If null dropdowns appears in red border.*
	 */
	private String errorClass;
	/**
	 * Css class applied to each dropdown.*
	 */
	private String customClass;
	/**
	 * Whether to round minutes and seconds if step greater than 1. E.g. if minuteStep = 5 date 2013-05-04 12:21 will be shown as 2013-05-04 12:20.*
	 */
	private Boolean roundTime;
	/**
	 * If false - number of days in dropdown is always 31.If true - number of days depends on selected month and year.*
	 */
	private Boolean smartDays;


	/*
	 * Constructs a new ComboDateOptions
	 */
	public ComboDateOptions()
	{
		//Nothing needed
	}

	/**
	 * In this format date is stored in original input. List of tokens.
	 *
	 * @return
	 */
	public String getFormat()
	{
		return format;
	}

	/**
	 * In this format date is stored in original input. List of tokens.
	 *
	 * @param format
	 *
	 * @return
	 */
	public ComboDateOptions setFormat(String format)
	{
		this.format = format;
		return this;
	}

	/**
	 * In this format dropdowns are displayed. Spaces are converted to &nbsp; for layout tuning.
	 *
	 * @return
	 */
	public String getTemplate()
	{
		return template;
	}

	/**
	 * In this format dropdowns are displayed. Spaces are converted to &nbsp; for layout tuning.
	 *
	 * @param template
	 *
	 * @return
	 */
	public ComboDateOptions setTemplate(String template)
	{
		this.template = template;
		return this;
	}

	/**
	 * Initial value. Used as default value if not defined in
	 *
	 * @return
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Initial value. Used as default value if not defined in
	 *
	 * @param value
	 *
	 * @return
	 */
	public ComboDateOptions setValue(String value)
	{
		this.value = value;
		return this;
	}

	/**
	 * Minimum value in years dropdown
	 *
	 * @return
	 */
	public Integer getMinYear()
	{
		return minYear;
	}

	/**
	 * Minimum value in years dropdown
	 *
	 * @param minYear
	 *
	 * @return
	 */
	public ComboDateOptions setMinYear(Integer minYear)
	{
		this.minYear = minYear;
		return this;
	}

	/**
	 * Maximum value in years dropdown
	 *
	 * @return
	 */
	public Integer getMaxYear()
	{
		return maxYear;
	}

	/**
	 * Maximum value in years dropdown
	 *
	 * @param maxYear
	 *
	 * @return
	 */
	public ComboDateOptions setMaxYear(Integer maxYear)
	{
		this.maxYear = maxYear;
		return this;
	}

	/**
	 * Years order
	 *
	 * @return
	 */
	public Boolean getYearDescending()
	{
		return yearDescending;
	}

	/**
	 * * Years order
	 *
	 * @param yearDescending
	 *
	 * @return
	 */
	public ComboDateOptions setYearDescending(Boolean yearDescending)
	{
		this.yearDescending = yearDescending;
		return this;
	}

	/**
	 * Step of values in minutes dropdown
	 *
	 * @return
	 */
	public Integer getMinuteStep()
	{
		return minuteStep;
	}

	/**
	 * Step of values in minutes dropdown
	 *
	 * @param minuteStep
	 *
	 * @return
	 */
	public ComboDateOptions setMinuteStep(Integer minuteStep)
	{
		this.minuteStep = minuteStep;
		return this;
	}

	/**
	 * Step of values in seconds dropdown
	 *
	 * @return
	 */
	public Integer getSecondStep()
	{
		return secondStep;
	}

	/**
	 * Step of values in seconds dropdown
	 *
	 * @param secondStep
	 *
	 * @return
	 */
	public ComboDateOptions setSecondStep(Integer secondStep)
	{
		this.secondStep = secondStep;
		return this;
	}

	/**
	 * What is shown in first item of all dropdown. Can be empty|name|none.
	 *
	 * @return
	 */
	public String getFirstItem()
	{
		return firstItem;
	}

	/**
	 * What is shown in first item of all dropdown. Can be empty|name|none.
	 *
	 * @param firstItem
	 *
	 * @return
	 */
	public ComboDateOptions setFirstItem(String firstItem)
	{
		this.firstItem = firstItem;
		return this;
	}

	/**
	 * Css class applied if date is incorrect, e.g. Feb, 31. If null dropdowns appears in red border.
	 *
	 * @return
	 */
	public String getErrorClass()
	{
		return errorClass;
	}

	/**
	 * Css class applied if date is incorrect, e.g. Feb, 31. If null dropdowns appears in red border.
	 *
	 * @param errorClass
	 *
	 * @return
	 */
	public ComboDateOptions setErrorClass(String errorClass)
	{
		this.errorClass = errorClass;
		return this;
	}

	/**
	 * Css class applied to each dropdown
	 *
	 * @return
	 */
	public String getCustomClass()
	{
		return customClass;
	}

	/**
	 * Css class applied to each dropdown
	 *
	 * @param customClass
	 *
	 * @return
	 */
	public ComboDateOptions setCustomClass(String customClass)
	{
		this.customClass = customClass;
		return this;
	}

	/**
	 * Whether to round minutes and seconds if step greater than 1. E.g. if minuteStep = 5 date 2013-05-04 12:21 will be shown as 2013-05-04 12:20.
	 *
	 * @return
	 */
	public Boolean getRoundTime()
	{
		return roundTime;
	}

	/**
	 * Whether to round minutes and seconds if step greater than 1. E.g. if minuteStep = 5 date 2013-05-04 12:21 will be shown as 2013-05-04 12:20.
	 *
	 * @param roundTime
	 *
	 * @return
	 */
	public ComboDateOptions setRoundTime(Boolean roundTime)
	{
		this.roundTime = roundTime;
		return this;
	}

	/**
	 * If false - number of days in dropdown is always 31.If true - number of days depends on selected month and year.
	 *
	 * @return
	 */
	public Boolean getSmartDays()
	{
		return smartDays;
	}

	/**
	 * If false - number of days in dropdown is always 31.If true - number of days depends on selected month and year.
	 *
	 * @param smartDays
	 *
	 * @return
	 */
	public ComboDateOptions setSmartDays(Boolean smartDays)
	{
		this.smartDays = smartDays;
		return this;
	}

}
