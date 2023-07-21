package net.shatterstar9652.wolrs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shatterstar9652.wolrs.WorldOfTheRisingSun;
import net.shatterstar9652.wolrs.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup WOTRS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WorldOfTheRisingSun.MOD_ID, "wotrs"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.wotrs"))
                .icon(() -> new ItemStack(ModItems.GOLDCOIN)).entries((displayContext, entries) -> {
                    entries.add(ModItems.GOLDCOIN);
                    entries.add(ModItems.IRONCOIN);
                    entries.add(ModItems.VULSSIANRUBLE);
                    entries.add(ModItems.CONORVIDADOLLAR);
                    entries.add(ModBlocks.TEST_BLOCK);

                }).build());

    public static void registerItemGroups() {
        WorldOfTheRisingSun.LOGGER.info("Registering Item Groups For " + WorldOfTheRisingSun.MOD_ID);
    }
}
