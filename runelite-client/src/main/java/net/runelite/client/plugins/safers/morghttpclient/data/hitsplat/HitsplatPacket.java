package net.runelite.client.plugins.safers.morghttpclient.data.hitsplat;

import net.runelite.client.plugins.safers.morghttpclient.data.PacketTypes;

public class HitsplatPacket
{
	public String packetType = PacketTypes.hitsplat.name();

	public String playerName; // Name of the client player
	public String targetName; // Name of the player being hit
	public int damage;
	public int tick;
}
