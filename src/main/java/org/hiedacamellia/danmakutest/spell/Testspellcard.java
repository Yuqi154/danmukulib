package org.hiedacamellia.danmakutest.spell;

import dev.xkmc.l2serial.serialization.SerialClass;
import dev.xkmc.youkaishomecoming.content.entity.danmaku.DanmakuHelper;
import dev.xkmc.youkaishomecoming.content.spell.mover.RectMover;
import dev.xkmc.youkaishomecoming.content.spell.spellcard.ActualSpellCard;
import dev.xkmc.youkaishomecoming.content.spell.spellcard.CardHolder;
import dev.xkmc.youkaishomecoming.content.spell.spellcard.Ticker;
import dev.xkmc.youkaishomecoming.init.registrate.YHDanmaku;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.phys.Vec3;


@SerialClass
public class Testspellcard extends ActualSpellCard {
    @Override
    public void tick(CardHolder holder) {
        super.tick(holder);
        var le = holder.target();
        if (le == null) return;
        var dir = holder.forward().scale(0.6);
        holder.shoot(holder.prepareDanmaku(80, dir, YHDanmaku.Bullet.CIRCLE, DyeColor.RED));
    }

}
