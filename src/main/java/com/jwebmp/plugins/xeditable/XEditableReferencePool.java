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

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum XEditableReferencePool
		implements ReferencePool
{
	XEditable(new JavascriptReference("XEditable", 1.6, "bower_components/x-editable/dist/bootstrap3-editable/js/bootstrap-editable.js"),
	          new CSSReference("XEditable", 1.6, "bower_components/x-editable/dist/bootstrap3-editable/css/bootstrap-editable.css")),
	XEditableTypeAhead(new JavascriptReference("XEditableTypeAhead", 1.6, "bower_components/x-editable/dist/inputs-ext/typeaheadjs/lib/typeahead.js"),
	                   new CSSReference("XEditableTypeAhead", 1.6, "bower_components/x-editable/dist/inputs-ext/typeaheadjs/lib/typeahead.js-bootstrap.css")),
	XEditableTypeAheadJS(new JavascriptReference("XEditableTypeAheadJS", 1.6, "bower_components/x-editable/dist/inputs-ext/typeaheadjs/typeaheadjs.js"),
	                     null),
	;
	/**
	 * Any sub data
	 */
	private String data;
	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;

	/**
	 * A new AngularSlimScrollReferencePool
	 */
	XEditableReferencePool()
	{

	}

	XEditableReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
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
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
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
