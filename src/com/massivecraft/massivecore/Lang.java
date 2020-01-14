package com.massivecraft.massivecore;

import com.massivecraft.massivecore.mson.Mson;
import org.bukkit.ChatColor;

import static com.massivecraft.massivecore.mson.Mson.mson;

public class Lang
{
	public static final String PERM_DEFAULT_DENIED_FORMAT = "�cVoc� n�o tem permiss�o para fazer isso.";
	public static final String PERM_DEFAULT_DESCRIPTION = "�cfazer isso";
	
	public static final String COMMAND_SENDER_MUST_BE_PLAYER = "�cEste comando nao pode ser usado pelo console.";
	public static final String COMMAND_SENDER_MUSNT_BE_PLAYER = "�cEste comando n�o pode ser usado por jogadores.";
	public static final String COMMAND_TITLES_MUST_BE_AVAILABLE = "�cEste comando requer o Minecraft vers�o 1.8 pois ele usa titles.";
	public static final String COMMAND_TOO_FEW_ARGUMENTS = "<i>Voc� usou argumentos inv�lidos para este comando.";
	public static final String COMMAND_TOO_MANY_ARGUMENTS = "<i>Voc� usou muitos argumentos para este comando.";
	public static final String COMMAND_TOO_MANY_ARGUMENTS2 = "<i>Tente usar �6/f ajuda �epara obter ajuda.";
	
	public static final Mson COMMAND_REPLACEMENT = mson("REPLACEMENT").color(ChatColor.YELLOW);
	
	public static final Mson COMMAND_CHILD_AMBIGUOUS = mson("�eComando n�o encontrado.").color(ChatColor.YELLOW).tooltip("�8Clique para �e/f");
	public static final Mson COMMAND_CHILD_NONE = mson("�eComando n�o encontrado.").color(ChatColor.YELLOW).tooltip("�8Clique para �e/f");
	public static final Mson COMMAND_CHILD_HELP = mson("�eUse �6/f �epara abrir o menu de ajuda.").color(ChatColor.YELLOW).tooltip("�8Clique para �e/f");
	
	public static final String COMMAND_TOO_MANY_TAB_SUGGESTIONS = "�cH� �c%d �cpossibilidades de auto-completamento para isto. Tente ser mais especifico.";
}
