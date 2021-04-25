/*
 * Copyright (c) 2021. This program is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program.  If not, see <https://www.gnu.org/licenses/gpl-3.0.html>
 *
 *  Contact information:
 *  Richard Simpson <magnum1997@gmail.com>
 *  19084 Leaf Lane
 *  Redding, CA 96003
 *  USA
 */

package com.reallemc;

import org.bukkit.block.CommandBlock;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class CheckSender {


    public static boolean isPlayer(CommandSender sender) {
        return (sender instanceof Player);
    }

    public static boolean isConsole(CommandSender sender) {
        return (sender instanceof ConsoleCommandSender);
    }

    public static boolean isCommand(CommandSender sender) {
        return (sender instanceof CommandBlock);
    }


}


