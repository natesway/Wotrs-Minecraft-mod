package net.shatterstar9652.wolrs.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.shatterstar9652.wolrs.WorldOfTheRisingSun;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT).collidable(true).luminance(100).strength(1).sounds(BlockSoundGroup.SUSPICIOUS_GRAVEL)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(WorldOfTheRisingSun.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(WorldOfTheRisingSun.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void  registerModBlocks() {
        WorldOfTheRisingSun.LOGGER.info("Registering ModBlocks for " + WorldOfTheRisingSun.MOD_ID);
    }
}
