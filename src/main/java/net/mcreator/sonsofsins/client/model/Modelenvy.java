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

public class Modelenvy<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sons_of_sins", "modelenvy"), "main");
    public final ModelPart body;
    public final ModelPart head;
    public final ModelPart rightleg;
    public final ModelPart leftleg;
    public final ModelPart body_isTarget;
    public final ModelPart right_arm;
    public final ModelPart head_isTarget;
    public final ModelPart leftleg_isTarget;
    public final ModelPart rightleg_isTarget;

    public Modelenvy(ModelPart root) {
        this.body = root.getChild("body");
        this.head = root.getChild("head");
        this.rightleg = root.getChild("rightleg");
        this.leftleg = root.getChild("leftleg");
        this.body_isTarget = root.getChild("body_isTarget");
        this.right_arm = root.getChild("right_arm");
        this.head_isTarget = root.getChild("head_isTarget");
        this.leftleg_isTarget = root.getChild("leftleg_isTarget");
        this.rightleg_isTarget = root.getChild("rightleg_isTarget");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 12).addBox(-4.5f, -0.5f, -2.5f, 4.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(48, 57).addBox(0.0f, 4.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(40, 48).addBox(-0.75f, 3.75f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(-0.2f)), PartPose.offsetAndRotation((float)-0.1f, (float)1.0f, (float)-1.0f, (float)0.0873f, (float)0.0f, (float)-0.0175f));
        PartDefinition rightarm = body.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(20, 0).addBox(-2.5f, -1.0f, -1.0f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset((float)-4.0f, (float)1.5f, (float)0.0f));
        PartDefinition bone4 = rightarm.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(40, 48).addBox(-1.25f, 1.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-2.25f, (float)0.0f, (float)0.0f, (float)0.0436f, (float)-0.3054f, (float)0.1309f));
        PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(40, 43).addBox(-1.0858f, -0.7071f, -1.5f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.1f)).texOffs(0, 43).addBox(-2.0858f, -1.7071f, -2.0f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.7854f));
        PartDefinition bone6 = bone4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(40, 31).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(44, 25).addBox(-1.0f, 2.0f, -1.0f, 2.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-0.25f, (float)4.0f, (float)0.25f, (float)-0.3491f, (float)0.0f, (float)0.0f));
        PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(40, 17).addBox(-2.0f, -0.2847f, -2.2745f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation((float)0.0f, (float)5.0f, (float)0.25f, (float)-0.1309f, (float)0.0f, (float)0.0f));
        PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation((float)-2.0f, (float)2.2153f, (float)-0.2745f, (float)0.0f, (float)0.0f, (float)0.2618f));
        PartDefinition bone10 = bone7.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation((float)-2.0f, (float)2.2153f, (float)-1.2745f, (float)-0.2618f, (float)0.3054f, (float)0.2618f));
        PartDefinition bone11 = bone7.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(56, 20).addBox(-1.0f, -0.5f, 0.0f, 2.0f, 5.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)4.2153f, (float)-0.2745f));
        PartDefinition leftarm = body.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(20, 0).mirror().addBox(0.5f, -1.0f, -1.0f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)3.2f, (float)1.5f, (float)0.0f));
        PartDefinition bone12 = leftarm.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(40, 48).mirror().addBox(-0.75f, 1.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)2.25f, (float)0.0f, (float)0.0f, (float)0.0436f, (float)0.3054f, (float)-0.1309f));
        PartDefinition bone13 = bone12.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(40, 43).mirror().addBox(-0.9142f, -0.7071f, -1.5f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.1f)).mirror(false).texOffs(0, 43).mirror().addBox(1.0858f, -1.7071f, -2.0f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.7854f));
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation((float)0.0f, (float)1.0f, (float)-1.25f, (float)0.0436f, (float)0.0436f, (float)0.0698f));
        PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 31).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 4.0f, new CubeDeformation(0.1f)).texOffs(0, 15).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 4.0f, new CubeDeformation(-0.1f)).texOffs(20, 23).addBox(-4.25f, -8.0f, -4.0f, 8.0f, 8.0f, 4.0f, new CubeDeformation(0.3f)).texOffs(40, 17).addBox(-2.0f, -5.5f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.25f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0436f, (float)0.0873f, (float)-0.0087f));
        PartDefinition bone8 = head.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0f, -8.0f, 0.0f, 8.0f, 8.0f, 4.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-0.0436f, (float)0.0f, (float)0.0436f));
        PartDefinition cube_r1 = bone8.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-4.0f, -4.0f, -2.0f, 8.0f, 8.0f, 4.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation((float)0.0f, (float)-4.0f, (float)2.0f, (float)0.0f, (float)3.1416f, (float)0.0f));
        PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0f, 0.0f, -1.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(10, 43).addBox(-1.5f, 4.0f, -1.5f, 3.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-1.75f, (float)12.0f, (float)0.0f, (float)-0.0436f, (float)0.2182f, (float)0.0f));
        PartDefinition bone = rightleg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(10, 48).addBox(-1.0f, -0.5f, -1.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)6.0f, (float)0.0f, (float)0.1309f, (float)0.0f, (float)0.0f));
        PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(40, 37).addBox(-2.0f, 0.0174f, -1.8257f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation((float)0.0f, (float)4.0f, (float)0.0f, (float)-0.0873f, (float)0.0f, (float)0.0f));
        PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(24, 35).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)2.0f, (float)12.0f, (float)0.0f, (float)0.1309f, (float)0.0f, (float)-0.0873f));
        PartDefinition body_isTarget = partdefinition.addOrReplaceChild("body_isTarget", CubeListBuilder.create().texOffs(64, 64).addBox(-3.808f, -10.9565f, -1.0414f, 8.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(88, 76).addBox(-4.308f, -11.4565f, -1.5414f, 4.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(112, 121).addBox(0.192f, -6.9565f, -1.0414f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(104, 112).addBox(-0.558f, -7.2065f, -0.0414f, 2.0f, 4.0f, 2.0f, new CubeDeformation(-0.2f)), PartPose.offsetAndRotation((float)-0.1f, (float)12.0f, (float)-1.0f, (float)0.6545f, (float)0.0f, (float)-0.0175f));
        PartDefinition leftarm2 = body_isTarget.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(84, 64).mirror().addBox(0.5f, -1.0f, -1.0f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)3.392f, (float)-9.4565f, (float)0.9586f, (float)-1.7453f, (float)0.0f, (float)0.0f));
        PartDefinition bone21 = leftarm2.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(104, 112).mirror().addBox(-0.75f, 1.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)2.25f, (float)0.0f, (float)0.0f, (float)0.0436f, (float)0.3054f, (float)-0.1309f));
        PartDefinition bone22 = bone21.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(104, 107).mirror().addBox(-0.9142f, -0.7071f, -1.5f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.1f)).mirror(false).texOffs(64, 107).mirror().addBox(1.0858f, -1.7071f, -2.0f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.7854f));
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset((float)-3.908f, (float)3.5435f, (float)-6.0414f));
        PartDefinition hand = right_arm.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(84, 64).addBox(-2.5f, -1.0f, -1.0f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-1.4399f, (float)0.0f, (float)-0.0175f));
        PartDefinition bone14 = hand.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(104, 112).addBox(-1.25f, 1.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-2.25f, (float)0.0f, (float)0.0f, (float)0.0436f, (float)-0.3054f, (float)0.1309f));
        PartDefinition bone15 = bone14.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(104, 107).addBox(-1.0858f, -0.7071f, -1.5f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.1f)).texOffs(64, 107).addBox(-2.2197f, -1.7071f, -2.0f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.7854f));
        PartDefinition bone16 = bone14.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(104, 95).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(108, 89).addBox(-1.0f, 2.0f, -1.0f, 2.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset((float)-0.25f, (float)4.0f, (float)0.25f));
        PartDefinition bone17 = bone16.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(104, 81).addBox(-2.0f, -0.2847f, -2.2745f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.1f)), PartPose.offset((float)0.0f, (float)5.0f, (float)0.25f));
        PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation((float)-2.0f, (float)2.2153f, (float)-0.2745f, (float)0.0f, (float)0.0f, (float)0.2618f));
        PartDefinition bone19 = bone17.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation((float)-2.0f, (float)2.2153f, (float)-1.2745f, (float)-0.2618f, (float)0.3054f, (float)0.2618f));
        PartDefinition bone20 = bone17.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(120, 84).addBox(-1.0f, -0.5f, 0.0f, 2.0f, 5.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)4.2153f, (float)-0.2745f));
        PartDefinition head_isTarget = partdefinition.addOrReplaceChild("head_isTarget", CubeListBuilder.create(), PartPose.offsetAndRotation((float)0.0f, (float)3.0f, (float)-7.25f, (float)0.0436f, (float)0.0436f, (float)0.0698f));
        PartDefinition bone23 = head_isTarget.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(64, 95).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 4.0f, new CubeDeformation(0.1f)).texOffs(64, 79).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 4.0f, new CubeDeformation(-0.1f)).texOffs(84, 87).addBox(-4.25f, -8.0f, -4.0f, 8.0f, 8.0f, 4.0f, new CubeDeformation(0.3f)).texOffs(104, 81).addBox(-2.0f, -5.5f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.25f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0436f, (float)0.0873f, (float)-0.0087f));
        PartDefinition bone24 = head_isTarget.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(88, 64).addBox(-4.0f, -8.0f, 0.0f, 8.0f, 8.0f, 4.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-0.0436f, (float)0.0f, (float)0.0436f));
        PartDefinition cube_r2 = bone24.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 79).addBox(-4.0f, -4.0f, -2.0f, 8.0f, 8.0f, 4.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation((float)0.0f, (float)-4.0f, (float)2.0f, (float)0.0f, (float)3.1416f, (float)0.0f));
        PartDefinition leftleg_isTarget = partdefinition.addOrReplaceChild("leftleg_isTarget", CubeListBuilder.create().texOffs(88, 99).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)2.0f, (float)12.0f, (float)0.0f, (float)0.1309f, (float)0.0f, (float)-0.0873f));
        PartDefinition rightleg_isTarget = partdefinition.addOrReplaceChild("rightleg_isTarget", CubeListBuilder.create().texOffs(112, 64).addBox(-1.0f, 0.0f, -1.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(74, 107).addBox(-1.5f, 4.0f, -1.5f, 3.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset((float)-1.75f, (float)12.0f, (float)0.0f));
        PartDefinition bone25 = rightleg_isTarget.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(74, 112).addBox(-1.0f, -0.5f, -1.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)6.0f, (float)0.0f));
        PartDefinition bone26 = bone25.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(104, 101).addBox(-2.0f, 0.0174f, -1.8257f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.1f)), PartPose.offset((float)0.0f, (float)4.0f, (float)0.0f));
        return LayerDefinition.create((MeshDefinition)meshdefinition, (int)128, (int)128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftleg_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightleg_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.leftleg_isTarget.xRot = Mth.cos((float)(limbSwing * 1.0f)) * -1.0f * limbSwingAmount;
        this.head_isTarget.yRot = netHeadYaw / 57.295776f;
        this.head_isTarget.xRot = headPitch / 57.295776f;
        this.right_arm.yRot = Mth.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * limbSwingAmount;
        this.rightleg.xRot = Mth.cos((float)(limbSwing * 1.0f)) * 1.0f * limbSwingAmount;
        this.leftleg.xRot = Mth.cos((float)(limbSwing * 1.0f)) * -1.0f * limbSwingAmount;
        this.rightleg_isTarget.xRot = Mth.cos((float)(limbSwing * 1.0f)) * 1.0f * limbSwingAmount;
        this.body.yRot = Mth.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * limbSwingAmount;
    }
}

