package org.hiedacamellia.danmakutest.item;

import dev.xkmc.l2serial.util.Wrappers;
import dev.xkmc.youkaishomecoming.content.spell.item.ItemSpell;
import dev.xkmc.youkaishomecoming.content.spell.mover.RectMover;
import dev.xkmc.youkaishomecoming.init.registrate.YHDanmaku;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import java.util.Arrays;
import java.util.List;

import net.minecraft.world.phys.Vec3;
import org.hiedacamellia.danmakulib.core.holder.PlayerHolder;

public class Testdanmuku extends Item {

    public Testdanmuku() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.BLOCK;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        if (!Screen.hasShiftDown()) {
            list.add(Component.literal(
                    "§7§o" + Component.translatable("tooltip.danmukutest.press_shift").getString() + "§r"));
        } else {
            List<String> description = Arrays
                    .asList(Component.translatable("tooltip.danmukuetest.testdanmuku").getString().split("§n"));
            for (String line : description) {
                list.add(Component.literal(line));
            }
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        var pos = entity.position();
        var dir = entity.getLookAngle();
        PlayerHolder holder = new PlayerHolder(entity, pos, null, null);
        var e = holder.prepareDanmaku(60, entity.getLookAngle(), YHDanmaku.Bullet.MENTOS, DyeColor.RED);
        e.setPos(pos);
        e.mover = new RectMover(pos, dir, Vec3.ZERO);
        return ar;
    }


}
