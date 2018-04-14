/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.xeditable;

import com.jwebmp.Feature;
import com.jwebmp.base.html.Link;

import static com.jwebmp.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * @param <O>
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public class XEditableFeature<O extends XEditableOptions>
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
		addQuery(getComponent().getJQueryID() + "editable(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
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
