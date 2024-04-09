package com.arkflame.modernlib.menus;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import com.arkflame.modernlib.menus.items.MenuItem;
import com.arkflame.modernlib.utils.ChatColors;

public class Menu implements InventoryHolder {
    private Inventory inventory;
    private Map<Integer, MenuItem> items = new HashMap<>();

    public Menu(String title, int rows) {
        this.inventory = Bukkit.createInventory(this, 9 * rows, ChatColors.color(title));
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public void openInventory(Player player) {
        player.openInventory(inventory);
    }

    public void setItem(int slot, MenuItem item) {
        inventory.setItem(slot, item);
        items.put(slot, item);
    }

    public MenuItem getItem(int slot) {
        return items.getOrDefault(slot, null);
    }
}