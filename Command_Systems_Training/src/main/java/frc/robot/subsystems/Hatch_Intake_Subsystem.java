/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Hatch_Intake_Subsystem extends SubsystemBase {
  private DoubleSolenoid LiftSolenoid = new DoubleSolenoid(0,4); // make fields lowercase and intiialize in constructor
  private DoubleSolenoid HatcheSolenoid = new DoubleSolenoid(1,5); //this is the "slide solenoid"
  /**
   * Creates a new Hatch_Intake_Subsystem.
   */
  public Hatch_Intake_Subsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void HatchStowed(){ //make methods lowercase, but otherwise good
    liftSolenoid.set(value.kReverse);
    hatchSolenoid.set(value.kReverse);
  }
  public vooid HatchExtened(){
    liftSolenoid.set(value.kForward);
    hatchSolenoid.set(value.kForward);
  }
}
