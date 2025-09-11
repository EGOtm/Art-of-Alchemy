package net.exonumia.artofalchemy.item;

import net.exonumia.artofalchemy.ArtofAlchemy;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArtofAlchemy.MOD_ID);

    public static final DeferredItem<Item> ACTIVATED_AMARANTH_PEARL = ITEMS.register("activated_amaranth_pearl",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ALCHEMICAL_JOURNAL = ITEMS.register("alchemical_journal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ALCHEMY_FORMULA = ITEMS.register("alchemy_formula",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ALKAHEST_BUCKET = ITEMS.register("alkahest_bucket",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AMARANTH_PEARL = ITEMS.register("amaranth_pearl",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AZOTH = ITEMS.register("azoth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BREWING_FORMULA = ITEMS.register("brewing_formula",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CRACKED_AMARANTH_PEARL = ITEMS.register("cracked_amaranth_pearl",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENCHANTMENT_FORMULA = ITEMS.register("enchantment_formula",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_APOLLO = ITEMS.register("essentia_bucket_apollo",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_CERES = ITEMS.register("essentia_bucket_ceres",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_DIANA = ITEMS.register("essentia_bucket_diana",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_JUPITER = ITEMS.register("essentia_bucket_jupiter",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_MARS = ITEMS.register("essentia_bucket_mars",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_MERCURY = ITEMS.register("essentia_bucket_mercury",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_NEPTUNE = ITEMS.register("essentia_bucket_neptune",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_PLUTO = ITEMS.register("essentia_bucket_pluto",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_SATURN = ITEMS.register("essentia_bucket_saturn",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_TELLUS = ITEMS.register("essentia_bucket_tellus",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_URANUS = ITEMS.register("essentia_bucket_uranus",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_VENUS = ITEMS.register("essentia_bucket_venus",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_BUCKET_VOID = ITEMS.register("essentia_bucket_void",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_EXTRACTOR = ITEMS.register("essentia_extractor",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_INSERTER = ITEMS.register("essentia_inserter",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESSENTIA_PORT = ITEMS.register("essentia_port",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FLAWED_STONE = ITEMS.register("flawed_stone",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ICON_ITEM = ITEMS.register("icon_item",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MATERIA_A = ITEMS.register("materia_a",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MATERIA_B = ITEMS.register("materia_b",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MATERIA_C = ITEMS.register("materia_c",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MATERIA_D = ITEMS.register("materia_d",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MATERIA_E = ITEMS.register("materia_e",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MATERIA_F = ITEMS.register("materia_f",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MATERIA_OMEGA = ITEMS.register("materia_omega",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MATERIA_S = ITEMS.register("materia_s",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PHILOSOPHERS_STONE = ITEMS.register("philosophers_stone",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
