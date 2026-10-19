package net.mcreator.equinox.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.equinox.init.EquinoxModEntities;
import net.mcreator.equinox.entity.SunkisserEntity;
import net.mcreator.equinox.entity.LightPatronEntity;
import net.mcreator.equinox.entity.FlorevoreEntity;
import net.mcreator.equinox.EquinoxMod;

import java.util.Comparator;

public class LightPatronOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_cooldown) : 0) > 0) {
				if (entity instanceof LightPatronEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_cooldown, (int) ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_cooldown) : 0) - 1));
			} else {
				if (entity instanceof LightPatronEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_cooldown, 200);
				if (Math.random() < 0.33) {
					if (world instanceof ServerLevel _level) {
						_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("attack 1 selected"), false);
					}
					if (entity instanceof LightPatronEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack, 1);
					if (entity instanceof LightPatronEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_timer, 90);
					if (entity instanceof LightPatronEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_cooldown, 190);
					if (Math.random() < 0.25) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_patron_summon_stand")), SoundSource.HOSTILE, 2, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_patron_summon_stand")), SoundSource.HOSTILE, 2, 1, false);
							}
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_patron_summon_handle")), SoundSource.HOSTILE, 2, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_patron_summon_handle")), SoundSource.HOSTILE, 2, 1, false);
							}
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_patron_summon_rise")), SoundSource.HOSTILE, 2, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_patron_summon_rise")), SoundSource.HOSTILE, 2, 1, false);
							}
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _level) {
						_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("attack 2 selected"), false);
					}
					if (entity instanceof LightPatronEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack, 2);
					if (entity instanceof LightPatronEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_timer, 60);
					if (entity instanceof LightPatronEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_cooldown, 160);
					if (Math.random() < 0.5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_patron_expulse_away")), SoundSource.HOSTILE, 2, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_patron_expulse_away")), SoundSource.HOSTILE, 2, 1, false);
							}
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_patron_expulse_mind")), SoundSource.HOSTILE, 2, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("equinox:light_patron_expulse_mind")), SoundSource.HOSTILE, 2, 1, false);
							}
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("attack 3 selected"), false);
					}
					if (entity instanceof LightPatronEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack, 3);
					if (entity instanceof LightPatronEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_timer, 60);
					if (entity instanceof LightPatronEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_cooldown, 160);
				}
			}
			if ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) == 50
					&& (entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack) : 0) == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EquinoxModEntities.FLOREVORE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
				if (!world.isClientSide()) {
					var photon = new com.lowdragmc.photon.command.BlockEffectCommand();
					photon.setLocation(net.minecraft.resources.ResourceLocation.parse("photon:big_light_explosion"));
					photon.setPos(new net.minecraft.core.BlockPos((int) x, (int) (y + 3), (int) z));
					net.neoforged.neoforge.network.PacketDistributor.sendToAllPlayers(photon);
				}
				for (int index0 = 0; index0 < 2; index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EquinoxModEntities.SUNKISSER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
				}
				if (entity instanceof LightPatronEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_timer, (int) ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) - 1));
			} else if ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) > 0
					&& (entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack) : 0) == 1) {
				if (entity instanceof LightPatronEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_timer, (int) ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) - 1));
			} else if ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) == 30
					&& (entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack) : 0) == 2) {
				if (entity instanceof LightPatronEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_timer, (int) ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) - 1));
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (!(entityiterator == entity) && (!(entityiterator instanceof FlorevoreEntity) || entityiterator instanceof SunkisserEntity)) {
							entityiterator.hurtMarked = true;
							entityiterator.setDeltaMovement(new Vec3(((entityiterator.getX() - entity.getX()) * 2), (entityiterator.getY() - entity.getY()), ((entityiterator.getZ() - entity.getZ()) * 2)));
						}
					}
				}
			} else if ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) > 0
					&& (entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack) : 0) == 2) {
				if (entity instanceof LightPatronEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_timer, (int) ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) - 1));
			} else if ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) == 30
					&& (entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack) : 0) == 3) {
				if (entity instanceof LightPatronEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_timer, (int) ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) - 1));
				if (!world.isClientSide()) {
					var photon = new com.lowdragmc.photon.command.BlockEffectCommand();
					photon.setLocation(net.minecraft.resources.ResourceLocation.parse("photon:light_shockwave"));
					photon.setPos(new net.minecraft.core.BlockPos((int) x, (int) y, (int) z));
					net.neoforged.neoforge.network.PacketDistributor.sendToAllPlayers(photon);
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof SunkisserEntity || entityiterator instanceof FlorevoreEntity || entityiterator instanceof LightPatronEntity) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.setHealth((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 30);
							{
								final Entity photon_entity = entityiterator;
								EquinoxMod.queueServerWork(1, () -> {
									if (!photon_entity.level().isClientSide()) {
										var photon = new com.lowdragmc.photon.command.EntityEffectCommand();
										photon.setLocation(net.minecraft.resources.ResourceLocation.parse("photon:light_explosion"));
										photon.setEntities(java.util.List.of(photon_entity));
										photon.setAutoRotate(com.lowdragmc.photon.client.fx.EntityEffectExecutor.AutoRotate.NONE);
										net.neoforged.neoforge.network.PacketDistributor.sendToAllPlayers(photon);
									}
								});
							}
						} else {
							entityiterator.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("equinox:exposure")))), 13);
							{
								final Entity photon_entity = entityiterator;
								EquinoxMod.queueServerWork(1, () -> {
									if (!photon_entity.level().isClientSide()) {
										var photon = new com.lowdragmc.photon.command.EntityEffectCommand();
										photon.setLocation(net.minecraft.resources.ResourceLocation.parse("photon:light_explosion"));
										photon.setEntities(java.util.List.of(photon_entity));
										photon.setAutoRotate(com.lowdragmc.photon.client.fx.EntityEffectExecutor.AutoRotate.NONE);
										net.neoforged.neoforge.network.PacketDistributor.sendToAllPlayers(photon);
									}
								});
							}
						}
					}
				}
			} else if ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) > 0
					&& (entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack) : 0) == 3) {
				if (entity instanceof LightPatronEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack_timer, (int) ((entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) - 1));
			} else {
				if (entity instanceof LightPatronEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LightPatronEntity.DATA_attack, 0);
			}
		}
	}
}