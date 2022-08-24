package tuffbrick.tuff_brick;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Tuff_brick implements ModInitializer {
public static final Block TUFF_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(7.0f));
public static final Item  TUFF_BRICK = new Item(new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

@Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("tuffbricks", "tuff_brick"), TUFF_BLOCK);

    //public static final Block TUFF_BLOCK,













        BlockItem register = Registry.register(Registry.ITEM, new Identifier("tuffbricks", "tuff_brick"),
                new BlockItem(TUFF_BRICK, new FabricItemSettings().group(ItemGroup.MISC)));







}
}
