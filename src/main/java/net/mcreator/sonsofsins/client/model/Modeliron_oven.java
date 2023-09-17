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

public class Modeliron_oven<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sons_of_sins", "modeliron_oven"), "main");
    public final ModelPart bone;

    public Modeliron_oven(ModelPart root) {
        this.bone = root.getChild("bone");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0f, -12.0f, -4.0f, 12.0f, 12.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(32, 0).addBox(-4.0f, -7.0f, 4.0f, 8.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 26).addBox(-5.0f, -22.0f, -2.0f, 4.0f, 10.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 25).mirror().addBox(1.0f, -27.0f, -2.0f, 4.0f, 16.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(0, 20).addBox(-5.5f, -15.0f, -2.5f, 11.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 29).mirror().addBox(0.5f, -29.0f, -2.5f, 5.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(0, 29).addBox(-5.5f, -25.0f, -2.5f, 5.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 24.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.bone.render(poseStack, buffer, packedLight, packedOverlay);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.bone.yRot = netHeadYaw / 57.295776f;
        this.bone.xRot = headPitch / 57.295776f;
    }
}

