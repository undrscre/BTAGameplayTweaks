package undrscre.tweaks.mixins.server;

import net.minecraft.core.item.Items;
import net.minecraft.core.crafting.LookupFuelFurnace;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = LookupFuelFurnace.class, remap = false)
public class Mixin_LookupFuelFurnace {
	@Inject(method = "register", at = @At("RETURN"))
	private void addCustomFuel(CallbackInfo ci) {
		LookupFuelFurnace self = (LookupFuelFurnace)(Object)this;
		self.addFuelEntry(Items.OLIVINE.id, 60);
	}
}
