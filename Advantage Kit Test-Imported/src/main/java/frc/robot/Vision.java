// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


import edu.wpi.first.apriltag.AprilTagFieldLayout;
import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.DriverStation;
import frc.robot.subsystems.Drivetrain;

/** Add your docs here. */
public class Vision {
    private Pose3d robotPoseApril;
    private Pose2d robotPoseTrad;
    AprilTagFieldLayout tagLayout;
    Transform3d robotToCamera;
    Transform3d cameraToRobot;
    private Drivetrain m_drivetrain;
    
    public Vision(Drivetrain drivetrain) {
        
    }
 
    public Pose3d getPoseApril() {
        return robotPoseApril;
    }

    public int getAutoTag() {
      return 0;
    } 

    public void periodic() {
       
    }

    public boolean hasGoalTarget() {
    return false;
    }

    public double getAlignDegrees(boolean tr) {
       return 0;
        
    }

    public double getAlignDegrees() {
          
    return 0;
    }

    private boolean isGoal(double id) {
       
        return false;
    }

    public double getGoalDistance() {
        
    return 0;
}

public double getGoalDistance(boolean tr) {
    
        return 0;

}

   
}
