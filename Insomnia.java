// Insomnia - Disallows sleeping in beds.
// Copyright © 2023 - Obsidianlad
//
// This file is part of Insomnia.
//
// Insomnia is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// Insomnia is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with Insomnia. If not, see <https://www.gnu.org/licenses/>.

package lad.obsidian.insomnia;

import java.util.Random;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.player.PlayerBedEnterEvent;

/**
 * Insomnia Plugin
 *
 * Listens for onEnter events, cancels it, and returns a random hardcoded message.
 */
public class Insomnia extends JavaPlugin implements Listener
{

    /**
     * {@inheritDoc}
     */
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("[Insomnia] enabled");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDisable()
    {
        System.out.println("[Insomnia] disabled");
    }

    /**
     * {@inheritDoc}
     *
     * Listens for onEnter events, cancels it, and returns a random hardcoded message.
     */
    @EventHandler
    public void onEnter(PlayerBedEnterEvent event)
    {
        event.setCancelled(true);

        String[] messages = {
            "You don't really feel like sleeping..",
            "You have insomnia..",
            "You're not really tired..",
            "Sleep is for the weak.",
            "You cannot sleep now.",
            "The sleeping pills aren't working..",
            "Your mind is racing too much to sleep..",
            "You're wide awake.",
            "Your eyes physically cannot close..",
            "You decide not to go to bed.",
            "You're too scared to sleep!",
            "You may not rest now, there are monsters nearby.",
            "You may not rest now, the bed is too far away.",
            "Bed is too far away.",
            "You can only sleep at night.",
            "This bed is occupied.",
            "You can sleep only at night and during thunderstorms.",
            "You're afraid the bed might explode..",
            "The bed is too close!",
            "Maybe tomorrow.",
        };

        event.getPlayer().sendMessage(ChatColor.RED + messages[new Random().nextInt(messages.length)]);
    }
}
