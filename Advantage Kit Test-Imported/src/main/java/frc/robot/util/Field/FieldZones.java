// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util.Field;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.DriverStation.Alliance;
import frc.robot.Robot;

import java.awt.geom.Point2D;


public class FieldZones {
    public enum FieldMacroZone {
        NONE,
        PICKUP_ZONE,
        SPEAKER,
        COLOR_ZONE,
        NEUTRAL, STAGE, AMP
    }

    private ArrayList<FieldZone> fieldZones = new ArrayList<FieldZone>();

    private FieldZone bluePickupZone;
    private FieldZone redPickupZone;
    private FieldZone blueAmpZone;
    private FieldZone redAmpZone;
    private FieldZone neutralZone;

    private FieldZone blueStageZone;
    private FieldZone redStageZone;

    private FieldZone blueZone;
    private FieldZone redZone;
    
    // We'll include a none state in case odometry ever breaks by enough that no zone is returned.
    private FieldZone noneZone;

    // Field Zones for Crescendo
    public static final FieldSubzone blueInsideSafeZone = new FieldSubzone(
        "Blue Inside Shooting Zone",
        0,
        0,
        10.75,
        8.15);

    public static final FieldSubzone blueOutsideSafeZone = new FieldSubzone(
        "Blue Outside Shooting Zone",
        10.75,
        0,
        5.85,
        8.15);

    public static final FieldSubzone redInsideSafeZone = new FieldSubzone(
        "Red Inside Shooting Zone",
        5.85,
        0,
        10.75,
        8.15);

    public static final FieldSubzone redOutsideSafeZone = new FieldSubzone(
        "Blue Outside Shooting Zone",
        0,
        0,
        5.85,
        8.15);


        public static final MirroredSubzone STAGE_MIRRORED_SUBZONE = new MirroredSubzone(
        "Stage",
        FieldMeasurements.STAGE_SOUTHWEST_CORNER_X_METERS,
        FieldMeasurements.STAGE_SOUTHWEST_CORNER_Y_METERS,
        FieldMeasurements.STAGE_STATION_WIDTH_METERS,
        FieldMeasurements.STAGE_HEIGHT_METERS,
        false);



    
    // Pickup zone. DONE!!!!!
    public static final MirroredSubzone PICKUP_ZONE_MIRRORED_SUBZONE = new MirroredSubzone(
        "Source Zone",
        FieldMeasurements.PICKUP_ZONE_WIDE_AREA_SOUTHWEST_CORNER_X_METERS,
        FieldMeasurements.PICKUP_ZONE_WIDE_AREA_SOUTHWEST_CORNER_Y_METERS,
        FieldMeasurements.PICKUP_ZONE_WIDE_AREA_WIDTH_METERS,
        FieldMeasurements.PICKUP_ZONE_WIDE_AREA_HEIGHT_METERS,
        true);

     public static final MirroredSubzone AMP_ZONE_MIRRORED_SUBZONE = new MirroredSubzone(
        "Amp Zone",
        FieldMeasurements.AMP_ZONE_AREA_SOUTHWEST_CORNER_X_METERS,
        FieldMeasurements.AMP_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS,
        FieldMeasurements.AMP_ZONE_AREA_WIDTH_METERS,
        FieldMeasurements.AMP_ZONE_AREA_HEIGHT_METERS,
        false);



      public static final MirroredSubzone COLOR_LARGE_SECTION_MIRRORED_SUBZONE = new MirroredSubzone(
        "Color Large Zone",
        FieldMeasurements.COLOR_LARGE_ZONE_AREA_SOUTHWEST_CORNER_X_METERS,
        FieldMeasurements.COLOR_LARGE_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS,
        FieldMeasurements.COLOR_LARGE_ZONE_AREA_WIDTH_METERS,
        FieldMeasurements.COLOR_LARGE_ZONE_AREA_HEIGHT_METERS,
        false);

     public static final MirroredSubzone COLOR_TINY_SECTION_MIRRORED_SUBZONE = new MirroredSubzone(
        "Color Tiny Zone",
        FieldMeasurements.COLOR_TINY_ZONE_AREA_SOUTHWEST_CORNER_X_METERS,
        FieldMeasurements.COLOR_TINY_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS,
        FieldMeasurements.COLOR_TINY_ZONE_AREA_WIDTH_METERS,
        FieldMeasurements.COLOR_TINY_ZONE_AREA_HEIGHT_METERS,
        false);

     public static final MirroredSubzone COLOR_LONG_SECTION_MIRRORED_SUBZONE = new MirroredSubzone(
        "Color Long Zone",
        FieldMeasurements.COLOR_LONG_ZONE_AREA_SOUTHWEST_CORNER_X_METERS,
        FieldMeasurements.COLOR_LONG_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS,
        FieldMeasurements.COLOR_LONG_ZONE_AREA_WIDTH_METERS,
        FieldMeasurements.COLOR_LONG_ZONE_AREA_HEIGHT_METERS,
        false);

     public static final MirroredSubzone COLOR_MED_SECTION_MIRRORED_SUBZONE = new MirroredSubzone(
        "Color Med Zone",
        FieldMeasurements.COLOR_MED_ZONE_AREA_SOUTHWEST_CORNER_X_METERS,
        FieldMeasurements.COLOR_MED_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS,
        FieldMeasurements.COLOR_MED_ZONE_AREA_WIDTH_METERS,
        FieldMeasurements.COLOR_MED_ZONE_AREA_HEIGHT_METERS,
        false);

     public static final MirroredSubzone COLOR_SMALL_SECTION_MIRRORED_SUBZONE = new MirroredSubzone(
        "Color Small Zone",
        FieldMeasurements.COLOR_SMALL_ZONE_AREA_SOUTHWEST_CORNER_X_METERS,
        FieldMeasurements.COLOR_SMALL_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS,
        FieldMeasurements.COLOR_SMALL_ZONE_AREA_WIDTH_METERS,
        FieldMeasurements.COLOR_SMALL_ZONE_AREA_HEIGHT_METERS,
        false);
    





    // Neutral zone. Unlike the other zones, the NZ is NOT mirrored - it's just one large FieldZone.
    // However the width coordinates are defined by halves so need to be doubled.
    public static final FieldSubzone neutralZoneArea = new FieldSubzone(
        "Neutral Zone",
        FieldMeasurements.NEUTRAL_ZONE_AREA_SOUTHWEST_CORNER_X_METERS,
        FieldMeasurements.NEUTRAL_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS,
        FieldMeasurements.NEUTRAL_ZONE_AREA_WIDTH_METERS,
        FieldMeasurements.NEUTRAL_ZONE_HEIGHT_METERS);
  
    public static final FieldSubzone noneSubzone = new FieldSubzone(
        "None",
        -1,
        -1,
        0,
        0);

    
    
    public FieldZones() {
        // Communities.
         MirroredFieldZone communityMirroredFieldZone = new MirroredFieldZone(FieldMacroZone.COLOR_ZONE, "Color Zone", COLOR_LARGE_SECTION_MIRRORED_SUBZONE);
            communityMirroredFieldZone.addMirroredSubzone(COLOR_TINY_SECTION_MIRRORED_SUBZONE);
            communityMirroredFieldZone.addMirroredSubzone(COLOR_MED_SECTION_MIRRORED_SUBZONE);
            communityMirroredFieldZone.addMirroredSubzone(COLOR_LONG_SECTION_MIRRORED_SUBZONE);
            communityMirroredFieldZone.addMirroredSubzone(COLOR_SMALL_SECTION_MIRRORED_SUBZONE);

        blueZone = communityMirroredFieldZone.getBlueFieldZone();
        redZone = communityMirroredFieldZone.getRedFieldZone();
        blueZone.generateBoundingBox();
        redZone.generateBoundingBox();
        fieldZones.add(blueZone);
        fieldZones.add(redZone); 





        // PICKUP zones.
        MirroredFieldZone pickupZoneMirroredFieldZone = new MirroredFieldZone(FieldMacroZone.PICKUP_ZONE, "Source Zone", PICKUP_ZONE_MIRRORED_SUBZONE);

        bluePickupZone = pickupZoneMirroredFieldZone.getBlueFieldZone();
        redPickupZone = pickupZoneMirroredFieldZone.getRedFieldZone();
        bluePickupZone.generateBoundingBox();
        redPickupZone.generateBoundingBox();
        fieldZones.add(bluePickupZone);
        fieldZones.add(redPickupZone);

        MirroredFieldZone stageZoneMirroredFieldZone = new MirroredFieldZone(FieldMacroZone.STAGE, "Stage Zone", STAGE_MIRRORED_SUBZONE);

        blueStageZone = stageZoneMirroredFieldZone.getBlueFieldZone();
        redStageZone = stageZoneMirroredFieldZone.getRedFieldZone();
        blueStageZone.generateBoundingBox();
        redStageZone.generateBoundingBox();
        fieldZones.add(blueStageZone);
        fieldZones.add(redStageZone);

         MirroredFieldZone ampZoneMirroredFieldZone = new MirroredFieldZone(FieldMacroZone.AMP, "Amp Zone", AMP_ZONE_MIRRORED_SUBZONE);

        blueAmpZone = ampZoneMirroredFieldZone.getBlueFieldZone();
        redAmpZone = ampZoneMirroredFieldZone.getRedFieldZone();
        blueAmpZone.generateBoundingBox();
        redAmpZone.generateBoundingBox();
        fieldZones.add(blueAmpZone);
        fieldZones.add(redAmpZone);

        // Neutral zone. Changed Alliance Invalid to Blue
        neutralZone = new FieldZone(Alliance.Blue, FieldMacroZone.NEUTRAL, "Neutral Zone", neutralZoneArea);
        neutralZone.generateBoundingBox();

        fieldZones.add(neutralZone);
 
        // Create the none zone. Changed Invalid to blue
        noneZone = new FieldZone(Alliance.Blue, FieldMacroZone.NONE, "None", noneSubzone);
        noneZone.generateBoundingBox();
        noneSubzone.setFieldZone(noneZone);
        fieldZones.add(noneZone);
    }

    public FieldSubzone getPointFieldZone(Point2D point) {
        // If odometry is working correctly we'll always find a zone, but if it's not, we need a default.
        FieldSubzone robotFieldSubzone = noneSubzone;

            for (int i = 0; i < fieldZones.size(); i++) {
                if (fieldZones.get(i).containsPoint(point)) {
                    robotFieldSubzone = fieldZones.get(i).subzonesContainPoint(point);

                    if (robotFieldSubzone != null) {
                        break;
                    }
            }
        }
        
        if (robotFieldSubzone == null) {
            robotFieldSubzone = FieldZones.noneSubzone;
        }

        return robotFieldSubzone;
    }

    public void output() {
        //System.out.println("Zones:");

        for (FieldZone zone : fieldZones) {
            zone.outputSubzones();
        }

       // System.out.println();
        //System.out.println();
    }

    public FieldZone getNoneZone() {
        return noneZone;
    }

    public ArrayList<FieldZone> getFieldZones() {
        return fieldZones;
        // ArrayList<FieldZone> rapidReactFieldZones = new ArrayList<>();
        // rapidReactFieldZones.add(new FieldZone(Alliance.Blue, FieldMacroZone.NONE, "Blue Inside Safe Zone", blueInsideSafeZone));
        // rapidReactFieldZones.add(new FieldZone(Alliance.Blue, FieldMacroZone.NONE, "Blue Outside Safe Zone", blueOutsideSafeZone));
        // rapidReactFieldZones.add(new FieldZone(Alliance.Red, FieldMacroZone.NONE, "Red Inside Safe Zone", redInsideSafeZone));
        // rapidReactFieldZones.add(new FieldZone(Alliance.Red, FieldMacroZone.NONE, "Red Outside Safe Zone", redOutsideSafeZone));
        // return rapidReactFieldZones;
    }
}