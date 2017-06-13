package za.co.mmagon.jwebswing.plugins.xeditable.components;

import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.xeditable.XEditable;
import za.co.mmagon.jwebswing.plugins.xeditable.options.XEditableSelectOptions;

/**
 * XEditable Select Drop Down
 * <p>
 * This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes. Please try out demo to
 * see how it works.
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
@ComponentInformation(name = "XEditable Select Component",
        description = "The Select Drop Down XEditable Component",
        url = "https://vitalets.github.io/x-editable/docs.html#textarea")
public class XEditableSelect extends XEditable<XEditableSelectOptions>
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new XEditableText
     */
    public XEditableSelect()
    {
        getFeature().setOptions(new XEditableSelectOptions());
    }

}
