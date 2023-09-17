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

public class Modelgluttony<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sons_of_sins", "modelgluttony"), "main");
    public final ModelPart body;
    public final ModelPart isTarget;
    public final ModelPart body2;
    public final ModelPart head;

    public Modelgluttony(ModelPart root) {
        this.body = root.getChild("body");
        this.isTarget = root.getChild("isTarget");
        this.body2 = root.getChild("body2");
        this.head = root.getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0f, 2.0f, -2.5f));
        PartDefinition bone12 = body.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0f, -22.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(32, 48).addBox(-4.0f, -22.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(-0.2f)), PartPose.offset(0.0f, 22.1381f, -0.393f));
        PartDefinition bone14 = body.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(16, 42).addBox(-1.5f, 0.0f, -1.5f, 3.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(32, 12).addBox(-4.0f, 2.0f, -1.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(0.1f)).texOffs(32, 12).addBox(-4.0f, 5.0f, -1.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation(0.0f, 11.1381f, -0.643f, 0.2618f, 0.0f, 0.0f));
        PartDefinition bone15 = bone14.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(16, 42).addBox(-1.5f, 0.05f, -1.625f, 3.0f, 8.0f, 3.0f, new CubeDeformation(-0.025f)), PartPose.offsetAndRotation(0.0f, 6.75f, -0.45f, 0.829f, 0.0f, 0.0f));
        PartDefinition rightarm2 = body.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(0, 42).addBox(-4.0f, -2.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.1f)).texOffs(24, 0).addBox(-3.0f, 0.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation(-4.0f, 1.9658f, -0.5221f, 0.0f, 0.1309f, 0.2182f));
        PartDefinition bone16 = rightarm2.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0f, -2.0f, -5.0f, 2.0f, 2.0f, 6.0f, new CubeDeformation(0.2f)), PartPose.offsetAndRotation(-2.0f, 5.0f, 0.5f, 0.5236f, 0.0f, 0.0f));
        PartDefinition bone17 = bone16.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0f, -3.0f, -5.0f, 5.0f, 5.0f, 5.0f, new CubeDeformation(0.1f)), PartPose.offset(0.5f, -0.75f, -5.0f));
        PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(0, 32).addBox(-2.5f, -2.5f, -2.5f, 5.0f, 5.0f, 5.0f, new CubeDeformation(-0.1f)), PartPose.offset(-0.4443f, 0.2669f, -2.3026f));
        PartDefinition rightarm3 = body.addOrReplaceChild("rightarm3", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(0.0f, -2.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.1f)).mirror(false).texOffs(24, 0).mirror().addBox(1.0f, 0.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.1f)).mirror(false), PartPose.offsetAndRotation(4.0f, 1.9658f, -0.5221f, 0.0f, 0.0f, -0.2182f));
        PartDefinition bone19 = rightarm3.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-1.0f, -2.0f, -5.0f, 2.0f, 2.0f, 6.0f, new CubeDeformation(0.2f)).mirror(false), PartPose.offsetAndRotation(2.0f, 5.0f, 0.5f, 0.5236f, 0.0f, 0.0f));
        PartDefinition bone20 = bone19.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-2.0f, -3.0f, -5.0f, 5.0f, 5.0f, 5.0f, new CubeDeformation(0.1f)).mirror(false), PartPose.offset(-0.5f, -0.75f, -5.0f));
        PartDefinition bone21 = bone20.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-2.5f, -2.5f, -2.5f, 5.0f, 5.0f, 5.0f, new CubeDeformation(-0.1f)).mirror(false), PartPose.offset(0.4443f, 0.2669f, -2.3026f));
        PartDefinition bone22 = body.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(32, 12).addBox(-2.2352f, -0.7406f, -0.7581f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.2f)), PartPose.offsetAndRotation(1.25f, 2.9658f, -1.7721f, 0.9163f, -2.0944f, -0.6981f));
        PartDefinition isTarget = partdefinition.addOrReplaceChild("isTarget", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 2.0f, -2.5f, 0.9599f, 0.0f, 0.0f));
        PartDefinition bone8 = isTarget.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 80).addBox(-4.0f, -22.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(32, 112).addBox(-4.0f, -22.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(-0.2f)), PartPose.offset(0.0f, 22.1381f, -0.393f));
        PartDefinition bone = isTarget.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(16, 106).addBox(-1.5f, 0.0f, -1.5f, 3.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(32, 76).addBox(-4.0f, 2.0f, -1.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(0.1f)).texOffs(32, 76).addBox(-4.0f, 5.0f, -1.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation(0.0f, 11.1381f, -0.643f, 0.2618f, 0.0f, 0.0f));
        PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(16, 106).addBox(-1.5f, 0.05f, -1.625f, 3.0f, 8.0f, 3.0f, new CubeDeformation(-0.025f)), PartPose.offsetAndRotation(0.0f, 6.75f, -0.45f, 0.829f, 0.0f, 0.0f));
        PartDefinition rightarm = isTarget.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(0.0f, -2.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.1f)).mirror(false).texOffs(24, 64).mirror().addBox(1.0f, 0.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.1f)).mirror(false), PartPose.offsetAndRotation(4.0f, 1.9658f, -0.5221f, -1.5272f, -0.2182f, -0.1745f));
        PartDefinition bone6 = rightarm.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-1.0f, -2.0f, -6.0f, 2.0f, 2.0f, 6.0f, new CubeDeformation(0.2f)).mirror(false), PartPose.offsetAndRotation(2.0f, 4.0f, 1.0f, 0.9599f, 0.0f, 0.0f));
        PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(32, 64).mirror().addBox(-2.0f, -3.0f, -5.0f, 5.0f, 5.0f, 5.0f, new CubeDeformation(0.1f)).mirror(false), PartPose.offsetAndRotation(-0.5f, -0.75f, -6.0f, -0.6981f, 0.0f, 0.3927f));
        PartDefinition bone13 = bone7.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-2.5f, -2.5f, -2.5f, 5.0f, 5.0f, 5.0f, new CubeDeformation(-0.1f)).mirror(false), PartPose.offsetAndRotation(0.4443f, 2.2669f, -2.3026f, 1.1345f, 0.0f, 0.0f));
        PartDefinition leftarm = isTarget.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 106).addBox(-4.0f, -2.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.1f)).texOffs(24, 64).addBox(-3.0f, 0.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation(-4.0f, 1.9658f, -0.5221f, -1.5272f, 0.2182f, 0.1745f));
        PartDefinition bone3 = leftarm.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 120).addBox(-1.0f, -2.0f, -6.0f, 2.0f, 2.0f, 6.0f, new CubeDeformation(0.2f)), PartPose.offsetAndRotation(-2.0f, 4.0f, 1.0f, 0.9599f, 0.0f, 0.0f));
        PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(32, 64).addBox(-3.0f, -3.0f, -5.0f, 5.0f, 5.0f, 5.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation(0.5f, -0.75f, -6.0f, -0.6981f, 0.0f, -0.3927f));
        PartDefinition bone11 = bone5.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(0, 96).addBox(-2.5f, -2.5f, -2.5f, 5.0f, 5.0f, 5.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(-0.4443f, 2.2669f, -1.3026f, 1.0472f, 0.0f, 0.0f));
        PartDefinition bone10 = isTarget.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(32, 76).addBox(-2.2352f, -0.7406f, -0.7581f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.2f)), PartPose.offsetAndRotation(1.25f, 2.9658f, -1.7721f, 0.9163f, -2.0944f, -0.6981f));
        PartDefinition body2 = partdefinition.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 2.0f, -2.5f, 0.3491f, 0.0f, 0.0f));
        PartDefinition bone23 = body2.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(64, 16).addBox(-4.0f, -22.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(96, 48).addBox(-4.0f, -22.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(-0.2f)), PartPose.offset(0.0f, 22.1381f, -0.393f));
        PartDefinition bone24 = body2.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(80, 42).addBox(-1.5f, 0.0f, -1.5f, 3.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(96, 12).addBox(-4.0f, 2.0f, -1.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(0.1f)).texOffs(96, 12).addBox(-4.0f, 5.0f, -1.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation(0.0f, 11.1381f, -0.643f, 0.2618f, 0.0f, 0.0f));
        PartDefinition bone25 = bone24.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(80, 42).addBox(-1.5f, 0.05f, -1.625f, 3.0f, 8.0f, 3.0f, new CubeDeformation(-0.025f)), PartPose.offsetAndRotation(0.0f, 6.75f, -0.45f, 0.829f, 0.0f, 0.0f));
        PartDefinition rightarm4 = body2.addOrReplaceChild("rightarm4", CubeListBuilder.create().texOffs(64, 42).addBox(-4.0f, -2.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.1f)).texOffs(88, 0).addBox(-3.0f, 0.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation(-4.0f, 1.9658f, -0.5221f, 0.0f, 0.1309f, 0.2182f));
        PartDefinition bone26 = rightarm4.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(64, 56).addBox(-1.0f, -2.0f, -5.0f, 2.0f, 2.0f, 6.0f, new CubeDeformation(0.2f)), PartPose.offsetAndRotation(-2.0f, 5.0f, 0.5f, 0.1309f, -0.1309f, 0.0f));
        PartDefinition bone27 = bone26.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(96, 0).addBox(-3.0f, -3.0f, -5.0f, 5.0f, 5.0f, 5.0f, new CubeDeformation(0.1f)), PartPose.offset(0.5f, -0.75f, -5.0f));
        PartDefinition bone28 = bone27.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(64, 32).addBox(-2.5f, -2.5f, -2.5f, 5.0f, 5.0f, 5.0f, new CubeDeformation(-0.1f)), PartPose.offset(-0.4443f, 0.2669f, -2.3026f));
        PartDefinition rightarm5 = body2.addOrReplaceChild("rightarm5", CubeListBuilder.create().texOffs(64, 42).mirror().addBox(0.0f, -2.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.1f)).mirror(false).texOffs(88, 0).mirror().addBox(1.0f, 0.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.1f)).mirror(false), PartPose.offsetAndRotation(4.0f, 1.9658f, -0.5221f, 0.0f, -0.1309f, -0.2182f));
        PartDefinition bone29 = rightarm5.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(64, 56).mirror().addBox(-1.0f, -2.0f, -5.0f, 2.0f, 2.0f, 6.0f, new CubeDeformation(0.2f)).mirror(false), PartPose.offsetAndRotation(2.0f, 5.0f, 0.5f, 0.1309f, 0.1309f, 0.0f));
        PartDefinition bone30 = bone29.addOrReplaceChild("bone30", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-2.0f, -3.0f, -5.0f, 5.0f, 5.0f, 5.0f, new CubeDeformation(0.1f)).mirror(false), PartPose.offset(-0.5f, -1.0f, -5.0f));
        PartDefinition bone31 = bone30.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(64, 32).mirror().addBox(-2.5f, -2.5f, -2.5f, 5.0f, 5.0f, 5.0f, new CubeDeformation(-0.1f)).mirror(false), PartPose.offset(0.4443f, 0.2669f, -2.3026f));
        PartDefinition bone32 = body2.addOrReplaceChild("bone32", CubeListBuilder.create().texOffs(96, 12).addBox(-2.2352f, -0.7406f, -0.7581f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.2f)), PartPose.offsetAndRotation(1.25f, 2.9658f, -1.7721f, 0.9163f, -2.0944f, -0.6981f));
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -7.75f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.1f)).texOffs(32, 32).addBox(-4.0f, -7.75f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(-0.2f)), PartPose.offset(0.0f, 2.1f, -3.0f));
        PartDefinition bone4 = head.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(32, 16).addBox(-5.0f, -1.0f, -1.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.2f)).texOffs(32, 16).addBox(2.6f, -1.0f, -1.0f, 7.0f, 2.0f, 2.0f, new CubeDeformation(-0.2f)), PartPose.offsetAndRotation(-2.0f, -3.25f, 0.5f, -0.2182f, 0.2182f, -0.2182f));
        PartDefinition bone9 = head.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(32, 16).addBox(-5.0f, 0.0f, -1.0f, 8.0f, 2.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(0.0f, -4.75f, 4.25f, 0.9163f, -1.2217f, -0.829f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.isTarget.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
    }
}

