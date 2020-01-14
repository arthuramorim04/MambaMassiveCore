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
				  Mson.parse("<g><bold>Comandos disponíveis:"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f criar <tag> <nome> <x>-<n> Cria uma nova facção.").suggest("/f criar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f entrar <facção> <x>-<n> Entra em uma facção.").suggest("/f entrar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f convites <x>-<n> Gerencia os convites de facção.").suggest("/f convites"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f perfil <player> <x>-<n> Mostra os status do player.").suggest("/f perfil"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f info <facção> <x>-<n> Mostra as informações da facção.").suggest("/f info"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f membros <facção> <x>-<n> Mostra a lista de membros da facção.").suggest("/f membros"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f home <facção> <x>-<n> Teleporta para a home da facção.").suggest("/f home"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f mapa [on/off] <x>-<n> Mostra o mapa dos territórios.").suggest("/f mapa"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f top <x>-<n> Abre o menu do Rank das facções.").suggest("/f top"));
		
		FACTION_HELP = mson(
				  Mson.NEWLINE,
				  Mson.parse("<g><bold>Comandos disponíveis:"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f perfil <player> <x>-<n> Mostra os status do player.").suggest("/f perfil"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f info <facção> <x>-<n> Mostra as informações da facção.").suggest("/f info"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f membros <facção> <x>-<n> Mostra a lista de membros da facção.").suggest("/f membros"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f home <facção> <x>-<n> Teleporta para a home da facção.").suggest("/f home"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f mapa [on/off] <x>-<n> Mostra o mapa dos territórios.").suggest("/f mapa"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f top <x>-<n> Abre o menu do Rank das facções.").suggest("/f top"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f terras <x>-<n> Mostra todas as terras da facção.").suggest("/f terras"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f geradores <x>-<n> Gerencia os geradores da facção.").suggest("/f geradores"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f proteger <x>-<n> Protege territórios temporariamente.").suggest("/f proteger"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f dominar <x>-<n> Conquista territórios para sua facção.").suggest("/f dominar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f abandonar <x>-<n> Abandona territórios da sua facção.").suggest("/f abandonar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f relação <x>-<n> Gerencia as relações da facção.").suggest("/f relação"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f convites <x>-<n> Gerencia os convites da facção.").suggest("/f convites"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f promover <player> <x>-<n> Promove um player de cargo.").suggest("/f promover"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f transferir <player> <x>-<n> Transfere a liderança da facção.").suggest("/f transferir"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f rebaixar <player> <x>-<n> Rebaixa um player de cargo.").suggest("/f rebaixar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f expulsar <player> <x>-<n> Expulsa um player da facção.").suggest("/f expulsar"),
				  Mson.NEWLINE,
				  Mson.parse("<g>/f verterras <x>-<n> Mostra as delimitações das terras.").suggest("/f verterras")
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
		this.setDesc("§6 ?,ajuda §e[página] §8-§7 Abre o menu de ajuda.");
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
