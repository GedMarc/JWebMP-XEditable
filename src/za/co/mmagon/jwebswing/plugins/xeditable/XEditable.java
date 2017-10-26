package za.co.mmagon.jwebswing.plugins.xeditable;

import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.attributes.LinkAttributes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * This library allows you to create editable elements on your page. It can be used with any engine (bootstrap, jquery-ui, jquery only) and includes both popup and inline modes. Please try out demo to
 * see how it works.
 *
 * @param <O>
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
@ComponentInformation(name = "XEditable Core Component",
		description = "The core XEditable Components",
		url = "https://vitalets.github.io/x-editable/docs.html")
public class XEditable<O extends XEditableOptions>
		extends Link<XEditable<O>>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The Feature for the items
	 */
	private XEditableFeature feature;

	/*
	 * Constructs a new XEditable
	 */
	public XEditable()
	{
		addAttribute(LinkAttributes.HRef, "#");
	}

	/**
	 * Constructs displaying a certain text
	 *
	 * @param displayedText
	 */
	public XEditable(String displayedText)
	{
		this();
		setText(displayedText);
	}

	/**
	 * Returns a feature never null
	 *
	 * @return
	 */
	public XEditableFeature<O> getFeature()
	{
		if (feature == null)
		{
			feature = new XEditableFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the feature of this component
	 *
	 * @param feature
	 *
	 * @return
	 */
	public XEditable setFeature(XEditableFeature feature)
	{
		this.feature = feature;
		return this;
	}

	@Override
	public O getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof XEditable))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		XEditable<?> xEditable = (XEditable<?>) o;

		return getFeature().equals(xEditable.getFeature());
	}
}
