package za.co.mmagon.jwebswing.plugins.xeditable;

/**
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public enum XEditableDataTypes
{
	Text,
	Textarea,
	Select,
	/**
	 * The email type
	 */
	Email,
	/**
	 * The date input type
	 */
	Date,
	/**
	 * The date time input type
	 */
	Datetime,
	DateUi,
	Checklist,
	ComboDate,
	Html5Types,
	/**
	 * The Input Password object represents an HTML input element with type="password".
	 */
	Password,
	/**
	 * Input URL Object
	 * <p>
	 * The Input URL Object is new in HTML5.
	 * <p>
	 * The Input URL object represents an HTML input element with type="url".
	 * <p>
	 * Note: input elements with type="url" are not supported in Internet Explorer 9 (and earlier versions), or Safari.
	 */
	Url,
	/**
	 * A telephone entry
	 */
	Tel,
	/**
	 * A number input
	 */
	Number,
	/**
	 * A range input selector
	 */
	Range,
	/**
	 * The Input Time Object is new in HTML5.
	 * <p>
	 * The Input Time object represents an HTML input element with type="time".
	 * <p>
	 * Note: input elements with type="time" are not supported in Internet Explorer or Firefox.
	 * <p>
	 * JWebswing excludes this for lack of support
	 */
	Time;
	/**
	 * Any sub data
	 */
	private String data;

	/**
	 * A new XEditableDataTypes
	 */
	private XEditableDataTypes()
	{

	}

	/**
	 * A new XEditableDataTypes with data
	 */
	private XEditableDataTypes(String data)
	{

	}

	/**
	 * Returns the name or the data contained within
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		if (data != null && !data.isEmpty())
		{
			return data;
		}
		else
		{
			return name();
		}
	}
}
