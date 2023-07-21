package net.shatterstar9652.wolrs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shatterstar9652.wolrs.WorldOfTheRisingSun;

public class ModItems {
    public static final Item GOLDCOIN = registerItem("gold_coin", new Item(new FabricItemSettings()));
    public static final Item IRONCOIN = registerItem("iron_coin", new Item(new FabricItemSettings()));
    public static final Item VULSSIANRUBLE = registerItem("vulssian_ruble", new Item(new FabricItemSettings()));
    public static final Item CONORVIDADOLLAR = registerItem("conorvida_dollar", new Item(new FabricItemSettings()));

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(GOLDCOIN);
        entries.add(IRONCOIN);
        entries.add(VULSSIANRUBLE);
        entries.add(CONORVIDADOLLAR);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WorldOfTheRisingSun.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WorldOfTheRisingSun.LOGGER.info("Registering Mod Items for " + WorldOfTheRisingSun.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }
}
