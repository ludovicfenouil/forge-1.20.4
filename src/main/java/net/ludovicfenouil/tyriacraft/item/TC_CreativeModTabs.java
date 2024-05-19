package net.ludovicfenouil.tyriacraft.item;

import net.ludovicfenouil.tyriacraft.TyriaCraft;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(TC_Items.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tyriacraft_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(TC_Items.SAPPHIRE.get());
                        pOutput.accept(TC_Items.RAW_SAPPHIRE.get());
                        pOutput.accept(Items.DIAMOND);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
