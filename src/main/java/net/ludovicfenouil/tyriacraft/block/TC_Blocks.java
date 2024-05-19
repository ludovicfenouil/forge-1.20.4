package net.ludovicfenouil.tyriacraft.block;

import net.ludovicfenouil.tyriacraft.TyriaCraft;
import net.ludovicfenouil.tyriacraft.item.TC_Items;
import net.minecraft.util.datafix.fixes.StriderGravityFix;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class TC_Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TyriaCraft.MOD_ID);

    public static final RegistryObject<Block> GREEN_MAPLE_LEAVES = registerBlock("green_maple_leaves",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> GOLDEN_OAK_LEAVES = registerBlock("golden_oak_leaves",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return TC_Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
