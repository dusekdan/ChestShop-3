package com.Acrobot.ChestShop.Listeners.Item;

import com.Acrobot.ChestShop.Signs.ChestShopSign;
import org.bukkit.block.BlockState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

/**
 * @author Acrobot
 */
public class ItemMoveListener implements Listener {

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
    public static void onItemMove(InventoryMoveItemEvent event) {
        if (event.getSource() == null || event.getDestination().getHolder() instanceof BlockState) {
            return;
        }

        if (!ChestShopSign.isShopBlock(event.getSource().getHolder())) {
            return;
        }

        event.setCancelled(true);
    }
}
