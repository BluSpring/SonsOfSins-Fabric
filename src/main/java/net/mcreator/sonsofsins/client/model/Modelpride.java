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

public class Modelpride<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sons_of_sins", "modelpride"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart rightLeg;
    public final ModelPart leftLeg;
    public final ModelPart leftArm;
    public final ModelPart rightArm;
    public final ModelPart head_isTarget;
    public final ModelPart body_isTarget;
    public final ModelPart leftArm_isTarget;
    public final ModelPart rightArm_isTarget;
    public final ModelPart leftLeg_isTarget;
    public final ModelPart rightLeg_isTarget;

    public Modelpride(ModelPart root) {
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.rightLeg = root.getChild("rightLeg");
        this.leftLeg = root.getChild("leftLeg");
        this.leftArm = root.getChild("leftArm");
        this.rightArm = root.getChild("rightArm");
        this.head_isTarget = root.getChild("head_isTarget");
        this.body_isTarget = root.getChild("body_isTarget");
        this.leftArm_isTarget = root.getChild("leftArm_isTarget");
        this.rightArm_isTarget = root.getChild("rightArm_isTarget");
        this.leftLeg_isTarget = root.getChild("leftLeg_isTarget");
        this.rightLeg_isTarget = root.getChild("rightLeg_isTarget");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.5f, 17.0f, -2.0f));
        PartDefinition bone8 = head.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(-0.1f)).texOffs(32, 0).mirror().addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.225f)).mirror(false), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0873f, 0.0f, 0.2182f));
        PartDefinition cube_r1 = bone8.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 60).addBox(-3.5886f, -1.8125f, -1.2587f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(-4.0f, -4.0f, -1.0f, 0.0436f, 0.2618f, 0.5236f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(-0.1f)).mirror(false).texOffs(16, 32).mirror().addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.225f)).mirror(false), PartPose.offsetAndRotation(0.5f, 16.0f, -2.0f, 1.0472f, 0.0f, 0.0436f));
        PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 60).addBox(-4.0f, -1.25f, -9.75f, 7.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(7.0f, 4.0f, 3.0f, 0.0873f, 1.3963f, -0.3054f));
        PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 60).addBox(0.0f, -4.0f, -4.25f, 5.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(7.0f, 4.0f, 3.0f, 0.0873f, 1.9199f, -0.3054f));
        PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offset(2.4f, 20.0f, 9.0f));
        PartDefinition bone4 = rightLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-1.9f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(-0.1f)).mirror(false).texOffs(0, 32).mirror().addBox(-1.9f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.225f)).mirror(false), PartPose.offsetAndRotation(0.0f, 2.0f, -1.0f, 1.5299f, 0.0417f, -0.1177f));
        PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offset(-2.4f, 20.0f, 9.0f));
        PartDefinition bone5 = leftLeg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 16).addBox(-2.1f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(-0.1f)).texOffs(0, 32).addBox(-2.1f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.225f)), PartPose.offsetAndRotation(0.0f, 2.0f, -1.0f, 1.5299f, -0.0417f, 0.1177f));
        PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(-3.5f, 17.0f, 0.0f));
        PartDefinition body2 = leftArm.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0f, 0.0f, -2.0f, 1.3963f, 0.0f, 0.0436f));
        PartDefinition bone2 = body2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(-0.1f)).texOffs(40, 32).addBox(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.225f)), PartPose.offsetAndRotation(-5.0f, 2.0f, 0.0f, -1.4835f, 0.6545f, 0.2618f));
        PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(4.5f, 16.0f, 0.0f));
        PartDefinition body3 = rightArm.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0f, 0.0f, -2.0f, 1.3963f, 0.0f, 0.0436f));
        PartDefinition bone3 = body3.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(-0.1f)).mirror(false).texOffs(40, 32).mirror().addBox(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.225f)).mirror(false), PartPose.offsetAndRotation(5.0f, 2.0f, 0.0f, -1.1781f, -0.6545f, -0.2618f));
        PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 60).addBox(-7.0f, -0.25f, -2.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(2.0f, 2.0f, 3.0f, 0.0f, -0.829f, -0.3054f));
        PartDefinition head_isTarget = partdefinition.addOrReplaceChild("head_isTarget", CubeListBuilder.create().texOffs(0, 64).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(-0.1f)).texOffs(32, 64).mirror().addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.225f)).mirror(false), PartPose.offset(0.5f, 14.0f, -5.0f));
        PartDefinition cube_r6 = head_isTarget.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 124).addBox(-3.5886f, -1.8125f, -1.2587f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(-4.0f, -4.0f, -1.0f, 0.0436f, 0.2618f, 0.5236f));
        PartDefinition body_isTarget = partdefinition.addOrReplaceChild("body_isTarget", CubeListBuilder.create().texOffs(16, 80).mirror().addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(-0.1f)).mirror(false).texOffs(16, 96).mirror().addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.225f)).mirror(false), PartPose.offsetAndRotation(0.5f, 14.0f, -5.0f, 1.3963f, 0.0f, 0.0436f));
        PartDefinition cube_r4 = body_isTarget.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 124).addBox(-4.0f, -1.25f, -9.75f, 7.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(7.0f, 4.0f, 3.0f, 0.0873f, 1.3963f, -0.3054f));
        PartDefinition cube_r7 = body_isTarget.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 124).addBox(0.0f, -4.0f, -4.25f, 5.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(7.0f, 4.0f, 3.0f, 0.0873f, 1.9199f, -0.3054f));
        PartDefinition leftArm_isTarget = partdefinition.addOrReplaceChild("leftArm_isTarget", CubeListBuilder.create(), PartPose.offset(-3.5f, 14.0f, -3.0f));
        PartDefinition body4 = leftArm_isTarget.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0f, 0.0f, -2.0f, 1.3963f, 0.0f, 0.0436f));
        PartDefinition bone6 = body4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(40, 80).addBox(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(-0.1f)).texOffs(40, 96).addBox(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.225f)), PartPose.offsetAndRotation(-5.0f, 2.0f, 0.0f, -1.4835f, 0.1309f, 0.2618f));
        PartDefinition rightArm_isTarget = partdefinition.addOrReplaceChild("rightArm_isTarget", CubeListBuilder.create(), PartPose.offset(4.5f, 14.0f, -3.0f));
        PartDefinition body5 = rightArm_isTarget.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0f, 0.0f, -2.0f, 1.3963f, 0.0f, 0.0436f));
        PartDefinition bone7 = body5.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(-0.1f)).mirror(false).texOffs(40, 96).mirror().addBox(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.225f)).mirror(false), PartPose.offsetAndRotation(5.0f, 2.0f, 0.0f, -1.1781f, -0.0436f, -0.2618f));
        PartDefinition cube_r8 = bone7.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 124).addBox(-7.0f, -0.25f, -2.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(2.0f, 2.0f, 3.0f, 0.0f, -0.829f, -0.3054f));
        PartDefinition leftLeg_isTarget = partdefinition.addOrReplaceChild("leftLeg_isTarget", CubeListBuilder.create(), PartPose.offset(2.4f, 15.75f, 6.0f));
        PartDefinition bone10 = leftLeg_isTarget.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(0, 80).addBox(-2.1f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(-0.1f)).texOffs(0, 96).addBox(-2.1f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.225f)), PartPose.offsetAndRotation(-4.3f, 0.25f, 0.0f, 0.8752f, -0.0637f, 0.2141f));
        PartDefinition cube_r10 = bone10.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 124).addBox(-3.0975f, -0.7338f, -2.6191f, 6.0f, 2.0f, 2.0f, new CubeDeformation(-0.2f)), PartPose.offsetAndRotation(-1.1f, 3.0f, -1.0f, 0.829f, -0.829f, 0.9599f));
        PartDefinition rightLeg_isTarget = partdefinition.addOrReplaceChild("rightLeg_isTarget", CubeListBuilder.create(), PartPose.offset(2.4f, 15.75f, 6.0f));
        PartDefinition bone9 = rightLeg_isTarget.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-1.9f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(-0.1f)).mirror(false).texOffs(0, 96).mirror().addBox(-1.9f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.225f)).mirror(false), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7881f, 0.0417f, -0.1177f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftArm_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightArm_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftLeg_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightLeg_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.head_isTarget.yRot = netHeadYaw / 57.295776f;
        this.head_isTarget.xRot = headPitch / 57.295776f;
        this.leftArm_isTarget.yRot = Mth.cos(limbSwing * 0.6662f + (float)Math.PI) * limbSwingAmount;
        this.rightArm.yRot = Mth.cos(limbSwing * 0.6662f + (float)Math.PI) * limbSwingAmount;
        this.rightLeg_isTarget.xRot = Mth.cos(limbSwing * 0.6662f + (float)Math.PI) * limbSwingAmount;
        this.leftArm.yRot = Mth.cos(limbSwing * 0.6662f + (float)Math.PI) * limbSwingAmount;
        this.rightArm_isTarget.yRot = Mth.cos(limbSwing * 0.6662f + (float)Math.PI) * limbSwingAmount;
        this.leftLeg_isTarget.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
    }
}

