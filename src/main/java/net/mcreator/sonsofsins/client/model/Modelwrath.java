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

public class Modelwrath<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sons_of_sins", "modelwrath"), "main");
    public final ModelPart leftleg;
    public final ModelPart rightleg;
    public final ModelPart body;
    public final ModelPart head;
    public final ModelPart leftleg_is_target;
    public final ModelPart rightleg2_is_target;
    public final ModelPart right_arm_is_target;
    public final ModelPart left_arm_is_target;
    public final ModelPart body_is_target;
    public final ModelPart head_is_target;

    public Modelwrath(ModelPart root) {
        this.leftleg = root.getChild("leftleg");
        this.rightleg = root.getChild("rightleg");
        this.body = root.getChild("body");
        this.head = root.getChild("head");
        this.leftleg_is_target = root.getChild("leftleg_is_target");
        this.rightleg2_is_target = root.getChild("rightleg2_is_target");
        this.right_arm_is_target = root.getChild("right_arm_is_target");
        this.left_arm_is_target = root.getChild("left_arm_is_target");
        this.body_is_target = root.getChild("body_is_target");
        this.head_is_target = root.getChild("head_is_target");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(16, 55).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(17, 17).addBox(-2.0f, 10.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(34, 17).addBox(-1.0f, 6.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-2.0f, (float)12.0f, (float)0.0f, (float)-0.0436f, (float)0.3491f, (float)0.0f));
        PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)2.0f, (float)12.0f, (float)0.0f, (float)0.0f, (float)-0.1309f, (float)0.0f));
        PartDefinition bone6 = rightleg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(50, 8).addBox(0.25f, -1.0f, -1.0f, 5.0f, 2.0f, 2.0f, new CubeDeformation(-0.25f)), PartPose.offsetAndRotation((float)-0.5f, (float)7.0f, (float)0.0f, (float)0.2182f, (float)0.8727f, (float)-1.2217f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset((float)0.4f, (float)0.0f, (float)-2.25f));
        PartDefinition bone7 = body.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)0.1745f, (float)0.0f, (float)0.0349f));
        PartDefinition bone3 = bone7.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(48, 23).addBox(-4.0f, -1.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 23).addBox(-4.0f, -1.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.2f)), PartPose.offset((float)0.0f, (float)1.0f, (float)0.0f));
        PartDefinition rightarm = bone7.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(42, 40).addBox(1.0f, -2.0f, -1.5f, 2.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(50, 14).addBox(0.5f, 6.0f, -1.5f, 3.0f, 1.0f, 3.0f, new CubeDeformation(0.2f)).texOffs(50, 0).mirror().addBox(0.0f, -2.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.25f)).mirror(false), PartPose.offsetAndRotation((float)4.0f, (float)2.5f, (float)0.0f, (float)-0.1745f, (float)0.3491f, (float)-0.2618f));
        PartDefinition cube_r1 = rightarm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -3.0f, -0.5f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)1.1548f, (float)15.0f, (float)-1.8126f, (float)0.0f, (float)0.4363f, (float)0.0f));
        PartDefinition cube_r2 = rightarm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 40).mirror().addBox(-0.5f, -4.5f, -1.5f, 1.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)2.0f, (float)13.5f, (float)0.0f, (float)0.0f, (float)-2.7053f, (float)0.0f));
        PartDefinition leftarm = bone7.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(24, 39).addBox(-4.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-4.0f, (float)2.5f, (float)0.0f, (float)-0.1745f, (float)-0.1745f, (float)0.1309f));
        PartDefinition bone4 = leftarm.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(50, 8).addBox(0.25f, -1.0f, -1.0f, 5.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-2.75f, (float)-0.75f, (float)0.75f, (float)-0.6545f, (float)-2.2253f, (float)0.7418f));
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation((float)0.25f, (float)0.0f, (float)-1.75f, (float)0.1309f, (float)0.0f, (float)-0.1309f));
        PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.3f)).texOffs(0, 0).addBox(-4.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)).texOffs(24, 0).addBox(-3.5f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(-4.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.3f)).texOffs(0, 0).addBox(-4.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)).texOffs(24, 0).addBox(-3.5f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)-1.0f, (float)0.0f, (float)0.0f, (float)-0.0436f));
        PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 16).addBox(0.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.3f)).texOffs(0, 0).mirror().addBox(0.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)).mirror(false).texOffs(24, 0).mirror().addBox(-0.5f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(0, 16).addBox(0.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.3f)).texOffs(0, 0).mirror().addBox(0.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)).mirror(false).texOffs(24, 0).mirror().addBox(-0.5f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.75f, (float)0.0f, (float)-1.0f, (float)0.0873f, (float)-0.0873f, (float)0.2182f));
        PartDefinition bone5 = bone2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(50, 8).addBox(0.25f, -1.0f, -1.0f, 5.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(50, 8).addBox(0.25f, -1.0f, -1.0f, 5.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)3.0f, (float)-7.0f, (float)-3.0f, (float)0.3491f, (float)0.5236f, (float)-0.7418f));
        PartDefinition leftleg_is_target = partdefinition.addOrReplaceChild("leftleg_is_target", CubeListBuilder.create().texOffs(72, 118).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(73, 80).addBox(-2.0f, 10.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(90, 80).addBox(-1.0f, 6.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset((float)-2.0f, (float)12.0f, (float)3.0f));
        PartDefinition rightleg2_is_target = partdefinition.addOrReplaceChild("rightleg2_is_target", CubeListBuilder.create().texOffs(56, 111).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset((float)2.0f, (float)12.0f, (float)3.0f));
        PartDefinition bone8 = rightleg2_is_target.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(106, 71).addBox(0.25f, -1.0f, -1.0f, 5.0f, 2.0f, 2.0f, new CubeDeformation(-0.25f)), PartPose.offsetAndRotation((float)-0.5f, (float)7.0f, (float)0.0f, (float)0.2182f, (float)0.8727f, (float)-1.2217f));
        PartDefinition right_arm_is_target = partdefinition.addOrReplaceChild("right_arm_is_target", CubeListBuilder.create(), PartPose.offset((float)6.4f, (float)2.5f, (float)-1.25f));
        PartDefinition rightarm2 = right_arm_is_target.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(98, 103).addBox(1.0f, -2.0f, -1.5f, 2.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(106, 77).addBox(0.5f, 6.0f, -1.5f, 3.0f, 1.0f, 3.0f, new CubeDeformation(0.2f)).texOffs(106, 63).mirror().addBox(0.0f, -2.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.25f)).mirror(false).texOffs(98, 103).addBox(1.0f, -2.0f, -1.5f, 2.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(106, 77).addBox(0.5f, 6.0f, -1.5f, 3.0f, 1.0f, 3.0f, new CubeDeformation(0.2f)).texOffs(106, 63).mirror().addBox(0.0f, -2.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.25f)).mirror(false), PartPose.offsetAndRotation((float)0.0f, (float)2.0f, (float)0.0f, (float)-0.829f, (float)0.3491f, (float)-1.1519f));
        PartDefinition cube_r3 = rightarm2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 63).addBox(-0.5f, -3.0f, -0.5f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(56, 63).addBox(-0.5f, -3.0f, -0.5f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)1.1548f, (float)15.0f, (float)-1.8126f, (float)0.0f, (float)0.4363f, (float)0.0f));
        PartDefinition cube_r4 = rightarm2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(110, 103).mirror().addBox(-0.5f, -4.5f, -1.5f, 1.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(110, 103).mirror().addBox(-0.5f, -4.5f, -1.5f, 1.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)2.0f, (float)13.5f, (float)0.0f, (float)0.0f, (float)-2.7053f, (float)0.0f));
        PartDefinition left_arm_is_target = partdefinition.addOrReplaceChild("left_arm_is_target", CubeListBuilder.create(), PartPose.offset((float)-4.6f, (float)2.5f, (float)-1.25f));
        PartDefinition leftarm2 = left_arm_is_target.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(80, 102).addBox(-4.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(80, 102).addBox(-4.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-1.0f, (float)2.0f, (float)0.0f, (float)-1.0036f, (float)-0.1745f, (float)1.789f));
        PartDefinition bone11 = leftarm2.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(106, 71).addBox(0.25f, -1.0f, -1.0f, 5.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-2.75f, (float)-0.75f, (float)0.75f, (float)-0.6545f, (float)-2.2253f, (float)0.7418f));
        PartDefinition body_is_target = partdefinition.addOrReplaceChild("body_is_target", CubeListBuilder.create(), PartPose.offsetAndRotation((float)0.4f, (float)0.0f, (float)-2.25f, (float)0.2618f, (float)0.0f, (float)0.0f));
        PartDefinition bone9 = body_is_target.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(104, 86).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(80, 86).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.2f)).texOffs(104, 86).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(80, 86).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.2f)), PartPose.offsetAndRotation((float)0.0f, (float)1.0f, (float)0.0f, (float)0.1745f, (float)0.0f, (float)0.0349f));
        PartDefinition head_is_target = partdefinition.addOrReplaceChild("head_is_target", CubeListBuilder.create(), PartPose.offsetAndRotation((float)0.25f, (float)0.0f, (float)-1.75f, (float)0.3927f, (float)0.0f, (float)-0.1309f));
        PartDefinition bone12 = head_is_target.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(56, 95).addBox(-4.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.3f)).texOffs(56, 63).addBox(-4.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)).texOffs(80, 63).addBox(-3.5f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(56, 95).addBox(-4.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.3f)).texOffs(56, 63).addBox(-4.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)).texOffs(80, 63).addBox(-3.5f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)-1.0f, (float)0.0f, (float)0.0f, (float)-0.0436f));
        PartDefinition bone13 = head_is_target.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(56, 79).addBox(0.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.3f)).texOffs(56, 63).mirror().addBox(0.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)).mirror(false).texOffs(80, 63).mirror().addBox(-0.5f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(56, 79).addBox(0.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.3f)).texOffs(56, 63).mirror().addBox(0.0f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)).mirror(false).texOffs(80, 63).mirror().addBox(-0.5f, -8.0f, -4.0f, 4.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation((float)0.75f, (float)0.0f, (float)-1.0f, (float)0.0873f, (float)-0.0873f, (float)0.2182f));
        PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(106, 71).addBox(0.25f, -1.0f, -1.0f, 5.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(106, 71).addBox(0.25f, -1.0f, -1.0f, 5.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)3.0f, (float)-7.0f, (float)-3.0f, (float)0.3491f, (float)0.5236f, (float)-0.7418f));
        return LayerDefinition.create((MeshDefinition)meshdefinition, (int)128, (int)128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftleg_is_target.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightleg2_is_target.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.right_arm_is_target.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.left_arm_is_target.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body_is_target.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head_is_target.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.right_arm_is_target.yRot = Mth.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * limbSwingAmount;
        this.leftleg_is_target.xRot = Mth.cos((float)(limbSwing * 1.0f)) * -1.0f * limbSwingAmount;
        this.rightleg.xRot = Mth.cos((float)(limbSwing * 1.0f)) * 1.0f * limbSwingAmount;
        this.leftleg.xRot = Mth.cos((float)(limbSwing * 1.0f)) * -1.0f * limbSwingAmount;
        this.left_arm_is_target.yRot = Mth.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * limbSwingAmount;
        this.body.yRot = Mth.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * limbSwingAmount;
        this.rightleg2_is_target.xRot = Mth.cos((float)(limbSwing * 1.0f)) * 1.0f * limbSwingAmount;
        this.head_is_target.yRot = netHeadYaw / 57.295776f;
        this.head_is_target.xRot = headPitch / 57.295776f;
    }
}

