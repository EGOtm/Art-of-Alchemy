package net.exonumia.artofalchemy.item;

import net.exonumia.artofalchemy.ArtofAlchemy;
import net.exonumia.artofalchemy.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArtofAlchemy.MOD_ID);

    public static final Supplier<CreativeModeTab> ART_OF_ALCHEMY_TAB = CREATIVE_MODE_TAB.register("art_of_alchemy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ICON_ITEM.get()))
                    .title(Component.translatable("creativetab.artofalchemy.artofalchemyitems"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.ALCHEMICAL_JOURNAL.get());
                        output.accept(ModItems.MATERIA_A.get());
                        output.accept(ModItems.MATERIA_B.get());
                        output.accept(ModItems.MATERIA_C.get());
                        output.accept(ModItems.MATERIA_D.get());
                        output.accept(ModItems.MATERIA_E.get());
                        output.accept(ModItems.MATERIA_F.get());
                        output.accept(ModItems.MATERIA_OMEGA.get());
                        output.accept(ModItems.MATERIA_S.get());
                        output.accept(ModItems.ACTIVATED_AMARANTH_PEARL.get());
                        output.accept(ModItems.AMARANTH_PEARL.get());
                        output.accept(ModItems.CRACKED_AMARANTH_PEARL.get());
                        output.accept(ModItems.PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.AZOTH.get());
                        output.accept(ModItems.ALKAHEST_BUCKET.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_APOLLO.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_CERES.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_DIANA.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_JUPITER.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_MARS.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_MERCURY.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_NEPTUNE.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_PLUTO.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_SATURN.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_TELLUS.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_URANUS.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_VENUS.get());
                        output.accept(ModItems.ESSENTIA_BUCKET_VOID.get());
                        output.accept(ModItems.ESSENTIA_EXTRACTOR.get());
                        output.accept(ModItems.ESSENTIA_INSERTER.get());
                        output.accept(ModItems.ESSENTIA_PORT.get());
                        output.accept(ModItems.FLAWED_STONE.get());
                        output.accept(ModItems.ICON_ITEM.get());
                        output.accept(ModItems.ALCHEMY_FORMULA.get());
                        output.accept(ModItems.BREWING_FORMULA.get());
                        output.accept(ModItems.ENCHANTMENT_FORMULA.get());
                        output.accept(ModBlocks.MATERIA_OMEGA_BLOCK.get());

                    }).build());



    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
