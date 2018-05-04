package com.massivecraft.massivecore.command.type.primitive;

import org.bukkit.command.CommandSender;

public class TypeInteger extends TypeAbstractNumber<Integer>
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static TypeInteger i = new TypeInteger();
	public static TypeInteger get() { return i; }
	public TypeInteger() { super(Integer.class); }
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public String getName()
	{
		return "n�mero";
	}

	@Override
	public Integer valueOf(String arg, CommandSender sender) throws Exception
	{
		return Integer.parseInt(arg);
	}

}