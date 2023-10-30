package net.loxymore.all_ladders.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.loxymore.all_ladders.AllLadders;
import net.loxymore.all_ladders.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MORE_LADDERS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AllLadders.MOD_ID,"all_ladders"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.all_ladders"))
                    .icon(() -> new ItemStack(ModBlocks.JUNGLE_LADDER)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.JUNGLE_LADDER);
                    }).build());
    public static void registerItemGroups(){
        AllLadders.LOGGER.info("Registering Mod Item Groups for the " + AllLadders.MOD_ID + " Mod !");
    }
}
