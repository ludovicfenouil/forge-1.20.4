package net.ludovicfenouil.tyriacraft.block;

import net.ludovicfenouil.tyriacraft.TyriaCraft;
import net.ludovicfenouil.tyriacraft.item.TC_Items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class TC_Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TyriaCraft.MOD_ID);

    // Maple Leaves
    public static final RegistryObject<Block> GREEN_MAPLE_LEAVES = registerBlock("green_maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> TENDER_MAPLE_LEAVES = registerBlock("tender_maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> GOLDEN_MAPLE_LEAVES = registerBlock("golden_maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> OCHER_MAPLE_LEAVES = registerBlock("ocher_maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> CRIMSON_MAPLE_LEAVES = registerBlock("crimson_maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> PURPLE_MAPLE_LEAVES = registerBlock("purple_maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    // Oak Leaves
    public static final RegistryObject<Block> GOLDEN_OAK_LEAVES = registerBlock("golden_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> OCHER_OAK_LEAVES = registerBlock("ocher_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> CRIMSON_OAK_LEAVES = registerBlock("crimson_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    // Aspen Leaves
    public static final RegistryObject<Block> GREEN_ASPEN_LEAVES = registerBlock("green_aspen_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> TENDER_ASPEN_LEAVES = registerBlock("tender_aspen_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> GOLDEN_ASPEN_LEAVES = registerBlock("golden_aspen_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> OCHER_ASPEN_LEAVES = registerBlock("ocher_aspen_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    // Beech Leaves
    public static final RegistryObject<Block> TENDER_BEECH_LEAVES = registerBlock("tender_beech_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> GOLDEN_BEECH_LEAVES = registerBlock("golden_beech_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> OCHER_BEECH_LEAVES = registerBlock("ocher_beech_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> CRIMSON_BEECH_LEAVES = registerBlock("crimson_beech_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> PURPLE_BEECH_LEAVES = registerBlock("purple_beech_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    // Spruce Leaves
    public static final RegistryObject<Block> FROZEN_SPRUCE_LEAVES = registerBlock("frozen_spruce_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> SNOWY_SPRUCE_LEAVES = registerBlock("snowy_spruce_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return TC_Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
