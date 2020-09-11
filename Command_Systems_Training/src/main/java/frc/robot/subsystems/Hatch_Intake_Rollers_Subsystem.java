/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HatchIntakeRollersSubsystem extends SubsystemBase {
  private WPI_TalonSRX HatchRoller = new WPI_TalonSRX(10); //lowercase and init in constructor
  Hatch_Intake_Rollers_Subsystem.setDefualtCommand(Set_Hatch_Rollers); // this should go in constructor, and you should use "this" rather than "hatchIntakeRollersSubsystem"
  /**
   * Creates a new HatchIntakeRollersSubsystem.
   */
  public HatchIntakeRollersSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void zero(){ //good
    HatchIntakeRollers.set(0);
  }
  public void set(double pwm){ //good
    HatchIntakeRollers.set(pwm);
}
