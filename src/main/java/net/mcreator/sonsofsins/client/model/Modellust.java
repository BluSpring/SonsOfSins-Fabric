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
import net.minecraft.world.entity.Entity;

public class Modellust<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sons_of_sins", "modellust"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart head_isTarget;
    public final ModelPart body_isTarget;

    public Modellust(ModelPart root) {
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.head_isTarget = root.getChild("head_isTarget");
        this.body_isTarget = root.getChild("body_isTarget");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 48).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(-0.2f)).texOffs(0, 0).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.275f)).texOffs(0, 16).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, -2.9f, -0.0436f, 0.0f, 0.0f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5f, 0.0f, -1.5f, 3.0f, 12.0f, 3.0f, new CubeDeformation(-0.175f)).texOffs(12, 32).addBox(-1.5f, 0.0f, -1.5f, 3.0f, 12.0f, 3.0f, new CubeDeformation(0.025f)).texOffs(32, 6).addBox(-4.5f, 2.0f, -1.5f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.3f)).texOffs(24, 0).addBox(-4.5f, 2.0f, -1.5f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.1f)).texOffs(32, 6).addBox(-4.5f, 5.25f, -1.5f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.4f)).texOffs(24, 0).addBox(-4.5f, 5.25f, -1.5f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.2f)).texOffs(24, 0).addBox(-4.5f, 8.25f, -1.7f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.3f)).texOffs(32, 6).addBox(-4.5f, 8.25f, -1.7f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.5f)), PartPose.offsetAndRotation(0.0f, 1.75f, -2.25f, 0.1309f, 0.0f, 0.0f));
        PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5f, 0.0f, -1.5f, 3.0f, 7.0f, 3.0f, new CubeDeformation(-0.175f)).texOffs(12, 32).addBox(-1.5f, 0.0f, -1.5f, 3.0f, 7.0f, 3.0f, new CubeDeformation(0.025f)), PartPose.offsetAndRotation(0.0f, 11.25f, -0.2f, 0.48f, 0.0f, 0.0f));
        PartDefinition head_isTarget = partdefinition.addOrReplaceChild("head_isTarget", CubeListBuilder.create().texOffs(96, 112).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(-0.2f)).texOffs(64, 64).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.275f)).texOffs(64, 80).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 4.0f, -4.9f));
        PartDefinition body_isTarget = partdefinition.addOrReplaceChild("body_isTarget", CubeListBuilder.create().texOffs(64, 96).addBox(-1.5f, -6.5f, -1.45f, 3.0f, 12.0f, 3.0f, new CubeDeformation(-0.175f)).texOffs(76, 96).addBox(-1.5f, -6.5f, -1.45f, 3.0f, 12.0f, 3.0f, new CubeDeformation(0.025f)).texOffs(96, 70).addBox(-4.5f, -4.5f, -1.45f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.3f)).texOffs(88, 64).addBox(-4.5f, -4.5f, -1.45f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.1f)).texOffs(96, 70).addBox(-4.5f, -1.25f, -1.45f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.4f)).texOffs(88, 64).addBox(-4.5f, -1.25f, -1.45f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.2f)).texOffs(88, 64).addBox(-4.5f, 1.75f, -1.65f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.3f)).texOffs(96, 70).addBox(-4.5f, 1.75f, -1.65f, 9.0f, 3.0f, 3.0f, new CubeDeformation(-0.5f)), PartPose.offsetAndRotation(0.0f, 8.1032f, -1.5627f, 0.6109f, 0.0f, 0.0f));
        PartDefinition bone3 = body_isTarget.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(64, 96).addBox(-1.5f, 0.0f, -1.5f, 3.0f, 7.0f, 3.0f, new CubeDeformation(-0.175f)).texOffs(76, 96).addBox(-1.5f, 0.0f, -1.5f, 3.0f, 7.0f, 3.0f, new CubeDeformation(0.025f)), PartPose.offsetAndRotation(0.0f, 4.75f, -0.15f, 0.48f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body_isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.head_isTarget.yRot = netHeadYaw / 57.295776f;
        this.head_isTarget.xRot = headPitch / 57.295776f;
    }
}

