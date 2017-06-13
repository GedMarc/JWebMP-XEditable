package za.co.mmagon.jwebswing.plugins.xeditable.components;

import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.xeditable.XEditable;
import za.co.mmagon.jwebswing.plugins.xeditable.XEditableDataTypes;
import za.co.mmagon.jwebswing.plugins.xeditable.options.XEditableHtml5TypesOptions;

/**
 * XEditable Text
 * <p>
 * This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes. Please try out demo to
 * see how it works.
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
@ComponentInformation(name = "XEditable Html Password Component",
        description = "The Html 6 Types XEditable Component",
        url = "https://vitalets.github.io/x-editable/docs.html#html5types")
public class XEditablePassword extends XEditable<XEditableHtml5TypesOptions>
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new XEditableText
     */
    public XEditablePassword()
    {
        getFeature().setOptions(new XEditableHtml5TypesOptions(XEditableDataTypes.Password));
    }

}
