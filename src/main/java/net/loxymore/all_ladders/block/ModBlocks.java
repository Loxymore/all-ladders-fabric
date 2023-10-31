package net.loxymore.all_ladders.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.loxymore.all_ladders.AllLadders;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LadderBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER)));
    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER)));
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER)));
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER)));
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER)));
    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER)));
    public static final Block WARPED_LADDER = registerBlock("warped_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER)));
    public static final Block CHAIN_LADDER = registerBlock("chain_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.CHAIN).requiresTool()));
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER)));
    public static final Block BAMBOO_LADDER = registerBlock("bamboo_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER)));
    public static final Block CHERRY_LADDER = registerBlock("cherry_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER)));
    public static final Block IRON_LADDER = registerBlock("iron_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.METAL).requiresTool()));
    public static final Block GOLDEN_LADDER = registerBlock("golden_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.METAL).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AllLadders.MOD_ID,name),block);
    }
    private static void addItemsToFunctionalItemGroup(FabricItemGroupEntries entries){
        entries.add(SPRUCE_LADDER);
        entries.add(BIRCH_LADDER);
        entries.add(JUNGLE_LADDER);
        entries.add(ACACIA_LADDER);
        entries.add(DARK_OAK_LADDER);
        entries.add(MANGROVE_LADDER);
        entries.add(BAMBOO_LADDER);
        entries.add(CHERRY_LADDER);
        entries.add(CRIMSON_LADDER);
        entries.add(WARPED_LADDER);
        entries.add(CHAIN_LADDER);
        entries.add(IRON_LADDER);
        entries.add(GOLDEN_LADDER);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(AllLadders.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        AllLadders.LOGGER.info("Registering Ladders for the " + AllLadders.MOD_ID + " Mod !");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModBlocks::addItemsToFunctionalItemGroup);
    }
}
