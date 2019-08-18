package com.jwebmp.plugins.xeditable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.jwebmp.core.generics.Positions;
import com.jwebmp.core.htmlbuilder.css.colours.ColourHexImpl;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.io.Serializable;

/**
 * @author GedMarc
 * @since 13 Jun 2017
 */
public class XEditableOptions<J extends XEditableOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * Additional options for submit ajax request. List of values: http://api.jquery.com/jQuery.ajax
	 */
	private Serializable ajaxOptions;

	/**
	 * Animation speed (inline mode only)
	 */
	@JsonProperty("anim")
	@JsonSerialize(as = ToStringSerializer.class)
	private Number animationSpeed;
	/**
	 * Allows to automatically set element's text based on it's value. Can be auto|always|never. Useful for select and date. For example, if dropdown list is {1: 'a', 2: 'b'} and
	 * element's value set
	 * to 1, it's html will be automatically set to 'a'. auto - text will be automatically set only if element is empty. always|never - always(never) try to set element's text.
	 */
	private String autoText;
	/**
	 * Value that will be displayed in input if original field value is empty (null|undefined|'').
	 */
	private String defaultValue;
	/**
	 * Sets disabled state of editable
	 */
	private Boolean disabled;

	/**
	 * Css class applied when editable text is empty.
	 */
	@JsonProperty("emptyclass")
	private String emptyClass;
	/**
	 * Text shown when element is empty.
	 */
	@JsonProperty("emptytext")
	private String emptyText;
	/**
	 * Color used to highlight element after update. Implemented via CSS3 transition, works in modern browsers.
	 */
	private ColourHexImpl highlight;
	/**
	 * Mode of editable, can be popup or inline
	 */
	private XEditableModes mode;
	/**
	 * Name of field. Will be submitted on server. Can be taken from id attribute
	 */
	private String name;
	/**
	 * Placement of container relative to element. Can be top|right|bottom|left. Not used for inline container.
	 */
	private Positions placement;

	/**
	 * Whether to save or cancel value when it was not changed but form was submitted
	 */
	@JsonProperty("savenochange")
	private Boolean saveNoChange;

	/**
	 * If selector is provided, editable will be delegated to the specified targets. Usefull for dynamically generated DOM elements. Please note, that delegated targets can't be
	 * initialized with
	 * emptytext and autotext options, as they actually become editable only after first click. You should manually set class editable-click to these elements. Also, if element
	 * originally empty you
	 * should add class editable-empty, set data-value="" and write emptytext into element:
	 * <p>
	 * &lt;div id="user"&gt;
	 * <p>
	 * &lt;!-- empty --&gt;
	 * <p>
	 * &lt;a href="#" data-name="username" data-type="text" class="editable-click editable-empty" data-value="" title="Username"&gt;Empty&lt;/a&gt;
	 * <p>
	 * &lt;!-- non-empty --&gt;
	 * <p>
	 * &lt;a href="#" data-name="group" data-type="select" data-source="/groups" data-value="1" class="editable-click" title="Group"&gt;Operator&lt;/a&gt;
	 * <p>
	 * &lt;/div&gt;
	 * <p>
	 * $('#user').editable({ selector: 'a', url: '/post', pk: 1 });
	 */
	private String selector;
	/**
	 * Strategy for sending data on server. Can be auto|always|never. When 'auto' data will be sent on server only if pk and url defined, otherwise new value will be stored
	 * locally.
	 */
	private String send;
	/**
	 * Where to show buttons: left(true)|bottom|false Form without buttons is auto-submitted.
	 */
	@JsonProperty("showbutton")
	private Boolean showButton;
	/**
	 * How to toggle editable. Can be click|dblclick|mouseenter|manual.
	 * <p>
	 * When set to manual you should manually call show/hide methods of editable. Note: if you call show or toggle inside click handler of some DOM element, you need to apply
	 * e.stopPropagation()
	 * because containers are being closed on any click on document.
	 * <p>
	 * $('#edit-button').click(function(e) { e.stopPropagation(); $('#username').editable('toggle'); });
	 */
	private String toggle;
	/**
	 * There are several input types supported by library. Each type may have additional configuration options. Input options are defined as well as other parameters of
	 * $().editable() method.
	 * Currently supported:
	 */
	private XEditableDataTypes type;
	/**
	 * Css class applied when value was stored but not sent to server (pk is empty or send = 'never').
	 * <p>
	 * You may set it to null if you work with editables locally and submit them together.
	 */
	@JsonProperty("unsavedclass")
	private String unsavedClass;

	/**
	 * Function for client-side validation. If returns string - means validation not passed and string showed as error.
	 * <p>
	 * Since 1.5.1 you can modify submitted value by returning object from validate:
	 * <p>
	 * {newValue: '...'} or {newValue: '...', msg: '...'}
	 * <p>
	 * validate: function(value) { if($.trim(value) == '') { return 'This field is required'; } }
	 */
	@JsonIgnore
	private String validationMessage;
	/**
	 * Initial value of input. If not set, taken from element's text. Note, that if element's text is empty - text is automatically generated from value and can be customized (see
	 * autotext option).
	 * For example, to display currency sign:
	 * <p>
	 * <p>
	 * &lt;a id="price" data-type="text" data-value="100"&gt;&lt;/a&gt;
	 * <p>
	 * $('#price').editable({ ... display: function(value) { $(this).text(value + '$'); } })
	 * <p>
	 * <p>
	 */
	private String value;

	/*
	 * Constructs a new XEditableOptions
	 */
	public XEditableOptions()
	{
		//Nothing needed
	}

	/**
	 * Additional options for submit ajax request. List of values: http://api.jquery.com/jQuery.ajax
	 *
	 * @return
	 */
	public Serializable getAjaxOptions()
	{
		return ajaxOptions;
	}

	/**
	 * Additional options for submit ajax request. List of values: http://api.jquery.com/jQuery.ajax
	 *
	 * @param ajaxOptions
	 *
	 * @return
	 */
	public XEditableOptions setAjaxOptions(Serializable ajaxOptions)
	{
		this.ajaxOptions = ajaxOptions;
		return this;
	}

	/**
	 * Animation speed (inline mode only)
	 *
	 * @return
	 */
	public Number getAnimationSpeed()
	{
		return animationSpeed;
	}

	/**
	 * Animation speed (inline mode only)
	 *
	 * @param animationSpeed
	 *
	 * @return
	 */
	public XEditableOptions setAnimationSpeed(Number animationSpeed)
	{
		this.animationSpeed = animationSpeed;
		return this;
	}

	/**
	 * Allows to automatically set element's text based on it's value. Can be auto|always|never. Useful for select and date. For example, if dropdown list is {1: 'a', 2: 'b'} and
	 * element's value set
	 * to 1, it's html will be automatically set to 'a'. auto - text will be automatically set only if element is empty. always|never - always(never) try to set element's text.
	 *
	 * @return
	 */
	public String getAutoText()
	{
		return autoText;
	}

	/**
	 * Allows to automatically set element's text based on it's value. Can be auto|always|never. Useful for select and date. For example, if dropdown list is {1: 'a', 2: 'b'} and
	 * element's value set
	 * to 1, it's html will be automatically set to 'a'. auto - text will be automatically set only if element is empty. always|never - always(never) try to set element's text.
	 *
	 * @param autoText
	 *
	 * @return
	 */
	public XEditableOptions setAutoText(String autoText)
	{
		this.autoText = autoText;
		return this;
	}

	/**
	 * Value that will be displayed in input if original field value is empty (null|undefined|'').
	 *
	 * @return
	 */
	public String getDefaultValue()
	{
		return defaultValue;
	}

	/**
	 * Value that will be displayed in input if original field value is empty (null|undefined|'').
	 *
	 * @param defaultValue
	 *
	 * @return
	 */
	public XEditableOptions setDefaultValue(String defaultValue)
	{
		this.defaultValue = defaultValue;
		return this;
	}

	/**
	 * Sets disabled state of editable
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Sets disabled state of editable
	 *
	 * @param disabled
	 *
	 * @return
	 */
	public XEditableOptions setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return this;
	}

	/**
	 * CSS class applied when editable text is empty.
	 *
	 * @return
	 */
	public String getEmptyClass()
	{
		return emptyClass;
	}

	/**
	 * CSS class applied when editable text is empty.
	 *
	 * @param emptyClass
	 *
	 * @return
	 */
	public XEditableOptions setEmptyClass(String emptyClass)
	{
		this.emptyClass = emptyClass;
		return this;
	}

	/**
	 * Text shown when element is empty.
	 *
	 * @return
	 */
	public String getEmptyText()
	{
		return emptyText;
	}

	/**
	 * Text shown when element is empty.
	 *
	 * @param emptyText
	 *
	 * @return
	 */
	public XEditableOptions setEmptyText(String emptyText)
	{
		this.emptyText = emptyText;
		return this;
	}

	/**
	 * Color used to highlight element after update. Implemented via CSS3 transition, works in modern browsers.
	 *
	 * @return
	 */
	public ColourHexImpl getHighlight()
	{
		return highlight;
	}

	/**
	 * Color used to highlight element after update. Implemented via CSS3 transition, works in modern browsers.
	 *
	 * @param highlight
	 *
	 * @return
	 */
	public XEditableOptions setHighlight(ColourHexImpl highlight)
	{
		this.highlight = highlight;
		return this;
	}

	/**
	 * Mode of editable, can be popup or inline
	 *
	 * @return
	 */
	public XEditableModes getMode()
	{
		return mode;
	}

	/**
	 * Mode of editable, can be popup or inline
	 *
	 * @param mode
	 *
	 * @return
	 */
	public XEditableOptions setMode(XEditableModes mode)
	{
		this.mode = mode;
		return this;
	}

	/**
	 * Name of field. Will be submitted on server. Can be taken from id attribute
	 *
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Name of field. Will be submitted on server. Can be taken from id attribute
	 *
	 * @param name
	 *
	 * @return
	 */
	public XEditableOptions setName(String name)
	{
		this.name = name;
		return this;
	}

	/**
	 * Placement of container relative to element. Can be top|right|bottom|left. Not used for inline container.
	 *
	 * @return
	 */
	public Positions getPlacement()
	{
		return placement;
	}

	/**
	 * Placement of container relative to element. Can be top|right|bottom|left. Not used for inline container.
	 *
	 * @param placement
	 *
	 * @return
	 */
	public XEditableOptions setPlacement(Positions placement)
	{
		this.placement = placement;
		return this;
	}

	/**
	 * Whether to save or cancel value when it was not changed but form was submitted
	 *
	 * @return
	 */
	public Boolean getSaveNoChange()
	{
		return saveNoChange;
	}

	/**
	 * Whether to save or cancel value when it was not changed but form was submitted
	 *
	 * @param saveNoChange
	 *
	 * @return
	 */
	public XEditableOptions setSaveNoChange(Boolean saveNoChange)
	{
		this.saveNoChange = saveNoChange;
		return this;
	}

	/**
	 * If selector is provided, editable will be delegated to the specified targets. Usefull for dynamically generated DOM elements. Please note, that delegated targets can't be
	 * initialized with
	 * emptytext and autotext options, as they actually become editable only after first click. You should manually set class editable-click to these elements. Also, if element
	 * originally empty you
	 * should add class editable-empty, set data-value="" and write emptytext into element:
	 * <p>
	 * &lt;div id="user"&gt;
	 * <p>
	 * &lt;!-- empty --&gt;
	 * <p>
	 * &lt;a href="#" data-name="username" data-type="text" class="editable-click editable-empty" data-value="" title="Username"&gt;Empty&lt;/a&gt;
	 * <p>
	 * &lt;!-- non-empty --&gt;
	 * <p>
	 * &lt;a href="#" data-name="group" data-type="select" data-source="/groups" data-value="1" class="editable-click" title="Group"&gt;Operator&lt;/a&gt;
	 * <p>
	 * &lt;/div&gt;
	 * <p>
	 * $('#user').editable({ selector: 'a', url: '/post', pk: 1 });
	 *
	 * @return
	 */
	public String getSelector()
	{
		return selector;
	}

	/**
	 * If selector is provided, editable will be delegated to the specified targets. Usefull for dynamically generated DOM elements. Please note, that delegated targets can't be
	 * initialized with
	 * emptytext and autotext options, as they actually become editable only after first click. You should manually set class editable-click to these elements. Also, if element
	 * originally empty you
	 * should add class editable-empty, set data-value="" and write emptytext into element:
	 * <p>
	 * &lt;div id="user"&gt;
	 * <p>
	 * &lt;!-- empty --&gt;
	 * <p>
	 * &lt;a href="#" data-name="username" data-type="text" class="editable-click editable-empty" data-value="" title="Username"&gt;Empty&lt;/a&gt;
	 * <p>
	 * &lt;!-- non-empty --&gt;
	 * <p>
	 * &lt;a href="#" data-name="group" data-type="select" data-source="/groups" data-value="1" class="editable-click" title="Group"&gt;Operator&lt;/a&gt;
	 * <p>
	 * &lt;/div&gt;
	 * <p>
	 * $('#user').editable({ selector: 'a', url: '/post', pk: 1 });
	 *
	 * @param selector
	 *
	 * @return
	 */
	public XEditableOptions setSelector(String selector)
	{
		this.selector = selector;
		return this;
	}

	/**
	 * Strategy for sending data on server. Can be auto|always|never. When 'auto' data will be sent on server only if pk and url defined, otherwise new value will be stored
	 * locally.
	 *
	 * @return
	 */
	public String getSend()
	{
		return send;
	}

	/**
	 * Strategy for sending data on server. Can be auto|always|never. When 'auto' data will be sent on server only if pk and url defined, otherwise new value will be stored
	 * locally.
	 *
	 * @param send
	 *
	 * @return
	 */
	public XEditableOptions setSend(String send)
	{
		this.send = send;
		return this;
	}

	/**
	 * Where to show buttons: left(true)|bottom|false Form without buttons is auto-submitted.
	 *
	 * @return
	 */
	public Boolean getShowButton()
	{
		return showButton;
	}

	/**
	 * Where to show buttons: left(true)|bottom|false Form without buttons is auto-submitted.
	 *
	 * @param showButton
	 *
	 * @return
	 */
	public XEditableOptions setShowButton(Boolean showButton)
	{
		this.showButton = showButton;
		return this;
	}

	/**
	 * How to toggle editable. Can be click|dblclick|mouseenter|manual.
	 * <p>
	 * When set to manual you should manually call show/hide methods of editable. Note: if you call show or toggle inside click handler of some DOM element, you need to apply
	 * e.stopPropagation()
	 * because containers are being closed on any click on document.
	 * <p>
	 * $('#edit-button').click(function(e) { e.stopPropagation(); $('#username').editable('toggle'); });
	 *
	 * @return
	 */
	public String getToggle()
	{
		return toggle;
	}

	/**
	 * How to toggle editable. Can be click|dblclick|mouseenter|manual.
	 * <p>
	 * When set to manual you should manually call show/hide methods of editable. Note: if you call show or toggle inside click handler of some DOM element, you need to apply
	 * e.stopPropagation()
	 * because containers are being closed on any click on document.
	 * <p>
	 * $('#edit-button').click(function(e) { e.stopPropagation(); $('#username').editable('toggle'); });
	 *
	 * @param toggle
	 *
	 * @return
	 */
	public XEditableOptions setToggle(String toggle)
	{
		this.toggle = toggle;
		return this;
	}

	/**
	 * There are several input types supported by library. Each type may have additional configuration options. Input options are defined as well as other parameters of
	 * $().editable() method.
	 * Currently supported:
	 *
	 * @return
	 */
	public XEditableDataTypes getType()
	{
		return type;
	}

	/**
	 * There are several input types supported by library. Each type may have additional configuration options. Input options are defined as well as other parameters of
	 * $().editable() method.
	 * Currently supported:
	 *
	 * @param type
	 *
	 * @return
	 */
	public XEditableOptions setType(XEditableDataTypes type)
	{
		this.type = type;
		return this;
	}

	/**
	 * Css class applied when value was stored but not sent to server (pk is empty or send = 'never').
	 * <p>
	 * You may set it to null if you work with editables locally and submit them together.
	 *
	 * @return
	 */
	public String getUnsavedClass()
	{
		return unsavedClass;
	}

	/**
	 * Css class applied when value was stored but not sent to server (pk is empty or send = 'never').
	 * <p>
	 * You may set it to null if you work with editables locally and submit them together.
	 *
	 * @param unsavedClass
	 *
	 * @return
	 */
	public XEditableOptions setUnsavedClass(String unsavedClass)
	{
		this.unsavedClass = unsavedClass;
		return this;
	}

	@JsonProperty("validation")
	@JsonRawValue
	protected String getValidation()
	{
		return "function(value) {\n"
		       + "    if($.trim(value) == '') {\n"
		       + "        return '" + getValidationMessage() + "';\n"
		       + "    }\n"
		       + "}";
	}

	/**
	 * Function for client-side validation. If returns string - means validation not passed and string showed as error. Since 1.5.1 you can modify submitted value by returning
	 * object from validate:
	 * {newValue: '...'} or {newValue: '...', msg: '...'}
	 * <p>
	 * <p>
	 * validate: function(value) { if($.trim(value) == '') { return 'This field is required'; } }
	 *
	 * @return
	 */
	public String getValidationMessage()
	{
		return validationMessage;
	}

	/**
	 * Function for client-side validation. If returns string - means validation not passed and string showed as error. Since 1.5.1 you can modify submitted value by returning
	 * object from validate:
	 * {newValue: '...'} or {newValue: '...', msg: '...'}
	 * <p>
	 * validate: function(value) { if($.trim(value) == '') { return 'This field is required'; } }
	 *
	 * @param validationMessage
	 *
	 * @return
	 */
	public XEditableOptions setValidationMessage(String validationMessage)
	{
		this.validationMessage = validationMessage;
		return this;
	}

	/**
	 * Initial value of input. If not set, taken from element's text. Note, that if element's text is empty - text is automatically generated from value and can be customized (see
	 * autotext option).
	 * For example, to display currency sign:
	 * <p>
	 * <p>
	 * &lt;a id="price" data-type="text" data-value="100"&gt;&lt;/a&gt;
	 * <p>
	 * $('#price').editable({ ... display: function(value) { $(this).text(value + '$'); } })
	 * <p>
	 * <p>
	 *
	 * @return
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Initial value of input. If not set, taken from element's text. Note, that if element's text is empty - text is automatically generated from value and can be customized (see
	 * autotext option).
	 * For example, to display currency sign:
	 * <p>
	 * <p>
	 * &lt;a id="price" data-type="text" data-value="100"&gt;&lt;/a&gt;
	 * <p>
	 * $('#price').editable({ ... display: function(value) { $(this).text(value + '$'); } })
	 * <p>
	 * <p>
	 *
	 * @param value
	 *
	 * @return
	 */
	public XEditableOptions setValue(String value)
	{
		this.value = value;
		return this;
	}

}
