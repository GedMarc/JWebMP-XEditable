package com.jwebmp.plugins.xeditable.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class XEditableInclusionsModule implements IGuiceScanModuleInclusions<XEditableInclusionsModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.xeditable");
		return set;
	}
}
