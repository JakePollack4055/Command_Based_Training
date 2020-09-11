/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CargoRollerSubsystem extends SubsystemBase {
  private WPI_TalonSRX CargoRoller = new WPI_TalonSRX(8); //make lowercase, initialize in constructor
  //both of these should be in constructor
  Cargo_Roller_Subsystem.setDefualtCommand(Set_Cargo_Rollers);
  configureButtonBindings();
  /**
   * Creates a new CargoRollerSubsystem.
   */
  public CargoRollerSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void set(double pwm){
    CargoRoller.set(pwm);
    
  }
}
