package za.co.mmagon.jwebswing.plugins.xeditable;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum XEditableReferencePool implements ReferencePool
{
    XEditable(new JavascriptReference("XEditable", 1.6, "bower_components/x-editable/dist/bootstrap3-editable/js/bootstrap-editable.js"),
            new CSSReference("XEditable", 1.6, "bower_components/x-editable/dist/bootstrap3-editable/css/bootstrap-editable.css")),
    XEditableTypeAhead(new JavascriptReference("XEditableTypeAhead", 1.6, "bower_components/x-editable/dist/inputs-ext/typeaheadjs/lib/typeahead.js"),
            new CSSReference("XEditableTypeAhead", 1.6, "bower_components/x-editable/dist/inputs-ext/typeaheadjs/lib/typeahead.js-bootstrap.css")),
    XEditableTypeAheadJS(new JavascriptReference("XEditableTypeAheadJS", 1.6, "bower_components/x-editable/dist/inputs-ext/typeaheadjs/typeaheadjs.js"),
            null),;
    /**
     * Any sub data
     */
    private String data;

    /**
     * A new AngularSlimScrollReferencePool
     */
    private XEditableReferencePool()
    {

    }

    /**
     * A new AngularSlimScrollReferencePool with data
     */
    private XEditableReferencePool(String data)
    {

    }

    private JavascriptReference javaScriptReference;
    private CSSReference cssReference;

    private XEditableReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
    {
        this.javaScriptReference = javaScriptReference;
        if (this.javaScriptReference != null)
        {
            this.javaScriptReference.setPriority(RequirementsPriority.DontCare);
        }
        this.cssReference = cssReference;
        if (this.cssReference != null)
        {
            this.cssReference.setPriority(RequirementsPriority.DontCare);
        }
    }

    @Override
    public JavascriptReference getJavaScriptReference()
    {
        return javaScriptReference;
    }

    @Override
    public void setJavaScriptReference(JavascriptReference javaScriptReference)
    {
        this.javaScriptReference = javaScriptReference;
    }

    @Override
    public CSSReference getCssReference()
    {
        return cssReference;
    }

    @Override
    public void setCssReference(CSSReference cssReference)
    {
        this.cssReference = cssReference;
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
