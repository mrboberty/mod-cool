package net.mcreator.equinox.procedures;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import net.mcreator.equinox.network.PlayPlayerAnimationMessage;
import net.mcreator.equinox.init.EquinoxModItems;
import net.mcreator.equinox.init.EquinoxModEntities;
import net.mcreator.equinox.entity.LightProjectileEntity;
import net.mcreator.equinox.entity.DarkProjectileEntity;

public class PolyvalentScepterRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _plrCldCheck1 && _plrCldCheck1.getCooldowns().isOnCooldown(itemstack.getItem()))) {
			if (hasEntityInInventory(entity, new ItemStack(EquinoxModItems.LIGHT_PELLET.get()))) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				if (!(getEntityGameType(entity) == GameType.CREATIVE)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(EquinoxModItems.LIGHT_PELLET.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				if (entity instanceof Player) {
					if (entity.level().isClientSide()) {
						CompoundTag data = entity.getPersistentData();
						data.putString("PlayerCurrentAnimation", "equinox:animation.staff.use");
						data.putBoolean("OverrideCurrentAnimation", false);
						data.putBoolean("FirstPersonAnimation", true);
					} else {
						PacketDistributor.sendToPlayersInDimension((ServerLevel) entity.level(), new PlayPlayerAnimationMessage(entity.getId(), "equinox:animation.staff.use", false, true));
					}
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = initArrowProjectile(new LightProjectileEntity(EquinoxModEntities.LIGHT_PROJECTILE.get(), projectileLevel), entity, 3, true, false, false, AbstractArrow.Pickup.DISALLOWED);
					_entityToSpawn.setPos(x, (y + 1.7), z);
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 0.6, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if ((entity instanceof Player _plrCldRem14 ? _plrCldRem14.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) == 100) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_shoot")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_shoot")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
			} else if (hasEntityInInventory(entity, new ItemStack(EquinoxModItems.DARKNESS_PELLET.get()))) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				if (!(getEntityGameType(entity) == GameType.CREATIVE)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(EquinoxModItems.DARKNESS_PELLET.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				if (entity instanceof Player) {
					if (entity.level().isClientSide()) {
						CompoundTag data = entity.getPersistentData();
						data.putString("PlayerCurrentAnimation", "equinox:animation.staff.use");
						data.putBoolean("OverrideCurrentAnimation", false);
						data.putBoolean("FirstPersonAnimation", true);
					} else {
						PacketDistributor.sendToPlayersInDimension((ServerLevel) entity.level(), new PlayPlayerAnimationMessage(entity.getId(), "equinox:animation.staff.use", false, true));
					}
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = initArrowProjectile(new DarkProjectileEntity(EquinoxModEntities.DARK_PROJECTILE.get(), projectileLevel), entity, 3, true, false, false, AbstractArrow.Pickup.DISALLOWED);
					_entityToSpawn.setPos(x, (y + 1.7), z);
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 0.6, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if ((entity instanceof Player _plrCldRem28 ? _plrCldRem28.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) == 100) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:darkness_shoot")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:darkness_shoot")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}

	private static AbstractArrow initArrowProjectile(AbstractArrow entityToSpawn, Entity shooter, float damage, boolean silent, boolean fire, boolean particles, AbstractArrow.Pickup pickup) {
		entityToSpawn.setOwner(shooter);
		entityToSpawn.setBaseDamage(damage);
		if (silent)
			entityToSpawn.setSilent(true);
		if (fire)
			entityToSpawn.igniteForSeconds(100);
		if (particles)
			entityToSpawn.setCritArrow(true);
		entityToSpawn.pickup = pickup;
		return entityToSpawn;
	}
}