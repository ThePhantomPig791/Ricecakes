package net.thephantompig791.ricecakes.mixin;

import com.ibm.icu.impl.duration.impl.Utils;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import net.thephantompig791.ricecakes.Ricecakes;
import net.thephantompig791.ricecakes.items.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    @Shadow public abstract boolean isPlayer();

    @Shadow protected HungerManager hungerManager;

    @Shadow public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Shadow public abstract void playSound(SoundEvent sound, float volume, float pitch);

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(
            method = "tick",
            at = @At("HEAD")
    )
    private void tick(CallbackInfo ci) {
        Item helmet = this.getEquippedStack(EquipmentSlot.HEAD).getItem();

        if(helmet.equals(ModItems.RICE_CAKE_HELMET) && this.hungerManager.getFoodLevel() <= 14) {
            this.hungerManager.add(6, 10);
            this.getEquippedStack(EquipmentSlot.HEAD).damage(1, this, null);
            this.playSound(SoundEvents.ENTITY_PLAYER_BURP, 1, 1);
        }
    }
}
