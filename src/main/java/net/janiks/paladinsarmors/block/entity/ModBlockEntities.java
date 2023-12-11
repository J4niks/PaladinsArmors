package net.janiks.paladinsarmors.block.entity;

import net.janiks.paladinsarmors.block.ModBlocks;
import net.janiks.paladinsarmors.paladinsarmors;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, paladinsarmors.MODID);

    public static final RegistryObject<BlockEntityType<ThePrimordiumForgeBlockEntity>> PRIMORDIUM_FORGE_BE =
            BLOCK_ENTITIES.register("primordium_forge_be",() ->
                    BlockEntityType.Builder.of(ThePrimordiumForgeBlockEntity::new,
                            ModBlocks.THE_PRIMORDIUM_FORGE.get()).build(null));
    public static void register (IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
