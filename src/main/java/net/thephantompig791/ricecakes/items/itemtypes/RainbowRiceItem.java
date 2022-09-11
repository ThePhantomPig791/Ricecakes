package net.thephantompig791.ricecakes.items.itemtypes;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.Nullable;

public class RainbowRiceItem extends Item {
    public RainbowRiceItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if(!user.isSneaking()) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0));
            user.swingHand(Hand.MAIN_HAND);
            stack.decrement(1);
        }
        return super.useOnEntity(stack, user, entity, hand);
    }

    @Nullable
    @Override
    public FoodComponent getFoodComponent() {
        new FoodComponent.Builder().hunger(1).saturationModifier(5).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0), 1f).build();
        return super.getFoodComponent();
    }
}
