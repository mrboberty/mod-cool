package net.mcreator.modcool.procedures;

import net.neoforged.bus.api.Event;

public class Sample_change_toucheProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z ) {
if (==0) {if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.fire.extinguish")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.fire.extinguish")),
SoundSource.NEUTRAL, 1, 1, false);
}
}}else if (==1) {if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")),
SoundSource.NEUTRAL, 1, 1, false);
}
}}else if (==2) {if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")),
SoundSource.NEUTRAL, 1, 1, false);
}
}}
}
}