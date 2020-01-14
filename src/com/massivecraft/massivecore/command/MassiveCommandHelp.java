package com.massivecraft.massivecore.command;

import com.massivecraft.factions.entity.MPlayer;
import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.mson.Mson;

public class MassiveCommandHelp extends MassiveCommand
{
	
	protected static final Mson FACTION_HELP;
	protected static final Mson NO_FACTION_HELP;
	
	static {
		NO_FACTION_HELP = mson(
				  Mson.NEWLINE,
				  Mson.parse("<g><bold>Comandos dispon�veis:"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f criar <tag> <nome> <x>-<n> Cria uma nova fac��o.").suggest("/f criar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f entrar <fac��o> <x>-<n> Entra em uma fac��o.").suggest("/f entrar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f convites <x>-<n> Gerencia os convites de fac��o.").suggest("/f convites"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f perfil <player> <x>-<n> Mostra os status do player.").suggest("/f perfil"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f info <fac��o> <x>-<n> Mostra as informa��es da fac��o.").suggest("/f info"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f membros <fac��o> <x>-<n> Mostra a lista de membros da fac��o.").suggest("/f membros"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f home <fac��o> <x>-<n> Teleporta para a home da fac��o.").suggest("/f home"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f mapa [on/off] <x>-<n> Mostra o mapa dos territ�rios.").suggest("/f mapa"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f top <x>-<n> Abre o menu do Rank das fac��es.").suggest("/f top"));
		
		FACTION_HELP = mson(
				  Mson.NEWLINE,
				  Mson.parse("<g><bold>Comandos dispon�veis:"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f perfil <player> <x>-<n> Mostra os status do player.").suggest("/f perfil"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f info <fac��o> <x>-<n> Mostra as informa��es da fac��o.").suggest("/f info"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f membros <fac��o> <x>-<n> Mostra a lista de membros da fac��o.").suggest("/f membros"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f home <fac��o> <x>-<n> Teleporta para a home da fac��o.").suggest("/f home"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f mapa [on/off] <x>-<n> Mostra o mapa dos territ�rios.").suggest("/f mapa"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f top <x>-<n> Abre o menu do Rank das fac��es.").suggest("/f top"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f terras <x>-<n> Mostra todas as terras da fac��o.").suggest("/f terras"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f geradores <x>-<n> Gerencia os geradores da fac��o.").suggest("/f geradores"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f proteger <x>-<n> Protege territ�rios temporariamente.").suggest("/f proteger"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f dominar <x>-<n> Conquista territ�rios para sua fac��o.").suggest("/f dominar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f abandonar <x>-<n> Abandona territ�rios da sua fac��o.").suggest("/f abandonar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f rela��o <x>-<n> Gerencia as rela��es da fac��o.").suggest("/f rela��o"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f convites <x>-<n> Gerencia os convites da fac��o.").suggest("/f convites"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f promover <player> <x>-<n> Promove um player de cargo.").suggest("/f promover"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f transferir <player> <x>-<n> Transfere a lideran�a da fac��o.").suggest("/f transferir"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f rebaixar <player> <x>-<n> Rebaixa um player de cargo.").suggest("/f rebaixar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f expulsar <player> <x>-<n> Expulsa um player da fac��o.").suggest("/f expulsar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f verterras <x>-<n> Mostra as delimita��es das terras.").suggest("/f verterras")
		          	);	
		}
	
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	protected static MassiveCommandHelp i = new MassiveCommandHelp();
	public static MassiveCommandHelp get() { return i; }
	public MassiveCommandHelp()
	{
		// Aliases
		this.addAliases( "ajuda", "?", "help", "h", "duvida");
		
		// Parameters
		this.addParameter(Parameter.getPage());
		
		// Other
		this.setDesc("�6 ?,ajuda �e[p�gina] �8-�7 Abre o menu de ajuda.");
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void perform() throws MassiveException
	{	
		// Sender
		MPlayer msender = MPlayer.get(sender);
		
		// Helpage
		if (msender.hasFaction()) {
			message(FACTION_HELP);
		} else {
			message(NO_FACTION_HELP);
		}
	}
	
}
