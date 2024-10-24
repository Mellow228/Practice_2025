package frc.robot.util.Field;

import edu.wpi.first.math.geometry.Translation2d;

public class FieldMeasurements {
    // Field measurements in inches.
    // There is a .03 inch discrepancy in the field measurements, likely due to a
    // rounding error on FIRST's part.
    // Half the field as measured by its components, multiplied by two, is .03
    // inches narrower than the overall field.
    // That comes out to .762 millimeters, so not enough to worry about.
    public static final double OVERALL_FIELD_WIDTH_INCHES = 651.25;
    public static final double HALF_FIELD_WIDTH_INCHES = 325.61;
    public static final double HALF_FIELD_WIDTH_TIMES_2_INCHES = HALF_FIELD_WIDTH_INCHES * 2;

    // This field height value is slightly shorter than the nominally given height
    // of 26 foot 3.5 inches.
    // This is compiled by the various zones. The discrepancy could be due to the
    // inclusion of the field wall.
    public static final double FIELD_HEIGHT_INCHES = (59.39 * 2) + 99.07 + 96;

    // Field elements used as references.
    public static final double DOUBLE_SUBSTATION_WIDTH_INCHES = 14;

    // Community.
    public static final double DISTANCE_FROM_WALL_TO_COMMUNITY_INCHES = 54.25;
    public static final double COMMUNITY_LENGTH_INCHES = 216.5;
    public static final double COMMUNITY_NORTHERN_SECTION_WIDTH_INCHES = 78; // 132.25 - 54.25.
    public static final double COMMUNITY_NORTHERN_SECTION_HEIGHT_INCHES = 59.39;
    public static final double COMMUNITY_COOP_SECTION_WIDTH_INCHES = 60.69;
    public static final double COMMUNITY_COOP_SECTION_HEIGHT_INCHES = 96; // 8 feet, same as the charge station.
    public static final double COMMUNITY_SOUTHERN_SECTION_WIDTH_INCHES = 138.87; // 224 minus 85.13, from the layout
                                                                                 // guide.
    public static final double COMMUNITY_SOUTHERN_SECTION_HEIGHT_INCHES = 59.39;

    // Charge station, which is also part of the community.
    public static final double COMMUNITY_CHARGE_STATION_WIDTH_INCHES = 76.125; // 6 foot 4 and a quarter.
    public static final double COMMUNITY_CHARGE_STATION_HEIGHT_INCHES = 96; // 8 feet, same as the charge station.

    // AprilTags.
    // The basis for AprilTag heights is tags 7 (blue) and 2 (red) which are
    // centered upon the center of the bridge.
    public static final double APRILTAG_2_7_HEIGHT_INCHES = COMMUNITY_SOUTHERN_SECTION_HEIGHT_INCHES
            + (COMMUNITY_CHARGE_STATION_HEIGHT_INCHES / 2);
    public static final double APRILTAG_1_8_HEIGHT_INCHES = APRILTAG_2_7_HEIGHT_INCHES - 66;
    public static final double APRILTAG_3_6_HEIGHT_INCHES = APRILTAG_2_7_HEIGHT_INCHES + 66;
    public static final double APRILTAG_4_5_HEIGHT_INCHES = APRILTAG_3_6_HEIGHT_INCHES + 91.55;

    // Tags 4 and 5 are on the double substation wall, and the other tags are all a
    // fixed offset past that.
    public static final double APRILTAG_4_5_WIDTH_INCHES = DOUBLE_SUBSTATION_WIDTH_INCHES;
    public static final double APRILTAG_123_678_WIDTH_INCHES = APRILTAG_4_5_WIDTH_INCHES + 26.19;

    // Calculate each individual tag's width coordinates. Now the difference between
    // blue and red matters.
    // The blue tags exactly math the general coordinates, but the red ones have to
    // be inverted.
    public static double APRILTAG_123_WIDTH_INCHES = HALF_FIELD_WIDTH_TIMES_2_INCHES - APRILTAG_123_678_WIDTH_INCHES;
    public static double APRILTAG_1_WIDTH_INCHES = APRILTAG_123_WIDTH_INCHES;
    public static double APRILTAG_2_WIDTH_INCHES = APRILTAG_123_WIDTH_INCHES;
    public static double APRILTAG_3_WIDTH_INCHES = APRILTAG_123_WIDTH_INCHES;
    public static double APRILTAG_4_WIDTH_INCHES = HALF_FIELD_WIDTH_TIMES_2_INCHES - APRILTAG_4_5_WIDTH_INCHES;
    public static double APRILTAG_5_WIDTH_INCHES = APRILTAG_4_5_WIDTH_INCHES;
    public static double APRILTAG_6_WIDTH_INCHES = APRILTAG_123_678_WIDTH_INCHES;
    public static double APRILTAG_7_WIDTH_INCHES = APRILTAG_123_678_WIDTH_INCHES;
    public static double APRILTAG_8_WIDTH_INCHES = APRILTAG_123_678_WIDTH_INCHES;

    // Height needs no inversion since its constant between the alliance colors.
    public static double APRILTAG_1_HEIGHT_INCHES = APRILTAG_1_8_HEIGHT_INCHES;
    public static double APRILTAG_2_HEIGHT_INCHES = APRILTAG_2_7_HEIGHT_INCHES;
    public static double APRILTAG_3_HEIGHT_INCHES = APRILTAG_3_6_HEIGHT_INCHES;
    public static double APRILTAG_4_HEIGHT_INCHES = APRILTAG_4_5_HEIGHT_INCHES;
    public static double APRILTAG_5_HEIGHT_INCHES = APRILTAG_4_5_HEIGHT_INCHES;
    public static double APRILTAG_6_HEIGHT_INCHES = APRILTAG_3_6_HEIGHT_INCHES;
    public static double APRILTAG_7_HEIGHT_INCHES = APRILTAG_2_7_HEIGHT_INCHES;
    public static double APRILTAG_8_HEIGHT_INCHES = APRILTAG_1_8_HEIGHT_INCHES;

    // Field measurements in meters, which is the native unit for PathPlanner
    // coordinates.
    public static final double INCHES_TO_METERS_CONVERSION = .0254;

    // Main field measurements.
    public static final double HALF_FIELD_WIDTH_TIMES_2_METERS = HALF_FIELD_WIDTH_TIMES_2_INCHES
            * INCHES_TO_METERS_CONVERSION;

    // Amp Zone
    public static final double AMP_ZONE_AREA_SOUTHWEST_CORNER_X_METERS = 0;
    public static final double AMP_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS = 7.8;
    public static final double AMP_ZONE_AREA_WIDTH_METERS = 3.3;
    public static final double AMP_ZONE_AREA_HEIGHT_METERS = .4;

    // Pickup Zone
    public static final double PICKUP_ZONE_WIDE_AREA_SOUTHWEST_CORNER_X_METERS = 0;
    public static final double PICKUP_ZONE_WIDE_AREA_SOUTHWEST_CORNER_Y_METERS = 0;
    public static final double PICKUP_ZONE_WIDE_AREA_WIDTH_METERS = 1.90;
    public static final double PICKUP_ZONE_WIDE_AREA_HEIGHT_METERS = 1.56;

    // Stage Zone
    public static final double STAGE_SOUTHWEST_CORNER_X_METERS = 3.20;
    public static final double STAGE_SOUTHWEST_CORNER_Y_METERS = 2.60;
    public static final double STAGE_STATION_WIDTH_METERS = 2.65;
    public static final double STAGE_HEIGHT_METERS = 3.10;

    // Netrual Zone
    public static final double NEUTRAL_ZONE_AREA_SOUTHWEST_CORNER_X_METERS = 5.85;
    public static final double NEUTRAL_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS = 0;
    public static final double NEUTRAL_ZONE_AREA_WIDTH_METERS = 4.85;
    public static final double NEUTRAL_ZONE_HEIGHT_METERS = 8.20;

    public static final double COLOR_LARGE_ZONE_AREA_SOUTHWEST_CORNER_X_METERS = 0;
    public static final double COLOR_LARGE_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS = 1.56;
    public static final double COLOR_LARGE_ZONE_AREA_WIDTH_METERS = 3.20;
    public static final double COLOR_LARGE_ZONE_AREA_HEIGHT_METERS = 6.24;

    public static final double COLOR_TINY_ZONE_AREA_SOUTHWEST_CORNER_X_METERS = 3.20;
    public static final double COLOR_TINY_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS = 1.56;
    public static final double COLOR_TINY_ZONE_AREA_WIDTH_METERS = 2.65;
    public static final double COLOR_TINY_ZONE_AREA_HEIGHT_METERS = 1.04;

    public static final double COLOR_LONG_ZONE_AREA_SOUTHWEST_CORNER_X_METERS = 1.90;
    public static final double COLOR_LONG_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS = 0;
    public static final double COLOR_LONG_ZONE_AREA_WIDTH_METERS = 3.95;
    public static final double COLOR_LONG_ZONE_AREA_HEIGHT_METERS = 1.56;

    public static final double COLOR_MED_ZONE_AREA_SOUTHWEST_CORNER_X_METERS = 3.20;
    public static final double COLOR_MED_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS = 5.70;
    public static final double COLOR_MED_ZONE_AREA_WIDTH_METERS = 2.65;
    public static final double COLOR_MED_ZONE_AREA_HEIGHT_METERS = 2.1;

    public static final double COLOR_SMALL_ZONE_AREA_SOUTHWEST_CORNER_X_METERS = 3.3;
    public static final double COLOR_SMALL_ZONE_AREA_SOUTHWEST_CORNER_Y_METERS = 7.8;
    public static final double COLOR_SMALL_ZONE_AREA_WIDTH_METERS = 2.55;
    public static final double COLOR_SMALL_ZONE_AREA_HEIGHT_METERS = .4;

    // AprilTags.
    public static final double APRILTAG_1_WIDTH_METERS = APRILTAG_1_WIDTH_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_1_HEIGHT_METERS = APRILTAG_1_HEIGHT_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_2_WIDTH_METERS = APRILTAG_2_WIDTH_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_2_HEIGHT_METERS = APRILTAG_2_HEIGHT_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_3_WIDTH_METERS = APRILTAG_3_WIDTH_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_3_HEIGHT_METERS = APRILTAG_3_HEIGHT_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_4_WIDTH_METERS = APRILTAG_4_WIDTH_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_4_HEIGHT_METERS = APRILTAG_4_HEIGHT_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_5_WIDTH_METERS = APRILTAG_5_WIDTH_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_5_HEIGHT_METERS = APRILTAG_5_HEIGHT_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_6_WIDTH_METERS = APRILTAG_6_WIDTH_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_6_HEIGHT_METERS = APRILTAG_6_HEIGHT_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_7_WIDTH_METERS = APRILTAG_7_WIDTH_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_7_HEIGHT_METERS = APRILTAG_7_HEIGHT_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_8_WIDTH_METERS = APRILTAG_8_WIDTH_INCHES * INCHES_TO_METERS_CONVERSION;
    public static final double APRILTAG_8_HEIGHT_METERS = APRILTAG_8_HEIGHT_INCHES * INCHES_TO_METERS_CONVERSION;

    // width = 30.25 inch

    // length = 34.5
    public static final Translation2d[] RED_NODE_COORD = {
            new Translation2d(14.69, 0.49), // 1
            new Translation2d(14.69, 1.18), // 2
            new Translation2d(14.69, 1.65), // 3
            new Translation2d(14.69, 2.24), // 4
            new Translation2d(14.69, 2.79), // 5
            new Translation2d(14.69, 3.33), // 6
            new Translation2d(14.69, 3.92), // 7
            new Translation2d(14.69, 4.41), // 8
            new Translation2d(14.69, 5.02), // 9
    };

    public static final Translation2d[] BLUE_NODE_COORD = {
            new Translation2d(1.85, 4.99), // 1
            new Translation2d(1.85, 4.34), // 2
            new Translation2d(1.85, 3.79), // 3
            new Translation2d(1.85, 3.26), // 4
            new Translation2d(1.85, 2.69), // 5
            new Translation2d(1.85, 2.16), // 6
            new Translation2d(1.85, 1.57), // 7
            new Translation2d(1.85, 1.08), // 8
            new Translation2d(1.85, 0.486), // 9
    };

    public static final Translation2d[] BLUE_SUBSTATIONS = {
            new Translation2d(15.2, 7.56), // LEFT DOUBLE SUBSTATION FOR BLUE ALLIANCE SCORING
            new Translation2d(15.2, 5.92), // RIGHT DOUBLE SUBSTATION FOR BLUE ALLIANCE SCORING
            new Translation2d(14.08, 7.42) // SINGLE SUBSTATION FOR SCORING BLUE ALLIANCE
    };

    public static final Translation2d[] RED_SUBSTATIONS = {
            new Translation2d(1.2038, 5.88), // LEFT DOUBLE SUBSTATION FOR RED ALLIANCE SCORING
            new Translation2d(1.2038, 7.59), // RIGHT DOUBLE SUBSTATION FOR RED ALLIANCE SCORING
            new Translation2d(2.352, 7.31) // SINGLE SUBSTATION FOR RED ALLIANCE SCORING
    };

    public static double getInvertedWidthInches(double blueAllianceWidth) {
        return HALF_FIELD_WIDTH_TIMES_2_INCHES - blueAllianceWidth;
    }

    public static double convertToRedWidthMeters(double blueAllianceWidth) {
        return HALF_FIELD_WIDTH_TIMES_2_METERS - blueAllianceWidth;
    }
}
