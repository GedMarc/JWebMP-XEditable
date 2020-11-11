package com.jwebmp.plugins.xeditable.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class XEditableExclusionsModule
		implements IGuiceScanModuleExclusions<XEditableExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.xeditable");
		return strings;
	}
}
