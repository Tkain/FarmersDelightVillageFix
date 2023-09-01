# Farmer's Delight Village Fix

![Available for Forge](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/compact/supported/forge_vector.svg)
![Available on Modrinth](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/compact/available/modrinth_vector.svg)

Farmer's Delight Village Fix is a Minecraft mod that fixes a bug in 1.16 versions of the Farmer's Delight mod that
causes villages to generate differently between same-seed worlds across restarts. Currently, this mod is only available
for Minecraft 1.16.2 to 1.16.5 with Minecraft Forge.

Farmer's Delight is an excellent Minecraft mod developed by [Vectorwing](https://github.com/vectorwing) that carefully
expands on farming and cooking in the game. (This mod is unaffiliated with the official Farmer's Delight mod.) Check
out the original mod on [Modrinth](https://modrinth.com/mod/farmers-delight) or
[CurseForge](https://www.curseforge.com/minecraft/mc-mods/farmers-delight)!

## Downloads

Farmer's Delight Village Fix is available on [Modrinth](https://modrinth.com/mod/farmers-delight-village-fix).

## Frequently Asked Questions

**Will this get ported to 1.17 or above?**

Nope; the bug isn't present for 1.17+ versions of Farmer's Delight (AFAIK).

**Will this get ported to 1.15, 1.16.1, or Fabric?**

It's not hard to do, so... if you ask nicely. :wink:

(Additionally, since this is MIT-licensed, feel free to fork it yourself.)

**Where does the bug come from?**

To add its structures to a village, Farmer's Delight uses a vanilla Minecraft function to get a list of structures in
each village before adding its own to the list. However, this function shuffles the order of the list using a provided
random number generator. The random number generator Farmer's Delight uses for this isn't seeded (i.e. deterministic),
causing the order of (not-yet-generated) village structures to change between restarts. This mod replaces that random
number generator with a seeded one so villages generate the same way between restarts.
