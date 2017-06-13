package za.co.mmagon.jwebswing.plugins.xeditable.options.items;

import java.util.ArrayList;
import java.util.List;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * All the options available for a select option
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public class XEditableSelectOption extends JavaScriptPart
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
