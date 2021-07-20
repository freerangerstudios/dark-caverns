package com.freeranger.dark_caverns.registry;

import com.freeranger.dark_caverns.DarkCaverns;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CustomSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DarkCaverns.MOD_ID);

    // DONE
    public static final RegistryObject<SoundEvent> SCORCHLING_AMBIENT = register("entity.scorchling.ambient");
    public static final RegistryObject<SoundEvent> SCORCHLING_HURT = register("entity.scorchling.hurt");
    public static final RegistryObject<SoundEvent> SCORCHLING_DEATH = register("entity.scorchling.death");

    // DONE
    public static final RegistryObject<SoundEvent> SCORCHHOUND_AMBIENT = register("entity.scorchhound.ambient");
    public static final RegistryObject<SoundEvent> SCORCHHOUND_HURT = register("entity.scorchhound.hurt");
    public static final RegistryObject<SoundEvent> SCORCHHOUND_DEATH = register("entity.scorchhound.death");

    // TODO
    public static final RegistryObject<SoundEvent> LUMINITE_FOX_AMBIENT = register("entity.luminite_fox.ambient");
    public static final RegistryObject<SoundEvent> LUMINITE_FOX_HURT = register("entity.luminite_fox.hurt");
    public static final RegistryObject<SoundEvent> LUMINITE_FOX_DEATH = register("entity.luminite_fox.death");

    // TODO
    public static final RegistryObject<SoundEvent> MOLTENER_AMBIENT = register("entity.moltener.ambient");
    public static final RegistryObject<SoundEvent> MOLTENER_HURT = register("entity.moltener.hurt");
    public static final RegistryObject<SoundEvent> MOLTENER_DEATH = register("entity.moltener.death");

    // TODO
    public static final RegistryObject<SoundEvent> SHROOMIE_AMBIENT = register("entity.shroomie.ambient");
    public static final RegistryObject<SoundEvent> SHROOMIE_HURT = register("entity.shroomie.hurt");
    public static final RegistryObject<SoundEvent> SHROOMIE_DEATH = register("entity.shroomie.death");
    public static final RegistryObject<SoundEvent> SHROOMIE_TRADE_YES = register("entity.shroomie.trade_yes");
    public static final RegistryObject<SoundEvent> SHROOMIE_TRADE_NO = register("entity.shroomie.trade_no");

    // TODO
    public static final RegistryObject<SoundEvent> SHROOMLING_AMBIENT = register("entity.shroomling.ambient");
    public static final RegistryObject<SoundEvent> SHROOMLING_HURT = register("entity.shroomling.hurt");
    public static final RegistryObject<SoundEvent> SHROOMLING_DEATH = register("entity.shroomling.death");

    // TODO
    public static final RegistryObject<SoundEvent> LUMINITE_GOLEM_AMBIENT = register("entity.luminite_golem.ambient");
    public static final RegistryObject<SoundEvent> LUMINITE_GOLEM_HURT = register("entity.luminite_golem.hurt");
    public static final RegistryObject<SoundEvent> LUMINITE_GOLEM_DEATH = register("entity.luminite_golem.death");
    public static final RegistryObject<SoundEvent> LUMINITE_GOLEM_ATTACK = register("entity.luminite_golem.attack");

    // TODO
    public static final RegistryObject<SoundEvent> CAMOROCK_HURT = register("entity.camorock.hurt");
    public static final RegistryObject<SoundEvent> CAMOROCK_DEATH = register("entity.camorock.death");

    private static RegistryObject<SoundEvent> register(String registryName) {
        return SOUNDS.register(registryName, () -> new SoundEvent(new ResourceLocation(DarkCaverns.MOD_ID, registryName)));
    }
}
