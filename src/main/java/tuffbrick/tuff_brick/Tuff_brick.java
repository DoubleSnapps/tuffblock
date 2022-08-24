package tuffbrick.tuff_brick;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Tuff_brick implements ModInitializer {
public static final Block TUFF_BRICK = new Block(FabricBlockSettings.of(Material.STONE).strength(7.0f));
//public static BlockItem TUFF_BRICK = new BlockItem()

@Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("tuffbricks", "tuff_brick"), TUFF_BRICK);
        BlockItem register = Registry.register(Registry.ITEM, new Identifier("tuffbricks", "tuff_brick"),
                new BlockItem(TUFF_BRICK, new FabricItemSettings().group(ItemGroup.MISC)));


    }
}
