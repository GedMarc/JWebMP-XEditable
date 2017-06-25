package za.co.mmagon.jwebswing.plugins.xeditable;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.Link;

/**
 *
 * @author Marc Magon
 * @param <O>
 *
 * @since 13 Jun 2017
 */
public class XEditableFeature<O extends XEditableOptions<O>>
        extends Feature<O, XEditableFeature<O>>
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new XEditableFeature
     */
    public XEditableFeature(Link editable)
    {
        super("xeditableFeature", editable);
    }

    @Override
    protected void assignFunctionsToComponent()
    {
        addQuery(getComponent().getJQueryID() + "editable(" + getOptions() + ");");
        super.assignFunctionsToComponent();
    }

    @Override
    public O getOptions()
    {
        if (super.getOptions() == null)
        {
            setOptions((O) new XEditableOptions());
        }
        return super.getOptions();
    }

}
