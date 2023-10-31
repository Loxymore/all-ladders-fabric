package net.loxymore.all_ladders.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.loxymore.all_ladders.AllLadders;
import net.loxymore.all_ladders.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ALL_LADDERS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AllLadders.MOD_ID,"all_ladders"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.all_ladders"))
                    .icon(() -> new ItemStack(ModBlocks.JUNGLE_LADDER)).entries((displayContext, entries) -> {
                        entries.add(Items.LADDER);
                        entries.add(ModBlocks.SPRUCE_LADDER);
                        entries.add(ModBlocks.BIRCH_LADDER);
                        entries.add(ModBlocks.JUNGLE_LADDER);
                        entries.add(ModBlocks.ACACIA_LADDER);
                        entries.add(ModBlocks.DARK_OAK_LADDER);
                        entries.add(ModBlocks.MANGROVE_LADDER);
                        entries.add(ModBlocks.BAMBOO_LADDER);
                        entries.add(ModBlocks.CHERRY_LADDER);
                        entries.add(ModBlocks.CRIMSON_LADDER);
                        entries.add(ModBlocks.WARPED_LADDER);
                        entries.add(ModBlocks.CHAIN_LADDER);
                        entries.add(ModBlocks.IRON_LADDER);
                        entries.add(ModBlocks.GOLDEN_LADDER);
                    }).build());
    public static void registerItemGroups(){
        AllLadders.LOGGER.info("Registering Mod Item Groups for the " + AllLadders.MOD_ID + " Mod !");
    }
}
