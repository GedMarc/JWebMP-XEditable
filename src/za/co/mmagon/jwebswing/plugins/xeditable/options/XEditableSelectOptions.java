package za.co.mmagon.jwebswing.plugins.xeditable.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import za.co.mmagon.jwebswing.plugins.xeditable.XEditableDataTypes;
import za.co.mmagon.jwebswing.plugins.xeditable.XEditableOptions;
import za.co.mmagon.jwebswing.plugins.xeditable.options.items.XEditableSelectOption;

/**
 * XEditable Text Input Component
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public class XEditableSelectOptions extends XEditableOptions<XEditableSelectOptions>
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
     * Data automatically prepended to the beginning of dropdown list.
     */
    private String prepend;
    /**
     * HTML template of input. Normally you should not change it.
     */
    @JsonProperty("tpl")
    private String template;
    /**
     *
     * Source data for list.
     * <p>
     * <p>
     * If array - it should be in format: [{value: 1, text: "text1"}, {value: 2, text: "text2"}, ...]
     * <p>
     * children supported to render OPTGROUP (for select input only). [{text: "group1", children: [{value: 1, text: "text1"}, {value: 2, text: "text2"}]}, ...]
     * <p>
     * For compability, object format is also supported: {"1": "text1", "2": "text2" ...} but it does not guarantee elements order.
     * <p>
     */
    private List<XEditableSelectOption> source;
    /**
     * if true and source is string url - results will be cached for fields with the same source.
     * <p>
     * Usefull for editable column in grid to prevent extra requests.
     */
    private Boolean sourceCache;
    /**
     * Error message when list cannot be loaded (e.g. ajax error)
     */
    private String sourceError;

    /*
     * Constructs a new XEditableTextOptions
     */
    public XEditableSelectOptions()
    {
        setType(XEditableDataTypes.Text);
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
    public XEditableSelectOptions setEscape(Boolean escape)
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
    public XEditableSelectOptions setInputClass(String inputClass)
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
    public XEditableSelectOptions setTpl(String tpl)
    {
        this.template = tpl;
        return this;
    }

    /**
     * Data automatically prepended to the beginning of dropdown list.
     *
     * @return
     */
    public String getPrepend()
    {
        return prepend;
    }

    /**
     * Data automatically prepended to the beginning of dropdown list.
     *
     * @param prepend
     *
     * @return
     */
    public XEditableSelectOptions setPrepend(String prepend)
    {
        this.prepend = prepend;
        return this;
    }

    /**
     * Source data for list.
     * <p>
     * <p>
     * If array - it should be in format: [{value: 1, text: "text1"}, {value: 2, text: "text2"}, ...]
     * <p>
     * children supported to render OPTGROUP (for select input only). [{text: "group1", children: [{value: 1, text: "text1"}, {value: 2, text: "text2"}]}, ...]
     * <p>
     * For compability, object format is also supported: {"1": "text1", "2": "text2" ...} but it does not guarantee elements order.
     * <p>
     * @return
     */
    public List<XEditableSelectOption> getSource()
    {
        if (source == null)
        {
            source = new ArrayList<>();
        }
        return source;
    }

    /**
     * Source data for list.
     * <p>
     * <p>
     * If array - it should be in format: [{value: 1, text: "text1"}, {value: 2, text: "text2"}, ...]
     * <p>
     * children supported to render OPTGROUP (for select input only). [{text: "group1", children: [{value: 1, text: "text1"}, {value: 2, text: "text2"}]}, ...]
     * <p>
     * For compability, object format is also supported: {"1": "text1", "2": "text2" ...} but it does not guarantee elements order.
     * <p>
     * @param source
     *
     * @return
     */
    public XEditableSelectOptions setSource(List<XEditableSelectOption> source)
    {
        this.source = source;
        return this;
    }

    /**
     * if true and source is string url - results will be cached for fields with the same source.
     * <p>
     * Usefull for editable column in grid to prevent extra requests.
     *
     * @return
     */
    public Boolean getSourceCache()
    {
        return sourceCache;
    }

    /**
     * if true and source is string url - results will be cached for fields with the same source.
     * <p>
     * Usefull for editable column in grid to prevent extra requests.
     *
     * @param sourceCache
     *
     * @return
     */
    public XEditableSelectOptions setSourceCache(Boolean sourceCache)
    {
        this.sourceCache = sourceCache;
        return this;
    }

    /**
     * Error message when list cannot be loaded (e.g. ajax error)
     *
     * @return
     */
    public String getSourceError()
    {
        return sourceError;
    }

    /**
     * Error message when list cannot be loaded (e.g. ajax error)
     *
     * @param sourceError
     *
     * @return
     */
    public XEditableSelectOptions setSourceError(String sourceError)
    {
        this.sourceError = sourceError;
        return this;
    }

}
