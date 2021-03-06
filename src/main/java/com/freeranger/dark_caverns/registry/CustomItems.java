package com.freeranger.dark_caverns.registry;

import com.freeranger.dark_caverns.DarkCaverns;
import com.freeranger.dark_caverns.armor.*;
import com.freeranger.dark_caverns.items.*;
import net.minecraft.advancements.AdvancementManager;
import net.minecraft.entity.item.EnderPearlEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CustomItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DarkCaverns.MOD_ID);

    public static final RegistryObject<Item> SCORCHED_BERRIES = ITEMS.register(
            "scorched_berries",
            () -> new BlockNamedItem(CustomBlocks.SCORCHED_BERRY_BUSH.get(), (new Item.Properties().tab(CustomItemGroups.GROUP).food(
                    new Food.Builder().effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 320), 1f)
                    .alwaysEat().fast().nutrition(3).saturationMod(0.2f).build())
            ))
    );

    public static final RegistryObject<Item> KEY_TO_THE_CAVERNS = ITEMS.register(
            "key_to_the_caverns",
            () -> new KeyToTheCavernsItem(new Item.Properties().tab(CustomItemGroups.GROUP).stacksTo(1))
    );

    public static final RegistryObject<Item> SCORCHLING_TAIL = ITEMS.register(
            "scorchling_tail", () -> new Item(new Item.Properties().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> SCORCHED_MEAT = ITEMS.register(
            "scorched_meat",
            () -> new Item(new Item.Properties().tab(CustomItemGroups.GROUP).food(
                    new Food.Builder().effect(() -> new EffectInstance(Effects.SATURATION, 620), 1f)
                            .alwaysEat().nutrition(7).saturationMod(0.7f).build())
            )
    );

    public static final RegistryObject<CustomSpawnEggItem> SCORCHHOUND_SPAWN_EGG = ITEMS.register(
            "scorchhound_spawn_egg",
            () -> new CustomSpawnEggItem(CustomEntityTypes.SCORCHHOUND_ENTITY, 5195333, 16737280)
    );

    public static final RegistryObject<CustomSpawnEggItem> MOLTENER_SPAWN_EGG = ITEMS.register(
            "moltener_spawn_egg",
            () -> new CustomSpawnEggItem(CustomEntityTypes.MOLTENER_ENTITY, 5195333, 4018742)
    );

    public static final RegistryObject<CustomSpawnEggItem> CAMOROCK_SPAWN_EGG = ITEMS.register(
            "camorock_spawn_egg",
            () -> new CustomSpawnEggItem(CustomEntityTypes.CAMOROCK_ENTITY, 4342338, 15263976)
    );

    public static final RegistryObject<CustomSpawnEggItem> SHROOMIE_SPAWN_EGG = ITEMS.register(
            "shroomie_spawn_egg",
            () -> new CustomSpawnEggItem(CustomEntityTypes.SHROOMIE_ENTITY, 6663388, 16777215)
    );

    public static final RegistryObject<CustomSpawnEggItem> SHROOMLING_SPAWN_EGG = ITEMS.register(
            "shroomling_spawn_egg",
            () -> new CustomSpawnEggItem(CustomEntityTypes.SHROOMLING_ENTITY, 6663388, 16777215)
    );

    public static final RegistryObject<CustomSpawnEggItem> LUMINITE_GOLEM_SPAWN_EGG = ITEMS.register(
            "luminite_golem_spawn_egg",
            () -> new CustomSpawnEggItem(CustomEntityTypes.LUMINITE_GOLEM_ENTITY, 4935256, 3276702)
    );

    public static final RegistryObject<CustomSpawnEggItem> LUMINITE_FOX_SPAWN_EGG = ITEMS.register(
            "luminite_fox_spawn_egg",
            () -> new CustomSpawnEggItem(CustomEntityTypes.LUMINITE_FOX_ENTITY, 4935256, 3276702)
    );

    public static final RegistryObject<CustomSpawnEggItem> SCORCHLING_SPAWN_EGG = ITEMS.register(
            "scorchling_spawn_egg",
            () -> new CustomSpawnEggItem(CustomEntityTypes.SCORCHLING_ENTITY, 5195333, 16751880)
    );

    public static final RegistryObject<Item> LUMINITE_DUST = ITEMS.register(
            "luminite_dust",
            () -> new Item(new Item.Properties().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> HELLSTONE = ITEMS.register(
            "hellstone",
            () -> new Item(new Item.Properties().fireResistant().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> HELLSTONE_ROCK = ITEMS.register(
            "hellstone_rock",
            () -> new Item(new Item.Properties().fireResistant().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> PLATINUM_PIECE = ITEMS.register(
            "platinum_piece",
            () -> new Item(new Item.Properties().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> SHROOMSTONE = ITEMS.register(
            "shroomstone",
            () -> new Item(new Item.Properties().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> SHROOMSTONE_PIECE = ITEMS.register(
            "shroomstone_piece",
            () -> new Item(new Item.Properties().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> SCORCHSTEEL_INGOT = ITEMS.register(
            "scorchsteel_ingot",
            () -> new Item(new Item.Properties().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register(
            "platinum_ingot",
            () -> new Item(new Item.Properties().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> THROWABLE_LUMINITE_TORCH = ITEMS.register(
            "throwable_luminite_torch",
            () -> new ThrowableLuminiteTorchItem(new Item.Properties().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> SHROOMBOMB = ITEMS.register(
            "shroombomb",
            () -> new ShroombombItem(new Item.Properties().tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> CORRUPTED_PEARL = ITEMS.register(
            "corrupted_pearl",
            () -> new CorruptedPearlItem(new Item.Properties().stacksTo(16).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> LUMINITE_HELMET = ITEMS.register(
            "luminite_helmet",
            () -> new ArmorItem(
                    LuminiteArmorMaterial.LUMINITE,
                    EquipmentSlotType.HEAD,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register(
            "platinum_sword",
            () -> new SwordItem(CustomItemTiers.PLATINUM, 3, -2.4f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register(
            "platinum_axe",
            () -> new AxeItem(CustomItemTiers.PLATINUM, 5f, -3f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register(
            "platinum_pickaxe",
            () -> new PickaxeItem(CustomItemTiers.PLATINUM, 1, -2.8f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register(
            "platinum_shovel",
            () -> new ShovelItem(CustomItemTiers.PLATINUM, 1.5f, -3f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register(
            "platinum_hoe",
            () -> new HoeItem(CustomItemTiers.PLATINUM, -4, 0f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> HELLSTONE_SWORD = ITEMS.register(
            "hellstone_sword",
            () -> new HellstoneSwordItem(CustomItemTiers.HELLSTONE, 3, -2.4f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> HELLSTONE_AXE = ITEMS.register(
            "hellstone_axe",
            () -> new HellstoneAxeItem(CustomItemTiers.HELLSTONE, 5f, -3f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> HELLSTONE_PICKAXE = ITEMS.register(
            "hellstone_pickaxe",
            () -> new HellstonePickaxeItem(CustomItemTiers.HELLSTONE, 1, -2.8f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> HELLSTONE_SHOVEL = ITEMS.register(
            "hellstone_shovel",
            () -> new HellstoneShovelItem(CustomItemTiers.HELLSTONE, 1.5f, -3f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> HELLSTONE_HOE = ITEMS.register(
            "hellstone_hoe",
            () -> new HellstoneHoeItem(CustomItemTiers.HELLSTONE, -4, 0f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> SHROOMSTONE_SWORD = ITEMS.register(
            "shroomstone_sword",
            () -> new ShroomstoneSwordItem(CustomItemTiers.SHROOMSTONE, 3, -2.4f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> SHROOMSTONE_AXE = ITEMS.register(
            "shroomstone_axe",
            () -> new ShroomstoneAxeItem(CustomItemTiers.SHROOMSTONE, 5f, -3f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> SHROOMSTONE_PICKAXE = ITEMS.register(
            "shroomstone_pickaxe",
            () -> new ShroomstonePickaxeItem(CustomItemTiers.SHROOMSTONE, 1, -2.8f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> SHROOMSTONE_SHOVEL = ITEMS.register(
            "shroomstone_shovel",
            () -> new ShroomstoneShovelItem(CustomItemTiers.SHROOMSTONE, 1.5f, -3f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> SHROOMSTONE_HOE = ITEMS.register(
            "shroomstone_hoe",
            () -> new ShroomstoneHoeItem(CustomItemTiers.SHROOMSTONE, -4, 0f, (new Item.Properties()).tab(CustomItemGroups.GROUP))
    );

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register(
            "platinum_helmet",
            () -> new ArmorItem(
                    PlatinumArmorMaterial.PLATINUM,
                    EquipmentSlotType.HEAD,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register(
            "platinum_chestplate",
            () -> new ArmorItem(
                    PlatinumArmorMaterial.PLATINUM,
                    EquipmentSlotType.CHEST,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register(
            "platinum_leggings",
            () -> new ArmorItem(
                    PlatinumArmorMaterial.PLATINUM,
                    EquipmentSlotType.LEGS,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register(
            "platinum_boots",
            () -> new ArmorItem(
                    PlatinumArmorMaterial.PLATINUM,
                    EquipmentSlotType.FEET,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> SHROOMSTONE_HELMET = ITEMS.register(
            "shroomstone_helmet",
            () -> new ShroomstoneArmorItem(
                    ShroomstoneArmorMaterial.SHROOMSTONE,
                    EquipmentSlotType.HEAD,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> SHROOMSTONE_CHESTPLATE = ITEMS.register(
            "shroomstone_chestplate",
            () -> new ShroomstoneArmorItem(
                    ShroomstoneArmorMaterial.SHROOMSTONE,
                    EquipmentSlotType.CHEST,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> SHROOMSTONE_LEGGINGS = ITEMS.register(
            "shroomstone_leggings",
            () -> new ShroomstoneArmorItem(
                    ShroomstoneArmorMaterial.SHROOMSTONE,
                    EquipmentSlotType.LEGS,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> SHROOMSTONE_BOOTS = ITEMS.register(
            "shroomstone_boots",
            () -> new ShroomstoneArmorItem(
                    ShroomstoneArmorMaterial.SHROOMSTONE,
                    EquipmentSlotType.FEET,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> HELLSTONE_HELMET = ITEMS.register(
            "hellstone_helmet",
            () -> new HellstoneArmorItem(
                    HellstoneArmorMaterial.HELLSTONE,
                    EquipmentSlotType.HEAD,
                    new Item.Properties().fireResistant().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> HELLSTONE_CHESTPLATE = ITEMS.register(
            "hellstone_chestplate",
            () -> new HellstoneArmorItem(
                    HellstoneArmorMaterial.HELLSTONE,
                    EquipmentSlotType.CHEST,
                    new Item.Properties().fireResistant().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> HELLSTONE_LEGGINGS = ITEMS.register(
            "hellstone_leggings",
            () -> new HellstoneArmorItem(
                    HellstoneArmorMaterial.HELLSTONE,
                    EquipmentSlotType.LEGS,
                    new Item.Properties().fireResistant().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> HELLSTONE_BOOTS = ITEMS.register(
            "hellstone_boots",
            () -> new HellstoneArmorItem(
                    HellstoneArmorMaterial.HELLSTONE,
                    EquipmentSlotType.FEET,
                    new Item.Properties().fireResistant().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> SCORCHSTEEL_HELMET = ITEMS.register(
            "scorchsteel_helmet",
            () -> new ScorchsteelArmorItem(
                    ScorchsteelArmorMaterial.SCORCHSTEEL,
                    EquipmentSlotType.HEAD,
                    new Item.Properties().fireResistant().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> SCORCHSTEEL_CHESTPLATE = ITEMS.register(
            "scorchsteel_chestplate",
            () -> new ScorchsteelArmorItem(
                    ScorchsteelArmorMaterial.SCORCHSTEEL,
                    EquipmentSlotType.CHEST,
                    new Item.Properties().fireResistant().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> SCORCHSTEEL_LEGGINGS = ITEMS.register(
            "scorchsteel_leggings",
            () -> new ScorchsteelArmorItem(
                    ScorchsteelArmorMaterial.SCORCHSTEEL,
                    EquipmentSlotType.LEGS,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> SCORCHSTEEL_BOOTS = ITEMS.register(
            "scorchsteel_boots",
            () -> new ScorchsteelArmorItem(
                    ScorchsteelArmorMaterial.SCORCHSTEEL,
                    EquipmentSlotType.FEET,
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );

    public static final RegistryObject<Item> LUMINITE_TORCH = ITEMS.register(
            "luminite_torch",
            () -> new WallOrFloorItem(
                    CustomBlocks.LUMINITE_TORCH.get(),
                    CustomBlocks.LUMINITE_WALL_TORCH.get(),
                    new Item.Properties().tab(CustomItemGroups.GROUP)
            )
    );
}