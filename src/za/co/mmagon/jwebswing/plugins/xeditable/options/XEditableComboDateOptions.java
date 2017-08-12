package za.co.mmagon.jwebswing.plugins.xeditable.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import za.co.mmagon.jwebswing.plugins.xeditable.XEditableDataTypes;
import za.co.mmagon.jwebswing.plugins.xeditable.XEditableOptions;
import za.co.mmagon.jwebswing.plugins.xeditable.options.items.ComboDateOptions;

/**
 * XEditable Combo Date Input Component
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public class XEditableComboDateOptions extends XEditableOptions<XEditableComboDateOptions>
{

	private static final long serialVersionUID = 1L;
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
		this.comboDate = datepicker;
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
	public XEditableComboDateOptions setViewFormat(String viewFormat)
	{
		this.viewFormat = viewFormat;
		return this;
	}

}
