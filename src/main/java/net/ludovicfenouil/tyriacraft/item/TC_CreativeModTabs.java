package net.ludovicfenouil.tyriacraft.item;

import net.ludovicfenouil.tyriacraft.TyriaCraft;
import net.ludovicfenouil.tyriacraft.block.TC_Blocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TC_CreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TyriaCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TYRIACRAFT_TAB = CREATIVE_MODE_TABS.register("tyriacraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(TC_Blocks.GOLDEN_OAK_LEAVES.get()))
                    .title(Component.translatable("creativetab.tyriacraft_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        /* Tutorial */
                        pOutput.accept(TC_Items.SAPPHIRE.get());
                        pOutput.accept(TC_Items.RAW_SAPPHIRE.get());
                        //pOutput.accept(Items.DIAMOND);
                        /* Maple Leaves */
                        pOutput.accept(TC_Blocks.GREEN_MAPLE_LEAVES.get());
                        pOutput.accept(TC_Blocks.TENDER_MAPLE_LEAVES.get());
                        pOutput.accept(TC_Blocks.GOLDEN_MAPLE_LEAVES.get());
                        pOutput.accept(TC_Blocks.OCHER_MAPLE_LEAVES.get());
                        pOutput.accept(TC_Blocks.CRIMSON_MAPLE_LEAVES.get());
                        pOutput.accept(TC_Blocks.PURPLE_MAPLE_LEAVES.get());
                        /* Oak Leaves */
                        pOutput.accept(TC_Blocks.GOLDEN_OAK_LEAVES.get());
                        pOutput.accept(TC_Blocks.OCHER_OAK_LEAVES.get());
                        pOutput.accept(TC_Blocks.CRIMSON_OAK_LEAVES.get());
                        /* Aspen Leaves */
                        pOutput.accept(TC_Blocks.GREEN_ASPEN_LEAVES.get());
                        pOutput.accept(TC_Blocks.TENDER_ASPEN_LEAVES.get());
                        pOutput.accept(TC_Blocks.GOLDEN_ASPEN_LEAVES.get());
                        pOutput.accept(TC_Blocks.OCHER_ASPEN_LEAVES.get());
                        /* Beech Leaves */
                        pOutput.accept(TC_Blocks.TENDER_BEECH_LEAVES.get());
                        pOutput.accept(TC_Blocks.GOLDEN_BEECH_LEAVES.get());
                        pOutput.accept(TC_Blocks.OCHER_BEECH_LEAVES.get());
                        pOutput.accept(TC_Blocks.CRIMSON_BEECH_LEAVES.get());
                        pOutput.accept(TC_Blocks.PURPLE_BEECH_LEAVES.get());
                        /* Spruce Leaves */
                        pOutput.accept(TC_Blocks.FROZEN_SPRUCE_LEAVES.get());
                        pOutput.accept(TC_Blocks.SNOWY_SPRUCE_LEAVES.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
