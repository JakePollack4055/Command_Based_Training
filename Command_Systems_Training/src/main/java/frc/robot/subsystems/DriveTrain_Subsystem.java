/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class DriveTrain_Subsystem extends Subsystem {  // no underscore, extend SubsystemBase 
  private CANSparkMAX driveLeftSpark1 = new CANSparkMAX(12, MotorType.kBrushless); // all need to be constructed in constructor
  private CANSparkMAX driveLeftSpark2 = new CANSparkMAX(13, MotorType.kBrushless);
  private CANSparkMAX driveLeftSpark3 = new CANSparkMAX(14, MotorType.kBrushless); 
  private CANSparkMAX driveLeftSpark4 = new CANSparkMAX(15, MotorType.kBrushless);
  private CANSparkMAX driveRightSpark1 = new CANSparkMAX(4, MotorType.kBrushless);
  private CANSparkMAX driveRightSpark2 = new CANSparkMAX(5, MotorType.kBrushless);
  private CANSparkMAX driverightSpark3 = new CANSparkMAX(6, MotorType.kBrushless);
  private CANSparkMAX driveRightSpark4 = new CANSparkMAX(7, MotorType.kBrushless);
  rightSpeedControllerGroup = new SpeedControllerGroup(driveRightSpark1, driveRightSpark2, driveRightSpark3, driveRightSpark4);
  leftSpeedControllerGroup = new SpeedControllerGroup(driveLeftSpark1, driveLeftSpark2, driveLeftSpark3, driveLeftSpark4);

  //make a DifferentialDrive field and use it to write a curvature drive method callign the curvatureDrive method of DifferentialDrive


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
