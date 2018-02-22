package io.github.hsyyid.commandsigns.listeners;

import io.github.hsyyid.commandsigns.data.Data;
import org.spongepowered.api.block.tileentity.TileEntity;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.block.InteractBlockEvent;
import org.spongepowered.api.event.filter.cause.First;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.util.ArrayList;

public class HitBlockListener {
    @Listener
    public void onPlayerHitBlock(InteractBlockEvent.Primary event, @First Player player) {
        if (!event.getTargetBlock().getLocation().isPresent()) {
            return;
        }

        Location<World> location = event.getTargetBlock().getLocation().get();

        if (!location.getTileEntity().isPresent()) {
            return;
        }

        TileEntity tile = location.getTileEntity().get();

        if (!tile.get(Data.class).isPresent()) {
            return;
        }

        Data data = tile.get(Data.class).get();

        if (player.hasPermission("commandsigns.destroy")) {
            tile.remove(Data.class);
            player.sendMessage(Text.of(TextColors.GOLD, "[CommandSigns]: ", TextColors.GRAY, "Successfully removed CommandSign!"));
        } else {
            player.sendMessage(Text.of(TextColors.GOLD, "[CommandSigns]: ", TextColors.DARK_RED, "Error! ", TextColors.RED, "You do not have permission to break CommandSigns!"));
            event.setCancelled(true);
        }
    }
}