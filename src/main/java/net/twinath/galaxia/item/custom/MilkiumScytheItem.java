package net.twinath.galaxia.item.custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.twinath.galaxia.item.ModItems;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;

import java.util.List;
import java.util.Optional;

public class MilkiumScytheItem extends SwordItem {
    private final float damage;
    private final Multimap<Attribute, AttributeModifier> defaultModifiers;

    public MilkiumScytheItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier,pProperties);
        this.damage = (float)pAttackDamageModifier + pTier.getAttackDamageBonus();
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", (double)this.damage, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", (double)pAttackSpeedModifier, AttributeModifier.Operation.ADDITION));
        this.defaultModifiers = builder.build();
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {



            pTarget.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 60, 2), pTarget);
            pTarget.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60), pTarget);
            pAttacker.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 4), pAttacker);
            pAttacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 2), pAttacker);

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        pTooltipComponents.add(Component.literal(("\u00A76") + ("\u00A7n") + "On Hit:" + ("\u00A7d") + ("\u00A7o") + "                                                Gives Your Target Blindness and Levitation, Gives You Jump Boost and Speed."));

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
