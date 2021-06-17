package com.freeranger.dark_caverns.registry;

import com.freeranger.dark_caverns.DarkCaverns;
import com.freeranger.dark_caverns.entities.MoltenerEntity;
import com.freeranger.dark_caverns.entities.ScorchhoundEntity;
import com.freeranger.dark_caverns.entities.ScorchlingEntity;
import com.freeranger.dark_caverns.entities.ThrowableLuminiteTorchEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = DarkCaverns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CustomEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, DarkCaverns.MOD_ID);

    public static final EntityType<ThrowableLuminiteTorchEntity> THROWABLE_LUMINITE_TORCH_TYPE =
            EntityType.Builder.<ThrowableLuminiteTorchEntity>of(ThrowableLuminiteTorchEntity::new, EntityClassification.MISC)
            .sized(0.25F, 0.25F)
            .updateInterval(10)
            .setTrackingRange(4)
            .build("throwable_luminite_torch");
    public static final RegistryObject<EntityType<ThrowableLuminiteTorchEntity>> THROWABLE_LUMINITE_TORCH =
            ENTITIES.register("throwable_luminite_torch", () -> THROWABLE_LUMINITE_TORCH_TYPE);

    public static final RegistryObject<EntityType<ScorchlingEntity>> SCORCHLING_ENTITY = buildEntity(ScorchlingEntity::new,
            0.6f, 0.4F, "scorchling");

    public static final RegistryObject<EntityType<MoltenerEntity>> MOLTENER_ENTITY = buildEntity(MoltenerEntity::new,
            0.7f, 0.9F, "moltener");

    public static final RegistryObject<EntityType<ScorchhoundEntity>> SCORCHHOUND_ENTITY = buildEntity(ScorchhoundEntity::new,
            1.5f, 1F, "scorchhound");

    public static <T extends Entity> RegistryObject<EntityType<T>> buildEntity(EntityType.IFactory<T> entity, float width, float height, String name) {
        return ENTITIES.register(name, () -> EntityType.Builder.of(entity, EntityClassification.CREATURE).sized(width, height).fireImmune().build(name));
    }

    public static void registerSpawnPlacements(){
        EntitySpawnPlacementRegistry.register(SCORCHLING_ENTITY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ScorchlingEntity::canScorchlingSpawn);

        EntitySpawnPlacementRegistry.register(SCORCHHOUND_ENTITY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ScorchhoundEntity::canScorchhoundSpawn);

        EntitySpawnPlacementRegistry.register(MOLTENER_ENTITY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MoltenerEntity::canMoltenerSpawn);
    }
}
