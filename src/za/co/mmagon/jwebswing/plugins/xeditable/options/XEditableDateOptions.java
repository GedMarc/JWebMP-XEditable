package za.co.mmagon.jwebswing.plugins.xeditable.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import za.co.mmagon.jwebswing.plugins.jqueryui.datepicker.JQUIDatePickerOptions;
import za.co.mmagon.jwebswing.plugins.xeditable.XEditableDataTypes;
import za.co.mmagon.jwebswing.plugins.xeditable.XEditableOptions;

/**
 * XEditable Combo Date Input Component
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public class XEditableDateOptions extends XEditableOptions<XEditableDateOptions>
{

	private static final long serialVersionUID = 1L;
	/**
	 * Text shown as clear date button. If false clear button will not be rendered.
	 */
	private Boolean clear;
	/**
	 * Configuration of datepicker. Full list of options: http://api.jqueryui.com/datepicker
	 */
	private JQUIDatePickerOptions datepicker;

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
	public XEditableDateOptions()
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
	public XEditableDateOptions setClear(Boolean clear)
	{
		this.clear = clear;
		return this;
	}

	/**
	 * Configuration of datepicker. Full list of options: http://api.jqueryui.com/datepicker
	 *
	 * @return
	 */
	public JQUIDatePickerOptions getDatepicker()
	{
		return datepicker;
	}

	/**
	 * Configuration of datepicker. Full list of options: http://api.jqueryui.com/datepicker
	 *
	 * @param datepicker
	 *
	 * @return
	 */
	public XEditableDateOptions setDatepicker(JQUIDatePickerOptions datepicker)
	{
		this.datepicker = datepicker;
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
	public XEditableDateOptions setEscape(Boolean escape)
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
	public XEditableDateOptions setFormat(String format)
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
	public XEditableDateOptions setInputClass(String inputClass)
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
	public XEditableDateOptions setTpl(String tpl)
	{
		this.template = tpl;
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
	public XEditableDateOptions setViewFormat(String viewFormat)
	{
		this.viewFormat = viewFormat;
		return this;
	}

}
