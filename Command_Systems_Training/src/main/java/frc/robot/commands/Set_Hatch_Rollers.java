/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class Set_Hatch_Rollers extends Command { //take subsystem as argument and set field to it, use camelcaing not undersores

  /*ok so this is all good except for the capitalization and ysome syntax errors, but conceptually it's not really how you would execute this. 
  the commands should be basic functionality rather than a dictum. in other words setting a 1 second timeout on it limits the functionality of how you can use it outside
  of the class. I would just have an execute method. that sets it. don't worry about isFinished. then, if you want a timout, you can use the .withTimeout() mehtod on the binding method in RobotContainer

  */
  //need subysystem field
  public Set_Hatch_Rollers(DoubleSupplier pwm) { //need to make a field for this and set it to it
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
    HatchRollers.set(pwm); //this needs to refer to the subysstem
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
