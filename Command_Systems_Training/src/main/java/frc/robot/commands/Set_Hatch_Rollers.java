/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class Set_Hatch_Rollers extends Command {
  public Set_Hatch_Rollers(DoubleSupplier pwm) {
    private timer timer;

    private subsystem Hatch_Intake_Roller_Subsystem();
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    timer.start;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    HatchRollers.set(pwm);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if{timer.get() == 1000}{
      return true;
    }

    
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
