package com.freeranger.dark_caverns.registry;

import com.freeranger.dark_caverns.DarkCaverns;
import com.freeranger.dark_caverns.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class CustomBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DarkCaverns.MOD_ID);

    public static final RegistryObject<Block> CARFSTONE = register("carfstone", () -> new Block(
            AbstractBlock.Properties.of(Material.STONE)
                    .strength(4f, 7f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> SMOOTH_CARFSTONE = register("smooth_carfstone", () -> new Block(
                    AbstractBlock.Properties.copy(CARFSTONE.get()))
    );

    public static final RegistryObject<Block> CARFSTONE_BRICKS = register("carfstone_bricks", () -> new Block(
            AbstractBlock.Properties.copy(CARFSTONE.get()))
    );

    public static final RegistryObject<Block> CARFSTONE_BRICK_STAIRS = register("carfstone_brick_stairs", () -> new StairsBlock(
            () -> CARFSTONE_BRICKS.get().defaultBlockState(),
            AbstractBlock.Properties.copy(CARFSTONE_BRICKS.get()))
    );

    public static final RegistryObject<Block> CARFSTONE_BRICK_SLAB = register("carfstone_brick_slab", () -> new SlabBlock(
            AbstractBlock.Properties.copy(CARFSTONE_BRICKS.get()))
    );

    public static final RegistryObject<Block> CARFSTONE_STAIRS = register("carfstone_stairs", () -> new StairsBlock(
            () -> CARFSTONE.get().defaultBlockState(),
            AbstractBlock.Properties.copy(CARFSTONE.get()))
    );

    public static final RegistryObject<Block> CARFSTONE_SLAB = register("carfstone_slab", () -> new SlabBlock(
            AbstractBlock.Properties.copy(CARFSTONE.get()))
    );

    public static final RegistryObject<Block> SMOOTH_CARFSTONE_STAIRS = register("smooth_carfstone_stairs", () -> new StairsBlock(
            () -> SMOOTH_CARFSTONE.get().defaultBlockState(),
            AbstractBlock.Properties.copy(SMOOTH_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> SMOOTH_CARFSTONE_SLAB = register("smooth_carfstone_slab", () -> new SlabBlock(
            AbstractBlock.Properties.copy(SMOOTH_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> CARFSTONE_WALL = register("carfstone_wall", () -> new WallBlock(
            AbstractBlock.Properties.copy(CARFSTONE.get()))
    );

    public static final RegistryObject<Block> SMOOTH_CARFSTONE_WALL = register("smooth_carfstone_wall", () -> new WallBlock(
            AbstractBlock.Properties.copy(SMOOTH_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> CARFSTONE_BRICK_WALL = register("carfstone_brick_wall", () -> new WallBlock(
            AbstractBlock.Properties.copy(CARFSTONE_BRICKS.get()))
    );

    public static final RegistryObject<Block> CRACKED_BEDROCK = register("cracked_bedrock", () -> new CrackedBedrockBlock(
                    AbstractBlock.Properties.copy(Blocks.BEDROCK))
    );

    public static final RegistryObject<Block> GATEWAY_TO_THE_CAVERNS = register("gateway_to_the_caverns", () -> new GatewayToTheCavernsBlock(
                    AbstractBlock.Properties.copy(Blocks.BEDROCK))
    );

    public static final RegistryObject<Block> GATEWAY_TO_THE_OVERWORLD = register("gateway_to_the_overworld", () -> new GatewayToTheOverworldBlock(
                    AbstractBlock.Properties.copy(Blocks.BEDROCK).noCollission())
    );

    public static final RegistryObject<Block> MOLTEN_CARFSTONE = register("molten_carfstone", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(4.5f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(0)
                            .requiresCorrectToolForDrops())
    );

    public static final RegistryObject<Block> SMOOTH_MOLTEN_CARFSTONE = register("smooth_molten_carfstone", () -> new Block(
            AbstractBlock.Properties.copy(MOLTEN_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> MOLTEN_CARFSTONE_BRICKS = register("molten_carfstone_bricks", () -> new Block(
            AbstractBlock.Properties.copy(MOLTEN_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> MOLTEN_CARFSTONE_BRICK_STAIRS = register("molten_carfstone_brick_stairs", () -> new StairsBlock(
            () -> MOLTEN_CARFSTONE_BRICKS.get().defaultBlockState(),
            AbstractBlock.Properties.copy(MOLTEN_CARFSTONE_BRICKS.get()))
    );

    public static final RegistryObject<Block> MOLTEN_CARFSTONE_BRICK_SLAB = register("molten_carfstone_brick_slab", () -> new SlabBlock(
            AbstractBlock.Properties.copy(MOLTEN_CARFSTONE_BRICKS.get()))
    );

    public static final RegistryObject<Block> MOLTEN_CARFSTONE_STAIRS = register("molten_carfstone_stairs", () -> new StairsBlock(
            () -> MOLTEN_CARFSTONE.get().defaultBlockState(),
            AbstractBlock.Properties.copy(MOLTEN_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> MOLTEN_CARFSTONE_SLAB = register("molten_carfstone_slab", () -> new SlabBlock(
            AbstractBlock.Properties.copy(MOLTEN_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> SMOOTH_MOLTEN_CARFSTONE_STAIRS = register("smooth_molten_carfstone_stairs", () -> new StairsBlock(
            () -> SMOOTH_MOLTEN_CARFSTONE.get().defaultBlockState(),
            AbstractBlock.Properties.copy(SMOOTH_MOLTEN_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> SMOOTH_MOLTEN_CARFSTONE_SLAB = register("smooth_molten_carfstone_slab", () -> new SlabBlock(
            AbstractBlock.Properties.copy(SMOOTH_MOLTEN_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> MOLTEN_CARFSTONE_WALL = register("molten_carfstone_wall", () -> new WallBlock(
            AbstractBlock.Properties.copy(MOLTEN_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> SMOOTH_MOLTEN_CARFSTONE_WALL = register("smooth_molten_carfstone_wall", () -> new WallBlock(
            AbstractBlock.Properties.copy(SMOOTH_MOLTEN_CARFSTONE.get()))
    );

    public static final RegistryObject<Block> MOLTEN_CARFSTONE_BRICK_WALL = register("molten_carfstone_brick_wall", () -> new WallBlock(
            AbstractBlock.Properties.copy(MOLTEN_CARFSTONE_BRICKS.get()))
    );

    public static final RegistryObject<Block> SCORCHED_BERRY_BUSH = BLOCKS.register("scorched_berry_bush",
            () -> new ScorchedBerryBushBlock(AbstractBlock.Properties.copy(Blocks.SWEET_BERRY_BUSH)
                    .lightLevel((p_235464_0_) -> 7), MOLTEN_CARFSTONE.get())
    );

    public static final RegistryObject<Block> GLIMMERSHROOM = register("glimmershroom", () -> new CustomMushroomBlock(
                    AbstractBlock.Properties.copy(Blocks.RED_MUSHROOM)
                            .lightLevel((p_235464_0_) -> 13))
    );


    public static final RegistryObject<Block> GLIMMERSHROOM_BLOCK = register("glimmershroom_block", () -> new GlimmershroomBlock(
            AbstractBlock.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)
                    .lightLevel((p_235464_0_) -> 11)
            )
    );

    public static final RegistryObject<Block> GLIMMERGRASS_BLOCK = register("glimmergrass_block", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(4f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(0)
                            .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> LUMINITE_BLOCK = register("luminite_block", () -> new Block(
            AbstractBlock.Properties.of(Material.STONE)
                    .strength(5f, 7f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .requiresCorrectToolForDrops()
                    .lightLevel((p_235464_0_) -> 15)
            )
    );

    public static final RegistryObject<Block> LUMINITE_ORE = register("carfstone_luminite_ore", () -> new Block(
            AbstractBlock.Properties.of(Material.STONE)
                    .strength(5f, 7f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .requiresCorrectToolForDrops()
                    .lightLevel((p_235464_0_) -> 9)
            )
    );

    public static final RegistryObject<Block> PLATINUM_ORE = register("carfstone_platinum_ore", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(7f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(3)
                            .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> PLATINUM_BLOCK = register("platinum_block", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(7f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(3)
                            .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> CARFSTONE_COAL_ORE = register("carfstone_coal_ore", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(4.5f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(0)
                            .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> CARFSTONE_IRON_ORE = register("carfstone_iron_ore", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(5f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(1)
                            .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> CARFSTONE_GOLD_ORE = register("carfstone_gold_ore", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(6f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(2)
                            .requiresCorrectToolForDrops()
            )
    );

        public static final RegistryObject<Block> CARFSTONE_DIAMOND_ORE = register("carfstone_diamond_ore", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(7f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(2)
                            .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> CARFSTONE_REDSTONE_ORE = register("carfstone_redstone_ore", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(6f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(2)
                            .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> CARFSTONE_LAPIS_ORE = register("carfstone_lapis_ore", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(6f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(2)
                            .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> HELLSTONE_ORE = register("hellstone_ore", () -> new Block(
                    AbstractBlock.Properties.of(Material.STONE)
                            .strength(9f, 7f)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(3)
                            .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> HELLSTONE_BLOCK = register("hellstone_block", () -> new Block(
            AbstractBlock.Properties.copy(HELLSTONE_ORE.get()))
    );

    public static final RegistryObject<Block> SHROOMSTONE_BLOCK = register("shroomstone_block", () -> new Block(
        AbstractBlock.Properties.of(Material.STONE)
            .strength(9f, 7f)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(3)
            .requiresCorrectToolForDrops()
        )
    );

    public static final RegistryObject<Block> LUMINITE_TORCH = BLOCKS.register("luminite_torch", () -> new LuminiteTorchBlock(
            AbstractBlock.Properties.copy(Blocks.TORCH)
                    .lightLevel((state) -> 15))
    );
    public static final RegistryObject<Block> LUMINITE_WALL_TORCH = BLOCKS.register("luminite_wall_torch", () -> new LuminiteWallTorchBlock(
            AbstractBlock.Properties.copy(Blocks.WALL_TORCH)
                    .lightLevel((state) -> 15))
    );

    public static final RegistryObject<Block> LUMINITE_LANTERN = register("luminite_lantern", () -> new LuminiteLanternBlock(
            AbstractBlock.Properties.copy(Blocks.LANTERN)
    ));

    public static final RegistryObject<Block> GLIMMERGRASS = register("glimmergrass", () -> new CustomPlantBlock(
            AbstractBlock.Properties.copy(Blocks.GRASS)
                    .lightLevel((state) -> 9),
            CustomBlocks.GLIMMERGRASS_BLOCK.get()
    ));

    public static final RegistryObject<Block> CHARRED_GRASS = register("charred_grass", () -> new CustomPlantBlock(
            AbstractBlock.Properties.copy(Blocks.GRASS), CustomBlocks.MOLTEN_CARFSTONE.get()
    ));

    private static <T extends Block> RegistryObject<T> baseRegister(String name, Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> register = BLOCKS.register(name, block);
        CustomItems.ITEMS.register(name, item.apply(register));
        return register;
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends Block> block) {
        return (RegistryObject<T>)baseRegister(name, block, CustomBlocks::registerBlockItem);
    }

    private static <T extends Block> Supplier<BlockItem> registerBlockItem(final RegistryObject<T> block) {
        return () -> new BlockItem(Objects.requireNonNull(block.get()), new Item.Properties().tab(CustomItemGroups.GROUP));
    }
}
