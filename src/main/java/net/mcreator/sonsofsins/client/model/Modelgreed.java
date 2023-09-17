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

public class Modelgreed<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sons_of_sins", "modelgreed"), "main");
    public final ModelPart blood;
    public final ModelPart body;
    public final ModelPart body_isTarget;
    public final ModelPart right_arm;
    public final ModelPart left_arm;
    public final ModelPart right_arm_isTarget;
    public final ModelPart left_arm_isTarget;
    public final ModelPart head_passive;
    public final ModelPart head_isTarget;

    public Modelgreed(ModelPart root) {
        this.blood = root.getChild("blood");
        this.body = root.getChild("body");
        this.body_isTarget = root.getChild("body_isTarget");
        this.right_arm = root.getChild("right_arm");
        this.left_arm = root.getChild("left_arm");
        this.right_arm_isTarget = root.getChild("right_arm_isTarget");
        this.left_arm_isTarget = root.getChild("left_arm_isTarget");
        this.head_passive = root.getChild("head_passive");
        this.head_isTarget = root.getChild("head_isTarget");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition blood = partdefinition.addOrReplaceChild("blood", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0f, -0.025f, -6.0f, 22.0f, 0.0f, 13.0f, new CubeDeformation(0.0f)).texOffs(20, 17).addBox(-5.0f, -0.025f, -10.0f, 16.0f, 0.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 13).addBox(-8.0f, -0.025f, 7.0f, 16.0f, 0.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 24.0f, 0.0f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 37).addBox(-4.0f, -3.0f, 0.0f, 8.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 24.75f, 0.0f));
        PartDefinition body_isTarget = partdefinition.addOrReplaceChild("body_isTarget", CubeListBuilder.create().texOffs(88, 101).addBox(-4.0f, -3.0f, -2.0f, 8.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 24.75f, 0.0f, 0.3054f, 0.0f, 0.0f));
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(4.0f, 23.0f, -1.0f));
        PartDefinition bone5 = right_arm.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 29).addBox(-2.0f, -12.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 4.0f, 1.5708f, -0.6981f, 0.0f));
        PartDefinition cube_r1 = bone5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 60).addBox(-3.0f, -1.0f, -1.0f, 6.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(2.1685f, -6.8485f, 1.6434f, -0.3054f, -0.6545f, -0.5672f));
        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(-4.0f, 23.0f, -1.0f));
        PartDefinition bone6 = left_arm.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 29).addBox(-2.0f, -12.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 4.0f, 1.5708f, 0.6981f, 0.0f));
        PartDefinition right_arm_isTarget = partdefinition.addOrReplaceChild("right_arm_isTarget", CubeListBuilder.create(), PartPose.offset(4.0f, 23.0f, -1.0f));
        PartDefinition bone2 = right_arm_isTarget.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(72, 93).addBox(-2.0f, -12.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.5708f, -0.9163f, 0.0f));
        PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 124).addBox(-3.0f, -1.0f, -1.0f, 6.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(2.1685f, -6.8485f, 1.6434f, -0.3054f, -0.6545f, -0.5672f));
        PartDefinition left_arm_isTarget = partdefinition.addOrReplaceChild("left_arm_isTarget", CubeListBuilder.create(), PartPose.offset(-4.0f, 23.0f, -1.0f));
        PartDefinition bone4 = left_arm_isTarget.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(72, 93).addBox(-2.0f, -12.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.5708f, 0.9163f, 0.0f));
        PartDefinition head_passive = partdefinition.addOrReplaceChild("head_passive", CubeListBuilder.create(), PartPose.offset(0.0f, 22.0f, 0.0f));
        PartDefinition bone3 = head_passive.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(24, 21).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(-0.1f)).texOffs(0, 13).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.2f)), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.3054f));
        PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 60).addBox(-3.0f, -1.0f, -1.0f, 6.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(-3.562f, -3.0428f, 0.996f, 0.1309f, 0.1745f, -0.1745f));
        PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 60).addBox(-4.0f, -1.0f, -1.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(3.4307f, -7.3049f, -3.2614f, -0.3054f, 0.829f, -0.9163f));
        PartDefinition head_isTarget = partdefinition.addOrReplaceChild("head_isTarget", CubeListBuilder.create().texOffs(96, 85).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(-0.1f)).texOffs(72, 77).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.2f)), PartPose.offset(0.0f, 22.0f, -1.0f));
        PartDefinition cube_r5 = head_isTarget.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 124).addBox(-3.0f, -1.0f, -1.0f, 6.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(-3.562f, -3.0428f, 0.996f, 0.1309f, 0.1745f, -0.1745f));
        PartDefinition cube_r6 = head_isTarget.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(72, 124).addBox(-4.0f, -1.0f, -1.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(3.4307f, -7.3049f, -3.2614f, -0.3054f, 0.829f, -0.9163f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.blood.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.right_arm_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.left_arm_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head_passive.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.right_arm_isTarget.yRot = Mth.cos(limbSwing * 0.6662f + (float)Math.PI) * limbSwingAmount;
        this.head_isTarget.yRot = netHeadYaw / 57.295776f;
        this.head_isTarget.xRot = headPitch / 57.295776f;
        this.right_arm.yRot = Mth.cos(limbSwing * 0.6662f + (float)Math.PI) * limbSwingAmount;
        this.left_arm.yRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.head_passive.yRot = netHeadYaw / 57.295776f;
        this.head_passive.xRot = headPitch / 57.295776f;
        this.left_arm_isTarget.yRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
    }
}

