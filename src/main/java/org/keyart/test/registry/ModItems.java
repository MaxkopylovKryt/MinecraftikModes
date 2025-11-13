package org.keyart.test.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.keyart.test.Test;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Test.MODID);


    public static final RegistryObject<Item> TEST_ITEM =
            ITEMS.register("kakashka", () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .food(new FoodProperties.Builder().nutrition(4)
                            .saturationMod(10).alwaysEat()
                            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20, 3, true, true, true), 1)
                            .build())));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
