package net.mcreator.modcool.procedures;

import net.neoforged.bus.api.Event;

public class PolyvalentScepterRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _plrCldCheck1 && _plrCldCheck1.getCooldowns().isOnCooldown(itemstack.getItem()))) {
			if (hasEntityInInventory(entity, new ItemStack(ModCoolModItems.LIGHT_PELLET.get()))) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				if (!(getEntityGameType(entity) == GameType.CREATIVE)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ModCoolModItems.LIGHT_PELLET.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				if (entity instanceof Player) {
					if (entity.level().isClientSide()) {
						CompoundTag data = entity.getPersistentData();
						data.putString("PlayerCurrentAnimation", "mod_cool:animation.staff.use");
						data.putBoolean("OverrideCurrentAnimation", false);
						data.putBoolean("FirstPersonAnimation", true);
					} else {
						PacketDistributor.sendToPlayersInDimension((ServerLevel) entity.level(), new PlayPlayerAnimationMessage(entity.getId(), "mod_cool:animation.staff.use", false, true));
					}
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = initArrowProjectile(new LightProjectileEntity(ModCoolModEntities.LIGHT_PROJECTILE.get(), projectileLevel), entity, 3, true, false, false, AbstractArrow.Pickup.DISALLOWED);
					_entityToSpawn.setPos(x, (y + 1.7), z);
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 0.6, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if ((entity instanceof Player _plrCldRem14 ? _plrCldRem14.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) == 100) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mod_cool:light_shoot")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mod_cool:light_shoot")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
			} else if (hasEntityInInventory(entity, new ItemStack(ModCoolModItems.DARKNESS_PELLET.get()))) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
				if (!(getEntityGameType(entity) == GameType.CREATIVE)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ModCoolModItems.DARKNESS_PELLET.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				if (entity instanceof Player) {
					if (entity.level().isClientSide()) {
						CompoundTag data = entity.getPersistentData();
						data.putString("PlayerCurrentAnimation", "mod_cool:animation.staff.use");
						data.putBoolean("OverrideCurrentAnimation", false);
						data.putBoolean("FirstPersonAnimation", true);
					} else {
						PacketDistributor.sendToPlayersInDimension((ServerLevel) entity.level(), new PlayPlayerAnimationMessage(entity.getId(), "mod_cool:animation.staff.use", false, true));
					}
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = initArrowProjectile(new DarkProjectileEntity(ModCoolModEntities.DELETED_MOD_ELEMENT.get(), projectileLevel), entity, 3, true, false, false, AbstractArrow.Pickup.DISALLOWED);
					_entityToSpawn.setPos(x, (y + 1.7), z);
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 0.6, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if ((entity instanceof Player _plrCldRem28 ? _plrCldRem28.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) == 100) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mod_cool:darkness_shoot")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mod_cool:darkness_shoot")), SoundSource.PLAYERS, 1, 1, false);
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