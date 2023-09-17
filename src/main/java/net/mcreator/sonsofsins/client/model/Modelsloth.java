/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.model.EntityModel
 *  net.minecraft.client.model.geom.ModelLayerLocation
 *  net.minecraft.client.model.geom.ModelPart
 *  net.minecraft.client.model.geom.PartPose
 *  net.minecraft.client.model.geom.builders.CubeDeformation
 *  net.minecraft.client.model.geom.builders.CubeListBuilder
 *  net.minecraft.client.model.geom.builders.LayerDefinition
 *  net.minecraft.client.model.geom.builders.MeshDefinition
 *  net.minecraft.client.model.geom.builders.PartDefinition
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.sonsofsins.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class Modelsloth<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sons_of_sins", "modelsloth"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart rightarm;
    public final ModelPart leftarm;
    public final ModelPart rightleg;
    public final ModelPart leftleg;
    public final ModelPart head_isTarget;
    public final ModelPart body_isTarget;
    public final ModelPart rightarm_isTarget;
    public final ModelPart leftarm_isTarget;
    public final ModelPart rightleg_isTarget;
    public final ModelPart leftleg_isTarget;

    public Modelsloth(ModelPart root) {
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.rightarm = root.getChild("rightarm");
        this.leftarm = root.getChild("leftarm");
        this.rightleg = root.getChild("rightleg");
        this.leftleg = root.getChild("leftleg");
        this.head_isTarget = root.getChild("head_isTarget");
        this.body_isTarget = root.getChild("body_isTarget");
        this.rightarm_isTarget = root.getChild("rightarm_isTarget");
        this.leftarm_isTarget = root.getChild("leftarm_isTarget");
        this.rightleg_isTarget = root.getChild("rightleg_isTarget");
        this.leftleg_isTarget = root.getChild("leftleg_isTarget");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 48).addBox(-4.0f, -5.0f, -6.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.4f)).texOffs(0, 48).addBox(-4.0f, -5.0f, -6.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation((float)0.0f, (float)-16.0f, (float)-10.0f, (float)0.1745f, (float)0.0f, (float)-0.0873f));
        PartDefinition bone14 = head.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(31, 70).addBox(-1.0f, -4.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)3.0f, (float)2.0f, (float)-5.0f, (float)-2.0944f, (float)2.4435f, (float)0.4363f));
        PartDefinition bone15 = head.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(31, 70).mirror().addBox(-1.0f, -5.0f, -1.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)-3.0f, (float)-3.0f, (float)-5.0f, (float)1.1781f, (float)0.5236f, (float)0.3054f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation((float)0.0f, (float)-15.0f, (float)-10.0f, (float)0.48f, (float)0.0f, (float)0.0f));
        PartDefinition bone8 = body.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0f, -32.0f, 0.0f, 16.0f, 17.0f, 7.0f, new CubeDeformation(0.25f)).texOffs(0, 24).addBox(-8.0f, -32.0f, 0.0f, 16.0f, 17.0f, 7.0f, new CubeDeformation(-0.2f)), PartPose.offset((float)0.0f, (float)31.0993f, (float)-0.1279f));
        PartDefinition bone12 = body.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(0, 64).addBox(-3.3434f, -2.3976f, -14.9135f, 3.0f, 3.0f, 21.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation((float)-2.0f, (float)5.6104f, (float)8.7544f, (float)0.192f, (float)-0.1745f, (float)0.0873f));
        PartDefinition bone13 = body.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(48, 77).addBox(-2.6136f, -0.9711f, -3.5708f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)4.0f, (float)11.6104f, (float)8.7544f, (float)-0.3491f, (float)0.2182f, (float)0.0873f));
        PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(46, 0).addBox(-8.0f, -1.0f, -5.0f, 16.0f, 15.0f, 7.0f, new CubeDeformation(-0.25f)), PartPose.offsetAndRotation((float)0.0f, (float)16.0993f, (float)4.8721f, (float)-0.3054f, (float)0.0f, (float)0.0f));
        PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset((float)8.0f, (float)-12.1396f, (float)-4.9956f));
        PartDefinition bone10 = rightarm.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(70, 23).mirror().addBox(-1.0f, -1.0f, -2.0f, 6.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(39, 68).mirror().addBox(0.0f, 4.0f, -1.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)0.2618f, (float)0.0f, (float)-0.2618f));
        PartDefinition bone = bone10.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(53, 69).mirror().addBox(-3.0f, -5.0f, -1.0f, 3.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)4.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.6545f));
        PartDefinition bone3 = bone10.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(70, 23).mirror().addBox(-1.0f, -1.0f, -2.0f, 6.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(39, 68).mirror().addBox(0.0f, 4.0f, -1.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)8.0f, (float)0.0f, (float)-0.1309f, (float)0.0f, (float)0.0873f));
        PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(46, 22).mirror().addBox(-1.0f, -1.0f, -2.75f, 6.0f, 12.0f, 6.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)8.0f, (float)0.0f, (float)-0.1745f, (float)0.0f, (float)0.0873f));
        PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset((float)-8.0f, (float)-12.1396f, (float)-4.9956f));
        PartDefinition bone4 = leftarm.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(70, 23).addBox(-5.0f, -1.0f, -2.0f, 6.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(39, 68).addBox(-4.0f, 4.0f, -1.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)0.2618f, (float)0.0f, (float)0.2618f));
        PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(53, 69).addBox(0.0f, -5.0f, -1.0f, 3.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-4.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.6545f));
        PartDefinition bone7 = bone4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(70, 23).addBox(-5.0f, -1.0f, -2.0f, 6.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(39, 68).addBox(-4.0f, 4.0f, -1.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)8.0f, (float)0.0f, (float)-0.1309f, (float)0.0f, (float)-0.0873f));
        PartDefinition bone16 = bone7.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(46, 22).addBox(-5.0f, -1.0f, -2.75f, 6.0f, 12.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)8.0f, (float)0.0f, (float)-0.1745f, (float)0.0f, (float)-0.0873f));
        PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset((float)-6.0f, (float)10.1f, (float)4.0f));
        PartDefinition bone34 = rightleg.addOrReplaceChild("bone34", CubeListBuilder.create().texOffs(70, 34).addBox(-3.0f, -1.6173f, -2.9239f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(39, 68).addBox(-2.5f, 1.6327f, -1.9239f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-0.3927f, (float)0.2182f, (float)0.0436f));
        PartDefinition bone9 = bone34.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(70, 46).addBox(-3.0f, -1.0f, -2.0f, 6.0f, 8.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-0.5f, (float)7.8827f, (float)-0.9239f, (float)0.3927f, (float)0.0f, (float)-0.0436f));
        PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offset((float)6.0f, (float)10.1f, (float)4.0f));
        PartDefinition bone35 = leftleg.addOrReplaceChild("bone35", CubeListBuilder.create().texOffs(70, 34).mirror().addBox(-2.0f, -1.6173f, -2.9239f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(39, 68).mirror().addBox(-1.5f, 1.6327f, -1.9239f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-0.3927f, (float)-0.2182f, (float)-0.0436f));
        PartDefinition bone11 = bone35.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(70, 46).mirror().addBox(-3.0f, -1.0f, -2.0f, 6.0f, 8.0f, 6.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.5f, (float)7.8827f, (float)-0.9239f, (float)0.3927f, (float)0.0f, (float)0.0436f));
        PartDefinition head_isTarget = partdefinition.addOrReplaceChild("head_isTarget", CubeListBuilder.create().texOffs(144, 160).addBox(-4.0f, -5.0f, -6.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.4f)).texOffs(112, 160).addBox(-4.0f, -5.0f, -6.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation((float)0.0f, (float)-11.0f, (float)-17.0f, (float)0.1745f, (float)0.0f, (float)-0.0873f));
        PartDefinition bone18 = head_isTarget.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(143, 182).addBox(-1.0f, -4.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)3.0f, (float)2.0f, (float)-5.0f, (float)-2.0944f, (float)2.4435f, (float)0.4363f));
        PartDefinition bone19 = head_isTarget.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(143, 182).mirror().addBox(-1.0f, -5.0f, -1.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)-3.0f, (float)-3.0f, (float)-5.0f, (float)1.1781f, (float)0.5236f, (float)0.3054f));
        PartDefinition body_isTarget = partdefinition.addOrReplaceChild("body_isTarget", CubeListBuilder.create(), PartPose.offsetAndRotation((float)0.0f, (float)-9.0f, (float)-17.0f, (float)0.829f, (float)0.0f, (float)0.0f));
        PartDefinition bone20 = body_isTarget.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(112, 112).addBox(-8.0f, -32.0f, 0.0f, 16.0f, 17.0f, 7.0f, new CubeDeformation(0.25f)).texOffs(112, 136).addBox(-8.0f, -32.0f, 0.0f, 16.0f, 17.0f, 7.0f, new CubeDeformation(-0.2f)), PartPose.offset((float)0.0f, (float)31.0993f, (float)-0.1279f));
        PartDefinition bone21 = body_isTarget.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(112, 176).addBox(-3.3434f, -2.3976f, -14.9135f, 3.0f, 3.0f, 21.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation((float)-2.0f, (float)5.6104f, (float)8.7544f, (float)0.192f, (float)-0.1745f, (float)0.0873f));
        PartDefinition bone22 = body_isTarget.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(160, 189).addBox(-2.6136f, -0.9711f, -3.5708f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)4.0f, (float)11.6104f, (float)8.7544f, (float)-0.3491f, (float)0.2182f, (float)0.0873f));
        PartDefinition bone23 = body_isTarget.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(158, 112).addBox(-8.0f, -1.0f, -5.0f, 16.0f, 15.0f, 7.0f, new CubeDeformation(-0.25f)), PartPose.offsetAndRotation((float)0.0f, (float)16.0993f, (float)4.8721f, (float)-0.3054f, (float)0.0f, (float)0.0f));
        PartDefinition rightarm_isTarget = partdefinition.addOrReplaceChild("rightarm_isTarget", CubeListBuilder.create(), PartPose.offset((float)8.0f, (float)-9.1396f, (float)-13.9956f));
        PartDefinition bone24 = rightarm_isTarget.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(182, 135).mirror().addBox(-1.0f, -1.0f, -2.0f, 6.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(151, 180).mirror().addBox(0.0f, 4.0f, -1.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-0.2618f, (float)0.0f, (float)-0.2618f));
        PartDefinition bone25 = bone24.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(165, 181).mirror().addBox(-3.0f, -5.0f, -1.0f, 3.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)4.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.6545f));
        PartDefinition bone26 = bone24.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(182, 135).mirror().addBox(-1.0f, -1.0f, -2.0f, 6.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(151, 180).mirror().addBox(0.0f, 4.0f, -1.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)8.0f, (float)0.0f, (float)-0.1309f, (float)0.0f, (float)0.0873f));
        PartDefinition bone27 = bone26.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(158, 134).mirror().addBox(-1.0f, -1.0f, -2.75f, 6.0f, 12.0f, 6.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)8.0f, (float)0.0f, (float)-0.1745f, (float)0.0f, (float)0.0873f));
        PartDefinition leftarm_isTarget = partdefinition.addOrReplaceChild("leftarm_isTarget", CubeListBuilder.create(), PartPose.offset((float)-8.0f, (float)-9.1396f, (float)-13.9956f));
        PartDefinition bone17 = leftarm_isTarget.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(182, 135).addBox(-5.0f, -1.0f, -2.0f, 6.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(151, 180).addBox(-4.0f, 4.0f, -1.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-0.2618f, (float)0.0f, (float)0.2618f));
        PartDefinition bone28 = bone17.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(165, 181).addBox(0.0f, -5.0f, -1.0f, 3.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-4.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.6545f));
        PartDefinition bone29 = bone17.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(182, 135).addBox(-5.0f, -1.0f, -2.0f, 6.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(151, 180).addBox(-4.0f, 4.0f, -1.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)8.0f, (float)0.0f, (float)-0.1309f, (float)0.0f, (float)-0.0873f));
        PartDefinition bone30 = bone29.addOrReplaceChild("bone30", CubeListBuilder.create().texOffs(158, 134).addBox(-5.0f, -1.0f, -2.75f, 6.0f, 12.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)8.0f, (float)0.0f, (float)-0.1745f, (float)0.0f, (float)-0.0873f));
        PartDefinition rightleg_isTarget = partdefinition.addOrReplaceChild("rightleg_isTarget", CubeListBuilder.create(), PartPose.offset((float)-6.0f, (float)10.1f, (float)4.0f));
        PartDefinition bone31 = rightleg_isTarget.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(182, 146).addBox(-3.0f, -1.6173f, -2.9239f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(151, 180).addBox(-2.5f, 1.6327f, -1.9239f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-0.3927f, (float)0.2182f, (float)0.0436f));
        PartDefinition bone36 = bone31.addOrReplaceChild("bone36", CubeListBuilder.create().texOffs(182, 158).addBox(-3.0f, -1.0f, -2.0f, 6.0f, 8.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-0.5f, (float)7.8827f, (float)-0.9239f, (float)0.3927f, (float)0.0f, (float)-0.0436f));
        PartDefinition leftleg_isTarget = partdefinition.addOrReplaceChild("leftleg_isTarget", CubeListBuilder.create(), PartPose.offset((float)6.0f, (float)10.1f, (float)4.0f));
        PartDefinition bone37 = leftleg_isTarget.addOrReplaceChild("bone37", CubeListBuilder.create().texOffs(182, 146).mirror().addBox(-2.0f, -1.6173f, -2.9239f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(151, 180).mirror().addBox(-1.5f, 1.6327f, -1.9239f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-0.3927f, (float)-0.2182f, (float)-0.0436f));
        PartDefinition bone38 = bone37.addOrReplaceChild("bone38", CubeListBuilder.create().texOffs(182, 158).mirror().addBox(-3.0f, -1.0f, -2.0f, 6.0f, 8.0f, 6.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.5f, (float)7.8827f, (float)-0.9239f, (float)0.3927f, (float)0.0f, (float)0.0436f));
        return LayerDefinition.create((MeshDefinition)meshdefinition, (int)224, (int)224);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightarm_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftarm_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightleg_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftleg_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.leftleg_isTarget.xRot = Mth.cos((float)(limbSwing * 1.0f)) * -1.0f * limbSwingAmount;
        this.head_isTarget.zRot = Mth.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * limbSwingAmount;
        this.rightleg.xRot = Mth.cos((float)(limbSwing * 1.0f)) * 1.0f * limbSwingAmount;
        this.rightarm.xRot = Mth.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * limbSwingAmount;
        this.leftleg.xRot = Mth.cos((float)(limbSwing * 1.0f)) * -1.0f * limbSwingAmount;
        this.rightleg_isTarget.xRot = Mth.cos((float)(limbSwing * 1.0f)) * 1.0f * limbSwingAmount;
        this.leftarm.xRot = Mth.cos((float)(limbSwing * 0.6662f)) * limbSwingAmount;
    }
}

