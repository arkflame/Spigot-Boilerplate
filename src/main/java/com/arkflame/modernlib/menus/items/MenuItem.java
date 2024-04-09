package com.arkflame.modernlib.menus.items;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.arkflame.modernlib.utils.ChatColors;

public class MenuItem extends ItemStack {
    public MenuItem(Material material, int amount, short damage, String displayName, String... lore) {
        super(material, amount);
        ItemMeta meta = this.getItemMeta();
        if (meta != null) {
            if (displayName != null) {
                meta.setDisplayName(ChatColors.color(displayName));
            }
            if (lore != null && lore.length > 0) {
                meta.setLore(ChatColors.color(Arrays.asList(lore)));
            }

            setItemMeta(meta);
        }
        setDurability(damage);
    }

    public MenuItem(Material material) {
        this(material, 1, (short) 0, null);
    }

    public MenuItem(Material material, String displayName, String... lore) {
        this(material, 1, (short) 0, displayName, lore);
    }

    public void onClick() {
        // Override to implement logic
    }
}